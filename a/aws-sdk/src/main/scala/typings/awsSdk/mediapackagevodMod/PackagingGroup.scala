package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackagingGroup extends js.Object {
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[string] = js.native
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}

object PackagingGroup {
  @scala.inline
  def apply(Arn: string = null, DomainName: string = null, Id: string = null, Tags: Tags = null): PackagingGroup = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagingGroup]
  }
}

