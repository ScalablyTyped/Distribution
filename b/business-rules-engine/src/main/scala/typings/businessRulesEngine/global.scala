package typings.businessRulesEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Utils {
    
    @JSGlobal("Utils.NumberFce")
    @js.native
    class NumberFce ()
      extends StObject
         with typings.businessRulesEngine.Utils.NumberFce
    object NumberFce {
      
      @JSGlobal("Utils.NumberFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def GetNegDigits(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNegDigits")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    @JSGlobal("Utils.StringFce")
    @js.native
    class StringFce ()
      extends StObject
         with typings.businessRulesEngine.Utils.StringFce
    object StringFce {
      
      @JSGlobal("Utils.StringFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def format(s: String, args: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    }
  }
}
