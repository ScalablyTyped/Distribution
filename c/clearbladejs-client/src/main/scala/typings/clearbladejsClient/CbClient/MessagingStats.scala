package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingStats extends js.Object {
  var URI: String
  var endpoint: String
  var systemKey: String
  var user: APIUser
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit
  def getOpenConnections(callback: CbCallback): Unit
}

object MessagingStats {
  @scala.inline
  def apply(
    URI: String,
    endpoint: String,
    getAveragePayloadSize: (String, Double, Double, CbCallback) => Unit,
    getCurrentSubscribers: (String, CbCallback) => Unit,
    getOpenConnections: CbCallback => Unit,
    systemKey: String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], getAveragePayloadSize = js.Any.fromFunction4(getAveragePayloadSize), getCurrentSubscribers = js.Any.fromFunction2(getCurrentSubscribers), getOpenConnections = js.Any.fromFunction1(getOpenConnections), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingStats]
  }
}

