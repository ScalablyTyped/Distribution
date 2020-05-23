package typings.cqrsDomain.anon

import typings.cqrsDomain.cqrsDomainStrings.inmemory
import typings.cqrsDomain.cqrsDomainStrings.mongodb
import typings.cqrsDomain.cqrsDomainStrings.redis
import typings.cqrsDomain.cqrsDomainStrings.tingodb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var db: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var `type`: mongodb | redis | tingodb | inmemory
}

object Host {
  @scala.inline
  def apply(
    `type`: mongodb | redis | tingodb | inmemory,
    db: js.UndefOr[Double] = js.undefined,
    host: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined
  ): Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(db)) __obj.updateDynamic("db")(db.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

