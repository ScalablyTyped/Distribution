package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamFile extends StObject {
  
  /**
    * The file ID.
    */
  var fileId: js.UndefOr[FileId] = js.undefined
  
  /**
    * The location of the file in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}
object StreamFile {
  
  @scala.inline
  def apply(): StreamFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamFile]
  }
  
  @scala.inline
  implicit class StreamFileMutableBuilder[Self <: StreamFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: FileId): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
