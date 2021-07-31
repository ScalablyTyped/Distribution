package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemsResponse extends StObject {
  
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined
  
  /**
    * Present if provided by caller in the request (String).
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.undefined
  
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextMarker in the subsequent request to fetch the descriptions.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeFileSystemsResponse {
  
  @scala.inline
  def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  
  @scala.inline
  implicit class DescribeFileSystemsResponseMutableBuilder[Self <: DescribeFileSystemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystems(value: FileSystemDescriptions): Self = StObject.set(x, "FileSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemsUndefined: Self = StObject.set(x, "FileSystems", js.undefined)
    
    @scala.inline
    def setFileSystemsVarargs(value: FileSystemDescription*): Self = StObject.set(x, "FileSystems", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
