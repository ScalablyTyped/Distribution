package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorModel extends StObject {
  
  /**
    * Information about how the detector is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
  
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.native
}
object DetectorModel {
  
  @scala.inline
  def apply(): DetectorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModel]
  }
  
  @scala.inline
  implicit class DetectorModelMutableBuilder[Self <: DetectorModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelConfiguration(value: DetectorModelConfiguration): Self = StObject.set(x, "detectorModelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelConfigurationUndefined: Self = StObject.set(x, "detectorModelConfiguration", js.undefined)
    
    @scala.inline
    def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDefinitionUndefined: Self = StObject.set(x, "detectorModelDefinition", js.undefined)
  }
}
