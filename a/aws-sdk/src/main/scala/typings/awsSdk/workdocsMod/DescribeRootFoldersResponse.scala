package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRootFoldersResponse extends StObject {
  
  /**
    * The user's special folders.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.undefined
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object DescribeRootFoldersResponse {
  
  @scala.inline
  def apply(): DescribeRootFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRootFoldersResponse]
  }
  
  @scala.inline
  implicit class DescribeRootFoldersResponseMutableBuilder[Self <: DescribeRootFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolders(value: FolderMetadataList): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "Folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: FolderMetadata*): Self = StObject.set(x, "Folders", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
