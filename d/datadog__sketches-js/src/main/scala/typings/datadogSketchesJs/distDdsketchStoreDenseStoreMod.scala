package typings.datadogSketchesJs

import typings.datadogSketchesJs.distDdsketchStoreTypesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchStoreDenseStoreMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store/DenseStore", "DenseStore")
  @js.native
  /**
    * Initialize a new DenseStore
    *
    * @param chunkSize The number of bins to add each time the bins grow (default 128)
    */
  open class DenseStore ()
    extends StObject
       with Store[DenseStore] {
    def this(chunkSize: Double) = this()
    
    /**
      * Adjust the `bins`, the `offset`, the `minKey`, and the `maxKey`
      * without resizing the bins, in order to try to make it fit the specified range.
      * Collapse to the left if necessary
      */
    def _adjust(newMinKey: Double, newMaxKey: Double): Unit = js.native
    
    /** Center the bins. This changes the `offset` */
    def _centerBins(newMinKey: Double, newMaxKey: Double): Unit = js.native
    
    /** Grow the bins as necessary, and call _adjust */
    def _extendRange(key: Double): Unit = js.native
    def _extendRange(key: Double, secondKey: Double): Unit = js.native
    
    /** Calculate the bin index for the key, extending the range if necessary */
    def _getIndex(key: Double): Double = js.native
    
    def _getNewLength(newMinKey: Double, newMaxKey: Double): Double = js.native
    
    /** Shift the bins by `shift`. This changes the `offset` */
    def _shiftBins(shift: Double): Unit = js.native
    
    def add(key: Double, weight: Double): Unit = js.native
    
    /** Storage for counts */
    var bins: js.Array[Double] = js.native
    
    /** The number of bins to grow when necessary */
    var chunkSize: Double = js.native
    
    /** The maximum key bin */
    var maxKey: Double = js.native
    
    /** The minimum key bin */
    var minKey: Double = js.native
    
    /** The difference between the keys and the index in which they are stored */
    var offset: Double = js.native
    
    def toProto(): Any = js.native
  }
  /* static members */
  object DenseStore {
    
    @JSImport("@datadog/sketches-js/dist/ddsketch/store/DenseStore", "DenseStore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromProto(): DenseStore = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")().asInstanceOf[DenseStore]
    inline def fromProto(
      protoStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStore */ Any
    ): DenseStore = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")(protoStore.asInstanceOf[js.Any]).asInstanceOf[DenseStore]
  }
}
