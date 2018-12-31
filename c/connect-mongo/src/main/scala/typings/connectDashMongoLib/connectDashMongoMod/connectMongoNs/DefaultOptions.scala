package typings
package connectDashMongoLib.connectDashMongoMod.connectMongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  /**
    * (Default: false)
    */
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically remove expired sessions.
    * (Default: 'native')
    */
  var autoRemove: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Default: 10)
    */
  var autoRemoveInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * The colletion of the database you are connecting to.
    * (Default: sessions)
    */
  var collection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The hostname of the database you are connecting to.
    * (Default: '127.0.0.1')
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The port number to connect to.
    * (Default: 27017)
    */
  var port: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Default: true)
    */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Serialize sessions using JSON.stringify and deserialize them with JSON.parse.
    * (Default: true)
    */
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * don't save session if unmodified
    */
  var touchAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: 14 days (60 * 60 * 24 * 14)
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
    * (Default: 1)
    */
  var w: js.UndefOr[scala.Double] = js.undefined
}

