package typings
package connectDashPgDashSimpleLib.connectDashPgDashSimpleMod.connectPgSimpleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PGStoreOptions extends js.Object {
  var conObject: js.UndefOr[pgLib.pgMod.PoolConfig] = js.undefined
   // not typed to avoid dependency to "pg-promise" module (which includes its own types)
  var conString: js.UndefOr[java.lang.String] = js.undefined
  // tslint:disable-next-line:prefer-method-signature
  var errorLog: js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]] = js.undefined
  var pgPromise: js.UndefOr[js.Object] = js.undefined
  var pool: js.UndefOr[pgLib.pgMod.Pool] = js.undefined
  var pruneSessionInterval: js.UndefOr[
    connectDashPgDashSimpleLib.connectDashPgDashSimpleLibNumbers.`false` | scala.Double
  ] = js.undefined
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

