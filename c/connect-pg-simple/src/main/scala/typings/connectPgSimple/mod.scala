package typings.connectPgSimple

import typings.connectPgSimple.connectPgSimpleBooleans.`false`
import typings.express.mod.RequestHandler
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.pg.mod.Pool
import typings.pg.mod.PoolConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    session: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].apply(session.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("connect-pg-simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("connect-pg-simple", "PGStore")
  @js.native
  open class PGStore () extends Store {
    def this(options: PGStoreOptions) = this()
    
    def close(): Unit = js.native
    
    def pruneSessions(): Unit = js.native
    def pruneSessions(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    @JSName("touch")
    def touch_MPGStore(sid: String, session: SessionData): Unit = js.native
    @JSName("touch")
    def touch_MPGStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait PGStoreOptions extends StObject {
    
    var conObject: js.UndefOr[PoolConfig] = js.undefined
    
    // not typed to avoid dependency to "pg-promise" module (which includes its own types)
    var conString: js.UndefOr[String] = js.undefined
    
    var createTableIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var disableTouch: js.UndefOr[Boolean] = js.undefined
    
    var errorLog: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var pgPromise: js.UndefOr[js.Object] = js.undefined
    
    var pool: js.UndefOr[Pool] = js.undefined
    
    var pruneSessionInterval: js.UndefOr[`false` | Double] = js.undefined
    
    var schemaName: js.UndefOr[String] = js.undefined
    
    var tableName: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object PGStoreOptions {
    
    inline def apply(): PGStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PGStoreOptions]
    }
    
    extension [Self <: PGStoreOptions](x: Self) {
      
      inline def setConObject(value: PoolConfig): Self = StObject.set(x, "conObject", value.asInstanceOf[js.Any])
      
      inline def setConObjectUndefined: Self = StObject.set(x, "conObject", js.undefined)
      
      inline def setConString(value: String): Self = StObject.set(x, "conString", value.asInstanceOf[js.Any])
      
      inline def setConStringUndefined: Self = StObject.set(x, "conString", js.undefined)
      
      inline def setCreateTableIfMissing(value: Boolean): Self = StObject.set(x, "createTableIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateTableIfMissingUndefined: Self = StObject.set(x, "createTableIfMissing", js.undefined)
      
      inline def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      inline def setErrorLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "errorLog", js.Any.fromFunction1(value))
      
      inline def setErrorLogUndefined: Self = StObject.set(x, "errorLog", js.undefined)
      
      inline def setPgPromise(value: js.Object): Self = StObject.set(x, "pgPromise", value.asInstanceOf[js.Any])
      
      inline def setPgPromiseUndefined: Self = StObject.set(x, "pgPromise", js.undefined)
      
      inline def setPool(value: Pool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setPruneSessionInterval(value: `false` | Double): Self = StObject.set(x, "pruneSessionInterval", value.asInstanceOf[js.Any])
      
      inline def setPruneSessionIntervalUndefined: Self = StObject.set(x, "pruneSessionInterval", js.undefined)
      
      inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
      
      inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
