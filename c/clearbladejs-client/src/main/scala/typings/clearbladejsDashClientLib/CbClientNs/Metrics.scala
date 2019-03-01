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
    getDBConnections: js.Function1[CbCallback, scala.Unit],
    getLogs: js.Function1[CbCallback, scala.Unit],
    getStatistics: js.Function1[CbCallback, scala.Unit],
    getStatisticsHistory: js.Function1[CbCallback, scala.Unit],
    setQuery: js.Function1[Query, scala.Unit],
    systemKey: java.lang.String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("getDBConnections")(getDBConnections)
    __obj.updateDynamic("getLogs")(getLogs)
    __obj.updateDynamic("getStatistics")(getStatistics)
    __obj.updateDynamic("getStatisticsHistory")(getStatisticsHistory)
    __obj.updateDynamic("setQuery")(setQuery)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Metrics]
  }
}

