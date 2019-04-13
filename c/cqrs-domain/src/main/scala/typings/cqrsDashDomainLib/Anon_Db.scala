package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Db extends js.Object {
  var db: scala.Double
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: cqrsDashDomainLib.cqrsDashDomainMod.SupportedDBTypes
}

object Anon_Db {
  @scala.inline
  def apply(
    db: scala.Double,
    `type`: cqrsDashDomainLib.cqrsDashDomainMod.SupportedDBTypes,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_Db = {
    val __obj = js.Dynamic.literal(db = db)
    __obj.updateDynamic("type")(`type`)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Db]
  }
}

