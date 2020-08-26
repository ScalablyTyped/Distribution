package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSubnetGroup extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the cache subnet group.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the cache subnet group.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A list of subnets associated with the cache subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object CacheSubnetGroup {
  @scala.inline
  def apply(): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroup]
  }
  @scala.inline
  implicit class CacheSubnetGroupOps[Self <: CacheSubnetGroup] (val x: Self) extends AnyVal {
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setCacheSubnetGroupDescription(value: String): Self = this.set("CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSubnetGroupDescription: Self = this.set("CacheSubnetGroupDescription", js.undefined)
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = this.set("CacheSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSubnetGroupName: Self = this.set("CacheSubnetGroupName", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: SubnetList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

