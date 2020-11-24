package typings.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.MessageResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageResponse extends js.Object {
  
  /**
    * Application id of the message.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  var EndpointResult: js.UndefOr[
    StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
  ] = js.native
  
  /**
    * Original request Id for which this message was delivered.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  var Result: js.UndefOr[StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]])] = js.native
}
object MessageResponse {
  
  @scala.inline
  def apply(): MessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageResponse]
  }
  
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setEndpointResult(
      value: StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
    ): Self = this.set("EndpointResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointResult: Self = this.set("EndpointResult", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setResult(value: StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]])): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
}
