package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupVersionRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
  
  /**
    * The ID of the group version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding ''GroupInformation'' object.
    */
  var GroupVersionId: string = js.native
}
object GetGroupVersionRequest {
  
  @scala.inline
  def apply(GroupId: string, GroupVersionId: string): GetGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], GroupVersionId = GroupVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupVersionRequest]
  }
  
  @scala.inline
  implicit class GetGroupVersionRequestMutableBuilder[Self <: GetGroupVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupVersionId(value: string): Self = StObject.set(x, "GroupVersionId", value.asInstanceOf[js.Any])
  }
}
