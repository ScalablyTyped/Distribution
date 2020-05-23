package typings.cqrsDomain.anon

import typings.cqrsDomain.mod.SupportedDBTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSource extends js.Object {
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

object AuthSource {
  @scala.inline
  def apply(
    `type`: SupportedDBTypes,
    authSource: String = null,
    dbName: String = null,
    eventsCollectionName: String = null,
    host: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    snapshotsCollectionName: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    transactionsCollectionName: String = null,
    url: String = null,
    username: String = null
  ): AuthSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (eventsCollectionName != null) __obj.updateDynamic("eventsCollectionName")(eventsCollectionName.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (snapshotsCollectionName != null) __obj.updateDynamic("snapshotsCollectionName")(snapshotsCollectionName.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (transactionsCollectionName != null) __obj.updateDynamic("transactionsCollectionName")(transactionsCollectionName.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSource]
  }
}

