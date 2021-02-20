package typings.cryptoJs

import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.Mode_
import typings.cryptoJs.mod.Padding
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hasher extends StObject {
    
    var hasher: js.UndefOr[HasherStatic] = js.native
    
    var iterations: Double = js.native
    
    var keySize: Double = js.native
  }
  object Hasher {
    
    @scala.inline
    def apply(iterations: Double, keySize: Double): Hasher = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hasher]
    }
    
    @scala.inline
    implicit class HasherMutableBuilder[Self <: Hasher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasher(value: HasherStatic): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasherUndefined: Self = StObject.set(x, "hasher", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<crypto-js.crypto-js.<global>.CryptoJS.lib.CipherParams> */
  @js.native
  trait PartialCipherParams extends StObject {
    
    var algorithm: js.UndefOr[CipherStatic] = js.native
    
    var blockSize: js.UndefOr[Double] = js.native
    
    var ciphertext: js.UndefOr[WordArray] = js.native
    
    var formatter: js.UndefOr[Format_] = js.native
    
    var iv: js.UndefOr[WordArray] = js.native
    
    var key: js.UndefOr[WordArray] = js.native
    
    var mode: js.UndefOr[Mode_] = js.native
    
    var padding: js.UndefOr[Padding] = js.native
    
    var salt: js.UndefOr[WordArray] = js.native
    
    @JSName("toString")
    var toString_FPartialCipherParams: js.UndefOr[js.Function1[/* formatter */ js.UndefOr[Format_], String]] = js.native
  }
  object PartialCipherParams {
    
    @scala.inline
    def apply(): PartialCipherParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCipherParams]
    }
    
    @scala.inline
    implicit class PartialCipherParamsMutableBuilder[Self <: PartialCipherParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: CipherStatic): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setCiphertext(value: WordArray): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
      
      @scala.inline
      def setFormatter(value: Format_): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setKey(value: WordArray): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMode(value: Mode_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSalt(value: WordArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setToString_(value: /* formatter */ js.UndefOr[Format_] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
}
