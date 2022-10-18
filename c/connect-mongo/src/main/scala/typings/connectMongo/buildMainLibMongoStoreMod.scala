package typings.connectMongo

import org.scalablytyped.runtime.StringDictionary
import typings.bson.mod.Document
import typings.connectMongo.anon.SessionDatalastModifiedDa
import typings.connectMongo.connectMongoBooleans.`false`
import typings.connectMongo.connectMongoStrings.disabled
import typings.connectMongo.connectMongoStrings.interval
import typings.connectMongo.connectMongoStrings.native
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import typings.mongodb.mod.Collection
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.WriteConcernSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMainLibMongoStoreMod {
  
  @JSImport("connect-mongo/build/main/lib/MongoStore", JSImport.Default)
  @js.native
  open class default protected () extends MongoStore {
    def this(hasCollectionNameTtlMongoOptionsAutoRemoveAutoRemoveIntervalTouchAfterStringifyCryptoRequired: ConnectMongoOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("connect-mongo/build/main/lib/MongoStore", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ConnectMongoOptions): MongoStore = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[MongoStore]
  }
  
  trait ConnectMongoOptions extends StObject {
    
    var autoRemove: js.UndefOr[native | interval | disabled] = js.undefined
    
    var autoRemoveInterval: js.UndefOr[Double] = js.undefined
    
    var client: js.UndefOr[MongoClient] = js.undefined
    
    var clientPromise: js.UndefOr[js.Promise[MongoClient]] = js.undefined
    
    var collectionName: js.UndefOr[String] = js.undefined
    
    var createAutoRemoveIdx: js.UndefOr[Boolean] = js.undefined
    
    var crypto: js.UndefOr[CryptoOptions] = js.undefined
    
    var dbName: js.UndefOr[String] = js.undefined
    
    var mongoOptions: js.UndefOr[MongoClientOptions] = js.undefined
    
    var mongoUrl: js.UndefOr[String] = js.undefined
    
    var serialize: js.UndefOr[js.Function1[/* a */ Any, Any]] = js.undefined
    
    var stringify: js.UndefOr[Boolean] = js.undefined
    
    var touchAfter: js.UndefOr[Double] = js.undefined
    
    var transformId: js.UndefOr[js.Function1[/* a */ Any, Any]] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var unserialize: js.UndefOr[js.Function1[/* a */ Any, Any]] = js.undefined
    
    var writeOperationOptions: js.UndefOr[WriteConcernSettings] = js.undefined
  }
  object ConnectMongoOptions {
    
    inline def apply(): ConnectMongoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectMongoOptions]
    }
    
    extension [Self <: ConnectMongoOptions](x: Self) {
      
      inline def setAutoRemove(value: native | interval | disabled): Self = StObject.set(x, "autoRemove", value.asInstanceOf[js.Any])
      
      inline def setAutoRemoveInterval(value: Double): Self = StObject.set(x, "autoRemoveInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoRemoveIntervalUndefined: Self = StObject.set(x, "autoRemoveInterval", js.undefined)
      
      inline def setAutoRemoveUndefined: Self = StObject.set(x, "autoRemove", js.undefined)
      
      inline def setClient(value: MongoClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientPromise(value: js.Promise[MongoClient]): Self = StObject.set(x, "clientPromise", value.asInstanceOf[js.Any])
      
      inline def setClientPromiseUndefined: Self = StObject.set(x, "clientPromise", js.undefined)
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
      
      inline def setCreateAutoRemoveIdx(value: Boolean): Self = StObject.set(x, "createAutoRemoveIdx", value.asInstanceOf[js.Any])
      
      inline def setCreateAutoRemoveIdxUndefined: Self = StObject.set(x, "createAutoRemoveIdx", js.undefined)
      
      inline def setCrypto(value: CryptoOptions): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setMongoOptions(value: MongoClientOptions): Self = StObject.set(x, "mongoOptions", value.asInstanceOf[js.Any])
      
      inline def setMongoOptionsUndefined: Self = StObject.set(x, "mongoOptions", js.undefined)
      
      inline def setMongoUrl(value: String): Self = StObject.set(x, "mongoUrl", value.asInstanceOf[js.Any])
      
      inline def setMongoUrlUndefined: Self = StObject.set(x, "mongoUrl", js.undefined)
      
      inline def setSerialize(value: /* a */ Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setTouchAfter(value: Double): Self = StObject.set(x, "touchAfter", value.asInstanceOf[js.Any])
      
      inline def setTouchAfterUndefined: Self = StObject.set(x, "touchAfter", js.undefined)
      
      inline def setTransformId(value: /* a */ Any => Any): Self = StObject.set(x, "transformId", js.Any.fromFunction1(value))
      
      inline def setTransformIdUndefined: Self = StObject.set(x, "transformId", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUnserialize(value: /* a */ Any => Any): Self = StObject.set(x, "unserialize", js.Any.fromFunction1(value))
      
      inline def setUnserializeUndefined: Self = StObject.set(x, "unserialize", js.undefined)
      
      inline def setWriteOperationOptions(value: WriteConcernSettings): Self = StObject.set(x, "writeOperationOptions", value.asInstanceOf[js.Any])
      
      inline def setWriteOperationOptionsUndefined: Self = StObject.set(x, "writeOperationOptions", js.undefined)
    }
  }
  
  trait CryptoOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var at_size: js.UndefOr[Double] = js.undefined
    
    var encodeas: js.UndefOr[String] = js.undefined
    
    var hashing: js.UndefOr[String] = js.undefined
    
    var iv_size: js.UndefOr[Double] = js.undefined
    
    var key_size: js.UndefOr[Double] = js.undefined
    
    var secret: `false` | String
  }
  object CryptoOptions {
    
    inline def apply(secret: `false` | String): CryptoOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoOptions]
    }
    
    extension [Self <: CryptoOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAt_size(value: Double): Self = StObject.set(x, "at_size", value.asInstanceOf[js.Any])
      
      inline def setAt_sizeUndefined: Self = StObject.set(x, "at_size", js.undefined)
      
      inline def setEncodeas(value: String): Self = StObject.set(x, "encodeas", value.asInstanceOf[js.Any])
      
      inline def setEncodeasUndefined: Self = StObject.set(x, "encodeas", js.undefined)
      
      inline def setHashing(value: String): Self = StObject.set(x, "hashing", value.asInstanceOf[js.Any])
      
      inline def setHashingUndefined: Self = StObject.set(x, "hashing", js.undefined)
      
      inline def setIv_size(value: Double): Self = StObject.set(x, "iv_size", value.asInstanceOf[js.Any])
      
      inline def setIv_sizeUndefined: Self = StObject.set(x, "iv_size", js.undefined)
      
      inline def setKey_size(value: Double): Self = StObject.set(x, "key_size", value.asInstanceOf[js.Any])
      
      inline def setKey_sizeUndefined: Self = StObject.set(x, "key_size", js.undefined)
      
      inline def setSecret(value: `false` | String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MongoStore extends Store {
    
    /**
      * Get all sessions in the store as an array
      */
    @JSName("all")
    def all_MMongoStore(
      callback: js.Function2[
          /* err */ Any, 
          /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Delete all sessions from the store.
      */
    @JSName("clear")
    def clear_MMongoStore(): Unit = js.native
    @JSName("clear")
    def clear_MMongoStore(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    /* private */ var clientP: Any = js.native
    
    /**
      * Close database connection
      */
    def close(): js.Promise[Unit] = js.native
    
    var collectionP: js.Promise[Collection[Document]] = js.native
    
    /* private */ var computeStorageId: Any = js.native
    
    /* private */ var crypto: Any = js.native
    
    /**
      * promisify and bind the `this.crypto.get` function.
      * Please check !!this.crypto === true before using this getter!
      */
    /* private */ def cryptoGet: Any = js.native
    
    /**
      * Decrypt given session data
      * @param session session data to be decrypt. Mutate the input session.
      */
    /* private */ var decryptSession: Any = js.native
    
    /**
      * Get the count of all sessions in the store
      */
    @JSName("length")
    def length_MMongoStore(callback: js.Function2[/* err */ Any, /* length */ Double, Unit]): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var setAutoRemove: Any = js.native
    
    /* private */ var timer: Any = js.native
    
    @JSName("touch")
    def touch_MMongoStore(sid: String, session: SessionDatalastModifiedDa): Unit = js.native
    @JSName("touch")
    def touch_MMongoStore(sid: String, session: SessionDatalastModifiedDa, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    /* private */ var transformFunctions: Any = js.native
  }
}
