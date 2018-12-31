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

