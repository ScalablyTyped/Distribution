package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bandwidth extends StObject {
  
  /**
    * Download speed in Mbps.
    */
  var DownloadSpeed: js.UndefOr[Integer] = js.undefined
  
  /**
    * Upload speed in Mbps.
    */
  var UploadSpeed: js.UndefOr[Integer] = js.undefined
}
object Bandwidth {
  
  inline def apply(): Bandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bandwidth]
  }
  
  extension [Self <: Bandwidth](x: Self) {
    
    inline def setDownloadSpeed(value: Integer): Self = StObject.set(x, "DownloadSpeed", value.asInstanceOf[js.Any])
    
    inline def setDownloadSpeedUndefined: Self = StObject.set(x, "DownloadSpeed", js.undefined)
    
    inline def setUploadSpeed(value: Integer): Self = StObject.set(x, "UploadSpeed", value.asInstanceOf[js.Any])
    
    inline def setUploadSpeedUndefined: Self = StObject.set(x, "UploadSpeed", js.undefined)
  }
}
