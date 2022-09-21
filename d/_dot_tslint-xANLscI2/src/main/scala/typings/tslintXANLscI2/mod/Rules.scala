package typings.tslintXANLscI2.mod

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rules {
  
  @JSImport(".tslint-xANLscI2", "Rules.AbstractRule")
  @js.native
  abstract class AbstractRule protected ()
    extends typings.tslintXANLscI2.rulesDTsMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport(".tslint-xANLscI2", "Rules.AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2", "Rules.AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport(".tslint-xANLscI2", "Rules.OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends typings.tslintXANLscI2.rulesDTsMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  @JSImport(".tslint-xANLscI2", "Rules.TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends typings.tslintXANLscI2.rulesDTsMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
