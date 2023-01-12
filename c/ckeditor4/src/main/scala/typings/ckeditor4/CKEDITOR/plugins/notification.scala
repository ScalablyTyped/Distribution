package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.editor
import typings.ckeditor4.CKEDITOR.plugins.notification.updateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait notification extends StObject {
  
  val area: typings.ckeditor4.CKEDITOR.plugins.notification.area
  
  val duration: Double
  
  val editor: typings.ckeditor4.CKEDITOR.editor
  
  val element: typings.ckeditor4.CKEDITOR.dom.element
  
  def hide(): Unit
  
  val id: Double
  
  def isVisible(): Boolean
  
  val message: String
  
  val progress: Double
  
  def show(): Unit
  
  val `type`: typings.ckeditor4.CKEDITOR.plugins.notification.`type`
  
  def update(options: updateOptions): Unit
}
object notification {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: notification] (val x: Self) extends AnyVal {
    
    inline def setArea(value: area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: updateOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
  
  trait area extends StObject {
    
    def add(notification: notification): Unit
    
    val editor: typings.ckeditor4.CKEDITOR.editor
    
    val element: typings.ckeditor4.CKEDITOR.dom.element
    
    val notifications: js.Array[notification]
    
    def remove(notification: notification): Unit
  }
  object area {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: area] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: notification => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: js.Array[notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setRemove(value: notification => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  trait options
    extends StObject
       with optionsBase {
    
    var message: String
  }
  object options {
    
    inline def apply(message: String): options = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait optionsBase extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[typings.ckeditor4.CKEDITOR.plugins.notification.`type`] = js.undefined
  }
  object optionsBase {
    
    inline def apply(): optionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[optionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: optionsBase] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditor4.ckeditor4Strings.info
    - typings.ckeditor4.ckeditor4Strings.warning
    - typings.ckeditor4.ckeditor4Strings.success
    - typings.ckeditor4.ckeditor4Strings.progress
  */
  trait `type` extends StObject
  object `type` {
    
    inline def info: typings.ckeditor4.ckeditor4Strings.info = "info".asInstanceOf[typings.ckeditor4.ckeditor4Strings.info]
    
    inline def progress: typings.ckeditor4.ckeditor4Strings.progress = "progress".asInstanceOf[typings.ckeditor4.ckeditor4Strings.progress]
    
    inline def success: typings.ckeditor4.ckeditor4Strings.success = "success".asInstanceOf[typings.ckeditor4.ckeditor4Strings.success]
    
    inline def warning: typings.ckeditor4.ckeditor4Strings.warning = "warning".asInstanceOf[typings.ckeditor4.ckeditor4Strings.warning]
  }
  
  trait updateOptions
    extends StObject
       with optionsBase {
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object updateOptions {
    
    inline def apply(): updateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[updateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: updateOptions] (val x: Self) extends AnyVal {
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
