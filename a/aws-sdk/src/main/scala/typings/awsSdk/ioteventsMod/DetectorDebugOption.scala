package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorDebugOption extends StObject {
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * The value of the input attribute key used to create the detector (the instance of the detector model).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}
object DetectorDebugOption {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DetectorDebugOption = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorDebugOption]
  }
  
  @scala.inline
  implicit class DetectorDebugOptionMutableBuilder[Self <: DetectorDebugOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
