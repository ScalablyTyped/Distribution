package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexFieldsResponse extends js.Object {
  /**
    * The index fields configured for the domain.
    */
  var IndexFields: IndexFieldStatusList = js.native
}

object DescribeIndexFieldsResponse {
  @scala.inline
  def apply(IndexFields: IndexFieldStatusList): DescribeIndexFieldsResponse = {
    val __obj = js.Dynamic.literal(IndexFields = IndexFields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIndexFieldsResponse]
  }
}

