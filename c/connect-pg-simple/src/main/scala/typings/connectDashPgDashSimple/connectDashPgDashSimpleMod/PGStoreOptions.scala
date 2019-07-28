package typings.connectDashPgDashSimple.connectDashPgDashSimpleMod

import typings.connectDashPgDashSimple.connectDashPgDashSimpleNumbers.`false`
import typings.pg.pgMod.Pool
import typings.pg.pgMod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PGStoreOptions extends js.Object {
  var conObject: js.UndefOr[PoolConfig] = js.undefined
   // not typed to avoid dependency to "pg-promise" module (which includes its own types)
  var conString: js.UndefOr[String] = js.undefined
  // tslint:disable-next-line:prefer-method-signature
  var errorLog: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var pgPromise: js.UndefOr[js.Object] = js.undefined
  var pool: js.UndefOr[Pool] = js.undefined
  var pruneSessionInterval: js.UndefOr[`false` | Double] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object PGStoreOptions {
  @scala.inline
  def apply(
    conObject: PoolConfig = null,
    conString: String = null,
    errorLog: /* repeated */ js.Any => Unit = null,
    pgPromise: js.Object = null,
    pool: Pool = null,
    pruneSessionInterval: `false` | Double = null,
    schemaName: String = null,
    tableName: String = null,
    ttl: Int | Double = null
  ): PGStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (conObject != null) __obj.updateDynamic("conObject")(conObject)
    if (conString != null) __obj.updateDynamic("conString")(conString)
    if (errorLog != null) __obj.updateDynamic("errorLog")(js.Any.fromFunction1(errorLog))
    if (pgPromise != null) __obj.updateDynamic("pgPromise")(pgPromise)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (pruneSessionInterval != null) __obj.updateDynamic("pruneSessionInterval")(pruneSessionInterval.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PGStoreOptions]
  }
}

