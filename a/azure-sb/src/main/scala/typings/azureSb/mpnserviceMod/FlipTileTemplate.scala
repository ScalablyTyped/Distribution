package typings.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureSb.mpnserviceMod.Template because Already inherited */ @js.native
trait FlipTileTemplate extends TileTemplate {
  
  var smallBackgroundImage: String = js.native
  
  var wideBackBackgroundImage: String = js.native
  
  var wideBackContent: String = js.native
  
  var wideBackgroundImage: String = js.native
}
object FlipTileTemplate {
  
  @scala.inline
  def apply(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    smallBackgroundImage: String,
    title: String,
    wideBackBackgroundImage: String,
    wideBackContent: String,
    wideBackgroundImage: String
  ): FlipTileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipTileTemplate]
  }
  
  @scala.inline
  implicit class FlipTileTemplateOps[Self <: FlipTileTemplate] (val x: Self) extends AnyVal {
    
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
    def setSmallBackgroundImage(value: String): Self = this.set("smallBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWideBackBackgroundImage(value: String): Self = this.set("wideBackBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWideBackContent(value: String): Self = this.set("wideBackContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWideBackgroundImage(value: String): Self = this.set("wideBackgroundImage", value.asInstanceOf[js.Any])
  }
}
