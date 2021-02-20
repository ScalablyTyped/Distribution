package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.plugins.notification.updateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait notification extends StObject {
  
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
object notification {
  
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
  ): notification = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), id = id.asInstanceOf[js.Any], isVisible = js.Any.fromFunction0(isVisible), message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[notification]
  }
  
  @js.native
  trait area extends StObject {
    
    def add(notification: notification): Unit = js.native
    
    val editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    val element: typings.ckeditor.CKEDITOR.dom.element = js.native
    
    val notifications: js.Array[notification] = js.native
    
    def remove(notification: notification): Unit = js.native
  }
  object area {
    
    @scala.inline
    def apply(
      add: notification => Unit,
      editor: editor,
      element: element,
      notifications: js.Array[notification],
      remove: notification => Unit
    ): area = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[area]
    }
    
    @scala.inline
    implicit class areaMutableBuilder[Self <: area] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: notification => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifications(value: js.Array[notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: notification => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @scala.inline
  implicit class notificationMutableBuilder[Self <: notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: updateOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
  
  @js.native
  trait options extends optionsBase {
    
    var message: String = js.native
  }
  object options {
    
    @scala.inline
    def apply(message: String): options = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait optionsBase extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var progress: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[typings.ckeditor.CKEDITOR.plugins.notification.`type`] = js.native
  }
  object optionsBase {
    
    @scala.inline
    def apply(): optionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[optionsBase]
    }
    
    @scala.inline
    implicit class optionsBaseMutableBuilder[Self <: optionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditor.ckeditorStrings.info
    - typings.ckeditor.ckeditorStrings.warning
    - typings.ckeditor.ckeditorStrings.success
    - typings.ckeditor.ckeditorStrings.progress
  */
  trait `type` extends StObject
  object `type` {
    
    @scala.inline
    def info: typings.ckeditor.ckeditorStrings.info = "info".asInstanceOf[typings.ckeditor.ckeditorStrings.info]
    
    @scala.inline
    def progress: typings.ckeditor.ckeditorStrings.progress = "progress".asInstanceOf[typings.ckeditor.ckeditorStrings.progress]
    
    @scala.inline
    def success: typings.ckeditor.ckeditorStrings.success = "success".asInstanceOf[typings.ckeditor.ckeditorStrings.success]
    
    @scala.inline
    def warning: typings.ckeditor.ckeditorStrings.warning = "warning".asInstanceOf[typings.ckeditor.ckeditorStrings.warning]
  }
  
  @js.native
  trait updateOptions extends optionsBase {
    
    var important: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
  }
  object updateOptions {
    
    @scala.inline
    def apply(): updateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[updateOptions]
    }
    
    @scala.inline
    implicit class updateOptionsMutableBuilder[Self <: updateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
