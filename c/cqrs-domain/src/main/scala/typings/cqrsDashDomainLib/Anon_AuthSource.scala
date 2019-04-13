package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSource extends js.Object {
  var authSource: js.UndefOr[java.lang.String] = js.undefined
  var dbName: js.UndefOr[java.lang.String] = js.undefined
  var eventsCollectionName: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var snapshotsCollectionName: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transactionsCollectionName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: cqrsDashDomainLib.cqrsDashDomainMod.SupportedDBTypes
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthSource {
  @scala.inline
  def apply(
    `type`: cqrsDashDomainLib.cqrsDashDomainMod.SupportedDBTypes,
    authSource: java.lang.String = null,
    dbName: java.lang.String = null,
    eventsCollectionName: java.lang.String = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    snapshotsCollectionName: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    transactionsCollectionName: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null
  ): Anon_AuthSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (eventsCollectionName != null) __obj.updateDynamic("eventsCollectionName")(eventsCollectionName)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (snapshotsCollectionName != null) __obj.updateDynamic("snapshotsCollectionName")(snapshotsCollectionName)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transactionsCollectionName != null) __obj.updateDynamic("transactionsCollectionName")(transactionsCollectionName)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_AuthSource]
  }
}

