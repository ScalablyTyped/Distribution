package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutClassificationExportConfigurationResponse extends StObject {
  
  /**
    * The location where the data classification results are stored, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.native
}
object PutClassificationExportConfigurationResponse {
  
  @scala.inline
  def apply(): PutClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutClassificationExportConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutClassificationExportConfigurationResponseMutableBuilder[Self <: PutClassificationExportConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ClassificationExportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
