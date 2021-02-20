package typings.connectPgSimple

import typings.connectPgSimple.connectPgSimpleBooleans.`false`
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.pg.mod.Pool
import typings.pg.mod.PoolConfig
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-pg-simple", JSImport.Namespace)
  @js.native
  def apply(
    session: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): js.Any = js.native
  
  @JSImport("connect-pg-simple", "PGStore")
  @js.native
  class PGStore () extends Store {
    def this(options: PGStoreOptions) = this()
    
    def close(): Unit = js.native
    
    def pruneSessions(): Unit = js.native
    def pruneSessions(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    @JSName("touch")
    def touch_MPGStore(sid: String, session: SessionData): Unit = js.native
    @JSName("touch")
    def touch_MPGStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait PGStoreOptions extends StObject {
    
    var conObject: js.UndefOr[PoolConfig] = js.native
    
    // not typed to avoid dependency to "pg-promise" module (which includes its own types)
    var conString: js.UndefOr[String] = js.native
    
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
    implicit class PGStoreOptionsMutableBuilder[Self <: PGStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConObject(value: PoolConfig): Self = StObject.set(x, "conObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConObjectUndefined: Self = StObject.set(x, "conObject", js.undefined)
      
      @scala.inline
      def setConString(value: String): Self = StObject.set(x, "conString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConStringUndefined: Self = StObject.set(x, "conString", js.undefined)
      
      @scala.inline
      def setErrorLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "errorLog", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorLogUndefined: Self = StObject.set(x, "errorLog", js.undefined)
      
      @scala.inline
      def setPgPromise(value: js.Object): Self = StObject.set(x, "pgPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgPromiseUndefined: Self = StObject.set(x, "pgPromise", js.undefined)
      
      @scala.inline
      def setPool(value: Pool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setPruneSessionInterval(value: `false` | Double): Self = StObject.set(x, "pruneSessionInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPruneSessionIntervalUndefined: Self = StObject.set(x, "pruneSessionInterval", js.undefined)
      
      @scala.inline
      def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
