package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var cacheFlushInterval: js.UndefOr[scala.Double] = js.undefined
  var capacity: js.UndefOr[scala.Double] = js.undefined
  var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
  var recycleFreq: js.UndefOr[scala.Double] = js.undefined
  var storageImpl: js.UndefOr[StorageImpl] = js.undefined
  var storageMode: js.UndefOr[StorageMode] = js.undefined
  var storagePrefix: js.UndefOr[java.lang.String] = js.undefined
  var storeOnReject: js.UndefOr[scala.Boolean] = js.undefined
  var storeOnResolve: js.UndefOr[scala.Boolean] = js.undefined
}

