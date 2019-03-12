package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  var URI: java.lang.String = js.native
  var client: js.Object = js.native
  var systemKey: java.lang.String = js.native
  var systemSecret: java.lang.String = js.native
  var user: APIUser = js.native
  def getMessageHistory(topic: java.lang.String, startTime: scala.Double, count: scala.Double, callback: CbCallback): scala.Unit = js.native
  def publish(topic: java.lang.String, payload: js.Object): scala.Unit = js.native
  def subscribe(topic: java.lang.String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): scala.Unit = js.native
  def unsubscribe(topic: java.lang.String): scala.Unit = js.native
  def unsubscribe(
    topic: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* packet */ js.UndefOr[js.Object], _]
  ): scala.Unit = js.native
}

