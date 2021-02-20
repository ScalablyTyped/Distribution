package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TunedHPOParams extends StObject {
  
  /**
    * A list of the hyperparameter values of the best performing model.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
}
object TunedHPOParams {
  
  @scala.inline
  def apply(): TunedHPOParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunedHPOParams]
  }
  
  @scala.inline
  implicit class TunedHPOParamsMutableBuilder[Self <: TunedHPOParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmHyperParameters(value: HyperParameters): Self = StObject.set(x, "algorithmHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmHyperParametersUndefined: Self = StObject.set(x, "algorithmHyperParameters", js.undefined)
  }
}
