package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`0`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`1`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`2`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`3`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`4`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`5`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`6`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictComparisonsRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/strictComparisonsRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
    
    /* private */ var getRuleOptions: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictComparisonsRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def INVALID_TYPES(types1: js.Array[TypeKind], types2: js.Array[TypeKind]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_TYPES")(types1.asInstanceOf[js.Any], types2.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def INVALID_TYPE_FOR_OPERATOR(`type`: TypeKind, comparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_TYPE_FOR_OPERATOR")(`type`.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictComparisonsRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`0`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`1`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`2`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`3`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`4`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`5`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`6`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`7`
  */
  trait TypeKind extends StObject
  object TypeKind {
    
    inline def Any: `0` = 0.asInstanceOf[`0`]
    
    inline def Boolean: `4` = 4.asInstanceOf[`4`]
    
    inline def Enum: `2` = 2.asInstanceOf[`2`]
    
    inline def Null: `5` = 5.asInstanceOf[`5`]
    
    inline def Number: `1` = 1.asInstanceOf[`1`]
    
    inline def Object: `7` = 7.asInstanceOf[`7`]
    
    inline def String: `3` = 3.asInstanceOf[`3`]
    
    inline def Undefined: `6` = 6.asInstanceOf[`6`]
  }
}
