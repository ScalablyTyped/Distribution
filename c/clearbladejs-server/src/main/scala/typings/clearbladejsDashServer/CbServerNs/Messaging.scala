package typings.clearbladejsDashServer.CbServerNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def getCurrentTopics(callback: CbCallback): Unit = js.native
  def getMessageHistory(topic: String, start: Double, count: Double, callback: CbCallback): Unit = js.native
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def publish(topic: String, payload: String): Unit = js.native
  def publish(topic: String, payload: ArrayBuffer): Unit = js.native
}

