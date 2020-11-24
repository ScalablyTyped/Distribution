package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaInfo extends js.Object {
  
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[String] = js.native
}
object IPanoramaInfo {
  
  @scala.inline
  def apply(): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaInfo]
  }
  
  @scala.inline
  implicit class IPanoramaInfoOps[Self <: IPanoramaInfo] (val x: Self) extends AnyVal {
    
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
    def setCd(value: String): Self = this.set("cd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCd: Self = this.set("cd", js.undefined)
  }
}
