package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSecurityGroupResult extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateSecurityGroupResult {
  
  @scala.inline
  def apply(): CreateSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityGroupResult]
  }
  
  @scala.inline
  implicit class CreateSecurityGroupResultMutableBuilder[Self <: CreateSecurityGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
