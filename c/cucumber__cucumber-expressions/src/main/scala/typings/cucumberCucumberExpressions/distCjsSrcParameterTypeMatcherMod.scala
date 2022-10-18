package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.cucumberCucumberExpressionsBooleans.`true`
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcParameterTypeMatcherMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ParameterTypeMatcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ParameterTypeMatcher {
    def this(
      parameterType: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any],
      regexpString: String,
      text: String
    ) = this()
    def this(
      parameterType: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any],
      regexpString: String,
      text: String,
      matchPosition: Double
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ParameterTypeMatcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def compare(a: ParameterTypeMatcher, b: ParameterTypeMatcher): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @js.native
  trait ParameterTypeMatcher extends StObject {
    
    def advanceTo(newMatchPosition: Double): ParameterTypeMatcher = js.native
    
    def find: Boolean | RegExpMatchArray | Null = js.native
    
    def fullWord: `true` | RegExpMatchArray | Null = js.native
    
    def group: String = js.native
    
    /* private */ val `match`: Any = js.native
    
    def matchEndWord: `true` | RegExpMatchArray | Null = js.native
    
    /* private */ var matchPosition: Any = js.native
    
    def matchStartWord: `true` | RegExpMatchArray | Null = js.native
    
    val parameterType: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any] = js.native
    
    /* private */ val regexpString: Any = js.native
    
    def start: Double = js.native
    
    /* private */ val text: Any = js.native
  }
}
