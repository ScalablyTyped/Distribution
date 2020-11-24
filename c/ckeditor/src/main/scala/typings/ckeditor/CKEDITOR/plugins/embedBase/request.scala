package typings.ckeditor.CKEDITOR.plugins.embedBase

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait request extends js.Object {
  
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
  implicit class requestOps[Self <: request] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCallback(value: String => Unit): Self = this.set("errorCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponse(value: StringDictionary[String]): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: task): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
