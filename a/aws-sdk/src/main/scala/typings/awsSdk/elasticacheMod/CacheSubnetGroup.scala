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
  def apply(
    ARN: String = null,
    CacheSubnetGroupDescription: String = null,
    CacheSubnetGroupName: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (CacheSubnetGroupDescription != null) __obj.updateDynamic("CacheSubnetGroupDescription")(CacheSubnetGroupDescription.asInstanceOf[js.Any])
    if (CacheSubnetGroupName != null) __obj.updateDynamic("CacheSubnetGroupName")(CacheSubnetGroupName.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSubnetGroup]
  }
}

