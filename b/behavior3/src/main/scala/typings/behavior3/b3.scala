package typings.behavior3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object b3 {
  
  /**
    * Action is the base class for all action nodes. Thus, if you want to create
    * new custom action nodes, you need to inherit from this class. For example,
    * take a look at the Runner action:
    *
    *     class Runner extends b3.Action {
    *       constructor(){
    *         super({name: 'Runner'});
    *       }
    *       tick(tick) {
    *         return b3.RUNNING;
    *       }
    *     };
    *
    */
  type Action = BaseNode
  
  /**
    * The BaseNode class is used as super class to all nodes in BehaviorJS. It
    * comprises all common variables and methods that a node must have to
    * execute.
    *
    * **IMPORTANT:** Do not inherit from this class, use `Composite`,
    * `Decorator`, `Action` or `Condition`, instead.
    *
    * The attributes are specially designed to serialization of the node in a
    * JSON format. In special, the `parameters` attribute can be set into the
    * visual editor (thus, in the JSON file), and it will be used as parameter
    * on the node initialization at `BehaviorTree.load`.
    *
    * BaseNode also provide 5 callback methods, which the node implementations
    * can override. They are `enter`, `open`, `tick`, `close` and `exit`. See
    * their documentation to know more. These callbacks are called inside the
    * `_execute` method, which is called in the tree traversal.
    *
    */
  trait BaseNode extends StObject {
    
    /**
      * Wrapper for close method.
      */
    def _close(tick: Tick): Unit
    
    /**
      * Wrapper for enter method.
      */
    def _enter(tick: Tick): Unit
    
    /**
      * This is the main method to propagate the tick signal to this node. This
      * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
      * `exit`. It only opens a node if it is not already open. In the same
      * way, this method only close a node if the node  returned a status
      * different of `RUNNING`.
      *
      */
    def _execute(tick: Tick): Double
    
    /**
      * Wrapper for exit method.
      */
    def _exit(tick: Tick): Unit
    
    /**
      * Wrapper for open method.
      */
    def _open(tick: Tick): Unit
    
    /**
      * Wrapper for tick method.
      */
    def _tick(tick: Tick): Double
    
    /**
      * Close method, override this to use. This method is called after the tick
      * callback, and only if the tick return a state different from
      * `RUNNING`.
      *
      */
    def close(tick: Tick): Unit
    
    /**
      * Enter method, override this to use. It is called every time a node is
      * asked to execute, before the tick itself.
      */
    def enter(tick: Tick): Unit
    
    /**
      * Exit method, override this to use. Called every time in the end of the
      * execution.
      *
      */
    def exit(tick: Tick): Unit
    
    /**
      * Open method, override this to use. It is called only before the tick
      * callback and only if the not isn't closed.
      *
      * Note: a node will be closed if it returned `RUNNING` in the tick.
      *
      */
    def open(tick: Tick): Unit
    
    /**
      * Tick method, override this to use. This method must contain the real
      * execution of node (perform a task, call children, etc.). It is called
      * every time a node is asked to execute.
      *
      */
    def tick(tick: Tick): Unit
  }
  object BaseNode {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): BaseNode = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[BaseNode]
    }
    
    extension [Self <: BaseNode](x: Self) {
      
      inline def setClose(value: Tick => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setEnter(value: Tick => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setExit(value: Tick => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Tick => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setTick(value: Tick => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
      
      inline def set_close(value: Tick => Unit): Self = StObject.set(x, "_close", js.Any.fromFunction1(value))
      
      inline def set_enter(value: Tick => Unit): Self = StObject.set(x, "_enter", js.Any.fromFunction1(value))
      
      inline def set_execute(value: Tick => Double): Self = StObject.set(x, "_execute", js.Any.fromFunction1(value))
      
      inline def set_exit(value: Tick => Unit): Self = StObject.set(x, "_exit", js.Any.fromFunction1(value))
      
      inline def set_open(value: Tick => Unit): Self = StObject.set(x, "_open", js.Any.fromFunction1(value))
      
      inline def set_tick(value: Tick => Double): Self = StObject.set(x, "_tick", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The BehaviorTree class, as the name implies, represents the Behavior Tree
    * structure.
    *
    * There are two ways to construct a Behavior Tree: by manually setting the
    * root node, or by loading it from a data structure (which can be loaded
    * from a JSON). Both methods are shown in the examples below and better
    * explained in the user guide.
    *
    * The tick method must be called periodically, in order to send the tick
    * signal to all nodes in the tree, starting from the root. The method
    * `BehaviorTree.tick` receives a target object and a blackboard as
    * parameters. The target object can be anything: a game agent, a system, a
    * DOM object, etc. This target is not used by any piece of Behavior3JS,
    * i.e., the target object will only be used by custom nodes.
    *
    * The blackboard is obligatory and must be an instance of `Blackboard`. This
    * requirement is necessary due to the fact that neither `BehaviorTree` or
    * any node will store the execution variables in its own object (e.g., the
    * BT does not store the target, information about opened nodes or number of
    * times the tree was called). But because of this, you only need a single
    * tree instance to control multiple (maybe hundreds) objects.
    *
    * Manual construction of a Behavior Tree
    * --------------------------------------
    *
    *     var tree = new b3.BehaviorTree();
    *
    *     tree.root = new b3.Sequence({children:[
    *       new b3.Priority({children:[
    *         new MyCustomNode(),
    *         new MyCustomNode()
    *       ]}),
    *       ...
    *     ]});
    *
    *
    * Loading a Behavior Tree from data structure
    * -------------------------------------------
    *
    *     var tree = new b3.BehaviorTree();
    *
    *     tree.load({
    *       'title'       : 'Behavior Tree title'
    *       'description' : 'My description'
    *       'root'        : 'node-id-1'
    *       'nodes'       : {
    *         'node-id-1' : {
    *           'name'        : 'Priority', // this is the node type
    *           'title'       : 'Root Node',
    *           'description' : 'Description',
    *           'children'    : ['node-id-2', 'node-id-3'],
    *         },
    *         ...
    *       }
    *     })
    *
    */
  @js.native
  trait BehaviorTree extends StObject {
    
    /**
      * This method dump the current BT into a data structure.
      *
      * Note: This method does not record the current node parameters. Thus,
      * it may not be compatible with load for now.
      *
      */
    def dump(): Any = js.native
    
    /**
      * This method loads a Behavior Tree from a data structure, populating this
      * object with the provided data. Notice that, the data structure must
      * follow the format specified by Behavior3JS. Consult the guide to know
      * more about this format.
      *
      * You probably want to use custom nodes in your BTs, thus, you need to
      * provide the `names` object, in which this method can find the nodes by
      * `names[NODE_NAME]`. This variable can be a namespace or a dictionary,
      * as long as this method can find the node by its name, for example:
      *
      *     //json
      *     ...
      *     'node1': {
      *       'name': MyCustomNode,
      *       'title': ...
      *     }
      *     ...
      *
      *     //code
      *     var bt = new b3.BehaviorTree();
      *     bt.load(data, {'MyCustomNode':MyCustomNode})
      *
      *
      */
    def load(data: Any): Unit = js.native
    def load(data: Any, names: Any): Unit = js.native
    
    /**
      * Propagates the tick signal through the tree, starting from the root.
      *
      * This method receives a target object of any type (Object, Array,
      * DOMElement, whatever) and a `Blackboard` instance. The target object has
      * no use at all for all Behavior3JS components, but surely is important
      * for custom nodes. The blackboard instance is used by the tree and nodes
      * to store execution variables (e.g., last node running) and is obligatory
      * to be a `Blackboard` instance (or an object with the same interface).
      *
      * Internally, this method creates a Tick object, which will store the
      * target and the blackboard objects.
      *
      * Note: BehaviorTree stores a list of open nodes from last tick, if these
      * nodes weren't called after the current tick, this method will close them
      * automatically.
      *
      */
    def tick(target: Any, blackboard: Blackboard): String = js.native
  }
  
  /**
    * The Blackboard is the memory structure required by `BehaviorTree` and its
    * nodes. It only have 2 public methods: `set` and `get`. These methods works
    * in 3 different contexts: global, per tree, and per node per tree.
    *
    * Suppose you have two different trees controlling a single object with a
    * single blackboard, then:
    *
    * - In the global context, all nodes will access the stored information.
    * - In per tree context, only nodes sharing the same tree share the stored
    *   information.
    * - In per node per tree context, the information stored in the blackboard
    *   can only be accessed by the same node that wrote the data.
    *
    * The context is selected indirectly by the parameters provided to these
    * methods, for example:
    *
    *     // getting/setting variable in global context
    *     blackboard.set('testKey', 'value');
    *     var value = blackboard.get('testKey');
    *
    *     // getting/setting variable in per tree context
    *     blackboard.set('testKey', 'value', tree.id);
    *     var value = blackboard.get('testKey', tree.id);
    *
    *     // getting/setting variable in per node per tree context
    *     blackboard.set('testKey', 'value', tree.id, node.id);
    *     var value = blackboard.get('testKey', tree.id, node.id);
    *
    * Note: Internally, the blackboard store these memories in different
    * objects, being the global on `_baseMemory`, the per tree on `_treeMemory`
    * and the per node per tree dynamically create inside the per tree memory
    * (it is accessed via `_treeMemory[id].nodeMemory`). Avoid to use these
    * variables manually, use `get` and `set` instead.
    *
    */
  trait Blackboard extends StObject {
    
    /**
      * Internal method to retrieve the context memory. If treeScope and
      * nodeScope are provided, this method returns the per node per tree
      * memory. If only the treeScope is provided, it returns the per tree
      * memory. If no parameter is provided, it returns the global memory.
      * Notice that, if only nodeScope is provided, this method will still
      * return the global memory.
      *
      */
    def _getMemory(treeScope: String, nodeScope: String): Any
    
    /**
      * Internal method to retrieve the node context memory, given the tree
      * memory. If the memory does not exist, this method creates is.
      *
      */
    def _getNodeMemory(treeMemory: String, nodeScope: String): Any
    
    /**
      * Internal method to retrieve the tree context memory. If the memory does
      * not exist, this method creates it.
      *
      */
    def _getTreeMemory(treeScope: String): Any
    
    /**
      * Retrieves a value in the blackboard. If treeScope and nodeScope are
      * provided, this method will retrieve the value from the per node per tree
      * memory. If only the treeScope is provided, it will retrieve the value
      * from the per tree memory. If no parameter is provided, this method will
      * retrieve from the global memory. If only nodeScope is provided (but
      * treeScope not), this method will still try to retrieve from the global
      * memory.
      *
      */
    def get(key: String, treeScope: String, nodeScope: String): Any
    
    /**
      * Stores a value in the blackboard. If treeScope and nodeScope are
      * provided, this method will save the value into the per node per tree
      * memory. If only the treeScope is provided, it will save the value into
      * the per tree memory. If no parameter is provided, this method will save
      * the value into the global memory. Notice that, if only nodeScope is
      * provided (but treeScope not), this method will still save the value into
      * the global memory.
      *
      */
    def set(key: String, value: String, treeScope: String, nodeScope: String): Unit
  }
  object Blackboard {
    
    inline def apply(
      _getMemory: (String, String) => Any,
      _getNodeMemory: (String, String) => Any,
      _getTreeMemory: String => Any,
      get: (String, String, String) => Any,
      set: (String, String, String, String) => Unit
    ): Blackboard = {
      val __obj = js.Dynamic.literal(_getMemory = js.Any.fromFunction2(_getMemory), _getNodeMemory = js.Any.fromFunction2(_getNodeMemory), _getTreeMemory = js.Any.fromFunction1(_getTreeMemory), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set))
      __obj.asInstanceOf[Blackboard]
    }
    
    extension [Self <: Blackboard](x: Self) {
      
      inline def setGet(value: (String, String, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setSet(value: (String, String, String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
      
      inline def set_getMemory(value: (String, String) => Any): Self = StObject.set(x, "_getMemory", js.Any.fromFunction2(value))
      
      inline def set_getNodeMemory(value: (String, String) => Any): Self = StObject.set(x, "_getNodeMemory", js.Any.fromFunction2(value))
      
      inline def set_getTreeMemory(value: String => Any): Self = StObject.set(x, "_getTreeMemory", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Composite is the base class for all composite nodes. Thus, if you want to
    * create new custom composite nodes, you need to inherit from this class.
    *
    * When creating composite nodes, you will need to propagate the tick signal
    * to the children nodes manually. To do that, override the `tick` method and
    * call the `_execute` method on all nodes. For instance, take a look at how
    * the Sequence node inherit this class and how it call its children:
    *
    *     // Inherit from Composite, using the util function Class.
    *     class Sequence extends Composite {
    *
    *       constructor(){
    *         // Remember to set the name of the node.
    *         super({name: 'Sequence'});
    *       }
    *
    *       // Override the tick function
    *       tick(tick) {
    *
    *         // Iterates over the children
    *         for (var i=0; i<this.children.length; i++) {
    *
    *           // Propagate the tick
    *           var status = this.children[i]._execute(tick);
    *
    *           if (status !== SUCCESS) {
    *               return status;
    *           }
    *         }
    *
    *         return SUCCESS;
    *       }
    *     };
    *
    */
  type Composite = BaseNode
  
  /**
    * Condition is the base class for all condition nodes. Thus, if you want to
    * create new custom condition nodes, you need to inherit from this class.
    *
    */
  type Condition = BaseNode
  
  /**
    * Decorator is the base class for all decorator nodes. Thus, if you want to
    * create new custom decorator nodes, you need to inherit from this class.
    *
    * When creating decorator nodes, you will need to propagate the tick signal
    * to the child node manually, just like the composite nodes. To do that,
    * override the `tick` method and call the `_execute` method on the child
    * node. For instance, take a look at how the Inverter node inherit this
    * class and how it call its children:
    *
    *     // Inherit from Decorator, using the util function Class.
    *     class Inverter extends b3.Decorator {
    *
    *       constructor(){
    *         super({name: 'Invereter'});
    *       }
    *
    *       tick: function(tick) {
    *         if (!this.child) {
    *           return b3.ERROR;
    *         }
    *
    *         // Propagate the tick
    *         var status = this.child._execute(tick);
    *
    *         if (status === b3.SUCCESS) {
    *           status = b3.FAILURE;
    *         } else if (status === b3.FAILURE) {
    *           status = b3.SUCCESS;
    *         }
    *
    *         return status;
    *       }
    *     });
    *
    */
  type Decorator = BaseNode
  
  /**
    * This action node returns `ERROR` always.
    *
    */
  trait Error
    extends StObject
       with BaseNode
  object Error {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Error = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Error]
    }
  }
  
  /**
    * This action node returns `FAILURE` always.
    *
    */
  trait Failer
    extends StObject
       with BaseNode
  object Failer {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Failer = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Failer]
    }
  }
  
  /**
    * The Inverter decorator inverts the result of the child, returning `SUCCESS`
    * for `FAILURE` and `FAILURE` for `SUCCESS`.
    *
    */
  trait Inverter
    extends StObject
       with BaseNode
  object Inverter {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Inverter = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Inverter]
    }
  }
  
  /**
    * This decorator limit the number of times its child can be called. After a
    * certain number of times, the Limiter decorator returns `FAILURE` without
    * executing the child.
    *
    */
  trait Limiter
    extends StObject
       with BaseNode
  object Limiter {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Limiter = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Limiter]
    }
  }
  
  /**
    * The MaxTime decorator limits the maximum time the node child can execute.
    * Notice that it does not interrupt the execution itself (i.e., the child
    * must be non-preemptive), it only interrupts the node after a `RUNNING`
    * status.
    *
    */
  trait MaxTime
    extends StObject
       with BaseNode
  object MaxTime {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): MaxTime = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[MaxTime]
    }
  }
  
  /**
    * MemPriority is similar to Priority node, but when a child returns a
    * `RUNNING` state, its index is recorded and in the next tick the,
    * MemPriority calls the child recorded directly, without calling previous
    * children again.
    *
    */
  trait MemPriority
    extends StObject
       with BaseNode
  object MemPriority {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): MemPriority = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[MemPriority]
    }
  }
  
  /**
    * MemSequence is similar to Sequence node, but when a child returns a
    * `RUNNING` state, its index is recorded and in the next tick the
    * MemPriority call the child recorded directly, without calling previous
    * children again.
    *
    */
  trait MemSequence
    extends StObject
       with BaseNode
  object MemSequence {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): MemSequence = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[MemSequence]
    }
  }
  
  /**
    * Priority ticks its children sequentially until one of them returns
    * `SUCCESS`, `RUNNING` or `ERROR`. If all children return the failure state,
    * the priority also returns `FAILURE`.
    *
    */
  trait Priority
    extends StObject
       with BaseNode
  object Priority {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Priority = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Priority]
    }
  }
  
  /**
    * RepeatUntilFailure is a decorator that repeats the tick signal until the
    * node child returns `FAILURE`, `RUNNING` or `ERROR`. Optionally, a maximum
    * number of repetitions can be defined.
    *
    */
  trait RepeatUntilFailure
    extends StObject
       with BaseNode
  object RepeatUntilFailure {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): RepeatUntilFailure = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[RepeatUntilFailure]
    }
  }
  
  /**
    * RepeatUntilSuccess is a decorator that repeats the tick signal until the
    * node child returns `SUCCESS`, `RUNNING` or `ERROR`. Optionally, a maximum
    * number of repetitions can be defined.
    *
    */
  trait RepeatUntilSuccess
    extends StObject
       with BaseNode
  object RepeatUntilSuccess {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): RepeatUntilSuccess = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[RepeatUntilSuccess]
    }
  }
  
  /**
    * Repeater is a decorator that repeats the tick signal until the child node
    * return `RUNNING` or `ERROR`. Optionally, a maximum number of repetitions
    * can be defined.
    *
    */
  trait Repeater
    extends StObject
       with BaseNode
  object Repeater {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Repeater = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Repeater]
    }
  }
  
  /**
    * This action node returns RUNNING always.
    *
    */
  trait Runner
    extends StObject
       with BaseNode
  object Runner {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Runner = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Runner]
    }
  }
  
  /**
    * The Sequence node ticks its children sequentially until one of them
    * returns `FAILURE`, `RUNNING` or `ERROR`. If all children return the
    * success state, the sequence also returns `SUCCESS`.
    *
    */
  trait Sequence
    extends StObject
       with BaseNode
  object Sequence {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Sequence = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Sequence]
    }
  }
  
  /**
    * This action node returns `SUCCESS` always.
    *
    */
  trait Succeeder
    extends StObject
       with BaseNode
  object Succeeder {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Succeeder = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Succeeder]
    }
  }
  
  /**
    * A new Tick object is instantiated every tick by BehaviorTree. It is passed
    * as parameter to the nodes through the tree during the traversal.
    *
    * The role of the Tick class is to store the instances of tree, debug,
    * target and blackboard. So, all nodes can access these informations.
    *
    * For internal uses, the Tick also is useful to store the open node after
    * the tick signal, in order to let `BehaviorTree` to keep track and close
    * them when necessary.
    *
    * This class also makes a bridge between nodes and the debug, passing the
    * node state to the debug if the last is provided.
    *
    */
  trait Tick extends StObject {
    
    /**
      * Callback when closing a node (called by BaseNode).
      */
    def _closeNode(node: Any): Unit
    
    /**
      * Called when entering a node (called by BaseNode).
      */
    def _enterNode(node: Any): Unit
    
    /**
      * Callback when exiting a node (called by BaseNode).
      */
    def _exitNode(node: Any): Unit
    
    /**
      * Callback when opening a node (called by BaseNode).
      */
    def _openNode(node: Any): Unit
    
    /**
      * Callback when ticking a node (called by BaseNode).
      */
    def _tickNode(node: Any): Unit
  }
  object Tick {
    
    inline def apply(
      _closeNode: Any => Unit,
      _enterNode: Any => Unit,
      _exitNode: Any => Unit,
      _openNode: Any => Unit,
      _tickNode: Any => Unit
    ): Tick = {
      val __obj = js.Dynamic.literal(_closeNode = js.Any.fromFunction1(_closeNode), _enterNode = js.Any.fromFunction1(_enterNode), _exitNode = js.Any.fromFunction1(_exitNode), _openNode = js.Any.fromFunction1(_openNode), _tickNode = js.Any.fromFunction1(_tickNode))
      __obj.asInstanceOf[Tick]
    }
    
    extension [Self <: Tick](x: Self) {
      
      inline def set_closeNode(value: Any => Unit): Self = StObject.set(x, "_closeNode", js.Any.fromFunction1(value))
      
      inline def set_enterNode(value: Any => Unit): Self = StObject.set(x, "_enterNode", js.Any.fromFunction1(value))
      
      inline def set_exitNode(value: Any => Unit): Self = StObject.set(x, "_exitNode", js.Any.fromFunction1(value))
      
      inline def set_openNode(value: Any => Unit): Self = StObject.set(x, "_openNode", js.Any.fromFunction1(value))
      
      inline def set_tickNode(value: Any => Unit): Self = StObject.set(x, "_tickNode", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Wait a few seconds.
    *
    */
  trait Wait
    extends StObject
       with BaseNode
  object Wait {
    
    inline def apply(
      _close: Tick => Unit,
      _enter: Tick => Unit,
      _execute: Tick => Double,
      _exit: Tick => Unit,
      _open: Tick => Unit,
      _tick: Tick => Double,
      close: Tick => Unit,
      enter: Tick => Unit,
      exit: Tick => Unit,
      open: Tick => Unit,
      tick: Tick => Unit
    ): Wait = {
      val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
      __obj.asInstanceOf[Wait]
    }
  }
}
