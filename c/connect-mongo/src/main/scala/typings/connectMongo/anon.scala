package typings.connectMongo

import org.scalablytyped.runtime.StringDictionary
import typings.connectMongo.connectMongoStrings.disabled
import typings.connectMongo.connectMongoStrings.interval
import typings.connectMongo.connectMongoStrings.native
import typings.connectMongo.mongoStoreMod.CryptoOptions
import typings.connectMongo.mongoStoreMod.default
import typings.expressSession.mod.Cookie
import typings.expressSession.mod.SessionData
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.WriteConcernSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    def all(): js.Promise[js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null]]
    
    def clear(): js.Promise[Unit]
    
    def close(): js.Promise[Unit]
    
    def destroy(arg1: String): js.Promise[Unit]
    
    def get(arg1: String): js.Promise[js.UndefOr[SessionData | Null]]
    
    def length(): js.Promise[Double]
    
    def set(arg1: String, arg2: SessionData): js.Promise[Unit]
    
    def touch(arg1: String, arg2: SessionDatalastModifiedDa): js.Promise[Unit]
  }
  object All {
    
    inline def apply(
      all: () => js.Promise[js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null]],
      clear: () => js.Promise[Unit],
      close: () => js.Promise[Unit],
      destroy: String => js.Promise[Unit],
      get: String => js.Promise[js.UndefOr[SessionData | Null]],
      length: () => js.Promise[Double],
      set: (String, SessionData) => js.Promise[Unit],
      touch: (String, SessionDatalastModifiedDa) => js.Promise[Unit]
    ): All = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), clear = js.Any.fromFunction0(clear), close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction1(destroy), get = js.Any.fromFunction1(get), length = js.Any.fromFunction0(length), set = js.Any.fromFunction2(set), touch = js.Any.fromFunction2(touch))
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: () => js.Promise[js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: String => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.Promise[js.UndefOr[SessionData | Null]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: () => js.Promise[Double]): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, SessionData) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setTouch(value: (String, SessionDatalastModifiedDa) => js.Promise[Unit]): Self = StObject.set(x, "touch", js.Any.fromFunction2(value))
    }
  }
  
  trait Baz extends StObject {
    
    var baz: Chicken
    
    var cookie: Cookie
    
    var foo: String
    
    var num: Double
  }
  object Baz {
    
    inline def apply(baz: Chicken, cookie: Cookie, foo: String, num: Double): Baz = {
      val __obj = js.Dynamic.literal(baz = baz.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], foo = foo.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
      __obj.asInstanceOf[Baz]
    }
    
    extension [Self <: Baz](x: Self) {
      
      inline def setBaz(value: Chicken): Self = StObject.set(x, "baz", value.asInstanceOf[js.Any])
      
      inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setFoo(value: String): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
      
      inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    }
  }
  
  trait Chicken extends StObject {
    
    var chicken: String
    
    var cow: String
  }
  object Chicken {
    
    inline def apply(chicken: String, cow: String): Chicken = {
      val __obj = js.Dynamic.literal(chicken = chicken.asInstanceOf[js.Any], cow = cow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chicken]
    }
    
    extension [Self <: Chicken](x: Self) {
      
      inline def setChicken(value: String): Self = StObject.set(x, "chicken", value.asInstanceOf[js.Any])
      
      inline def setCow(value: String): Self = StObject.set(x, "cow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cow extends StObject {
    
    var cow: String
    
    var fish: String
    
    var fox: String
  }
  object Cow {
    
    inline def apply(cow: String, fish: String, fox: String): Cow = {
      val __obj = js.Dynamic.literal(cow = cow.asInstanceOf[js.Any], fish = fish.asInstanceOf[js.Any], fox = fox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cow]
    }
    
    extension [Self <: Cow](x: Self) {
      
      inline def setCow(value: String): Self = StObject.set(x, "cow", value.asInstanceOf[js.Any])
      
      inline def setFish(value: String): Self = StObject.set(x, "fish", value.asInstanceOf[js.Any])
      
      inline def setFox(value: String): Self = StObject.set(x, "fox", value.asInstanceOf[js.Any])
    }
  }
  
  trait Foo extends StObject {
    
    var baz: Cow
    
    var foo: String
    
    var num: Double
  }
  object Foo {
    
    inline def apply(baz: Cow, foo: String, num: Double): Foo = {
      val __obj = js.Dynamic.literal(baz = baz.asInstanceOf[js.Any], foo = foo.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
      __obj.asInstanceOf[Foo]
    }
    
    extension [Self <: Foo](x: Self) {
      
      inline def setBaz(value: Cow): Self = StObject.set(x, "baz", value.asInstanceOf[js.Any])
      
      inline def setFoo(value: String): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
      
      inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<connect-mongo.connect-mongo/build/main/lib/MongoStore.ConnectMongoOptions> */
  trait PartialConnectMongoOption extends StObject {
    
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
  object PartialConnectMongoOption {
    
    inline def apply(): PartialConnectMongoOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConnectMongoOption]
    }
    
    extension [Self <: PartialConnectMongoOption](x: Self) {
      
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
  
  /* Inlined express-session.express-session.SessionData & {  lastModified :std.Date | undefined} */
  trait SessionDatalastModifiedDa extends StObject {
    
    var cookie: Cookie
    
    var lastModified: js.UndefOr[js.Date] = js.undefined
  }
  object SessionDatalastModifiedDa {
    
    inline def apply(cookie: Cookie): SessionDatalastModifiedDa = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionDatalastModifiedDa]
    }
    
    extension [Self <: SessionDatalastModifiedDa](x: Self) {
      
      inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    }
  }
  
  trait Store extends StObject {
    
    var store: default
    
    var storePromise: All
  }
  object Store {
    
    inline def apply(store: default, storePromise: All): Store = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storePromise = storePromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setStore(value: default): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStorePromise(value: All): Self = StObject.set(x, "storePromise", value.asInstanceOf[js.Any])
    }
  }
}
