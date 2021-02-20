package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultHyperParameterRanges extends StObject {
  
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.native
  
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.native
  
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.native
}
object DefaultHyperParameterRanges {
  
  @scala.inline
  def apply(): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
  
  @scala.inline
  implicit class DefaultHyperParameterRangesMutableBuilder[Self <: DefaultHyperParameterRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalHyperParameterRanges(value: DefaultCategoricalHyperParameterRanges): Self = StObject.set(x, "categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalHyperParameterRangesUndefined: Self = StObject.set(x, "categoricalHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setCategoricalHyperParameterRangesVarargs(value: DefaultCategoricalHyperParameterRange*): Self = StObject.set(x, "categoricalHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setContinuousHyperParameterRanges(value: DefaultContinuousHyperParameterRanges): Self = StObject.set(x, "continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousHyperParameterRangesUndefined: Self = StObject.set(x, "continuousHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setContinuousHyperParameterRangesVarargs(value: DefaultContinuousHyperParameterRange*): Self = StObject.set(x, "continuousHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setIntegerHyperParameterRanges(value: DefaultIntegerHyperParameterRanges): Self = StObject.set(x, "integerHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerHyperParameterRangesUndefined: Self = StObject.set(x, "integerHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setIntegerHyperParameterRangesVarargs(value: DefaultIntegerHyperParameterRange*): Self = StObject.set(x, "integerHyperParameterRanges", js.Array(value :_*))
  }
}
