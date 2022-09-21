package typings.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeTypesMod {
  
  @js.native
  trait Store[S] extends StObject {
    
    /** Update the counter at the specified index key, growing the number of bins if necessary */
    def add(key: Double): Unit = js.native
    
    /** Directly clone the contents of the parameter `store` into this store */
    def copy(store: S): Unit = js.native
    
    /** The total number of values added to the store */
    var count: Double = js.native
    
    /** Return the key for the value at the given rank */
    def keyAtRank(rank: Double): Unit = js.native
    def keyAtRank(rank: Double, reverse: Boolean): Unit = js.native
    
    /** Return the length of the underlying storage (`bins`) */
    def length(): Double = js.native
    
    /** Merge the contents of the parameter `store` into this store */
    def merge(store: S): Unit = js.native
  }
}
