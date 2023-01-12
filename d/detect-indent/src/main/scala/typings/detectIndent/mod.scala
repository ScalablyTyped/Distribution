package typings.detectIndent

import typings.detectIndent.detectIndentStrings.space
import typings.detectIndent.detectIndentStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-indent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): Indent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Indent]
  
  trait Indent extends StObject {
    
    /**
    	The amount of indentation. For example, `2`.
    	*/
    var amount: Double
    
    /**
    	The actual indentation.
    	*/
    var indent: String
    
    /**
    	The type of indentation.
    	It is `undefined` if no indentation is detected.
    	*/
    var `type`: js.UndefOr[tab | space] = js.undefined
  }
  object Indent {
    
    inline def apply(amount: Double, indent: String): Indent = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setType(value: tab | space): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
