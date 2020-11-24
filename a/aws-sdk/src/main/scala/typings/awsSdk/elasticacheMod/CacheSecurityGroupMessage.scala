package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecurityGroupMessage extends js.Object {
  
  /**
    * A list of cache security groups. Each element in the list contains detailed information about one group.
    */
  var CacheSecurityGroups: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSecurityGroups] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CacheSecurityGroupMessage {
  
  @scala.inline
  def apply(): CacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class CacheSecurityGroupMessageOps[Self <: CacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setCacheSecurityGroupsVarargs(value: CacheSecurityGroup*): Self = this.set("CacheSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setCacheSecurityGroups(value: CacheSecurityGroups): Self = this.set("CacheSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroups: Self = this.set("CacheSecurityGroups", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
