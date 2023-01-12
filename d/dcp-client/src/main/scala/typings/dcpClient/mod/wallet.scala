package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wallet {
  
  trait Wallet extends StObject {
    
    /**
      * This function will add the provided keystore to the wallet API internal cache,
      * which will return the same keystore when get is called with the same name.
      *  @param keystore Keystore
      *  @param name string = ‘default’
      */
    def add(keystore: Keystore, name: String): js.Promise[Double]
    
    /**
      * This function will clear the wallet API’s internal keystore cache.
      * @param keystore Keystore
      */
    def addId(keystore: Keystore): js.Promise[Double]
    
    /**
      * This function will clear the wallet API’s internal keystore cache.
      */
    def clear(): js.Promise[Unit]
    
    /**
      * [See docs](https://docs.dcp.dev/specs/wallet-api.html#wallet-api)
      * Gets a keystore from the wallet
      * @returns a Promise which will be fulfilled with a AuthKeystore object.
      * @param options AuthKeystoreOptions
      */
    def get(options: AuthKeystoreOptions): js.Promise[AuthKeystore]
    
    /**
      * This function behaves exactly the same as get(),
      * except its default keystore file is the id keystore instead of the default keystore.
      */
    def getId(): js.Promise[Double]
    
    /**
      * Gets a keystore from the disk
      * @returns a Promise which will be fulfilled with a AuthKeystore object.
      * @param options LoadOptions
      */
    def load(options: LoadOptions): js.Promise[LoadResult]
  }
  object Wallet {
    
    inline def apply(
      add: (Keystore, String) => js.Promise[Double],
      addId: Keystore => js.Promise[Double],
      clear: () => js.Promise[Unit],
      get: AuthKeystoreOptions => js.Promise[AuthKeystore],
      getId: () => js.Promise[Double],
      load: LoadOptions => js.Promise[LoadResult]
    ): Wallet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addId = js.Any.fromFunction1(addId), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), getId = js.Any.fromFunction0(getId), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[Wallet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Wallet] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (Keystore, String) => js.Promise[Double]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddId(value: Keystore => js.Promise[Double]): Self = StObject.set(x, "addId", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: AuthKeystoreOptions => js.Promise[AuthKeystore]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetId(value: () => js.Promise[Double]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setLoad(value: LoadOptions => js.Promise[LoadResult]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
}
