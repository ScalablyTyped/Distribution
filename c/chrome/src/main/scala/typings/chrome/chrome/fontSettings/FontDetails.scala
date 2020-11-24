package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontDetails extends js.Object {
  
  /** The generic font family for the font. */
  var genericFamily: String = js.native
  
  /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
  var script: js.UndefOr[String] = js.native
}
object FontDetails {
  
  @scala.inline
  def apply(genericFamily: String): FontDetails = {
    val __obj = js.Dynamic.literal(genericFamily = genericFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDetails]
  }
  
  @scala.inline
  implicit class FontDetailsOps[Self <: FontDetails] (val x: Self) extends AnyVal {
    
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
    def setGenericFamily(value: String): Self = this.set("genericFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
}
