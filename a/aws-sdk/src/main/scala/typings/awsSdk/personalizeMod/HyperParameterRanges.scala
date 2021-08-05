package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterRanges extends StObject {
  
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.undefined
  
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.undefined
  
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.undefined
}
object HyperParameterRanges {
  
  inline def apply(): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterRanges]
  }
  
  extension [Self <: HyperParameterRanges](x: Self) {
    
    inline def setCategoricalHyperParameterRanges(value: CategoricalHyperParameterRanges): Self = StObject.set(x, "categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setCategoricalHyperParameterRangesUndefined: Self = StObject.set(x, "categoricalHyperParameterRanges", js.undefined)
    
    inline def setCategoricalHyperParameterRangesVarargs(value: CategoricalHyperParameterRange*): Self = StObject.set(x, "categoricalHyperParameterRanges", js.Array(value :_*))
    
    inline def setContinuousHyperParameterRanges(value: ContinuousHyperParameterRanges): Self = StObject.set(x, "continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setContinuousHyperParameterRangesUndefined: Self = StObject.set(x, "continuousHyperParameterRanges", js.undefined)
    
    inline def setContinuousHyperParameterRangesVarargs(value: ContinuousHyperParameterRange*): Self = StObject.set(x, "continuousHyperParameterRanges", js.Array(value :_*))
    
    inline def setIntegerHyperParameterRanges(value: IntegerHyperParameterRanges): Self = StObject.set(x, "integerHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setIntegerHyperParameterRangesUndefined: Self = StObject.set(x, "integerHyperParameterRanges", js.undefined)
    
    inline def setIntegerHyperParameterRangesVarargs(value: IntegerHyperParameterRange*): Self = StObject.set(x, "integerHyperParameterRanges", js.Array(value :_*))
  }
}
