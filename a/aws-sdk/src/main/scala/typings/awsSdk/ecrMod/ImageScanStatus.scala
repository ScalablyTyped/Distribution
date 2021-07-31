package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanStatus extends StObject {
  
  /**
    * The description of the image scan status.
    */
  var description: js.UndefOr[ScanStatusDescription] = js.undefined
  
  /**
    * The current state of an image scan.
    */
  var status: js.UndefOr[ScanStatus] = js.undefined
}
object ImageScanStatus {
  
  @scala.inline
  def apply(): ImageScanStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanStatus]
  }
  
  @scala.inline
  implicit class ImageScanStatusMutableBuilder[Self <: ImageScanStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ScanStatusDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setStatus(value: ScanStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
