package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) with which the tag is associated, for example: arn:aws:redshift:us-east-2:123456789:cluster:t1.
    */
  var ResourceName: js.UndefOr[String] = js.native
  /**
    * The type of resource with which the tag is associated. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   For more information about Amazon Redshift resource types and constructing ARNs, go to Constructing an Amazon Redshift Amazon Resource Name (ARN) in the Amazon Redshift Cluster Management Guide. 
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * The tag for the resource.
    */
  var Tag: js.UndefOr[typings.awsSdk.redshiftMod.Tag] = js.native
}

object TaggedResource {
  @scala.inline
  def apply(): TaggedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResource]
  }
  @scala.inline
  implicit class TaggedResourceOps[Self <: TaggedResource] (val x: Self) extends AnyVal {
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
    def setResourceName(value: String): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("ResourceName", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

