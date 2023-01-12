package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientBrandingRequest extends StObject {
  
  /**
    * The directory identifier of the WorkSpace for which you want to view client branding information.
    */
  var ResourceId: DirectoryId
}
object DescribeClientBrandingRequest {
  
  inline def apply(ResourceId: DirectoryId): DescribeClientBrandingRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientBrandingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientBrandingRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
