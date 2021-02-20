package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterThingRequest extends StObject {
  
  /**
    * The parameters for provisioning a thing. See Provisioning Templates for more information.
    */
  var parameters: js.UndefOr[Parameters] = js.native
  
  /**
    * The provisioning template. See Provisioning Devices That Have Device Certificates for more information.
    */
  var templateBody: TemplateBody = js.native
}
object RegisterThingRequest {
  
  @scala.inline
  def apply(templateBody: TemplateBody): RegisterThingRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterThingRequest]
  }
  
  @scala.inline
  implicit class RegisterThingRequestMutableBuilder[Self <: RegisterThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
  }
}
