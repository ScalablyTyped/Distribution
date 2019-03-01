package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingStats extends js.Object {
  var URI: java.lang.String
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var user: APIUser
  def getAveragePayloadSize(topic: java.lang.String, start: scala.Double, stop: scala.Double, callback: CbCallback): scala.Unit
  def getCurrentSubscribers(topic: java.lang.String, callback: CbCallback): scala.Unit
  def getOpenConnections(callback: CbCallback): scala.Unit
}

object MessagingStats {
  @scala.inline
  def apply(
    URI: java.lang.String,
    endpoint: java.lang.String,
    getAveragePayloadSize: js.Function4[java.lang.String, scala.Double, scala.Double, CbCallback, scala.Unit],
    getCurrentSubscribers: js.Function2[java.lang.String, CbCallback, scala.Unit],
    getOpenConnections: js.Function1[CbCallback, scala.Unit],
    systemKey: java.lang.String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("getAveragePayloadSize")(getAveragePayloadSize)
    __obj.updateDynamic("getCurrentSubscribers")(getCurrentSubscribers)
    __obj.updateDynamic("getOpenConnections")(getOpenConnections)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MessagingStats]
  }
}

