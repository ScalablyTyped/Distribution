package typings.commitlintTypes

import org.scalablytyped.runtime.StringDictionary
import typings.commitlintTypes.anon.PartialRulesConfigUser
import typings.commitlintTypes.ensureMod.TargetCaseType
import typings.commitlintTypes.promptMod.UserPromptConfig
import typings.commitlintTypes.rulesMod.AsyncRule
import typings.commitlintTypes.rulesMod.CaseRuleConfig
import typings.commitlintTypes.rulesMod.EnumRuleConfig
import typings.commitlintTypes.rulesMod.LengthRuleConfig
import typings.commitlintTypes.rulesMod.Rule
import typings.commitlintTypes.rulesMod.RuleConfig
import typings.commitlintTypes.rulesMod.RuleConfigQuality.Qualified
import typings.commitlintTypes.rulesMod.RuleConfigSeverity.Disabled
import typings.commitlintTypes.rulesMod.RuleConfigTuple
import typings.commitlintTypes.rulesMod.SyncRule
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadMod {
  
  trait LoadOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  trait ParserPreset extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var parserOpts: js.UndefOr[Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object ParserPreset {
    
    inline def apply(): ParserPreset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserPreset]
    }
    
    extension [Self <: ParserPreset](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParserOpts(value: Any): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    var rules: StringDictionary[Rule[scala.Nothing] | AsyncRule[scala.Nothing] | SyncRule[scala.Nothing]]
  }
  object Plugin {
    
    inline def apply(rules: StringDictionary[Rule[scala.Nothing] | AsyncRule[scala.Nothing] | SyncRule[scala.Nothing]]): Plugin = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setRules(value: StringDictionary[Rule[scala.Nothing] | AsyncRule[scala.Nothing] | SyncRule[scala.Nothing]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  type PluginRecords = Record[String, Plugin]
  
  trait QualifiedConfig extends StObject {
    
    var defaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var `extends`: js.Array[String]
    
    var formatter: String
    
    var helpUrl: String
    
    var ignores: js.UndefOr[js.Array[js.Function1[/* commit */ String, Boolean]]] = js.undefined
    
    var parserPreset: js.UndefOr[ParserPreset] = js.undefined
    
    var plugins: PluginRecords
    
    var prompt: UserPromptConfig
    
    var rules: QualifiedRules
  }
  object QualifiedConfig {
    
    inline def apply(
      `extends`: js.Array[String],
      formatter: String,
      helpUrl: String,
      plugins: PluginRecords,
      prompt: UserPromptConfig,
      rules: QualifiedRules
    ): QualifiedConfig = {
      val __obj = js.Dynamic.literal(formatter = formatter.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedConfig]
    }
    
    extension [Self <: QualifiedConfig](x: Self) {
      
      inline def setDefaultIgnores(value: Boolean): Self = StObject.set(x, "defaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDefaultIgnoresUndefined: Self = StObject.set(x, "defaultIgnores", js.undefined)
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
      
      inline def setIgnores(value: js.Array[js.Function1[/* commit */ String, Boolean]]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: (js.Function1[/* commit */ String, Boolean])*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setParserPreset(value: ParserPreset): Self = StObject.set(x, "parserPreset", value.asInstanceOf[js.Any])
      
      inline def setParserPresetUndefined: Self = StObject.set(x, "parserPreset", js.undefined)
      
      inline def setPlugins(value: PluginRecords): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: UserPromptConfig): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setRules(value: QualifiedRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@commitlint/types.@commitlint/types/lib/rules.RulesConfig<@commitlint/types.@commitlint/types/lib/rules.RuleConfigQuality.Qualified>> */
  trait QualifiedRules extends StObject {
    
    var `body-case`: js.UndefOr[CaseRuleConfig[Qualified]] = js.undefined
    
    var `body-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `body-full-stop`: js.UndefOr[RuleConfig[Qualified, String]] = js.undefined
    
    var `body-leading-blank`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `body-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `body-max-line-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `body-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `footer-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `footer-leading-blank`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `footer-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `footer-max-line-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `footer-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `header-case`: js.UndefOr[CaseRuleConfig[Qualified]] = js.undefined
    
    var `header-full-stop`: js.UndefOr[RuleConfig[Qualified, String]] = js.undefined
    
    var `header-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `header-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `references-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `scope-case`: js.UndefOr[CaseRuleConfig[Qualified]] = js.undefined
    
    var `scope-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `scope-enum`: js.UndefOr[EnumRuleConfig[Qualified]] = js.undefined
    
    var `scope-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `scope-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `signed-off-by`: js.UndefOr[RuleConfig[Qualified, String]] = js.undefined
    
    var `subject-case`: js.UndefOr[CaseRuleConfig[Qualified]] = js.undefined
    
    var `subject-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `subject-full-stop`: js.UndefOr[RuleConfig[Qualified, String]] = js.undefined
    
    var `subject-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `subject-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `trailer-exists`: js.UndefOr[RuleConfig[Qualified, String]] = js.undefined
    
    var `type-case`: js.UndefOr[CaseRuleConfig[Qualified]] = js.undefined
    
    var `type-empty`: js.UndefOr[RuleConfig[Qualified, Unit]] = js.undefined
    
    var `type-enum`: js.UndefOr[EnumRuleConfig[Qualified]] = js.undefined
    
    var `type-max-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
    
    var `type-min-length`: js.UndefOr[LengthRuleConfig[Qualified]] = js.undefined
  }
  object QualifiedRules {
    
    inline def apply(): QualifiedRules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QualifiedRules]
    }
    
    extension [Self <: QualifiedRules](x: Self) {
      
      inline def `setBody-case`(value: CaseRuleConfig[Qualified]): Self = StObject.set(x, "body-case", value.asInstanceOf[js.Any])
      
      inline def `setBody-caseFunction0`(
        value: () => (js.Promise[RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]]]) | (RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]])
      ): Self = StObject.set(x, "body-case", js.Any.fromFunction0(value))
      
      inline def `setBody-caseUndefined`: Self = StObject.set(x, "body-case", js.undefined)
      
      inline def `setBody-caseVarargs`(value: Disabled*): Self = StObject.set(x, "body-case", js.Array(value*))
      
      inline def `setBody-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "body-empty", value.asInstanceOf[js.Any])
      
      inline def `setBody-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "body-empty", js.Any.fromFunction0(value))
      
      inline def `setBody-emptyUndefined`: Self = StObject.set(x, "body-empty", js.undefined)
      
      inline def `setBody-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "body-empty", js.Array(value*))
      
      inline def `setBody-full-stop`(value: RuleConfig[Qualified, String]): Self = StObject.set(x, "body-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setBody-full-stopFunction0`(value: () => js.Promise[RuleConfigTuple[String]] | RuleConfigTuple[String]): Self = StObject.set(x, "body-full-stop", js.Any.fromFunction0(value))
      
      inline def `setBody-full-stopUndefined`: Self = StObject.set(x, "body-full-stop", js.undefined)
      
      inline def `setBody-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "body-full-stop", js.Array(value*))
      
      inline def `setBody-leading-blank`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "body-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setBody-leading-blankFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "body-leading-blank", js.Any.fromFunction0(value))
      
      inline def `setBody-leading-blankUndefined`: Self = StObject.set(x, "body-leading-blank", js.undefined)
      
      inline def `setBody-leading-blankVarargs`(value: Disabled*): Self = StObject.set(x, "body-leading-blank", js.Array(value*))
      
      inline def `setBody-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "body-max-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "body-max-length", js.Any.fromFunction0(value))
      
      inline def `setBody-max-lengthUndefined`: Self = StObject.set(x, "body-max-length", js.undefined)
      
      inline def `setBody-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-max-length", js.Array(value*))
      
      inline def `setBody-max-line-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "body-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-line-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "body-max-line-length", js.Any.fromFunction0(value))
      
      inline def `setBody-max-line-lengthUndefined`: Self = StObject.set(x, "body-max-line-length", js.undefined)
      
      inline def `setBody-max-line-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-max-line-length", js.Array(value*))
      
      inline def `setBody-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "body-min-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "body-min-length", js.Any.fromFunction0(value))
      
      inline def `setBody-min-lengthUndefined`: Self = StObject.set(x, "body-min-length", js.undefined)
      
      inline def `setBody-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-min-length", js.Array(value*))
      
      inline def `setFooter-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "footer-empty", value.asInstanceOf[js.Any])
      
      inline def `setFooter-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "footer-empty", js.Any.fromFunction0(value))
      
      inline def `setFooter-emptyUndefined`: Self = StObject.set(x, "footer-empty", js.undefined)
      
      inline def `setFooter-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "footer-empty", js.Array(value*))
      
      inline def `setFooter-leading-blank`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "footer-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setFooter-leading-blankFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "footer-leading-blank", js.Any.fromFunction0(value))
      
      inline def `setFooter-leading-blankUndefined`: Self = StObject.set(x, "footer-leading-blank", js.undefined)
      
      inline def `setFooter-leading-blankVarargs`(value: Disabled*): Self = StObject.set(x, "footer-leading-blank", js.Array(value*))
      
      inline def `setFooter-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "footer-max-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "footer-max-length", js.Any.fromFunction0(value))
      
      inline def `setFooter-max-lengthUndefined`: Self = StObject.set(x, "footer-max-length", js.undefined)
      
      inline def `setFooter-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-max-length", js.Array(value*))
      
      inline def `setFooter-max-line-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "footer-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-line-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "footer-max-line-length", js.Any.fromFunction0(value))
      
      inline def `setFooter-max-line-lengthUndefined`: Self = StObject.set(x, "footer-max-line-length", js.undefined)
      
      inline def `setFooter-max-line-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-max-line-length", js.Array(value*))
      
      inline def `setFooter-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "footer-min-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "footer-min-length", js.Any.fromFunction0(value))
      
      inline def `setFooter-min-lengthUndefined`: Self = StObject.set(x, "footer-min-length", js.undefined)
      
      inline def `setFooter-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-min-length", js.Array(value*))
      
      inline def `setHeader-case`(value: CaseRuleConfig[Qualified]): Self = StObject.set(x, "header-case", value.asInstanceOf[js.Any])
      
      inline def `setHeader-caseFunction0`(
        value: () => (js.Promise[RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]]]) | (RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]])
      ): Self = StObject.set(x, "header-case", js.Any.fromFunction0(value))
      
      inline def `setHeader-caseUndefined`: Self = StObject.set(x, "header-case", js.undefined)
      
      inline def `setHeader-caseVarargs`(value: Disabled*): Self = StObject.set(x, "header-case", js.Array(value*))
      
      inline def `setHeader-full-stop`(value: RuleConfig[Qualified, String]): Self = StObject.set(x, "header-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setHeader-full-stopFunction0`(value: () => js.Promise[RuleConfigTuple[String]] | RuleConfigTuple[String]): Self = StObject.set(x, "header-full-stop", js.Any.fromFunction0(value))
      
      inline def `setHeader-full-stopUndefined`: Self = StObject.set(x, "header-full-stop", js.undefined)
      
      inline def `setHeader-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "header-full-stop", js.Array(value*))
      
      inline def `setHeader-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "header-max-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "header-max-length", js.Any.fromFunction0(value))
      
      inline def `setHeader-max-lengthUndefined`: Self = StObject.set(x, "header-max-length", js.undefined)
      
      inline def `setHeader-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "header-max-length", js.Array(value*))
      
      inline def `setHeader-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "header-min-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "header-min-length", js.Any.fromFunction0(value))
      
      inline def `setHeader-min-lengthUndefined`: Self = StObject.set(x, "header-min-length", js.undefined)
      
      inline def `setHeader-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "header-min-length", js.Array(value*))
      
      inline def `setReferences-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "references-empty", value.asInstanceOf[js.Any])
      
      inline def `setReferences-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "references-empty", js.Any.fromFunction0(value))
      
      inline def `setReferences-emptyUndefined`: Self = StObject.set(x, "references-empty", js.undefined)
      
      inline def `setReferences-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "references-empty", js.Array(value*))
      
      inline def `setScope-case`(value: CaseRuleConfig[Qualified]): Self = StObject.set(x, "scope-case", value.asInstanceOf[js.Any])
      
      inline def `setScope-caseFunction0`(
        value: () => (js.Promise[RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]]]) | (RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]])
      ): Self = StObject.set(x, "scope-case", js.Any.fromFunction0(value))
      
      inline def `setScope-caseUndefined`: Self = StObject.set(x, "scope-case", js.undefined)
      
      inline def `setScope-caseVarargs`(value: Disabled*): Self = StObject.set(x, "scope-case", js.Array(value*))
      
      inline def `setScope-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "scope-empty", value.asInstanceOf[js.Any])
      
      inline def `setScope-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "scope-empty", js.Any.fromFunction0(value))
      
      inline def `setScope-emptyUndefined`: Self = StObject.set(x, "scope-empty", js.undefined)
      
      inline def `setScope-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "scope-empty", js.Array(value*))
      
      inline def `setScope-enum`(value: EnumRuleConfig[Qualified]): Self = StObject.set(x, "scope-enum", value.asInstanceOf[js.Any])
      
      inline def `setScope-enumFunction0`(value: () => js.Promise[RuleConfigTuple[js.Array[String]]] | RuleConfigTuple[js.Array[String]]): Self = StObject.set(x, "scope-enum", js.Any.fromFunction0(value))
      
      inline def `setScope-enumUndefined`: Self = StObject.set(x, "scope-enum", js.undefined)
      
      inline def `setScope-enumVarargs`(value: Disabled*): Self = StObject.set(x, "scope-enum", js.Array(value*))
      
      inline def `setScope-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "scope-max-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "scope-max-length", js.Any.fromFunction0(value))
      
      inline def `setScope-max-lengthUndefined`: Self = StObject.set(x, "scope-max-length", js.undefined)
      
      inline def `setScope-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "scope-max-length", js.Array(value*))
      
      inline def `setScope-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "scope-min-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "scope-min-length", js.Any.fromFunction0(value))
      
      inline def `setScope-min-lengthUndefined`: Self = StObject.set(x, "scope-min-length", js.undefined)
      
      inline def `setScope-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "scope-min-length", js.Array(value*))
      
      inline def `setSigned-off-by`(value: RuleConfig[Qualified, String]): Self = StObject.set(x, "signed-off-by", value.asInstanceOf[js.Any])
      
      inline def `setSigned-off-byFunction0`(value: () => js.Promise[RuleConfigTuple[String]] | RuleConfigTuple[String]): Self = StObject.set(x, "signed-off-by", js.Any.fromFunction0(value))
      
      inline def `setSigned-off-byUndefined`: Self = StObject.set(x, "signed-off-by", js.undefined)
      
      inline def `setSigned-off-byVarargs`(value: Disabled*): Self = StObject.set(x, "signed-off-by", js.Array(value*))
      
      inline def `setSubject-case`(value: CaseRuleConfig[Qualified]): Self = StObject.set(x, "subject-case", value.asInstanceOf[js.Any])
      
      inline def `setSubject-caseFunction0`(
        value: () => (js.Promise[RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]]]) | (RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]])
      ): Self = StObject.set(x, "subject-case", js.Any.fromFunction0(value))
      
      inline def `setSubject-caseUndefined`: Self = StObject.set(x, "subject-case", js.undefined)
      
      inline def `setSubject-caseVarargs`(value: Disabled*): Self = StObject.set(x, "subject-case", js.Array(value*))
      
      inline def `setSubject-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "subject-empty", value.asInstanceOf[js.Any])
      
      inline def `setSubject-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "subject-empty", js.Any.fromFunction0(value))
      
      inline def `setSubject-emptyUndefined`: Self = StObject.set(x, "subject-empty", js.undefined)
      
      inline def `setSubject-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "subject-empty", js.Array(value*))
      
      inline def `setSubject-full-stop`(value: RuleConfig[Qualified, String]): Self = StObject.set(x, "subject-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setSubject-full-stopFunction0`(value: () => js.Promise[RuleConfigTuple[String]] | RuleConfigTuple[String]): Self = StObject.set(x, "subject-full-stop", js.Any.fromFunction0(value))
      
      inline def `setSubject-full-stopUndefined`: Self = StObject.set(x, "subject-full-stop", js.undefined)
      
      inline def `setSubject-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "subject-full-stop", js.Array(value*))
      
      inline def `setSubject-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "subject-max-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "subject-max-length", js.Any.fromFunction0(value))
      
      inline def `setSubject-max-lengthUndefined`: Self = StObject.set(x, "subject-max-length", js.undefined)
      
      inline def `setSubject-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "subject-max-length", js.Array(value*))
      
      inline def `setSubject-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "subject-min-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "subject-min-length", js.Any.fromFunction0(value))
      
      inline def `setSubject-min-lengthUndefined`: Self = StObject.set(x, "subject-min-length", js.undefined)
      
      inline def `setSubject-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "subject-min-length", js.Array(value*))
      
      inline def `setTrailer-exists`(value: RuleConfig[Qualified, String]): Self = StObject.set(x, "trailer-exists", value.asInstanceOf[js.Any])
      
      inline def `setTrailer-existsFunction0`(value: () => js.Promise[RuleConfigTuple[String]] | RuleConfigTuple[String]): Self = StObject.set(x, "trailer-exists", js.Any.fromFunction0(value))
      
      inline def `setTrailer-existsUndefined`: Self = StObject.set(x, "trailer-exists", js.undefined)
      
      inline def `setTrailer-existsVarargs`(value: Disabled*): Self = StObject.set(x, "trailer-exists", js.Array(value*))
      
      inline def `setType-case`(value: CaseRuleConfig[Qualified]): Self = StObject.set(x, "type-case", value.asInstanceOf[js.Any])
      
      inline def `setType-caseFunction0`(
        value: () => (js.Promise[RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]]]) | (RuleConfigTuple[TargetCaseType | js.Array[TargetCaseType]])
      ): Self = StObject.set(x, "type-case", js.Any.fromFunction0(value))
      
      inline def `setType-caseUndefined`: Self = StObject.set(x, "type-case", js.undefined)
      
      inline def `setType-caseVarargs`(value: Disabled*): Self = StObject.set(x, "type-case", js.Array(value*))
      
      inline def `setType-empty`(value: RuleConfig[Qualified, Unit]): Self = StObject.set(x, "type-empty", value.asInstanceOf[js.Any])
      
      inline def `setType-emptyFunction0`(value: () => js.Promise[RuleConfigTuple[Unit]] | RuleConfigTuple[Unit]): Self = StObject.set(x, "type-empty", js.Any.fromFunction0(value))
      
      inline def `setType-emptyUndefined`: Self = StObject.set(x, "type-empty", js.undefined)
      
      inline def `setType-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "type-empty", js.Array(value*))
      
      inline def `setType-enum`(value: EnumRuleConfig[Qualified]): Self = StObject.set(x, "type-enum", value.asInstanceOf[js.Any])
      
      inline def `setType-enumFunction0`(value: () => js.Promise[RuleConfigTuple[js.Array[String]]] | RuleConfigTuple[js.Array[String]]): Self = StObject.set(x, "type-enum", js.Any.fromFunction0(value))
      
      inline def `setType-enumUndefined`: Self = StObject.set(x, "type-enum", js.undefined)
      
      inline def `setType-enumVarargs`(value: Disabled*): Self = StObject.set(x, "type-enum", js.Array(value*))
      
      inline def `setType-max-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "type-max-length", value.asInstanceOf[js.Any])
      
      inline def `setType-max-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "type-max-length", js.Any.fromFunction0(value))
      
      inline def `setType-max-lengthUndefined`: Self = StObject.set(x, "type-max-length", js.undefined)
      
      inline def `setType-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "type-max-length", js.Array(value*))
      
      inline def `setType-min-length`(value: LengthRuleConfig[Qualified]): Self = StObject.set(x, "type-min-length", value.asInstanceOf[js.Any])
      
      inline def `setType-min-lengthFunction0`(value: () => js.Promise[RuleConfigTuple[Double]] | RuleConfigTuple[Double]): Self = StObject.set(x, "type-min-length", js.Any.fromFunction0(value))
      
      inline def `setType-min-lengthUndefined`: Self = StObject.set(x, "type-min-length", js.undefined)
      
      inline def `setType-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "type-min-length", js.Array(value*))
    }
  }
  
  trait UserConfig
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var defaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var formatter: js.UndefOr[String] = js.undefined
    
    var helpUrl: js.UndefOr[String] = js.undefined
    
    var ignores: js.UndefOr[js.Array[js.Function1[/* commit */ String, Boolean]]] = js.undefined
    
    var parserPreset: js.UndefOr[String | ParserPreset | js.Promise[ParserPreset]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | Plugin]] = js.undefined
    
    var prompt: js.UndefOr[UserPromptConfig] = js.undefined
    
    var rules: js.UndefOr[PartialRulesConfigUser] = js.undefined
  }
  object UserConfig {
    
    inline def apply(): UserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConfig]
    }
    
    extension [Self <: UserConfig](x: Self) {
      
      inline def setDefaultIgnores(value: Boolean): Self = StObject.set(x, "defaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDefaultIgnoresUndefined: Self = StObject.set(x, "defaultIgnores", js.undefined)
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
      
      inline def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
      
      inline def setIgnores(value: js.Array[js.Function1[/* commit */ String, Boolean]]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: (js.Function1[/* commit */ String, Boolean])*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setParserPreset(value: String | ParserPreset | js.Promise[ParserPreset]): Self = StObject.set(x, "parserPreset", value.asInstanceOf[js.Any])
      
      inline def setParserPresetUndefined: Self = StObject.set(x, "parserPreset", js.undefined)
      
      inline def setPlugins(value: js.Array[String | Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | Plugin)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPrompt(value: UserPromptConfig): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRules(value: PartialRulesConfigUser): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
}
