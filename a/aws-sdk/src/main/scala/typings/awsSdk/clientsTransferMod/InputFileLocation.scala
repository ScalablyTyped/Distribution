package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFileLocation extends StObject {
  
  /**
    * Reserved for future use.
    */
  var EfsFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.EfsFileLocation] = js.undefined
  
  /**
    * Specifies the details for the S3 file being copied.
    */
  var S3FileLocation: js.UndefOr[S3InputFileLocation] = js.undefined
}
object InputFileLocation {
  
  inline def apply(): InputFileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFileLocation]
  }
  
  extension [Self <: InputFileLocation](x: Self) {
    
    inline def setEfsFileLocation(value: EfsFileLocation): Self = StObject.set(x, "EfsFileLocation", value.asInstanceOf[js.Any])
    
    inline def setEfsFileLocationUndefined: Self = StObject.set(x, "EfsFileLocation", js.undefined)
    
    inline def setS3FileLocation(value: S3InputFileLocation): Self = StObject.set(x, "S3FileLocation", value.asInstanceOf[js.Any])
    
    inline def setS3FileLocationUndefined: Self = StObject.set(x, "S3FileLocation", js.undefined)
  }
}
