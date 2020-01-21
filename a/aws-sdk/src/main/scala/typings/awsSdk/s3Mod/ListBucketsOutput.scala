package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketsOutput extends js.Object {
  /**
    * The list of buckets owned by the requestor.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3Mod.Buckets] = js.native
  /**
    * The owner of the buckets listed.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
}

object ListBucketsOutput {
  @scala.inline
  def apply(Buckets: Buckets = null, Owner: Owner = null): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    if (Buckets != null) __obj.updateDynamic("Buckets")(Buckets.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsOutput]
  }
}

