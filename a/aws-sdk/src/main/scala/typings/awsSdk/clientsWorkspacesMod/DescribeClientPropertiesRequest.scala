package typings.awsSdk.clientsWorkspacesMod

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
  
  inline def apply(ResourceIds: ResourceIdList): DescribeClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIds(value: ResourceIdList): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
  }
}
