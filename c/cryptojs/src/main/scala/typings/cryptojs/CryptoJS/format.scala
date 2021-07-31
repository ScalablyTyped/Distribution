package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.lib.CipherParams
import typings.cryptojs.CryptoJS.lib.CipherParamsData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object format {
  
  trait FormatStatic extends StObject {
    
    var Hex: IFormatter
    
    var OpenSSL: IFormatter
  }
  object FormatStatic {
    
    @scala.inline
    def apply(Hex: IFormatter, OpenSSL: IFormatter): FormatStatic = {
      val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatStatic]
    }
    
    @scala.inline
    implicit class FormatStaticMutableBuilder[Self <: FormatStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHex(value: IFormatter): Self = StObject.set(x, "Hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenSSL(value: IFormatter): Self = StObject.set(x, "OpenSSL", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFormatter extends StObject {
    
    def parse(s: String): CipherParams
    
    def stringify(cipherParams: CipherParamsData): String
  }
  object IFormatter {
    
    @scala.inline
    def apply(parse: String => CipherParams, stringify: CipherParamsData => String): IFormatter = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[IFormatter]
    }
    
    @scala.inline
    implicit class IFormatterMutableBuilder[Self <: IFormatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: String => CipherParams): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringify(value: CipherParamsData => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}
