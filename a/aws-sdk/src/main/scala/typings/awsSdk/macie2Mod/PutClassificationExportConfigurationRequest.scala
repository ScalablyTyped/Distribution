package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutClassificationExportConfigurationRequest extends js.Object {
  
  /**
    * The location to store data classification results in, and the encryption settings to use when storing results in that location.
    */
  var configuration: ClassificationExportConfiguration = js.native
}
object PutClassificationExportConfigurationRequest {
  
  @scala.inline
  def apply(configuration: ClassificationExportConfiguration): PutClassificationExportConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClassificationExportConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutClassificationExportConfigurationRequestOps[Self <: PutClassificationExportConfigurationRequest] (val x: Self) extends AnyVal {
    
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
  }
}
