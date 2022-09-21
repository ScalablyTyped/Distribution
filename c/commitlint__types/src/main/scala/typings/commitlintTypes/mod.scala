package typings.commitlintTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/types", "RuleConfigQuality")
  @js.native
  object RuleConfigQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.commitlintTypes.rulesMod.RuleConfigQuality & Double] = js.native
    
    /* 1 */ val Qualified: typings.commitlintTypes.rulesMod.RuleConfigQuality.Qualified & Double = js.native
    
    /* 0 */ val User: typings.commitlintTypes.rulesMod.RuleConfigQuality.User & Double = js.native
  }
  
  @JSImport("@commitlint/types", "RuleConfigSeverity")
  @js.native
  object RuleConfigSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.commitlintTypes.rulesMod.RuleConfigSeverity & Double] = js.native
    
    /* 0 */ val Disabled: typings.commitlintTypes.rulesMod.RuleConfigSeverity.Disabled & Double = js.native
    
    /* 2 */ val Error: typings.commitlintTypes.rulesMod.RuleConfigSeverity.Error & Double = js.native
    
    /* 1 */ val Warning: typings.commitlintTypes.rulesMod.RuleConfigSeverity.Warning & Double = js.native
  }
}
