package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupRequest extends StObject {
  
  /**
    * The name for the group. It can include any Unicode characters. The names for all groups in your account, across all Regions, must be unique.
    */
  var Name: GroupName
  
  /**
    * A list of key-value pairs to associate with the group. You can associate as many as 50 tags with a group. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateGroupRequest {
  
  inline def apply(Name: GroupName): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
