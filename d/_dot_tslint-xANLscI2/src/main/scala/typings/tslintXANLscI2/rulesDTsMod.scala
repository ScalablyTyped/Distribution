package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules.d.ts", "AbstractRule")
  @js.native
  abstract class AbstractRule protected ()
    extends typings.tslintXANLscI2.abstractRuleDTsMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport(".tslint-xANLscI2/lib/rules.d.ts", "AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules.d.ts", "AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport(".tslint-xANLscI2/lib/rules.d.ts", "OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends typings.tslintXANLscI2.optionallyTypedRuleDTsMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/rules.d.ts", "TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends typings.tslintXANLscI2.typedRuleDTsMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
