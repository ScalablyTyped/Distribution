package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLocation extends StObject {
  
  /**
    * Specifies the Amazon EFS identifier and the path for the file being used.
    */
  var EfsFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.EfsFileLocation] = js.undefined
  
  /**
    * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
    */
  var S3FileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.S3FileLocation] = js.undefined
}
object FileLocation {
  
  inline def apply(): FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileLocation] (val x: Self) extends AnyVal {
    
    inline def setEfsFileLocation(value: EfsFileLocation): Self = StObject.set(x, "EfsFileLocation", value.asInstanceOf[js.Any])
    
    inline def setEfsFileLocationUndefined: Self = StObject.set(x, "EfsFileLocation", js.undefined)
    
    inline def setS3FileLocation(value: S3FileLocation): Self = StObject.set(x, "S3FileLocation", value.asInstanceOf[js.Any])
    
    inline def setS3FileLocationUndefined: Self = StObject.set(x, "S3FileLocation", js.undefined)
  }
}
