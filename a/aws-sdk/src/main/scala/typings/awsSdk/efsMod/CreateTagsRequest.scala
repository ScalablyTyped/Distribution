package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagsRequest extends StObject {
  
  /**
    * The ID of the file system whose tags you want to modify (String). This operation modifies the tags only, not the file system.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
  
  /**
    * An array of Tag objects to add. Each Tag object is a key-value pair. 
    */
  var Tags: typings.awsSdk.efsMod.Tags
}
object CreateTagsRequest {
  
  inline def apply(FileSystemId: FileSystemId, Tags: Tags): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  extension [Self <: CreateTagsRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
