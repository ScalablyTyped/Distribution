package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var user: APIUser = js.native
  def getDBConnections(callback: CbCallback): Unit = js.native
  def getLogs(callback: CbCallback): Unit = js.native
  def getStatistics(callback: CbCallback): Unit = js.native
  def getStatisticsHistory(callback: CbCallback): Unit = js.native
  def setQuery(query: Query): Unit = js.native
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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], getDBConnections = js.Any.fromFunction1(getDBConnections), getLogs = js.Any.fromFunction1(getLogs), getStatistics = js.Any.fromFunction1(getStatistics), getStatisticsHistory = js.Any.fromFunction1(getStatisticsHistory), setQuery = js.Any.fromFunction1(setQuery), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDBConnections(value: CbCallback => Unit): Self = this.set("getDBConnections", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLogs(value: CbCallback => Unit): Self = this.set("getLogs", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStatistics(value: CbCallback => Unit): Self = this.set("getStatistics", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStatisticsHistory(value: CbCallback => Unit): Self = this.set("getStatisticsHistory", js.Any.fromFunction1(value))
    @scala.inline
    def setSetQuery(value: Query => Unit): Self = this.set("setQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

