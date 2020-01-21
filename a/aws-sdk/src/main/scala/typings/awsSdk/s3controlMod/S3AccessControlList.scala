package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3AccessControlList extends js.Object {
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var Owner: S3ObjectOwner = js.native
}

object S3AccessControlList {
  @scala.inline
  def apply(Owner: S3ObjectOwner, Grants: S3GrantList = null): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlList]
  }
}

