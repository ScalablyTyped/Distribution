package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexRequest extends js.Object {
  /**
    * The index name.
    */
  var indexName: IndexName = js.native
}

object DescribeIndexRequest {
  @scala.inline
  def apply(indexName: IndexName): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIndexRequest]
  }
}

