package typings.behavior3

import typings.behavior3.anon.Category
import typings.behavior3.anon.Child
import typings.behavior3.anon.ChildMaxLoop
import typings.behavior3.anon.Children
import typings.behavior3.anon.MaxLoop
import typings.behavior3.anon.Milliseconds
import typings.behavior3.anon.Name
import typings.behavior3.anon.`0`
import typings.behavior3.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object b3 {
    
    @JSGlobal("b3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("b3.ACTION")
    @js.native
    val ACTION_ : String = js.native
    
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
    @JSGlobal("b3.Action")
    @js.native
    /**
      * Creates an instance of Action.
      */
    class Action ()
      extends StObject
         with typings.behavior3.b3.BaseNode {
      def this(hasNameTitleProperties: Name) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
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
    @JSGlobal("b3.BaseNode")
    @js.native
    /**
      * Initialization method.
      */
    class BaseNode ()
      extends StObject
         with typings.behavior3.b3.BaseNode {
      def this(hasCategoryNameTitleDescriptionProperties: Category) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
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
    @JSGlobal("b3.BehaviorTree")
    @js.native
    /**
      * Initialization method.
      */
    class BehaviorTree ()
      extends StObject
         with typings.behavior3.b3.BehaviorTree
    
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
    @JSGlobal("b3.Blackboard")
    @js.native
    /**
      * Initialization method.
      */
    class Blackboard ()
      extends StObject
         with typings.behavior3.b3.Blackboard {
      
      /**
        * Internal method to retrieve the context memory. If treeScope and
        * nodeScope are provided, this method returns the per node per tree
        * memory. If only the treeScope is provided, it returns the per tree
        * memory. If no parameter is provided, it returns the global memory.
        * Notice that, if only nodeScope is provided, this method will still
        * return the global memory.
        *
        */
      /* CompleteClass */
      override def _getMemory(treeScope: String, nodeScope: String): js.Any = js.native
      
      /**
        * Internal method to retrieve the node context memory, given the tree
        * memory. If the memory does not exist, this method creates is.
        *
        */
      /* CompleteClass */
      override def _getNodeMemory(treeMemory: String, nodeScope: String): js.Any = js.native
      
      /**
        * Internal method to retrieve the tree context memory. If the memory does
        * not exist, this method creates it.
        *
        */
      /* CompleteClass */
      override def _getTreeMemory(treeScope: String): js.Any = js.native
      
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
      /* CompleteClass */
      override def get(key: String, treeScope: String, nodeScope: String): js.Any = js.native
      
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
      /* CompleteClass */
      override def set(key: String, value: String, treeScope: String, nodeScope: String): Unit = js.native
    }
    
    @JSGlobal("b3.COMPOSITE")
    @js.native
    val COMPOSITE_ : String = js.native
    
    @JSGlobal("b3.CONDITION")
    @js.native
    val CONDITION_ : String = js.native
    
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
    @JSGlobal("b3.Composite")
    @js.native
    /**
      * Creates an instance of Composite.
      */
    class Composite ()
      extends StObject
         with typings.behavior3.b3.BaseNode {
      def this(hasChildrenNameTitleProperties: Children) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * Condition is the base class for all condition nodes. Thus, if you want to
      * create new custom condition nodes, you need to inherit from this class.
      *
      */
    @JSGlobal("b3.Condition")
    @js.native
    /**
      * Creates an instance of Condition.
      */
    class Condition ()
      extends StObject
         with typings.behavior3.b3.BaseNode {
      def this(hasNameTitleProperties: Name) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    @JSGlobal("b3.DECORATOR")
    @js.native
    val DECORATOR_ : String = js.native
    
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
    @JSGlobal("b3.Decorator")
    @js.native
    /**
      * Creates an instance of Decorator.
      */
    class Decorator ()
      extends StObject
         with typings.behavior3.b3.BaseNode {
      def this(hasChildNameTitleProperties: Child) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    @JSGlobal("b3.ERROR")
    @js.native
    val ERROR_ : Double = js.native
    
    /**
      * This action node returns `ERROR` always.
      *
      */
    @JSGlobal("b3.Error")
    @js.native
    /**
      * Creates an instance of Error.
      */
    class Error ()
      extends StObject
         with typings.behavior3.b3.Error {
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    @JSGlobal("b3.FAILURE")
    @js.native
    val FAILURE: Double = js.native
    
    /**
      * This action node returns `FAILURE` always.
      *
      */
    @JSGlobal("b3.Failer")
    @js.native
    /**
      * Creates an instance of Failer.
      */
    class Failer ()
      extends StObject
         with typings.behavior3.b3.Failer {
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * The Inverter decorator inverts the result of the child, returning `SUCCESS`
      * for `FAILURE` and `FAILURE` for `SUCCESS`.
      *
      */
    @JSGlobal("b3.Inverter")
    @js.native
    /**
      * Creates an instance of Inverter.
      */
    class Inverter ()
      extends StObject
         with typings.behavior3.b3.Inverter {
      def this(hasChild: `1`) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * This decorator limit the number of times its child can be called. After a
      * certain number of times, the Limiter decorator returns `FAILURE` without
      * executing the child.
      *
      */
    @JSGlobal("b3.Limiter")
    @js.native
    /**
      * Creates an instance of Limiter.
      *
      * Settings parameters:
      *
      * - **maxLoop** (*Integer*) Maximum number of repetitions.
      * - **child** (*BaseNode*) The child node.
      *
      */
    class Limiter ()
      extends StObject
         with typings.behavior3.b3.Limiter {
      def this(hasChildMaxLoop: MaxLoop) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * The MaxTime decorator limits the maximum time the node child can execute.
      * Notice that it does not interrupt the execution itself (i.e., the child
      * must be non-preemptive), it only interrupts the node after a `RUNNING`
      * status.
      *
      */
    @JSGlobal("b3.MaxTime")
    @js.native
    /**
      * Creates an instance of MaxTime.
      *
      * - **maxTime** (*Integer*) Maximum time a child can execute.
      * - **child** (*BaseNode*) The child node.
      *
      */
    class MaxTime ()
      extends StObject
         with typings.behavior3.b3.MaxTime {
      def this(hasMaxTimeChild: typings.behavior3.anon.MaxTime) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * MemPriority is similar to Priority node, but when a child returns a
      * `RUNNING` state, its index is recorded and in the next tick the,
      * MemPriority calls the child recorded directly, without calling previous
      * children again.
      *
      */
    @JSGlobal("b3.MemPriority")
    @js.native
    /**
      * Creates an instance of MemPriority.
      */
    class MemPriority ()
      extends StObject
         with typings.behavior3.b3.MemPriority {
      def this(hasChildren: `0`) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * MemSequence is similar to Sequence node, but when a child returns a
      * `RUNNING` state, its index is recorded and in the next tick the
      * MemPriority call the child recorded directly, without calling previous
      * children again.
      *
      */
    @JSGlobal("b3.MemSequence")
    @js.native
    /**
      * Creates an instance of MemSequence.
      */
    class MemSequence ()
      extends StObject
         with typings.behavior3.b3.MemSequence {
      def this(hasChildren: `0`) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * Priority ticks its children sequentially until one of them returns
      * `SUCCESS`, `RUNNING` or `ERROR`. If all children return the failure state,
      * the priority also returns `FAILURE`.
      *
      */
    @JSGlobal("b3.Priority")
    @js.native
    /**
      * Creates an instance of Priority.
      */
    class Priority ()
      extends StObject
         with typings.behavior3.b3.Priority {
      def this(hasChildren: `0`) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    @JSGlobal("b3.RUNNING")
    @js.native
    val RUNNING: Double = js.native
    
    /**
      * RepeatUntilFailure is a decorator that repeats the tick signal until the
      * node child returns `FAILURE`, `RUNNING` or `ERROR`. Optionally, a maximum
      * number of repetitions can be defined.
      *
      */
    @JSGlobal("b3.RepeatUntilFailure")
    @js.native
    /**
      * Creates an instance of RepeatUntilFailure.
      *
      * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
      * - **child** (*BaseNode*) The child node.
      *
      */
    class RepeatUntilFailure ()
      extends StObject
         with typings.behavior3.b3.RepeatUntilFailure {
      def this(hasMaxLoopChild: ChildMaxLoop) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * RepeatUntilSuccess is a decorator that repeats the tick signal until the
      * node child returns `SUCCESS`, `RUNNING` or `ERROR`. Optionally, a maximum
      * number of repetitions can be defined.
      *
      */
    @JSGlobal("b3.RepeatUntilSuccess")
    @js.native
    /**
      * Creates an instance of RepeatUntilSuccess.
      *
      * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
      * - **child** (*BaseNode*) The child node.
      *
      */
    class RepeatUntilSuccess ()
      extends StObject
         with typings.behavior3.b3.RepeatUntilSuccess {
      def this(hasMaxLoopChild: ChildMaxLoop) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * Repeater is a decorator that repeats the tick signal until the child node
      * return `RUNNING` or `ERROR`. Optionally, a maximum number of repetitions
      * can be defined.
      *
      */
    @JSGlobal("b3.Repeater")
    @js.native
    /**
      * Creates an instance of MaxTime.
      *
      * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
      * - **child** (*BaseNode*) The child node.
      *
      */
    class Repeater ()
      extends StObject
         with typings.behavior3.b3.Repeater {
      def this(hasMaxLoopChild: ChildMaxLoop) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * This action node returns RUNNING always.
      *
      */
    @JSGlobal("b3.Runner")
    @js.native
    /**
      * Creates an instance of Runner.
      */
    class Runner ()
      extends StObject
         with typings.behavior3.b3.Runner {
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    @JSGlobal("b3.SUCCESS")
    @js.native
    val SUCCESS: Double = js.native
    
    /**
      * The Sequence node ticks its children sequentially until one of them
      * returns `FAILURE`, `RUNNING` or `ERROR`. If all children return the
      * success state, the sequence also returns `SUCCESS`.
      *
      */
    @JSGlobal("b3.Sequence")
    @js.native
    /**
      * Creates an instance of Sequence.
      */
    class Sequence ()
      extends StObject
         with typings.behavior3.b3.Sequence {
      def this(hasChildren: `0`) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * This action node returns `SUCCESS` always.
      *
      */
    @JSGlobal("b3.Succeeder")
    @js.native
    /**
      * Creates an instance of Succeeder.
      */
    class Succeeder ()
      extends StObject
         with typings.behavior3.b3.Succeeder {
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
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
    @JSGlobal("b3.Tick")
    @js.native
    /**
      * Initialization method.
      */
    class Tick ()
      extends StObject
         with typings.behavior3.b3.Tick {
      
      /**
        * Callback when closing a node (called by BaseNode).
        */
      /* CompleteClass */
      override def _closeNode(node: js.Any): Unit = js.native
      
      /**
        * Called when entering a node (called by BaseNode).
        */
      /* CompleteClass */
      override def _enterNode(node: js.Any): Unit = js.native
      
      /**
        * Callback when exiting a node (called by BaseNode).
        */
      /* CompleteClass */
      override def _exitNode(node: js.Any): Unit = js.native
      
      /**
        * Callback when opening a node (called by BaseNode).
        */
      /* CompleteClass */
      override def _openNode(node: js.Any): Unit = js.native
      
      /**
        * Callback when ticking a node (called by BaseNode).
        */
      /* CompleteClass */
      override def _tickNode(node: js.Any): Unit = js.native
    }
    
    @JSGlobal("b3.VERSION")
    @js.native
    val VERSION: String = js.native
    
    /**
      * Wait a few seconds.
      *
      */
    @JSGlobal("b3.Wait")
    @js.native
    /**
      * Creates an instance of Wait.
      */
    class Wait ()
      extends StObject
         with typings.behavior3.b3.Wait {
      def this(hasMilliseconds: Milliseconds) = this()
      
      /**
        * Wrapper for close method.
        */
      /* CompleteClass */
      override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for enter method.
        */
      /* CompleteClass */
      override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * This is the main method to propagate the tick signal to this node. This
        * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
        * `exit`. It only opens a node if it is not already open. In the same
        * way, this method only close a node if the node  returned a status
        * different of `RUNNING`.
        *
        */
      /* CompleteClass */
      override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Wrapper for exit method.
        */
      /* CompleteClass */
      override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for open method.
        */
      /* CompleteClass */
      override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Wrapper for tick method.
        */
      /* CompleteClass */
      override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
      
      /**
        * Close method, override this to use. This method is called after the tick
        * callback, and only if the tick return a state different from
        * `RUNNING`.
        *
        */
      /* CompleteClass */
      override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Enter method, override this to use. It is called every time a node is
        * asked to execute, before the tick itself.
        */
      /* CompleteClass */
      override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Exit method, override this to use. Called every time in the end of the
        * execution.
        *
        */
      /* CompleteClass */
      override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Open method, override this to use. It is called only before the tick
        * callback and only if the not isn't closed.
        *
        * Note: a node will be closed if it returned `RUNNING` in the tick.
        *
        */
      /* CompleteClass */
      override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
      
      /**
        * Tick method, override this to use. This method must contain the real
        * execution of node (perform a task, call children, etc.). It is called
        * every time a node is asked to execute.
        *
        */
      /* CompleteClass */
      override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
    }
    
    /**
      * This function is used to create unique IDs for trees and nodes.
      *
      * (consult http://www.ietf.org/rfc/rfc4122.txt).
      *
      */
    inline def createUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUUID")().asInstanceOf[String]
  }
}
