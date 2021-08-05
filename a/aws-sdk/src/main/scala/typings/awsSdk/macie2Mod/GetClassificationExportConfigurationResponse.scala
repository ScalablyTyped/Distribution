package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassificationExportConfigurationResponse extends StObject {
  
  /**
    * The location where data classification results are stored, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.undefined
}
object GetClassificationExportConfigurationResponse {
  
  inline def apply(): GetClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassificationExportConfigurationResponse]
  }
  
  extension [Self <: GetClassificationExportConfigurationResponse](x: Self) {
    
    inline def setConfiguration(value: ClassificationExportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
