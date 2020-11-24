package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorModel extends js.Object {
  
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
  implicit class DetectorModelOps[Self <: DetectorModel] (val x: Self) extends AnyVal {
    
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
    def setDetectorModelConfiguration(value: DetectorModelConfiguration): Self = this.set("detectorModelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelConfiguration: Self = this.set("detectorModelConfiguration", js.undefined)
    
    @scala.inline
    def setDetectorModelDefinition(value: DetectorModelDefinition): Self = this.set("detectorModelDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelDefinition: Self = this.set("detectorModelDefinition", js.undefined)
  }
}
