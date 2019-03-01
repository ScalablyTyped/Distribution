package typings
package connectDashMongodbDashSessionLib.connectDashMongodbDashSessionMod.connectMongodbSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var collection: java.lang.String
  var connectionOptions: js.UndefOr[mongodbLib.mongodbMod.MongoClientOptions] = js.undefined
  var databaseName: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var idField: js.UndefOr[java.lang.String] = js.undefined
  var uri: java.lang.String
}

object ConnectionInfo {
  @scala.inline
  def apply(
    collection: java.lang.String,
    uri: java.lang.String,
    connectionOptions: mongodbLib.mongodbMod.MongoClientOptions = null,
    databaseName: java.lang.String = null,
    expires: scala.Int | scala.Double = null,
    idField: java.lang.String = null
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("uri")(uri)
    if (connectionOptions != null) __obj.updateDynamic("connectionOptions")(connectionOptions)
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (idField != null) __obj.updateDynamic("idField")(idField)
    __obj.asInstanceOf[ConnectionInfo]
  }
}

