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
    callback: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    errorCallback: js.Function1[java.lang.String, scala.Unit],
    response: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    task: ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs.task,
    url: java.lang.String
  ): request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("errorCallback")(errorCallback)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[request]
  }
}

