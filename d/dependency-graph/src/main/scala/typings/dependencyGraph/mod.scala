package typings.dependencyGraph

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dependency-graph", "DepGraph")
  @js.native
  /**
    * Creates an instance of DepGraph with optional Options.
    */
  open class DepGraph[T] () extends StObject {
    def this(opts: Options) = this()
    
    /**
      * Add a dependency between two nodes (will throw an Error if one of the nodes does not exist).
      * @param {string} from
      * @param {string} to
      */
    def addDependency(from: String, to: String): Unit = js.native
    
    /**
      * Add a node in the graph with optional data. If data is not given, name will be used as data.
      * @param {string} name
      * @param data
      */
    def addNode(name: String): Unit = js.native
    def addNode(name: String, data: T): Unit = js.native
    
    /**
      * Get an array containing the nodes that depend on the specified node (transitively). If leavesOnly is true, only nodes that do not have any dependants will be returned in the array.
      * @param {string} name
      * @param {boolean} leavesOnly
      */
    def dependantsOf(name: String): js.Array[String] = js.native
    def dependantsOf(name: String, leavesOnly: Boolean): js.Array[String] = js.native
    
    /**
      * Get an array containing the nodes that the specified node depends on (transitively). If leavesOnly is true, only nodes that do not depend on any other nodes will be returned in the array.
      * @param {string} name
      * @param {boolean} leavesOnly
      */
    def dependenciesOf(name: String): js.Array[String] = js.native
    def dependenciesOf(name: String, leavesOnly: Boolean): js.Array[String] = js.native
    
    /**
      * Alias of `dependantsOf`
      *
      * @see dependantsOf
      * @param name
      * @param leavesOnly
      */
    def dependentsOf(name: String): js.Array[String] = js.native
    def dependentsOf(name: String, leavesOnly: Boolean): js.Array[String] = js.native
    
    /**
      * Get an array containing the nodes that directly depend on the specified node.
      * @param name
      */
    def directDependantsOf(name: String): js.Array[String] = js.native
    
    /**
      * Get an array containing the direct dependency nodes of the specified node.
      * @param name
      */
    def directDependenciesOf(name: String): js.Array[String] = js.native
    
    /**
      * Alias of `directDependantsOf`
      *
      * @see directDependantsOf
      * @param {string} name
      */
    def directDependentsOf(name: String): js.Array[String] = js.native
    
    /**
      * Get an array of nodes that have no dependants (i.e. nothing depends on them).
      */
    def entryNodes(): js.Array[String] = js.native
    
    /**
      * Get the data associated with a node (will throw an Error if the node does not exist).
      * @param {string} name
      */
    def getNodeData(name: String): T = js.native
    
    /**
      * Check if a node exists in the graph.
      * @param {string} name
      */
    def hasNode(name: String): Boolean = js.native
    
    /**
      * Construct the overall processing order for the dependency graph. If leavesOnly is true, only nodes that do not depend on any other nodes will be returned.
      * @param {boolean} leavesOnly
      */
    def overallOrder(): js.Array[String] = js.native
    def overallOrder(leavesOnly: Boolean): js.Array[String] = js.native
    
    /**
      * Remove a dependency between two nodes.
      * @param {string} from
      * @param {string} to
      */
    def removeDependency(from: String, to: String): Unit = js.native
    
    /**
      * Remove a node from the graph.
      * @param {string} name
      */
    def removeNode(name: String): Unit = js.native
    
    /**
      * Set the data for an existing node (will throw an Error if the node does not exist).
      * @param {string} name
      * @param data
      */
    def setNodeData(name: String): Unit = js.native
    def setNodeData(name: String, data: T): Unit = js.native
    
    /**
      * The number of nodes in the graph.
      */
    def size(): Double = js.native
  }
  
  @JSImport("dependency-graph", "DepGraphCycleError")
  @js.native
  open class DepGraphCycleError ()
    extends StObject
       with Error {
    
    var cyclePath: js.Array[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait Options extends StObject {
    
    var circular: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    }
  }
}
