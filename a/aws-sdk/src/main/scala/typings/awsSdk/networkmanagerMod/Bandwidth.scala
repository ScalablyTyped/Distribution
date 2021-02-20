package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bandwidth extends StObject {
  
  /**
    * Download speed in Mbps.
    */
  var DownloadSpeed: js.UndefOr[Integer] = js.native
  
  /**
    * Upload speed in Mbps.
    */
  var UploadSpeed: js.UndefOr[Integer] = js.native
}
object Bandwidth {
  
  @scala.inline
  def apply(): Bandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bandwidth]
  }
  
  @scala.inline
  implicit class BandwidthMutableBuilder[Self <: Bandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadSpeed(value: Integer): Self = StObject.set(x, "DownloadSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadSpeedUndefined: Self = StObject.set(x, "DownloadSpeed", js.undefined)
    
    @scala.inline
    def setUploadSpeed(value: Integer): Self = StObject.set(x, "UploadSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSpeedUndefined: Self = StObject.set(x, "UploadSpeed", js.undefined)
  }
}
