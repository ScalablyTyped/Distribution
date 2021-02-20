package typings.cryptex

import typings.cryptex.anon.DataKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cryptex", "Cryptex")
  @js.native
  class Cryptex protected () extends StObject {
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
  
  @JSImport("cryptex", "decrypt")
  @js.native
  def decrypt(data: String): js.Promise[String] = js.native
  @JSImport("cryptex", "decrypt")
  @js.native
  def decrypt(data: String, encoding: String): js.Promise[String] = js.native
  
  @JSImport("cryptex", "encrypt")
  @js.native
  def encrypt(data: String): js.Promise[String] = js.native
  @JSImport("cryptex", "encrypt")
  @js.native
  def encrypt(data: String, encoding: String): js.Promise[String] = js.native
  
  @JSImport("cryptex", "getSecret")
  @js.native
  def getSecret(secret: String): js.Promise[String] = js.native
  @JSImport("cryptex", "getSecret")
  @js.native
  def getSecret(secret: String, optional: Boolean): js.Promise[String] = js.native
  
  @JSImport("cryptex", "getSecrets")
  @js.native
  def getSecrets(secrets: js.Array[String]): js.Promise[js.Array[String]] = js.native
  @JSImport("cryptex", "getSecrets")
  @js.native
  def getSecrets(secrets: js.Array[String], optional: Boolean): js.Promise[js.Array[String]] = js.native
  
  @JSImport("cryptex", "update")
  @js.native
  def update(opts: CryptexOpts): Unit = js.native
  
  @js.native
  trait CryptexConfig extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var keySource: String = js.native
    
    var keySourceOpts: js.UndefOr[DataKey] = js.native
    
    var secretEncoding: js.UndefOr[String] = js.native
    
    var secrets: js.Object = js.native
  }
  object CryptexConfig {
    
    @scala.inline
    def apply(keySource: String, secrets: js.Object): CryptexConfig = {
      val __obj = js.Dynamic.literal(keySource = keySource.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptexConfig]
    }
    
    @scala.inline
    implicit class CryptexConfigMutableBuilder[Self <: CryptexConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setKeySource(value: String): Self = StObject.set(x, "keySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySourceOpts(value: DataKey): Self = StObject.set(x, "keySourceOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySourceOptsUndefined: Self = StObject.set(x, "keySourceOpts", js.undefined)
      
      @scala.inline
      def setSecretEncoding(value: String): Self = StObject.set(x, "secretEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretEncodingUndefined: Self = StObject.set(x, "secretEncoding", js.undefined)
      
      @scala.inline
      def setSecrets(value: js.Object): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CryptexOpts extends StObject {
    
    var cacheKey: js.UndefOr[Boolean] = js.native
    
    var cacheKeyTimeout: js.UndefOr[Double] = js.native
    
    var config: js.UndefOr[CryptexConfig] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
  }
  object CryptexOpts {
    
    @scala.inline
    def apply(): CryptexOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CryptexOpts]
    }
    
    @scala.inline
    implicit class CryptexOptsMutableBuilder[Self <: CryptexOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: Boolean): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyTimeout(value: Double): Self = StObject.set(x, "cacheKeyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyTimeoutUndefined: Self = StObject.set(x, "cacheKeyTimeout", js.undefined)
      
      @scala.inline
      def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      @scala.inline
      def setConfig(value: CryptexConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
}
