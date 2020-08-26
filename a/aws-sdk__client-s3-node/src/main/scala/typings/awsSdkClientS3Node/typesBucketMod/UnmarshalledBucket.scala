package typings.awsSdkClientS3Node.typesBucketMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledBucket extends Bucket {
  /**
    * <p>Date the bucket was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledBucket: js.UndefOr[Date] = js.native
}

object UnmarshalledBucket {
  @scala.inline
  def apply(): UnmarshalledBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBucket]
  }
  @scala.inline
  implicit class UnmarshalledBucketOps[Self <: UnmarshalledBucket] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
  }
  
}

