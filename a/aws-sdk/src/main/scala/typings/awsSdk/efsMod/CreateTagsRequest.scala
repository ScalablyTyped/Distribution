package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tags you want to modify (String). This operation modifies the tags only, not the file system.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * An array of Tag objects to add. Each Tag object is a key-value pair. 
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Tags: Tags): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

