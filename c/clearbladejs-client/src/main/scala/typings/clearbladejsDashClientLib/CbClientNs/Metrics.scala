package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var user: APIUser
  def getDBConnections(callback: CbCallback): scala.Unit
  def getLogs(callback: CbCallback): scala.Unit
  def getStatistics(callback: CbCallback): scala.Unit
  def getStatisticsHistory(callback: CbCallback): scala.Unit
  def setQuery(query: Query): scala.Unit
}

object Metrics {
  @scala.inline
  def apply(
    URI: java.lang.String,
    getDBConnections: CbCallback => scala.Unit,
    getLogs: CbCallback => scala.Unit,
    getStatistics: CbCallback => scala.Unit,
    getStatisticsHistory: CbCallback => scala.Unit,
    setQuery: Query => scala.Unit,
    systemKey: java.lang.String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal(URI = URI, getDBConnections = js.Any.fromFunction1(getDBConnections), getLogs = js.Any.fromFunction1(getLogs), getStatistics = js.Any.fromFunction1(getStatistics), getStatisticsHistory = js.Any.fromFunction1(getStatisticsHistory), setQuery = js.Any.fromFunction1(setQuery), systemKey = systemKey, user = user)
  
    __obj.asInstanceOf[Metrics]
  }
}

