package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterRanges extends StObject {
  
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.native
  
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.native
  
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.native
}
object HyperParameterRanges {
  
  @scala.inline
  def apply(): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterRanges]
  }
  
  @scala.inline
  implicit class HyperParameterRangesMutableBuilder[Self <: HyperParameterRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalHyperParameterRanges(value: CategoricalHyperParameterRanges): Self = StObject.set(x, "categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalHyperParameterRangesUndefined: Self = StObject.set(x, "categoricalHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setCategoricalHyperParameterRangesVarargs(value: CategoricalHyperParameterRange*): Self = StObject.set(x, "categoricalHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setContinuousHyperParameterRanges(value: ContinuousHyperParameterRanges): Self = StObject.set(x, "continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousHyperParameterRangesUndefined: Self = StObject.set(x, "continuousHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setContinuousHyperParameterRangesVarargs(value: ContinuousHyperParameterRange*): Self = StObject.set(x, "continuousHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setIntegerHyperParameterRanges(value: IntegerHyperParameterRanges): Self = StObject.set(x, "integerHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerHyperParameterRangesUndefined: Self = StObject.set(x, "integerHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setIntegerHyperParameterRangesVarargs(value: IntegerHyperParameterRange*): Self = StObject.set(x, "integerHyperParameterRanges", js.Array(value :_*))
  }
}
