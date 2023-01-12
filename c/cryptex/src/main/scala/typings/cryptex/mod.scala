package typings.cryptex

import typings.cryptex.anon.DataKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cryptex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cryptex", "Cryptex")
  @js.native
  open class Cryptex protected () extends StObject {
    def this(opts: CryptexOpts) = this()
    
    def decrypt(data: String): String = js.native
    def decrypt(data: String, encoding: String): String = js.native
    
    def encrypt(data: String): String = js.native
    def encrypt(data: String, encoding: String): String = js.native
    
    def getSecret(secret: String): js.Promise[String] = js.native
    def getSecret(secret: String, optional: Boolean): js.Promise[String] = js.native
    
    def getSecrets(secrets: js.Array[String]): js.Promise[js.Array[String]] = js.native
    def getSecrets(secrets: js.Array[String], optional: Boolean): js.Promise[js.Array[String]] = js.native
    
    def update(opts: CryptexOpts): Unit = js.native
  }
  
  inline def decrypt(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def decrypt(data: String, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def encrypt(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def encrypt(data: String, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getSecret(secret: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(secret.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getSecret(secret: String, optional: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecret")(secret.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getSecrets(secrets: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecrets")(secrets.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def getSecrets(secrets: js.Array[String], optional: Boolean): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecrets")(secrets.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def update(opts: CryptexOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CryptexConfig extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var keySource: String
    
    var keySourceOpts: js.UndefOr[DataKey] = js.undefined
    
    var secretEncoding: js.UndefOr[String] = js.undefined
    
    var secrets: js.Object
  }
  object CryptexConfig {
    
    inline def apply(keySource: String, secrets: js.Object): CryptexConfig = {
      val __obj = js.Dynamic.literal(keySource = keySource.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptexConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptexConfig] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setKeySource(value: String): Self = StObject.set(x, "keySource", value.asInstanceOf[js.Any])
      
      inline def setKeySourceOpts(value: DataKey): Self = StObject.set(x, "keySourceOpts", value.asInstanceOf[js.Any])
      
      inline def setKeySourceOptsUndefined: Self = StObject.set(x, "keySourceOpts", js.undefined)
      
      inline def setSecretEncoding(value: String): Self = StObject.set(x, "secretEncoding", value.asInstanceOf[js.Any])
      
      inline def setSecretEncodingUndefined: Self = StObject.set(x, "secretEncoding", js.undefined)
      
      inline def setSecrets(value: js.Object): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    }
  }
  
  trait CryptexOpts extends StObject {
    
    var cacheKey: js.UndefOr[Boolean] = js.undefined
    
    var cacheKeyTimeout: js.UndefOr[Double] = js.undefined
    
    var config: js.UndefOr[CryptexConfig] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
  }
  object CryptexOpts {
    
    inline def apply(): CryptexOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CryptexOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptexOpts] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: Boolean): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyTimeout(value: Double): Self = StObject.set(x, "cacheKeyTimeout", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyTimeoutUndefined: Self = StObject.set(x, "cacheKeyTimeout", js.undefined)
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setConfig(value: CryptexConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
}
