package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorModel extends StObject {
  
  /**
    * Information about how the detector is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
  
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.undefined
}
object DetectorModel {
  
  inline def apply(): DetectorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModel]
  }
  
  extension [Self <: DetectorModel](x: Self) {
    
    inline def setDetectorModelConfiguration(value: DetectorModelConfiguration): Self = StObject.set(x, "detectorModelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelConfigurationUndefined: Self = StObject.set(x, "detectorModelConfiguration", js.undefined)
    
    inline def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelDefinitionUndefined: Self = StObject.set(x, "detectorModelDefinition", js.undefined)
  }
}
