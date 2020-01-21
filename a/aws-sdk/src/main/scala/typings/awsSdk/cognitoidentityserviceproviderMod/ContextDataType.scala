package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDataType extends js.Object {
  /**
    * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
    */
  var EncodedData: js.UndefOr[StringType] = js.native
  /**
    * HttpHeaders received on your server in same order.
    */
  var HttpHeaders: HttpHeaderList = js.native
  /**
    * Source IP address of your user.
    */
  var IpAddress: StringType = js.native
  /**
    * Your server endpoint where this API is invoked.
    */
  var ServerName: StringType = js.native
  /**
    * Your server path where this API is invoked. 
    */
  var ServerPath: StringType = js.native
}

object ContextDataType {
  @scala.inline
  def apply(
    HttpHeaders: HttpHeaderList,
    IpAddress: StringType,
    ServerName: StringType,
    ServerPath: StringType,
    EncodedData: StringType = null
  ): ContextDataType = {
    val __obj = js.Dynamic.literal(HttpHeaders = HttpHeaders.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], ServerPath = ServerPath.asInstanceOf[js.Any])
    if (EncodedData != null) __obj.updateDynamic("EncodedData")(EncodedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDataType]
  }
}

