package typings.commitlintTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/types", "RuleConfigQuality")
  @js.native
  object RuleConfigQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.commitlintTypes.libRulesMod.RuleConfigQuality & Double] = js.native
    
    /* 1 */ val Qualified: typings.commitlintTypes.libRulesMod.RuleConfigQuality.Qualified & Double = js.native
    
    /* 0 */ val User: typings.commitlintTypes.libRulesMod.RuleConfigQuality.User & Double = js.native
  }
  
  @JSImport("@commitlint/types", "RuleConfigSeverity")
  @js.native
  object RuleConfigSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.commitlintTypes.libRulesMod.RuleConfigSeverity & Double] = js.native
    
    /* 0 */ val Disabled: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Disabled & Double = js.native
    
    /* 2 */ val Error: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Error & Double = js.native
    
    /* 1 */ val Warning: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Warning & Double = js.native
  }
}
