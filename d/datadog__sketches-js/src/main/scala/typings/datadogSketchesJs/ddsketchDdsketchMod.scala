package typings.datadogSketchesJs

import typings.datadogSketchesJs.storeMod.DenseStore
import typings.datadogSketchesJs.typesMod.Mapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddsketchDdsketchMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/DDSketch", "DDSketch")
  @js.native
  /**
    * Initialize a new DDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    */
  open class DDSketch ()
    extends StObject
       with BaseDDSketch {
    def this(hasRelativeAccuracy: SketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/DDSketch", "LogCollapsingHighestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingHighestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before highest indices are collapsed (default 2048)
    */
  open class LogCollapsingHighestDenseDDSketch ()
    extends StObject
       with BaseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/DDSketch", "LogCollapsingLowestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingLowestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before lowest indices are collapsed (default 2048)
    */
  open class LogCollapsingLowestDenseDDSketch ()
    extends StObject
       with BaseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
  
  /** Base class for DDSketch*/
  @js.native
  trait BaseDDSketch extends StObject {
    
    /**
      * Helper method to copy the contents of the parameter `store` into this store
      * @see DDSketch.merge to merge two sketches safely
      *
      * @param store The store to be copied into the caller store
      */
    def _copy(sketch: DDSketch): Unit = js.native
    
    /**
      * Add a value to the sketch
      *
      * @param value The value to be added
      * @param weight The amount to weight the value (default 1.0)
      *
      * @throws Error if `weight` is 0 or negative
      */
    def accept(value: Double): Unit = js.native
    def accept(value: Double, weight: Double): Unit = js.native
    
    /** The total number of values seen by the sketch */
    var count: Double = js.native
    
    /**
      * Retrieve a value from the sketch at the quantile
      *
      * @param quantile A number between `0` and `1` (inclusive)
      */
    def getValueAtQuantile(quantile: Double): Double = js.native
    
    /** The mapping between values and indicies for the sketch */
    var mapping: Mapping = js.native
    
    /** The maximum value seen by the sketch */
    var max: Double = js.native
    
    /**
      * Merge the contents of the parameter `sketch` into this sketch
      *
      * @param sketch The sketch to merge into the caller sketch
      * @throws Error if the sketches were initialized with different `relativeAccuracy` values
      */
    def merge(sketch: DDSketch): Unit = js.native
    
    /**
      * Determine whether two sketches can be merged
      *
      * @param sketch The sketch to be merged into the caller sketch
      */
    def mergeable(sketch: DDSketch): Boolean = js.native
    
    /** The minimum value seen by the sketch */
    var min: Double = js.native
    
    /** Storage for negative values */
    var negativeStore: DenseStore = js.native
    
    /** Storage for positive values */
    var store: DenseStore = js.native
    
    /** The sum of the values seen by the sketch */
    var sum: Double = js.native
    
    /** Serialize a DDSketch to protobuf format */
    def toProto(): js.typedarray.Uint8Array = js.native
    
    /** The count of zero values */
    var zeroCount: Double = js.native
  }
  
  trait BaseSketchConfig extends StObject {
    
    /** The mapping between values and indicies for the sketch */
    var mapping: Mapping
    
    /** Storage for negative values */
    var negativeStore: DenseStore
    
    /** Storage for positive values */
    var store: DenseStore
    
    /** The number of zeroes added to the sketch */
    var zeroCount: Double
  }
  object BaseSketchConfig {
    
    inline def apply(mapping: Mapping, negativeStore: DenseStore, store: DenseStore, zeroCount: Double): BaseSketchConfig = {
      val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], negativeStore = negativeStore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zeroCount = zeroCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSketchConfig]
    }
    
    extension [Self <: BaseSketchConfig](x: Self) {
      
      inline def setMapping(value: Mapping): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setNegativeStore(value: DenseStore): Self = StObject.set(x, "negativeStore", value.asInstanceOf[js.Any])
      
      inline def setStore(value: DenseStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setZeroCount(value: Double): Self = StObject.set(x, "zeroCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogCollapsingSketchConfig extends StObject {
    
    var binLimit: js.UndefOr[Double] = js.undefined
    
    /** The accuracy guarantee of the sketch, between 0-1 (default 0.01) */
    var relativeAccuracy: js.UndefOr[Double] = js.undefined
  }
  object LogCollapsingSketchConfig {
    
    inline def apply(): LogCollapsingSketchConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogCollapsingSketchConfig]
    }
    
    extension [Self <: LogCollapsingSketchConfig](x: Self) {
      
      inline def setBinLimit(value: Double): Self = StObject.set(x, "binLimit", value.asInstanceOf[js.Any])
      
      inline def setBinLimitUndefined: Self = StObject.set(x, "binLimit", js.undefined)
      
      inline def setRelativeAccuracy(value: Double): Self = StObject.set(x, "relativeAccuracy", value.asInstanceOf[js.Any])
      
      inline def setRelativeAccuracyUndefined: Self = StObject.set(x, "relativeAccuracy", js.undefined)
    }
  }
  
  trait SketchConfig extends StObject {
    
    /** The accuracy guarantee of the sketch, between 0-1 (default 0.01) */
    var relativeAccuracy: js.UndefOr[Double] = js.undefined
  }
  object SketchConfig {
    
    inline def apply(): SketchConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SketchConfig]
    }
    
    extension [Self <: SketchConfig](x: Self) {
      
      inline def setRelativeAccuracy(value: Double): Self = StObject.set(x, "relativeAccuracy", value.asInstanceOf[js.Any])
      
      inline def setRelativeAccuracyUndefined: Self = StObject.set(x, "relativeAccuracy", js.undefined)
    }
  }
}
