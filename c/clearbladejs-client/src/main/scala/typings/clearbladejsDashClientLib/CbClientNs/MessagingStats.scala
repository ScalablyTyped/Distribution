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

