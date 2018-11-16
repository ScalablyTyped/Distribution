package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  var systemKey: java.lang.String = js.native
  var systemSecret: java.lang.String = js.native
  var user: APIUser = js.native
  def getAndDeleteMessageHistory(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit = js.native
  def getCurrentTopics(callback: CbCallback): scala.Unit = js.native
  def getMessageHistory(topic: java.lang.String, start: scala.Double, count: scala.Double, callback: CbCallback): scala.Unit = js.native
  def getMessageHistoryWithTimeFrame(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit = js.native
  def publish(topic: java.lang.String, payload: java.lang.String): scala.Unit = js.native
  def publish(topic: java.lang.String, payload: stdLib.ArrayBuffer): scala.Unit = js.native
}

