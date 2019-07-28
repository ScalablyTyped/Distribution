package typings.cqrsDashDomain

import typings.cqrsDashDomain.cqrsDashDomainStrings.inmemory
import typings.cqrsDashDomain.cqrsDashDomainStrings.mongodb
import typings.cqrsDashDomain.cqrsDashDomainStrings.redis
import typings.cqrsDashDomain.cqrsDashDomainStrings.tingodb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbHost extends js.Object {
  var db: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var `type`: mongodb | redis | tingodb | inmemory
}

object Anon_DbHost {
  @scala.inline
  def apply(
    `type`: mongodb | redis | tingodb | inmemory,
    db: Int | Double = null,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    prefix: String = null,
    timeout: Int | Double = null,
    ttl: Int | Double = null
  ): Anon_DbHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DbHost]
  }
}

