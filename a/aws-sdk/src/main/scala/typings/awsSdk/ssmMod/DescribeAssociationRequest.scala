package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationRequest extends js.Object {
  /**
    * The association ID for which you want information.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * Specify the association version to retrieve. To view the latest version, either specify $LATEST for this parameter, or omit this parameter. To view a list of all associations for an instance, use ListAssociations. To get a list of versions for a specific association, use ListAssociationVersions. 
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
}

object DescribeAssociationRequest {
  @scala.inline
  def apply(): DescribeAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationRequest]
  }
  @scala.inline
  implicit class DescribeAssociationRequestOps[Self <: DescribeAssociationRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = this.set("AssociationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationVersion: Self = this.set("AssociationVersion", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

