package typings.crossStorage

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cross-storage", "CrossStorageClient")
  @js.native
  class CrossStorageClient protected () extends StObject {
    /**
      * Constructs a new cross storage client given the url to a hub. By default, an iframe is created 
      * within the document body that points to the url. It also accepts an options object, which may include 
      * a timeout, frameId, and promise. The timeout, in milliseconds, is applied to each request and defaults 
      * to 5000ms. The options object may also include a frameId, identifying an existing frame on which to 
      * install its listeners. If the promise key is supplied the constructor for a Promise, that Promise 
      * library will be used instead of the default window.Promise.
      */
    def this(hubUrl: String, opts: CrossStorageClientOptions) = this()
    
    /**
      * Returns a promise that, when resolved, passes an array of keys currently in storage.
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Deletes the iframe and sets the connected state to false. The client can no longer be used after 
      * being invoked.
      */
    def close(): Unit = js.native
    
    /**
      * Accepts one or more keys for deletion. Returns a promise that is settled on hub response or timeout.
      */
    def del(keys: String*): js.Promise[Unit] = js.native
    
    /**
      * Accepts one or more keys for which to retrieve their values. Returns a promise that is settled on 
      * hub response or timeout. On success, it is fulfilled with the value of the key if only passed a 
      * single argument. Otherwise it's resolved with an array of values. On failure, it is rejected with 
      * the corresponding error message.
      */
    def get(key: String): js.Promise[js.Any] = js.native
    def get(keys: String*): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * Returns a promise that, when resolved, passes an array of keys currently in storage.
      */
    def getKeys(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Returns a promise that is fulfilled when a connection has been established with the cross storage 
      * hub. Its use is required to avoid sending any requests prior to initialization being complete.
      */
    def onConnect(): js.Promise[Unit] = js.native
    
    /**
      * Sets a key to the specified value, optionally accepting a ttl to passively expire the key after a 
      * number of milliseconds. Returns a promise that is fulfilled on success, or rejected if any errors 
      * setting the key occurred, or the request timed out.
      */
    def set(key: String, value: js.Any): js.Promise[Unit] = js.native
    def set(key: String, value: js.Any, ttl: Double): js.Promise[Unit] = js.native
  }
  
  @JSImport("cross-storage", "CrossStorageHub")
  @js.native
  class CrossStorageHub () extends StObject
  /* static members */
  object CrossStorageHub {
    
    @JSImport("cross-storage", "CrossStorageHub")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Accepts an array of objects with two keys: origin and allow. The value of origin is expected to be 
      * a RegExp, and allow, an array of strings. The cross storage hub is then initialized to accept requests 
      * from any of the matching origins, allowing access to the associated lists of methods. Methods may 
      * include any of: get, set, del, getKeys and clear. A 'ready' message is sent to the parent window once 
      * complete.
      */
    inline def init(subdomains: js.Array[SubDomain]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(subdomains.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait CrossStorageClientOptions extends StObject {
    
    var frameId: js.UndefOr[String] = js.undefined
    
    var promise: js.UndefOr[js.Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CrossStorageClientOptions {
    
    inline def apply(): CrossStorageClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossStorageClientOptions]
    }
    
    extension [Self <: CrossStorageClientOptions](x: Self) {
      
      inline def setFrameId(value: String): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setPromise(value: js.Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.crossStorage.crossStorageStrings.get
    - typings.crossStorage.crossStorageStrings.set
    - typings.crossStorage.crossStorageStrings.del
    - typings.crossStorage.crossStorageStrings.getKeys
    - typings.crossStorage.crossStorageStrings.clear
  */
  trait CrossStorageMethod extends StObject
  object CrossStorageMethod {
    
    inline def clear: typings.crossStorage.crossStorageStrings.clear = "clear".asInstanceOf[typings.crossStorage.crossStorageStrings.clear]
    
    inline def del: typings.crossStorage.crossStorageStrings.del = "del".asInstanceOf[typings.crossStorage.crossStorageStrings.del]
    
    inline def get: typings.crossStorage.crossStorageStrings.get = "get".asInstanceOf[typings.crossStorage.crossStorageStrings.get]
    
    inline def getKeys: typings.crossStorage.crossStorageStrings.getKeys = "getKeys".asInstanceOf[typings.crossStorage.crossStorageStrings.getKeys]
    
    inline def set: typings.crossStorage.crossStorageStrings.set = "set".asInstanceOf[typings.crossStorage.crossStorageStrings.set]
  }
  
  trait SubDomain extends StObject {
    
    var allow: js.Array[CrossStorageMethod]
    
    var origin: RegExp
  }
  object SubDomain {
    
    inline def apply(allow: js.Array[CrossStorageMethod], origin: RegExp): SubDomain = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubDomain]
    }
    
    extension [Self <: SubDomain](x: Self) {
      
      inline def setAllow(value: js.Array[CrossStorageMethod]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowVarargs(value: CrossStorageMethod*): Self = StObject.set(x, "allow", js.Array(value :_*))
      
      inline def setOrigin(value: RegExp): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
