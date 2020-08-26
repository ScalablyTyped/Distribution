package typings.cassandraDriver.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.native
  var heartBeatInterval: js.UndefOr[Double] = js.native
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  var warmup: js.UndefOr[Boolean] = js.native
}

object CoreConnectionsPerHost {
  @scala.inline
  def apply(): CoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreConnectionsPerHost]
  }
  @scala.inline
  implicit class CoreConnectionsPerHostOps[Self <: CoreConnectionsPerHost] (val x: Self) extends AnyVal {
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
    def setCoreConnectionsPerHost(value: NumberDictionary[Double]): Self = this.set("coreConnectionsPerHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreConnectionsPerHost: Self = this.set("coreConnectionsPerHost", js.undefined)
    @scala.inline
    def setHeartBeatInterval(value: Double): Self = this.set("heartBeatInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartBeatInterval: Self = this.set("heartBeatInterval", js.undefined)
    @scala.inline
    def setMaxRequestsPerConnection(value: Double): Self = this.set("maxRequestsPerConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRequestsPerConnection: Self = this.set("maxRequestsPerConnection", js.undefined)
    @scala.inline
    def setWarmup(value: Boolean): Self = this.set("warmup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmup: Self = this.set("warmup", js.undefined)
  }
  
}

