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

