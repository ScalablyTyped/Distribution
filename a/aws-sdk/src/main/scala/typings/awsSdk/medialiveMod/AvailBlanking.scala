package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailBlanking extends js.Object {
  
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[InputLocation] = js.native
  
  /**
    * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
    */
  var State: js.UndefOr[AvailBlankingState] = js.native
}
object AvailBlanking {
  
  @scala.inline
  def apply(): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailBlanking]
  }
  
  @scala.inline
  implicit class AvailBlankingOps[Self <: AvailBlanking] (val x: Self) extends AnyVal {
    
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
    def setAvailBlankingImage(value: InputLocation): Self = this.set("AvailBlankingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailBlankingImage: Self = this.set("AvailBlankingImage", js.undefined)
    
    @scala.inline
    def setState(value: AvailBlankingState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
