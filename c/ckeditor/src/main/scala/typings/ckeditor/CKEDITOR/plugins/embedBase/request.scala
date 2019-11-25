package typings.ckeditor.CKEDITOR.plugins.embedBase

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait request extends js.Object {
  var response: StringDictionary[String]
  var task: typings.ckeditor.CKEDITOR.plugins.notificationAggregator.task
  var url: String
  def callback(): Unit
  def cancel(): Unit
  def errorCallback(error: String): Unit
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
}

