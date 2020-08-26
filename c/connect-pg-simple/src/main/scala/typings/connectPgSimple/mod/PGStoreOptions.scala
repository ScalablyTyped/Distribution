package typings.connectPgSimple.mod

import typings.connectPgSimple.connectPgSimpleBooleans.`false`
import typings.pg.mod.Pool
import typings.pg.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PGStoreOptions extends js.Object {
  var conObject: js.UndefOr[PoolConfig] = js.native
   // not typed to avoid dependency to "pg-promise" module (which includes its own types)
  var conString: js.UndefOr[String] = js.native
  // tslint:disable-next-line:prefer-method-signature
  var errorLog: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var pgPromise: js.UndefOr[js.Object] = js.native
  var pool: js.UndefOr[Pool] = js.native
  var pruneSessionInterval: js.UndefOr[`false` | Double] = js.native
  var schemaName: js.UndefOr[String] = js.native
  var tableName: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object PGStoreOptions {
  @scala.inline
  def apply(): PGStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PGStoreOptions]
  }
  @scala.inline
  implicit class PGStoreOptionsOps[Self <: PGStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConObject(value: PoolConfig): Self = this.set("conObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConObject: Self = this.set("conObject", js.undefined)
    @scala.inline
    def setConString(value: String): Self = this.set("conString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConString: Self = this.set("conString", js.undefined)
    @scala.inline
    def setErrorLog(value: /* repeated */ js.Any => Unit): Self = this.set("errorLog", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorLog: Self = this.set("errorLog", js.undefined)
    @scala.inline
    def setPgPromise(value: js.Object): Self = this.set("pgPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePgPromise: Self = this.set("pgPromise", js.undefined)
    @scala.inline
    def setPool(value: Pool): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setPruneSessionInterval(value: `false` | Double): Self = this.set("pruneSessionInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePruneSessionInterval: Self = this.set("pruneSessionInterval", js.undefined)
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

