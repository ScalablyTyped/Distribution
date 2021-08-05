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
  
  inline def apply(): StreamFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamFile]
  }
  
  extension [Self <: StreamFile](x: Self) {
    
    inline def setFileId(value: FileId): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
