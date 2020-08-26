package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSubnetGroupMessage extends js.Object {
  /**
    * A description for the cache subnet group.
    */
  var CacheSubnetGroupDescription: String = js.native
  /**
    * A name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String = js.native
  /**
    * A list of VPC subnet IDs for the cache subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object CreateCacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroupDescription: String, CacheSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupDescription = CacheSubnetGroupDescription.asInstanceOf[js.Any], CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
  }
  @scala.inline
  implicit class CreateCacheSubnetGroupMessageOps[Self <: CreateCacheSubnetGroupMessage] (val x: Self) extends AnyVal {
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
    def setCacheSubnetGroupDescription(value: String): Self = this.set("CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = this.set("CacheSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
  }
  
}

