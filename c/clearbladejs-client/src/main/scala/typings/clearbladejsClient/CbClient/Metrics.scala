package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metrics extends StObject {
  
  var URI: String = js.native
  
  def getDBConnections(callback: CbCallback): Unit = js.native
  
  def getLogs(callback: CbCallback): Unit = js.native
  
  def getStatistics(callback: CbCallback): Unit = js.native
  
  def getStatisticsHistory(callback: CbCallback): Unit = js.native
  
  def setQuery(query: Query): Unit = js.native
  
  var systemKey: String = js.native
  
  var user: APIUser = js.native
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
  implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDBConnections(value: CbCallback => Unit): Self = StObject.set(x, "getDBConnections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLogs(value: CbCallback => Unit): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStatistics(value: CbCallback => Unit): Self = StObject.set(x, "getStatistics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStatisticsHistory(value: CbCallback => Unit): Self = StObject.set(x, "getStatisticsHistory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuery(value: Query => Unit): Self = StObject.set(x, "setQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
