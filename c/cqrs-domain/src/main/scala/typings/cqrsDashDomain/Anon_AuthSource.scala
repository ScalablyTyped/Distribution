package typings.cqrsDashDomain

import typings.cqrsDashDomain.cqrsDashDomainMod.SupportedDBTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSource extends js.Object {
  var authSource: js.UndefOr[String] = js.undefined
  var dbName: js.UndefOr[String] = js.undefined
  var eventsCollectionName: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var snapshotsCollectionName: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transactionsCollectionName: js.UndefOr[String] = js.undefined
  var `type`: SupportedDBTypes
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_AuthSource {
  @scala.inline
  def apply(
    `type`: SupportedDBTypes,
    authSource: String = null,
    dbName: String = null,
    eventsCollectionName: String = null,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    snapshotsCollectionName: String = null,
    timeout: Int | Double = null,
    transactionsCollectionName: String = null,
    url: String = null,
    username: String = null
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

