package typings
package ckeditorLib.CKEDITORNs.pluginsNs.embedBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait request extends js.Object {
  var response: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var task: ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs.task
  var url: java.lang.String
  def callback(): scala.Unit
  def cancel(): scala.Unit
  def errorCallback(error: java.lang.String): scala.Unit
}

object request {
  @scala.inline
  def apply(
    callback: () => scala.Unit,
    cancel: () => scala.Unit,
    errorCallback: java.lang.String => scala.Unit,
    response: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    task: ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs.task,
    url: java.lang.String
  ): request = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), cancel = js.Any.fromFunction0(cancel), errorCallback = js.Any.fromFunction1(errorCallback), response = response, task = task, url = url)
  
    __obj.asInstanceOf[request]
  }
}

