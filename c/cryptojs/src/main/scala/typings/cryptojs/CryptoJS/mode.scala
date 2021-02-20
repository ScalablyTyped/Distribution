package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.lib.BlockCipherMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mode {
  
  type CBC = IBlockCipherModeImpl
  
  type CFB = IBlockCipherModeImpl
  
  type CTR = IBlockCipherModeImpl
  
  type CTRGladman = IBlockCipherModeImpl
  
  type ECB = IBlockCipherModeImpl
  
  @js.native
  trait IBlockCipherDecryptor extends BlockCipherMode {
    
    //exactly as IBlockCipherEncryptor
    def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
  }
  
  @js.native
  trait IBlockCipherEncryptor extends BlockCipherMode {
    
    def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
  }
  
  @js.native
  trait IBlockCipherModeImpl extends BlockCipherMode {
    
    var Decryptor: IBlockCipherDecryptor = js.native
    
    var Encryptor: IBlockCipherEncryptor = js.native
  }
  
  @js.native
  trait ModeStatic extends StObject {
    
    var CBC: typings.cryptojs.CryptoJS.mode.CBC = js.native
    
    var CFB: typings.cryptojs.CryptoJS.mode.CFB = js.native
    
    var CTR: typings.cryptojs.CryptoJS.mode.CTR = js.native
    
    var CTRGladman: typings.cryptojs.CryptoJS.mode.CTRGladman = js.native
    
    var ECB: typings.cryptojs.CryptoJS.mode.ECB = js.native
    
    var OFB: typings.cryptojs.CryptoJS.mode.OFB = js.native
  }
  object ModeStatic {
    
    @scala.inline
    def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
      val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModeStatic]
    }
    
    @scala.inline
    implicit class ModeStaticMutableBuilder[Self <: ModeStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCBC(value: CBC): Self = StObject.set(x, "CBC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCFB(value: CFB): Self = StObject.set(x, "CFB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCTR(value: CTR): Self = StObject.set(x, "CTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCTRGladman(value: CTRGladman): Self = StObject.set(x, "CTRGladman", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setECB(value: ECB): Self = StObject.set(x, "ECB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFB(value: OFB): Self = StObject.set(x, "OFB", value.asInstanceOf[js.Any])
    }
  }
  
  type OFB = IBlockCipherModeImpl
}
