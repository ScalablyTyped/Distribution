package typings.connectDashMongodbDashSession.connectDashMongodbDashSessionMod.connectMongodbSession

import typings.mongodb.mongodbMod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var collection: String
  var connectionOptions: js.UndefOr[MongoClientOptions] = js.undefined
  var databaseName: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var idField: js.UndefOr[String] = js.undefined
  var uri: String
}

object ConnectionInfo {
  @scala.inline
  def apply(
    collection: String,
    uri: String,
    connectionOptions: MongoClientOptions = null,
    databaseName: String = null,
    expires: Int | Double = null,
    idField: String = null
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (connectionOptions != null) __obj.updateDynamic("connectionOptions")(connectionOptions.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (idField != null) __obj.updateDynamic("idField")(idField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

