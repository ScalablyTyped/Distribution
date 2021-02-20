package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import typings.ckeditor.CKEDITOR.plugins.widget.definition
import typings.ckeditor.CKEDITOR.template
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedBase {
  
  @js.native
  trait baseDefinition extends definition {
    
    def getErrorMessage(messageTypeOrMessage: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: js.UndefOr[scala.Nothing], suffix: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: String, suffix: String): String = js.native
    
    def isUrlValid(url: String): Boolean = js.native
    
    def loadContent(url: String): request = js.native
    def loadContent(
      url: String,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.UndefOr[scala.Nothing],
      noNotifications: Boolean
    ): request = js.native
    def loadContent(
      url: String,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): request = js.native
    def loadContent(
      url: String,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit],
      noNotifications: Boolean
    ): request = js.native
    def loadContent(url: String, callback: js.Function0[Unit]): request = js.native
    def loadContent(
      url: String,
      callback: js.Function0[Unit],
      errorCallback: js.UndefOr[scala.Nothing],
      noNotifications: Boolean
    ): request = js.native
    def loadContent(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* error */ String, Unit]): request = js.native
    def loadContent(
      url: String,
      callback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit],
      noNotifications: Boolean
    ): request = js.native
    
    var providerUrl: template = js.native
    
    var urlRegExp: RegExp = js.native
  }
  
  @js.native
  trait request extends StObject {
    
    def callback(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def errorCallback(error: String): Unit = js.native
    
    var response: StringDictionary[String] = js.native
    
    var task: typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task = js.native
    
    var url: String = js.native
  }
  object request {
    
    @scala.inline
    def apply(
      callback: () => Unit,
      cancel: () => Unit,
      errorCallback: String => Unit,
      response: StringDictionary[String],
      task: task,
      url: String
    ): request = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), cancel = js.Any.fromFunction0(cancel), errorCallback = js.Any.fromFunction1(errorCallback), response = response.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[request]
    }
    
    @scala.inline
    implicit class requestMutableBuilder[Self <: request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorCallback(value: String => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponse(value: StringDictionary[String]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
