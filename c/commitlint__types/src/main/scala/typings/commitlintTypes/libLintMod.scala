package typings.commitlintTypes

import typings.commitlintTypes.libIsIgnoredMod.Matcher
import typings.commitlintTypes.libLoadMod.PluginRecords
import typings.commitlintTypes.libParseMod.ParserOptions
import typings.commitlintTypes.libRulesMod.RuleConfigSeverity
import typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Disabled
import typings.commitlintTypes.libRulesMod.RuleConfigTuple
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintMod {
  
  trait LintOptions extends StObject {
    
    /** If it should ignore the default commit messages (defaults to `true`) */
    var defaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var helpUrl: js.UndefOr[String] = js.undefined
    
    /** Additional commits to ignore, defined by ignore matchers  */
    var ignores: js.UndefOr[js.Array[Matcher]] = js.undefined
    
    /** The parser configuration to use when linting the commit */
    var parserOpts: js.UndefOr[ParserOptions] = js.undefined
    
    var plugins: js.UndefOr[PluginRecords] = js.undefined
  }
  object LintOptions {
    
    inline def apply(): LintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LintOptions]
    }
    
    extension [Self <: LintOptions](x: Self) {
      
      inline def setDefaultIgnores(value: Boolean): Self = StObject.set(x, "defaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDefaultIgnoresUndefined: Self = StObject.set(x, "defaultIgnores", js.undefined)
      
      inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
      
      inline def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
      
      inline def setIgnores(value: js.Array[Matcher]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: Matcher*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPlugins(value: PluginRecords): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    }
  }
  
  trait LintOutcome extends StObject {
    
    /** All errors, per rule, for the commit */
    var errors: js.Array[LintRuleOutcome]
    
    /** The linted commit, as string */
    var input: String
    
    /** If the linted commit is considered valid */
    var valid: Boolean
    
    /** All warnings, per rule, for the commit */
    var warnings: js.Array[LintRuleOutcome]
  }
  object LintOutcome {
    
    inline def apply(
      errors: js.Array[LintRuleOutcome],
      input: String,
      valid: Boolean,
      warnings: js.Array[LintRuleOutcome]
    ): LintOutcome = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintOutcome]
    }
    
    extension [Self <: LintOutcome](x: Self) {
      
      inline def setErrors(value: js.Array[LintRuleOutcome]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: LintRuleOutcome*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[LintRuleOutcome]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: LintRuleOutcome*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  type LintRuleConfig = Record[String, js.Array[Disabled] | (RuleConfigTuple[Any | Unit])]
  
  trait LintRuleOutcome extends StObject {
    
    /** The "severity" of the rule (1 = warning, 2 = error) */
    var level: RuleConfigSeverity
    
    /** The message returned from the rule, if invalid */
    var message: String
    
    /** The name of the rule */
    var name: String
    
    /** If the commit is considered valid for the rule */
    var valid: Boolean
  }
  object LintRuleOutcome {
    
    inline def apply(level: RuleConfigSeverity, message: String, name: String, valid: Boolean): LintRuleOutcome = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintRuleOutcome]
    }
    
    extension [Self <: LintRuleOutcome](x: Self) {
      
      inline def setLevel(value: RuleConfigSeverity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
