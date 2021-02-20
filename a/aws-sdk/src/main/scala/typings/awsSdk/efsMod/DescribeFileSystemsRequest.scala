package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFileSystemsRequest extends StObject {
  
  /**
    * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token when you create an Amazon EFS file system.
    */
  var CreationToken: js.UndefOr[typings.awsSdk.efsMod.CreationToken] = js.native
  
  /**
    * (Optional) ID of the file system whose description you want to retrieve (String).
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If present, specifies to continue the list from where the returning call had left off. 
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  
  /**
    * (Optional) Specifies the maximum number of file systems to return in the response (integer). This number is automatically set to 100. The response is paginated at 100 per page if you have more than 100 file systems. 
    */
  var MaxItems: js.UndefOr[typings.awsSdk.efsMod.MaxItems] = js.native
}
object DescribeFileSystemsRequest {
  
  @scala.inline
  def apply(): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
  
  @scala.inline
  implicit class DescribeFileSystemsRequestMutableBuilder[Self <: DescribeFileSystemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationToken(value: CreationToken): Self = StObject.set(x, "CreationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTokenUndefined: Self = StObject.set(x, "CreationToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
