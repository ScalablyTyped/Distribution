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
}

