package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreBucketMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledBucket extends _Bucket {
  /**
    * <p>Date the bucket was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate__UnmarshalledBucket: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledBucket {
  @scala.inline
  def apply(CreationDate: Date = null, Name: String = null): _UnmarshalledBucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[_UnmarshalledBucket]
  }
}

