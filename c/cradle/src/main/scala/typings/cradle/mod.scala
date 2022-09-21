package typings.cradle

import typings.cradle.anon.Cancel
import typings.cradle.anon.Descending
import typings.cradle.anon.Id
import typings.cradle.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cradle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cradle", "Connection")
  @js.native
  open class Connection () extends StObject {
    def this(uri: String) = this()
    def this(uri: String, port: Double) = this()
    def this(uri: Unit, port: Double) = this()
    def this(uri: String, port: Double, options: Options) = this()
    def this(uri: String, port: Unit, options: Options) = this()
    def this(uri: Unit, port: Double, options: Options) = this()
    def this(uri: Unit, port: Unit, options: Options) = this()
    
    def activeTasks(callback: Callback): Unit = js.native
    
    def config(callback: Callback): Unit = js.native
    
    def database(name: String): Database = js.native
    
    def databases(Callback: Callback): Unit = js.native
    
    def info(callback: Callback): Unit = js.native
    
    def replicate(options: Cancel, callback: Callback): Unit = js.native
    
    def stats(callback: Callback): Unit = js.native
    
    def uuids(callback: Callback): Unit = js.native
    def uuids(count: Double, callback: Callback): Unit = js.native
  }
  
  @JSImport("cradle", "Database")
  @js.native
  open class Database () extends StObject {
    
    def all(callback: Callback): Unit = js.native
    def all(options: Any, callback: Callback): Unit = js.native
    
    def changes(callback: js.Function2[/* error */ Any, /* list */ js.Array[Any], Unit]): Unit = js.native
    def changes(options: ChangesOptions): Any = js.native
    def changes(options: ChangesOptions, callback: js.Function2[/* error */ Any, /* list */ js.Array[Any], Unit]): Unit = js.native
    
    def compact(callback: Callback): Unit = js.native
    def compact(design: String, callback: Callback): Unit = js.native
    
    def create(callback: ErrorCallback): Unit = js.native
    
    def destroy(callback: ErrorCallback): Unit = js.native
    
    def exists(callback: js.Function2[/* error */ Any, /* exists */ Boolean, Unit]): Unit = js.native
    
    def get(id: String, callback: js.Function2[/* error */ Any, /* document */ Any, Unit]): Unit = js.native
    def get(id: String, rev: String, callback: js.Function2[/* error */ Any, /* document */ Any, Unit]): Unit = js.native
    def get(ids: js.Array[String], callback: Callback): Unit = js.native
    
    def getAttachment(id: String, attachmentName: String, callback: Callback): Unit = js.native
    
    @JSName("get")
    def get_T[T](id: String, callback: js.Function2[/* error */ Any, /* document */ T, Unit]): Unit = js.native
    @JSName("get")
    def get_T[T](id: String, rev: String, callback: js.Function2[/* error */ Any, /* document */ T, Unit]): Unit = js.native
    
    def info(callback: Callback): Unit = js.native
    
    def merge(id: String, document: Any, callback: Callback): Unit = js.native
    @JSName("merge")
    def merge_T[T](id: String, document: T, callback: Callback): Unit = js.native
    
    var name: String = js.native
    
    def remove(id: String, revision: String, callback: Callback): Unit = js.native
    
    def removeAttachment(id: String, attachmentName: String, callback: Callback): Unit = js.native
    
    def replicate(target: String, callback: Callback): Unit = js.native
    def replicate(target: String, options: Any, callback: Callback): Unit = js.native
    
    def save(document: Any, callback: Callback): Unit = js.native
    def save(documents: js.Array[Any], callback: Callback): Unit = js.native
    def save(id: String, document: Any, callback: Callback): Unit = js.native
    def save(id: String, revision: String, document: Any, callback: Callback): Unit = js.native
    
    def saveAttachment(idAndRevData: Id, attachmentData: Any, callback: Callback): Unit = js.native
    
    @JSName("save")
    def save_T[T](document: T, callback: Callback): Unit = js.native
    @JSName("save")
    def save_T[T](id: String, document: T, callback: Callback): Unit = js.native
    @JSName("save")
    def save_T[T](id: String, revision: String, document: T, callback: Callback): Unit = js.native
    
    def temporaryView(view: Any, callback: Callback): Unit = js.native
    
    def update(name: String, id: String, queryObject: Any, documentBody: Any, callback: Callback): Unit = js.native
    
    def view(name: String, callback: Callback): Unit = js.native
    def view(name: String, options: Descending, callback: Callback): Unit = js.native
    
    def viewCleanup(callback: Callback): Unit = js.native
  }
  
  inline def setup(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* error */ Any, /* response */ Any, Unit]
  
  trait ChangesOptions extends StObject {
    
    var since: Double
  }
  object ChangesOptions {
    
    inline def apply(since: Double): ChangesOptions = {
      val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangesOptions]
    }
    
    extension [Self <: ChangesOptions](x: Self) {
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* error */ Any, Unit]
  
  trait Options extends StObject {
    
    var auth: js.UndefOr[String | Password] = js.undefined
    
    var ca: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var forceSave: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryTimeout: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAuth(value: String | Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setForceSave(value: Boolean): Self = StObject.set(x, "forceSave", value.asInstanceOf[js.Any])
      
      inline def setForceSaveUndefined: Self = StObject.set(x, "forceSave", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
}
