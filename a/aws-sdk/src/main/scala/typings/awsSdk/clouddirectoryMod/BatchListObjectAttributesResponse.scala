package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectAttributesResponse extends js.Object {
  /**
    * The attributes map that is associated with the object. AttributeArn is the key; attribute value is the value.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object BatchListObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null, NextToken: NextToken = null): BatchListObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectAttributesResponse]
  }
}

