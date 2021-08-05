package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsRequest extends StObject {
  
  /**
    * The ID of the file system whose tag set you want to retrieve.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
  
  /**
    * (Optional) An opaque pagination token returned from a previous DescribeTags operation (String). If present, it specifies to continue the list from where the previous call left off.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.undefined
  
  /**
    * (Optional) The maximum number of file system tags to return in the response. Currently, this number is automatically set to 100, and other values are ignored. The response is paginated at 100 per page if you have more than 100 tags.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.efsMod.MaxItems] = js.undefined
}
object DescribeTagsRequest {
  
  inline def apply(FileSystemId: FileSystemId): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  
  extension [Self <: DescribeTagsRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
