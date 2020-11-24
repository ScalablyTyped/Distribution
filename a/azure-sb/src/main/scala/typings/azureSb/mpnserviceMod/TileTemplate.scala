package typings.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileTemplate extends Template {
  
  var backBackgroundImage: String = js.native
  
  var backContent: String = js.native
  
  var backTitle: String = js.native
  
  var backgroundImage: String = js.native
  
  var count: String = js.native
  
  var id: String = js.native
  
  var title: String = js.native
}
object TileTemplate {
  
  @scala.inline
  def apply(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    title: String
  ): TileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileTemplate]
  }
  
  @scala.inline
  implicit class TileTemplateOps[Self <: TileTemplate] (val x: Self) extends AnyVal {
    
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
    def setBackBackgroundImage(value: String): Self = this.set("backBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackContent(value: String): Self = this.set("backContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTitle(value: String): Self = this.set("backTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImage(value: String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
