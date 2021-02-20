package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClassificationExportConfigurationResponse extends StObject {
  
  /**
    * The location where data classification results are stored, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.native
}
object GetClassificationExportConfigurationResponse {
  
  @scala.inline
  def apply(): GetClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassificationExportConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetClassificationExportConfigurationResponseMutableBuilder[Self <: GetClassificationExportConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ClassificationExportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
