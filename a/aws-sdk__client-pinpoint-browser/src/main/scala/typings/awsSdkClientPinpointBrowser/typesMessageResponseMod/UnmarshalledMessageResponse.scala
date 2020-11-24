package typings.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.UnmarshalledMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledMessageResponse extends MessageResponse {
  
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  @JSName("EndpointResult")
  var EndpointResult_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledEndpointMessageResult]] = js.native
  
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  @JSName("Result")
  var Result_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledMessageResult]] = js.native
}
object UnmarshalledMessageResponse {
  
  @scala.inline
  def apply(): UnmarshalledMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMessageResponse]
  }
  
  @scala.inline
  implicit class UnmarshalledMessageResponseOps[Self <: UnmarshalledMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointResult(value: StringDictionary[UnmarshalledEndpointMessageResult]): Self = this.set("EndpointResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointResult: Self = this.set("EndpointResult", js.undefined)
    
    @scala.inline
    def setResult(value: StringDictionary[UnmarshalledMessageResult]): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
}
