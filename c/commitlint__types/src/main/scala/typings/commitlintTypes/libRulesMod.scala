package typings.commitlintTypes

import org.scalablytyped.runtime.StringDictionary
import typings.commitlintTypes.commitlintTypesStrings.async
import typings.commitlintTypes.commitlintTypesStrings.either
import typings.commitlintTypes.commitlintTypesStrings.sync
import typings.commitlintTypes.libEnsureMod.TargetCaseType
import typings.commitlintTypes.libParseMod.Commit
import typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesMod {
  
  @js.native
  sealed trait RuleConfigQuality extends StObject
  @JSImport("@commitlint/types/lib/rules", "RuleConfigQuality")
  @js.native
  object RuleConfigQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RuleConfigQuality & Double] = js.native
    
    @js.native
    sealed trait Qualified
      extends StObject
         with RuleConfigQuality
    /* 1 */ val Qualified: typings.commitlintTypes.libRulesMod.RuleConfigQuality.Qualified & Double = js.native
    
    @js.native
    sealed trait User
      extends StObject
         with RuleConfigQuality
    /* 0 */ val User: typings.commitlintTypes.libRulesMod.RuleConfigQuality.User & Double = js.native
  }
  
  @js.native
  sealed trait RuleConfigSeverity extends StObject
  @JSImport("@commitlint/types/lib/rules", "RuleConfigSeverity")
  @js.native
  object RuleConfigSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RuleConfigSeverity & Double] = js.native
    
    @js.native
    sealed trait Disabled
      extends StObject
         with RuleConfigSeverity
    /* 0 */ val Disabled: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Disabled & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with RuleConfigSeverity
    /* 2 */ val Error: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Error & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with RuleConfigSeverity
    /* 1 */ val Warning: typings.commitlintTypes.libRulesMod.RuleConfigSeverity.Warning & Double = js.native
  }
  
  type AnyRuleConfig[V] = RuleConfig[V, Any | Unit]
  
  type AsyncRule[Value] = BaseRule[Value, async]
  
  type BaseRule[Value, Type /* <: RuleType */] = js.Function3[
    /* parsed */ Commit, 
    /* when */ js.UndefOr[RuleConfigCondition], 
    /* value */ js.UndefOr[Value], 
    /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'either' ? @commitlint/types.@commitlint/types/lib/rules.RuleOutcome | std.Promise<@commitlint/types.@commitlint/types/lib/rules.RuleOutcome> : Type extends 'async' ? std.Promise<@commitlint/types.@commitlint/types/lib/rules.RuleOutcome> : Type extends 'sync' ? @commitlint/types.@commitlint/types/lib/rules.RuleOutcome : never */ js.Any
  ]
  
  type CaseRuleConfig[V] = RuleConfig[V, TargetCaseType | js.Array[TargetCaseType]]
  
  type EnumRuleConfig[V] = RuleConfig[V, js.Array[String]]
  
  type LengthRuleConfig[V] = RuleConfig[V, Double]
  
  type QualifiedRuleConfig[T] = (js.Function0[js.Promise[RuleConfigTuple[T]] | RuleConfigTuple[T]]) | RuleConfigTuple[T]
  
  type Rule[Value] = BaseRule[Value, either]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends @commitlint/types.@commitlint/types/lib/rules.RuleConfigQuality.Qualified ? @commitlint/types.@commitlint/types/lib/rules.RuleConfigTuple<T> : @commitlint/types.@commitlint/types/lib/rules.QualifiedRuleConfig<T>
    }}}
    */
  type RuleConfig[V, T] = js.Array[Disabled] | (js.Tuple2[RuleConfigSeverity, RuleConfigCondition])
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintTypes.commitlintTypesStrings.always
    - typings.commitlintTypes.commitlintTypesStrings.never
  */
  trait RuleConfigCondition extends StObject
  object RuleConfigCondition {
    
    inline def always: typings.commitlintTypes.commitlintTypesStrings.always = "always".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.always]
    
    inline def never: typings.commitlintTypes.commitlintTypesStrings.never = "never".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.never]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends void ? std.Readonly<[@commitlint/types.@commitlint/types/lib/rules.RuleConfigSeverity.Disabled]> | std.Readonly<[@commitlint/types.@commitlint/types/lib/rules.RuleConfigSeverity, @commitlint/types.@commitlint/types/lib/rules.RuleConfigCondition]> : std.Readonly<[@commitlint/types.@commitlint/types/lib/rules.RuleConfigSeverity.Disabled]> | std.Readonly<[@commitlint/types.@commitlint/types/lib/rules.RuleConfigSeverity, @commitlint/types.@commitlint/types/lib/rules.RuleConfigCondition, T]>
    }}}
    */
  type RuleConfigTuple[T] = js.Array[Disabled] | (js.Tuple2[RuleConfigSeverity, RuleConfigCondition])
  
  type RuleOutcome = js.Tuple2[Boolean, js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintTypes.commitlintTypesStrings.async
    - typings.commitlintTypes.commitlintTypesStrings.sync
    - typings.commitlintTypes.commitlintTypesStrings.either
  */
  trait RuleType extends StObject
  object RuleType {
    
    inline def async: typings.commitlintTypes.commitlintTypesStrings.async = "async".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.async]
    
    inline def either: typings.commitlintTypes.commitlintTypesStrings.either = "either".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.either]
    
    inline def sync: typings.commitlintTypes.commitlintTypesStrings.sync = "sync".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.sync]
  }
  
  trait RulesConfig[V]
    extends StObject
       with /* key */ StringDictionary[AnyRuleConfig[V]] {
    
    var `body-case`: CaseRuleConfig[V]
    
    var `body-empty`: RuleConfig[V, Unit]
    
    var `body-full-stop`: RuleConfig[V, String]
    
    var `body-leading-blank`: RuleConfig[V, Unit]
    
    var `body-max-length`: LengthRuleConfig[V]
    
    var `body-max-line-length`: LengthRuleConfig[V]
    
    var `body-min-length`: LengthRuleConfig[V]
    
    var `footer-empty`: RuleConfig[V, Unit]
    
    var `footer-leading-blank`: RuleConfig[V, Unit]
    
    var `footer-max-length`: LengthRuleConfig[V]
    
    var `footer-max-line-length`: LengthRuleConfig[V]
    
    var `footer-min-length`: LengthRuleConfig[V]
    
    var `header-case`: CaseRuleConfig[V]
    
    var `header-full-stop`: RuleConfig[V, String]
    
    var `header-max-length`: LengthRuleConfig[V]
    
    var `header-min-length`: LengthRuleConfig[V]
    
    var `references-empty`: RuleConfig[V, Unit]
    
    var `scope-case`: CaseRuleConfig[V]
    
    var `scope-empty`: RuleConfig[V, Unit]
    
    var `scope-enum`: EnumRuleConfig[V]
    
    var `scope-max-length`: LengthRuleConfig[V]
    
    var `scope-min-length`: LengthRuleConfig[V]
    
    var `signed-off-by`: RuleConfig[V, String]
    
    var `subject-case`: CaseRuleConfig[V]
    
    var `subject-empty`: RuleConfig[V, Unit]
    
    var `subject-full-stop`: RuleConfig[V, String]
    
    var `subject-max-length`: LengthRuleConfig[V]
    
    var `subject-min-length`: LengthRuleConfig[V]
    
    var `trailer-exists`: RuleConfig[V, String]
    
    var `type-case`: CaseRuleConfig[V]
    
    var `type-empty`: RuleConfig[V, Unit]
    
    var `type-enum`: EnumRuleConfig[V]
    
    var `type-max-length`: LengthRuleConfig[V]
    
    var `type-min-length`: LengthRuleConfig[V]
  }
  object RulesConfig {
    
    inline def apply[V](
      `body-case`: CaseRuleConfig[V],
      `body-empty`: RuleConfig[V, Unit],
      `body-full-stop`: RuleConfig[V, String],
      `body-leading-blank`: RuleConfig[V, Unit],
      `body-max-length`: LengthRuleConfig[V],
      `body-max-line-length`: LengthRuleConfig[V],
      `body-min-length`: LengthRuleConfig[V],
      `footer-empty`: RuleConfig[V, Unit],
      `footer-leading-blank`: RuleConfig[V, Unit],
      `footer-max-length`: LengthRuleConfig[V],
      `footer-max-line-length`: LengthRuleConfig[V],
      `footer-min-length`: LengthRuleConfig[V],
      `header-case`: CaseRuleConfig[V],
      `header-full-stop`: RuleConfig[V, String],
      `header-max-length`: LengthRuleConfig[V],
      `header-min-length`: LengthRuleConfig[V],
      `references-empty`: RuleConfig[V, Unit],
      `scope-case`: CaseRuleConfig[V],
      `scope-empty`: RuleConfig[V, Unit],
      `scope-enum`: EnumRuleConfig[V],
      `scope-max-length`: LengthRuleConfig[V],
      `scope-min-length`: LengthRuleConfig[V],
      `signed-off-by`: RuleConfig[V, String],
      `subject-case`: CaseRuleConfig[V],
      `subject-empty`: RuleConfig[V, Unit],
      `subject-full-stop`: RuleConfig[V, String],
      `subject-max-length`: LengthRuleConfig[V],
      `subject-min-length`: LengthRuleConfig[V],
      `trailer-exists`: RuleConfig[V, String],
      `type-case`: CaseRuleConfig[V],
      `type-empty`: RuleConfig[V, Unit],
      `type-enum`: EnumRuleConfig[V],
      `type-max-length`: LengthRuleConfig[V],
      `type-min-length`: LengthRuleConfig[V]
    ): RulesConfig[V] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("body-case")(`body-case`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-empty")(`body-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-full-stop")(`body-full-stop`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-leading-blank")(`body-leading-blank`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-max-length")(`body-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-max-line-length")(`body-max-line-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("body-min-length")(`body-min-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("footer-empty")(`footer-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("footer-leading-blank")(`footer-leading-blank`.asInstanceOf[js.Any])
      __obj.updateDynamic("footer-max-length")(`footer-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("footer-max-line-length")(`footer-max-line-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("footer-min-length")(`footer-min-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("header-case")(`header-case`.asInstanceOf[js.Any])
      __obj.updateDynamic("header-full-stop")(`header-full-stop`.asInstanceOf[js.Any])
      __obj.updateDynamic("header-max-length")(`header-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("header-min-length")(`header-min-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("references-empty")(`references-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("scope-case")(`scope-case`.asInstanceOf[js.Any])
      __obj.updateDynamic("scope-empty")(`scope-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("scope-enum")(`scope-enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("scope-max-length")(`scope-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("scope-min-length")(`scope-min-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("signed-off-by")(`signed-off-by`.asInstanceOf[js.Any])
      __obj.updateDynamic("subject-case")(`subject-case`.asInstanceOf[js.Any])
      __obj.updateDynamic("subject-empty")(`subject-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("subject-full-stop")(`subject-full-stop`.asInstanceOf[js.Any])
      __obj.updateDynamic("subject-max-length")(`subject-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("subject-min-length")(`subject-min-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("trailer-exists")(`trailer-exists`.asInstanceOf[js.Any])
      __obj.updateDynamic("type-case")(`type-case`.asInstanceOf[js.Any])
      __obj.updateDynamic("type-empty")(`type-empty`.asInstanceOf[js.Any])
      __obj.updateDynamic("type-enum")(`type-enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("type-max-length")(`type-max-length`.asInstanceOf[js.Any])
      __obj.updateDynamic("type-min-length")(`type-min-length`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesConfig[V]]
    }
    
    extension [Self <: RulesConfig[?], V](x: Self & RulesConfig[V]) {
      
      inline def `setBody-case`(value: CaseRuleConfig[V]): Self = StObject.set(x, "body-case", value.asInstanceOf[js.Any])
      
      inline def `setBody-caseVarargs`(value: Disabled*): Self = StObject.set(x, "body-case", js.Array(value*))
      
      inline def `setBody-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "body-empty", value.asInstanceOf[js.Any])
      
      inline def `setBody-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "body-empty", js.Array(value*))
      
      inline def `setBody-full-stop`(value: RuleConfig[V, String]): Self = StObject.set(x, "body-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setBody-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "body-full-stop", js.Array(value*))
      
      inline def `setBody-leading-blank`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "body-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setBody-leading-blankVarargs`(value: Disabled*): Self = StObject.set(x, "body-leading-blank", js.Array(value*))
      
      inline def `setBody-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "body-max-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-max-length", js.Array(value*))
      
      inline def `setBody-max-line-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "body-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-line-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-max-line-length", js.Array(value*))
      
      inline def `setBody-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "body-min-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "body-min-length", js.Array(value*))
      
      inline def `setFooter-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "footer-empty", value.asInstanceOf[js.Any])
      
      inline def `setFooter-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "footer-empty", js.Array(value*))
      
      inline def `setFooter-leading-blank`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "footer-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setFooter-leading-blankVarargs`(value: Disabled*): Self = StObject.set(x, "footer-leading-blank", js.Array(value*))
      
      inline def `setFooter-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "footer-max-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-max-length", js.Array(value*))
      
      inline def `setFooter-max-line-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "footer-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-line-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-max-line-length", js.Array(value*))
      
      inline def `setFooter-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "footer-min-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "footer-min-length", js.Array(value*))
      
      inline def `setHeader-case`(value: CaseRuleConfig[V]): Self = StObject.set(x, "header-case", value.asInstanceOf[js.Any])
      
      inline def `setHeader-caseVarargs`(value: Disabled*): Self = StObject.set(x, "header-case", js.Array(value*))
      
      inline def `setHeader-full-stop`(value: RuleConfig[V, String]): Self = StObject.set(x, "header-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setHeader-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "header-full-stop", js.Array(value*))
      
      inline def `setHeader-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "header-max-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "header-max-length", js.Array(value*))
      
      inline def `setHeader-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "header-min-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "header-min-length", js.Array(value*))
      
      inline def `setReferences-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "references-empty", value.asInstanceOf[js.Any])
      
      inline def `setReferences-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "references-empty", js.Array(value*))
      
      inline def `setScope-case`(value: CaseRuleConfig[V]): Self = StObject.set(x, "scope-case", value.asInstanceOf[js.Any])
      
      inline def `setScope-caseVarargs`(value: Disabled*): Self = StObject.set(x, "scope-case", js.Array(value*))
      
      inline def `setScope-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "scope-empty", value.asInstanceOf[js.Any])
      
      inline def `setScope-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "scope-empty", js.Array(value*))
      
      inline def `setScope-enum`(value: EnumRuleConfig[V]): Self = StObject.set(x, "scope-enum", value.asInstanceOf[js.Any])
      
      inline def `setScope-enumVarargs`(value: Disabled*): Self = StObject.set(x, "scope-enum", js.Array(value*))
      
      inline def `setScope-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "scope-max-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "scope-max-length", js.Array(value*))
      
      inline def `setScope-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "scope-min-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "scope-min-length", js.Array(value*))
      
      inline def `setSigned-off-by`(value: RuleConfig[V, String]): Self = StObject.set(x, "signed-off-by", value.asInstanceOf[js.Any])
      
      inline def `setSigned-off-byVarargs`(value: Disabled*): Self = StObject.set(x, "signed-off-by", js.Array(value*))
      
      inline def `setSubject-case`(value: CaseRuleConfig[V]): Self = StObject.set(x, "subject-case", value.asInstanceOf[js.Any])
      
      inline def `setSubject-caseVarargs`(value: Disabled*): Self = StObject.set(x, "subject-case", js.Array(value*))
      
      inline def `setSubject-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "subject-empty", value.asInstanceOf[js.Any])
      
      inline def `setSubject-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "subject-empty", js.Array(value*))
      
      inline def `setSubject-full-stop`(value: RuleConfig[V, String]): Self = StObject.set(x, "subject-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setSubject-full-stopVarargs`(value: Disabled*): Self = StObject.set(x, "subject-full-stop", js.Array(value*))
      
      inline def `setSubject-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "subject-max-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "subject-max-length", js.Array(value*))
      
      inline def `setSubject-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "subject-min-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "subject-min-length", js.Array(value*))
      
      inline def `setTrailer-exists`(value: RuleConfig[V, String]): Self = StObject.set(x, "trailer-exists", value.asInstanceOf[js.Any])
      
      inline def `setTrailer-existsVarargs`(value: Disabled*): Self = StObject.set(x, "trailer-exists", js.Array(value*))
      
      inline def `setType-case`(value: CaseRuleConfig[V]): Self = StObject.set(x, "type-case", value.asInstanceOf[js.Any])
      
      inline def `setType-caseVarargs`(value: Disabled*): Self = StObject.set(x, "type-case", js.Array(value*))
      
      inline def `setType-empty`(value: RuleConfig[V, Unit]): Self = StObject.set(x, "type-empty", value.asInstanceOf[js.Any])
      
      inline def `setType-emptyVarargs`(value: Disabled*): Self = StObject.set(x, "type-empty", js.Array(value*))
      
      inline def `setType-enum`(value: EnumRuleConfig[V]): Self = StObject.set(x, "type-enum", value.asInstanceOf[js.Any])
      
      inline def `setType-enumVarargs`(value: Disabled*): Self = StObject.set(x, "type-enum", js.Array(value*))
      
      inline def `setType-max-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "type-max-length", value.asInstanceOf[js.Any])
      
      inline def `setType-max-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "type-max-length", js.Array(value*))
      
      inline def `setType-min-length`(value: LengthRuleConfig[V]): Self = StObject.set(x, "type-min-length", value.asInstanceOf[js.Any])
      
      inline def `setType-min-lengthVarargs`(value: Disabled*): Self = StObject.set(x, "type-min-length", js.Array(value*))
    }
  }
  
  type SyncRule[Value] = BaseRule[Value, sync]
}
