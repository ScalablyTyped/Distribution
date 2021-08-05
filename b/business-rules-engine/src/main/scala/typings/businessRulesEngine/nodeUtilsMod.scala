package typings.businessRulesEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("node-utils", "NumberFce")
  @js.native
  class NumberFce ()
    extends StObject
       with typings.businessRulesEngine.Utils.NumberFce
  object NumberFce {
    
    @JSImport("node-utils", "NumberFce")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetNegDigits(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNegDigits")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("node-utils", "StringFce")
  @js.native
  class StringFce ()
    extends StObject
       with typings.businessRulesEngine.Utils.StringFce
  object StringFce {
    
    @JSImport("node-utils", "StringFce")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def format(s: String, args: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
