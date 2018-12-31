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

