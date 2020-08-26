package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingStats extends js.Object {
  var URI: String = js.native
  var endpoint: String = js.native
  var systemKey: String = js.native
  var user: APIUser = js.native
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit = js.native
  def getOpenConnections(callback: CbCallback): Unit = js.native
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
  @scala.inline
  implicit class MessagingStatsOps[Self <: MessagingStats] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAveragePayloadSize(value: (String, Double, Double, CbCallback) => Unit): Self = this.set("getAveragePayloadSize", js.Any.fromFunction4(value))
    @scala.inline
    def setGetCurrentSubscribers(value: (String, CbCallback) => Unit): Self = this.set("getCurrentSubscribers", js.Any.fromFunction2(value))
    @scala.inline
    def setGetOpenConnections(value: CbCallback => Unit): Self = this.set("getOpenConnections", js.Any.fromFunction1(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

