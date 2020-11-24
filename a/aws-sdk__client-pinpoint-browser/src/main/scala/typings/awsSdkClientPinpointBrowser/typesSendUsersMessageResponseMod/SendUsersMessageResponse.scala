package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendUsersMessageResponse extends js.Object {
  
  /**
    * The unique ID of the Amazon Pinpoint project used to send the message.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * The unique ID assigned to the users-messages request.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[
    (StringDictionary[
      StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
    ]) | (Iterable[
      js.Tuple2[
        String, 
        StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
      ]
    ])
  ] = js.native
}
object SendUsersMessageResponse {
  
  @scala.inline
  def apply(): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
  
  @scala.inline
  implicit class SendUsersMessageResponseOps[Self <: SendUsersMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setResult(
      value: (StringDictionary[
          StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
        ]) | (Iterable[
          js.Tuple2[
            String, 
            StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
          ]
        ])
    ): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
}
