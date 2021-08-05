package typings.blake2sJs

import typings.blake2sJs.blake2sJsNumbers.`32`
import typings.blake2sJs.blake2sJsNumbers.`64`
import typings.blake2sJs.blake2sJsNumbers.`8`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blake2s-js", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with BLAKE2s {
    def this(digestLength: Double) = this()
    def this(digestLength: Double, config: BLAKE2sConfig) = this()
    def this(digestLength: Double, key: ByteArray) = this()
    def this(digestLength: Unit, config: BLAKE2sConfig) = this()
    def this(digestLength: Unit, key: ByteArray) = this()
  }
  /* static members */
  object default {
    
    @JSImport("blake2s-js", "default.blockLength")
    @js.native
    val blockLength: `64` = js.native
    
    @JSImport("blake2s-js", "default.digestLength")
    @js.native
    val digestLength: `32` = js.native
    
    @JSImport("blake2s-js", "default.keyLength")
    @js.native
    val keyLength: `32` = js.native
    
    @JSImport("blake2s-js", "default.personalizationLength")
    @js.native
    val personalizationLength: `8` = js.native
    
    @JSImport("blake2s-js", "default.saltLength")
    @js.native
    val saltLength: `8` = js.native
  }
  
  @JSImport("blake2s-js", "blockLength")
  @js.native
  val blockLength: `64` = js.native
  
  @JSImport("blake2s-js", "digestLength")
  @js.native
  val digestLength: `32` = js.native
  
  @JSImport("blake2s-js", "keyLength")
  @js.native
  val keyLength: `32` = js.native
  
  @JSImport("blake2s-js", "personalizationLength")
  @js.native
  val personalizationLength: `8` = js.native
  
  @JSImport("blake2s-js", "saltLength")
  @js.native
  val saltLength: `8` = js.native
  
  @js.native
  trait BLAKE2s extends StObject {
    
    def digest(): Uint8Array = js.native
    
    def hexDigest(): String = js.native
    
    def update(p: ByteArray): this.type = js.native
    def update(p: ByteArray, offset: Double): this.type = js.native
    def update(p: ByteArray, offset: Double, length: Double): this.type = js.native
    def update(p: ByteArray, offset: Unit, length: Double): this.type = js.native
  }
  
  trait BLAKE2sConfig extends StObject {
    
    var key: js.UndefOr[ByteArray] = js.undefined
    
    var personalization: js.UndefOr[ByteArray] = js.undefined
    
    var salt: js.UndefOr[ByteArray] = js.undefined
  }
  object BLAKE2sConfig {
    
    inline def apply(): BLAKE2sConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BLAKE2sConfig]
    }
    
    extension [Self <: BLAKE2sConfig](x: Self) {
      
      inline def setKey(value: ByteArray): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      inline def setPersonalization(value: ByteArray): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
      
      inline def setPersonalizationVarargs(value: Double*): Self = StObject.set(x, "personalization", js.Array(value :_*))
      
      inline def setSalt(value: ByteArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
    }
  }
  
  type ByteArray = js.Array[Double] | Uint8Array
}
