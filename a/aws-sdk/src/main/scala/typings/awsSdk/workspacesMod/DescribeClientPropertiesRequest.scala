package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientPropertiesRequest extends StObject {
  
  /**
    * The resource identifier, in the form of directory IDs.
    */
  var ResourceIds: ResourceIdList
}
object DescribeClientPropertiesRequest {
  
  @scala.inline
  def apply(ResourceIds: ResourceIdList): DescribeClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientPropertiesRequest]
  }
  
  @scala.inline
  implicit class DescribeClientPropertiesRequestMutableBuilder[Self <: DescribeClientPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceIds(value: ResourceIdList): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ResourceIds", js.Array(value :_*))
  }
}
