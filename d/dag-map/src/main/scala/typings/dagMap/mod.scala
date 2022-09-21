package typings.dagMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dag-map", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with DAG[T]
  
  type Callback[T] = js.Function2[/* key */ String, /* value */ js.UndefOr[T], Unit]
  
  @js.native
  trait DAG[T] extends StObject {
    
    /* private */ var _vertices: Any = js.native
    
    /**
      * Adds a key/value pair with dependencies on other key/value pairs.
      *
      * @public
      * @param key    The key of the vertex to be added.
      * @param value  The value of that vertex.
      * @param before A key or array of keys of the vertices that must
      *               be visited before this vertex.
      * @param after  An string or array of strings with the keys of the
      *               vertices that must be after this vertex is visited.
      */
    def add(key: String): Unit = js.native
    def add(key: String, value: T): Unit = js.native
    def add(key: String, value: T, before: Unit, after: MaybeStringOrArray): Unit = js.native
    def add(key: String, value: T, before: MaybeStringOrArray): Unit = js.native
    def add(key: String, value: T, before: MaybeStringOrArray, after: MaybeStringOrArray): Unit = js.native
    def add(key: String, value: Unit, before: Unit, after: MaybeStringOrArray): Unit = js.native
    def add(key: String, value: Unit, before: MaybeStringOrArray): Unit = js.native
    def add(key: String, value: Unit, before: MaybeStringOrArray, after: MaybeStringOrArray): Unit = js.native
    
    /**
      * @deprecated please use add.
      */
    def addEdges(key: String): Unit = js.native
    def addEdges(key: String, value: T): Unit = js.native
    def addEdges(key: String, value: T, before: Unit, after: MaybeStringOrArray): Unit = js.native
    def addEdges(key: String, value: T, before: MaybeStringOrArray): Unit = js.native
    def addEdges(key: String, value: T, before: MaybeStringOrArray, after: MaybeStringOrArray): Unit = js.native
    def addEdges(key: String, value: Unit, before: Unit, after: MaybeStringOrArray): Unit = js.native
    def addEdges(key: String, value: Unit, before: MaybeStringOrArray): Unit = js.native
    def addEdges(key: String, value: Unit, before: MaybeStringOrArray, after: MaybeStringOrArray): Unit = js.native
    
    /**
      * Visits key/value pairs in topological order.
      *
      * @public
      * @param callback The function to be invoked with each key/value.
      */
    def each(callback: Callback[T]): Unit = js.native
    
    /**
      * @deprecated please use each.
      */
    def topsort(callback: Callback[T]): Unit = js.native
  }
  
  type MaybeStringOrArray = js.UndefOr[String | js.Array[String]]
}
