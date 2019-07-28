package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var URI: String
  var systemKey: String
  var user: APIUser
  def getDBConnections(callback: CbCallback): Unit
  def getLogs(callback: CbCallback): Unit
  def getStatistics(callback: CbCallback): Unit
  def getStatisticsHistory(callback: CbCallback): Unit
  def setQuery(query: Query): Unit
}

object Metrics {
  @scala.inline
  def apply(
    URI: String,
    getDBConnections: CbCallback => Unit,
    getLogs: CbCallback => Unit,
    getStatistics: CbCallback => Unit,
    getStatisticsHistory: CbCallback => Unit,
    setQuery: Query => Unit,
    systemKey: String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal(URI = URI, getDBConnections = js.Any.fromFunction1(getDBConnections), getLogs = js.Any.fromFunction1(getLogs), getStatistics = js.Any.fromFunction1(getStatistics), getStatisticsHistory = js.Any.fromFunction1(getStatisticsHistory), setQuery = js.Any.fromFunction1(setQuery), systemKey = systemKey, user = user)
  
    __obj.asInstanceOf[Metrics]
  }
}

