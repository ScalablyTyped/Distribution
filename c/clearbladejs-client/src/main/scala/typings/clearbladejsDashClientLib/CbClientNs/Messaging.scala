package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messaging extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var client: pahoDashMqttLib.pahoDashMqttMod.Global.PahoNs.MQTTNs.Client
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def currentTopics(callback: CbCallback): scala.Unit
  def disconnect(): scala.Unit
  def getAndDeleteMessageHistory(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit
  def getMessageHistory(topic: java.lang.String, last: scala.Double, count: scala.Double, callback: CbCallback): scala.Unit
  def getMessageHistoryWithTimeFrame(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit
  def publish(topic: java.lang.String, payload: js.Object): scala.Unit
  def publishREST(topic: java.lang.String, payload: js.Object, callback: CbCallback): scala.Unit
  def subscribe(topic: java.lang.String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): scala.Unit
  def unsubscribe(topic: java.lang.String, options: MessagingSubscribeOptions): scala.Unit
}

