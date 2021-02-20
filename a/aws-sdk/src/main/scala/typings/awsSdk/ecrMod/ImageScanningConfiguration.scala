package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanningConfiguration extends StObject {
  
  /**
    * The setting that determines whether images are scanned after being pushed to a repository. If set to true, images will be scanned after being pushed. If this parameter is not specified, it will default to false and images will not be scanned unless a scan is manually started with the StartImageScan API.
    */
  var scanOnPush: js.UndefOr[ScanOnPushFlag] = js.native
}
object ImageScanningConfiguration {
  
  @scala.inline
  def apply(): ImageScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanningConfiguration]
  }
  
  @scala.inline
  implicit class ImageScanningConfigurationMutableBuilder[Self <: ImageScanningConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScanOnPush(value: ScanOnPushFlag): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanOnPushUndefined: Self = StObject.set(x, "scanOnPush", js.undefined)
  }
}
