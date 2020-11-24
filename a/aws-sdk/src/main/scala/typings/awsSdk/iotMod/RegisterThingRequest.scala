package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterThingRequest extends js.Object {
  
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
  implicit class RegisterThingRequestOps[Self <: RegisterThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
