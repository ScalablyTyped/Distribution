package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFaqRequest extends js.Object {
  /**
    * The unique identifier of the FAQ.
    */
  var Id: FaqId = js.native
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object DescribeFaqRequest {
  @scala.inline
  def apply(Id: FaqId, IndexId: IndexId): DescribeFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFaqRequest]
  }
}

