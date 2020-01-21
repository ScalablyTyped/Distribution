package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCollectionRequest extends js.Object {
  /**
    * The ID of the collection to describe.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
}

object DescribeCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): DescribeCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeCollectionRequest]
  }
}

