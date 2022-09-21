package typings.connectAzuretables

import typings.connectAzuretables.connectAzuretablesStrings.SET
import typings.connectAzuretables.connectAzuretablesStrings.TOUCH
import typings.express.mod.RequestHandler
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
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
  ): AzureTableStoreFactory = ^.asInstanceOf[js.Dynamic].apply(session.asInstanceOf[js.Any]).asInstanceOf[AzureTableStoreFactory]
  
  @JSImport("connect-azuretables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait AzureTableStore extends Store {
    
    def cleanUp(): Unit = js.native
    
    def startBackgroundCleanUp(): Unit = js.native
    
    def update(method: SET | TOUCH, sid: String, session: SessionData): Unit = js.native
    def update(
      method: SET | TOUCH,
      sid: String,
      session: SessionData,
      callback: js.Function1[/* err */ Any, Unit]
    ): Unit = js.native
  }
  
  trait AzureTableStoreFactory extends StObject {
    
    def create(options: AzureTableStoreOptions): AzureTableStore
  }
  object AzureTableStoreFactory {
    
    inline def apply(create: AzureTableStoreOptions => AzureTableStore): AzureTableStoreFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[AzureTableStoreFactory]
    }
    
    extension [Self <: AzureTableStoreFactory](x: Self) {
      
      inline def setCreate(value: AzureTableStoreOptions => AzureTableStore): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait AzureTableStoreOptions extends StObject {
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var errorLogger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    // sessionTimeOut in minutes
    var overrideCron: js.UndefOr[String] = js.undefined
    
    var sessionTimeOut: js.UndefOr[Double] = js.undefined
    
    // cron job description
    var storageAccount: js.UndefOr[String] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object AzureTableStoreOptions {
    
    inline def apply(): AzureTableStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AzureTableStoreOptions]
    }
    
    extension [Self <: AzureTableStoreOptions](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setErrorLogger(value: /* message */ String => Unit): Self = StObject.set(x, "errorLogger", js.Any.fromFunction1(value))
      
      inline def setErrorLoggerUndefined: Self = StObject.set(x, "errorLogger", js.undefined)
      
      inline def setLogger(value: /* message */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOverrideCron(value: String): Self = StObject.set(x, "overrideCron", value.asInstanceOf[js.Any])
      
      inline def setOverrideCronUndefined: Self = StObject.set(x, "overrideCron", js.undefined)
      
      inline def setSessionTimeOut(value: Double): Self = StObject.set(x, "sessionTimeOut", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeOutUndefined: Self = StObject.set(x, "sessionTimeOut", js.undefined)
      
      inline def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
      
      inline def setStorageAccountUndefined: Self = StObject.set(x, "storageAccount", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
