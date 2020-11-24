package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.plugins.notification.`type`
import typings.ckeditor.CKEDITOR.plugins.notification.area
import typings.ckeditor.CKEDITOR.plugins.notification.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait notification_ extends js.Object {
  
  val area: typings.ckeditor.CKEDITOR.plugins.notification.area = js.native
  
  val duration: Double = js.native
  
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  
  def hide(): Unit = js.native
  
  val id: Double = js.native
  
  def isVisible(): Boolean = js.native
  
  val message: String = js.native
  
  val progress: Double = js.native
  
  def show(): Unit = js.native
  
  val `type`: typings.ckeditor.CKEDITOR.plugins.notification.`type` = js.native
  
  def update(options: updateOptions): Unit = js.native
}
object notification_ {
  
  @scala.inline
  def apply(
    area: area,
    duration: Double,
    editor: editor,
    element: element,
    hide: () => Unit,
    id: Double,
    isVisible: () => Boolean,
    message: String,
    progress: Double,
    show: () => Unit,
    `type`: `type`,
    update: updateOptions => Unit
  ): notification_ = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), id = id.asInstanceOf[js.Any], isVisible = js.Any.fromFunction0(isVisible), message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[notification_]
  }
  
  @scala.inline
  implicit class notification_Ops[Self <: notification_] (val x: Self) extends AnyVal {
    
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
    def setArea(value: area): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: `type`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: updateOptions => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
