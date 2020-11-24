package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSpecification extends js.Object {
  
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.native
  
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.native
  
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.native
}
object InputSpecification {
  
  @scala.inline
  def apply(): InputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecification]
  }
  
  @scala.inline
  implicit class InputSpecificationOps[Self <: InputSpecification] (val x: Self) extends AnyVal {
    
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
    def setCodec(value: InputCodec): Self = this.set("Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    
    @scala.inline
    def setMaximumBitrate(value: InputMaximumBitrate): Self = this.set("MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBitrate: Self = this.set("MaximumBitrate", js.undefined)
    
    @scala.inline
    def setResolution(value: InputResolution): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
  }
}
