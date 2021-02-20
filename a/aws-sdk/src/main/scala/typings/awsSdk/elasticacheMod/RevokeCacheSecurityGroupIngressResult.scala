package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeCacheSecurityGroupIngressResult extends StObject {
  
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}
object RevokeCacheSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeCacheSecurityGroupIngressResultMutableBuilder[Self <: RevokeCacheSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroup(value: CacheSecurityGroup): Self = StObject.set(x, "CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupUndefined: Self = StObject.set(x, "CacheSecurityGroup", js.undefined)
  }
}
