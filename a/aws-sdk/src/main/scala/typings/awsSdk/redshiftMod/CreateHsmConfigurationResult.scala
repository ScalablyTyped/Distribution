package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmConfigurationResult extends StObject {
  
  var HsmConfiguration: js.UndefOr[typings.awsSdk.redshiftMod.HsmConfiguration] = js.undefined
}
object CreateHsmConfigurationResult {
  
  @scala.inline
  def apply(): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
  
  @scala.inline
  implicit class CreateHsmConfigurationResultMutableBuilder[Self <: CreateHsmConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmConfiguration(value: HsmConfiguration): Self = StObject.set(x, "HsmConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmConfigurationUndefined: Self = StObject.set(x, "HsmConfiguration", js.undefined)
  }
}
