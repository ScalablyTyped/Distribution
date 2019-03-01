package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbHost extends js.Object {
  var db: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var `type`: cqrsDashDomainLib.cqrsDashDomainLibStrings.mongodb | cqrsDashDomainLib.cqrsDashDomainLibStrings.redis | cqrsDashDomainLib.cqrsDashDomainLibStrings.tingodb | cqrsDashDomainLib.cqrsDashDomainLibStrings.inmemory
}

object Anon_DbHost {
  @scala.inline
  def apply(
    `type`: cqrsDashDomainLib.cqrsDashDomainLibStrings.mongodb | cqrsDashDomainLib.cqrsDashDomainLibStrings.redis | cqrsDashDomainLib.cqrsDashDomainLibStrings.tingodb | cqrsDashDomainLib.cqrsDashDomainLibStrings.inmemory,
    db: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null
  ): Anon_DbHost = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
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

