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
  @scala.inline
  implicit class DescribeCollectionRequestOps[Self <: DescribeCollectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionId(value: CollectionId): Self = this.set("CollectionId", value.asInstanceOf[js.Any])
  }
  
}

