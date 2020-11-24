package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISettingsStyle extends js.Object {
  
  /** A hex color value that all land is first flushed to before things are drawn on it. */
  var landColor: js.UndefOr[String] = js.native
  
  /** Specifies whether or not to draw elevation shading on the map. */
  var shadedReliefVisible: js.UndefOr[Boolean] = js.native
}
object ISettingsStyle {
  
  @scala.inline
  def apply(): ISettingsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISettingsStyle]
  }
  
  @scala.inline
  implicit class ISettingsStyleOps[Self <: ISettingsStyle] (val x: Self) extends AnyVal {
    
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
    def setLandColor(value: String): Self = this.set("landColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandColor: Self = this.set("landColor", js.undefined)
    
    @scala.inline
    def setShadedReliefVisible(value: Boolean): Self = this.set("shadedReliefVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadedReliefVisible: Self = this.set("shadedReliefVisible", js.undefined)
  }
}
