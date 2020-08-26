package typings.connectRedis.mod

import typings.expressSession.mod.global.Express.SessionData
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStoreOptions extends js.Object {
  var client: js.UndefOr[RedisClient | Redis] = js.native
  var db: js.UndefOr[Double] = js.native
  var disableTTL: js.UndefOr[Boolean] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var logErrors: js.UndefOr[Boolean | (js.Function1[/* error */ String, Unit])] = js.native
  var pass: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var scanCount: js.UndefOr[Double] = js.native
  var serializer: js.UndefOr[Serializer | JSON] = js.native
  var socket: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[
    Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
  ] = js.native
  var unref: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
}

object RedisStoreOptions {
  @scala.inline
  def apply(): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisStoreOptions]
  }
  @scala.inline
  implicit class RedisStoreOptionsOps[Self <: RedisStoreOptions] (val x: Self) extends AnyVal {
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
    def setClient(value: RedisClient | Redis): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setDb(value: Double): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setDisableTTL(value: Boolean): Self = this.set("disableTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTTL: Self = this.set("disableTTL", js.undefined)
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouch: Self = this.set("disableTouch", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLogErrorsFunction1(value: /* error */ String => Unit): Self = this.set("logErrors", js.Any.fromFunction1(value))
    @scala.inline
    def setLogErrors(value: Boolean | (js.Function1[/* error */ String, Unit])): Self = this.set("logErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogErrors: Self = this.set("logErrors", js.undefined)
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setScanCount(value: Double): Self = this.set("scanCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanCount: Self = this.set("scanCount", js.undefined)
    @scala.inline
    def setSerializer(value: Serializer | JSON): Self = this.set("serializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
    @scala.inline
    def setSocket(value: String): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    @scala.inline
    def setTtlFunction3(value: (/* store */ RedisStore, /* sess */ SessionData, /* sid */ String) => Double): Self = this.set("ttl", js.Any.fromFunction3(value))
    @scala.inline
    def setTtl(
      value: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
    ): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setUnref(value: Boolean): Self = this.set("unref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnref: Self = this.set("unref", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

