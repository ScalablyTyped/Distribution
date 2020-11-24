package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutClassificationExportConfigurationResponse extends js.Object {
  
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
  implicit class PutClassificationExportConfigurationResponseOps[Self <: PutClassificationExportConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(value: ClassificationExportConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
  }
}
