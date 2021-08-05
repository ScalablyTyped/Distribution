package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUploadResult extends StObject {
  
  /**
    * The newly created upload.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}
object CreateUploadResult {
  
  inline def apply(): CreateUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUploadResult]
  }
  
  extension [Self <: CreateUploadResult](x: Self) {
    
    inline def setUpload(value: Upload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
