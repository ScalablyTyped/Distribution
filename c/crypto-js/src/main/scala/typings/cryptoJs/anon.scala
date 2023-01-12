package typings.cryptoJs

import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.Mode_
import typings.cryptoJs.mod.Padding
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hasher extends StObject {
    
    var hasher: js.UndefOr[HasherStatic] = js.undefined
    
    var iterations: Double
    
    var keySize: Double
  }
  object Hasher {
    
    inline def apply(iterations: Double, keySize: Double): Hasher = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hasher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hasher] (val x: Self) extends AnyVal {
      
      inline def setHasher(value: HasherStatic): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      inline def setHasherUndefined: Self = StObject.set(x, "hasher", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<crypto-js.crypto-js.<global>.CryptoJS.lib.CipherParams> */
  trait PartialCipherParams extends StObject {
    
    var algorithm: js.UndefOr[CipherStatic] = js.undefined
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var ciphertext: js.UndefOr[WordArray] = js.undefined
    
    var formatter: js.UndefOr[Format_] = js.undefined
    
    var iv: js.UndefOr[WordArray] = js.undefined
    
    var key: js.UndefOr[WordArray] = js.undefined
    
    var mode: js.UndefOr[Mode_] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var salt: js.UndefOr[WordArray] = js.undefined
    
    @JSName("toString")
    var toString_FPartialCipherParams: js.UndefOr[js.Function1[/* formatter */ js.UndefOr[Format_], String]] = js.undefined
  }
  object PartialCipherParams {
    
    inline def apply(): PartialCipherParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCipherParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCipherParams] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: CipherStatic): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCiphertext(value: WordArray): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
      
      inline def setFormatter(value: Format_): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setKey(value: WordArray): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMode(value: Mode_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSalt(value: WordArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setToString_(value: /* formatter */ js.UndefOr[Format_] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
}
