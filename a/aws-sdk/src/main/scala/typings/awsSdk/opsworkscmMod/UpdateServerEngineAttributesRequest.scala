package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerEngineAttributesRequest extends js.Object {
  /**
    * The name of the engine attribute to update. 
    */
  var AttributeName: typings.awsSdk.opsworkscmMod.AttributeName = js.native
  /**
    * The value to set for the attribute. 
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.opsworkscmMod.AttributeValue] = js.native
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object UpdateServerEngineAttributesRequest {
  @scala.inline
  def apply(AttributeName: AttributeName, ServerName: ServerName, AttributeValue: AttributeValue = null): UpdateServerEngineAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerEngineAttributesRequest]
  }
}

