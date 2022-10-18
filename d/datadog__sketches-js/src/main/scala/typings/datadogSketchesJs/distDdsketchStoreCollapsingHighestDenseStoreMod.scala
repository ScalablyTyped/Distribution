package typings.datadogSketchesJs

import typings.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchStoreCollapsingHighestDenseStoreMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store/CollapsingHighestDenseStore", "CollapsingHighestDenseStore")
  @js.native
  open class CollapsingHighestDenseStore protected () extends DenseStore {
    /**
      * Initialize a new CollapsingHighestDenseStore
      *
      * @param binLimit The maximum number of bins
      * @param chunkSize The number of bins to add each time the bins grow (default 128)
      */
    def this(binLimit: Double) = this()
    def this(binLimit: Double, chunkSize: Double) = this()
    
    /** The maximum number of bins */
    var binLimit: Double = js.native
    
    /**
      * Directly clone the contents of the parameter `store` into this store
      *
      * @param store The store to be copied into the caller store
      */
    def copy(store: CollapsingHighestDenseStore): Unit = js.native
    
    /** Whether the store has been collapsed to make room for additional keys */
    var isCollapsed: Boolean = js.native
    
    /**
      * Merge the contents of the parameter `store` into this store
      *
      * @param store The store to merge into the caller store
      */
    def merge(store: CollapsingHighestDenseStore): Unit = js.native
  }
}
