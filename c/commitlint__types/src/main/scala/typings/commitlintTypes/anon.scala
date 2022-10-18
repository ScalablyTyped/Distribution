package typings.commitlintTypes

import org.scalablytyped.runtime.StringDictionary
import typings.commitlintTypes.libParseMod.CommitNote
import typings.commitlintTypes.libParseMod.CommitReference
import typings.commitlintTypes.libRulesMod.CaseRuleConfig
import typings.commitlintTypes.libRulesMod.EnumRuleConfig
import typings.commitlintTypes.libRulesMod.LengthRuleConfig
import typings.commitlintTypes.libRulesMod.RuleConfig
import typings.commitlintTypes.libRulesMod.RuleConfigQuality.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var emoji: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Description {
    
    inline def apply(): Description = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait EnableMultipleScopes extends StObject {
    
    var enableMultipleScopes: Boolean
    
    var scopeEnumSeparator: String
  }
  object EnableMultipleScopes {
    
    inline def apply(enableMultipleScopes: Boolean, scopeEnumSeparator: String): EnableMultipleScopes = {
      val __obj = js.Dynamic.literal(enableMultipleScopes = enableMultipleScopes.asInstanceOf[js.Any], scopeEnumSeparator = scopeEnumSeparator.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableMultipleScopes]
    }
    
    extension [Self <: EnableMultipleScopes](x: Self) {
      
      inline def setEnableMultipleScopes(value: Boolean): Self = StObject.set(x, "enableMultipleScopes", value.asInstanceOf[js.Any])
      
      inline def setScopeEnumSeparator(value: String): Self = StObject.set(x, "scopeEnumSeparator", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enum extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var `enum`: js.UndefOr[StringDictionary[Description]] = js.undefined
    
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Enum {
    
    inline def apply(): Enum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enum]
    }
    
    extension [Self <: Enum](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnum(value: StringDictionary[Description]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@commitlint/types.@commitlint/types/lib/parse.Commit, 'raw'> */
  trait OmitCommitraw extends StObject {
    
    var body: js.UndefOr[String | Null] = js.undefined
    
    var footer: js.UndefOr[String | Null] = js.undefined
    
    var header: String
    
    var mentions: js.Array[String]
    
    var merge: Any
    
    var notes: js.Array[CommitNote]
    
    var references: js.Array[CommitReference]
    
    var revert: Any
    
    var scope: js.UndefOr[String | Null] = js.undefined
    
    var subject: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object OmitCommitraw {
    
    inline def apply(
      header: String,
      mentions: js.Array[String],
      merge: Any,
      notes: js.Array[CommitNote],
      references: js.Array[CommitReference],
      revert: Any
    ): OmitCommitraw = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCommitraw]
    }
    
    extension [Self <: OmitCommitraw](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value*))
      
      inline def setMerge(value: Any): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: js.Array[CommitNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: CommitNote*): Self = StObject.set(x, "notes", js.Array(value*))
      
      inline def setReferences(value: js.Array[CommitReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesVarargs(value: CommitReference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setRevert(value: Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<@commitlint/types.@commitlint/types/lib/prompt.PromptName, {  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined}>> */
  trait PartialRecordPromptNamede extends StObject {
    
    var body: js.UndefOr[Enum] = js.undefined
    
    var breaking: js.UndefOr[Enum] = js.undefined
    
    var breakingBody: js.UndefOr[Enum] = js.undefined
    
    var footer: js.UndefOr[Enum] = js.undefined
    
    var header: js.UndefOr[Enum] = js.undefined
    
    var isBreaking: js.UndefOr[Enum] = js.undefined
    
    var isIssueAffected: js.UndefOr[Enum] = js.undefined
    
    var issues: js.UndefOr[Enum] = js.undefined
    
    var issuesBody: js.UndefOr[Enum] = js.undefined
    
    var scope: js.UndefOr[Enum] = js.undefined
    
    var subject: js.UndefOr[Enum] = js.undefined
    
    var `type`: js.UndefOr[Enum] = js.undefined
  }
  object PartialRecordPromptNamede {
    
    inline def apply(): PartialRecordPromptNamede = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordPromptNamede]
    }
    
    extension [Self <: PartialRecordPromptNamede](x: Self) {
      
      inline def setBody(value: Enum): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBreaking(value: Enum): Self = StObject.set(x, "breaking", value.asInstanceOf[js.Any])
      
      inline def setBreakingBody(value: Enum): Self = StObject.set(x, "breakingBody", value.asInstanceOf[js.Any])
      
      inline def setBreakingBodyUndefined: Self = StObject.set(x, "breakingBody", js.undefined)
      
      inline def setBreakingUndefined: Self = StObject.set(x, "breaking", js.undefined)
      
      inline def setFooter(value: Enum): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Enum): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIsBreaking(value: Enum): Self = StObject.set(x, "isBreaking", value.asInstanceOf[js.Any])
      
      inline def setIsBreakingUndefined: Self = StObject.set(x, "isBreaking", js.undefined)
      
      inline def setIsIssueAffected(value: Enum): Self = StObject.set(x, "isIssueAffected", value.asInstanceOf[js.Any])
      
      inline def setIsIssueAffectedUndefined: Self = StObject.set(x, "isIssueAffected", js.undefined)
      
      inline def setIssues(value: Enum): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesBody(value: Enum): Self = StObject.set(x, "issuesBody", value.asInstanceOf[js.Any])
      
      inline def setIssuesBodyUndefined: Self = StObject.set(x, "issuesBody", js.undefined)
      
      inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
      
      inline def setScope(value: Enum): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSubject(value: Enum): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setType(value: Enum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@commitlint/types.@commitlint/types/lib/rules.RulesConfig<@commitlint/types.@commitlint/types/lib/rules.RuleConfigQuality.User>> */
  trait PartialRulesConfigUser extends StObject {
    
    var `body-case`: js.UndefOr[CaseRuleConfig[User]] = js.undefined
    
    var `body-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `body-full-stop`: js.UndefOr[RuleConfig[User, String]] = js.undefined
    
    var `body-leading-blank`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `body-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `body-max-line-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `body-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `footer-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `footer-leading-blank`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `footer-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `footer-max-line-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `footer-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `header-case`: js.UndefOr[CaseRuleConfig[User]] = js.undefined
    
    var `header-full-stop`: js.UndefOr[RuleConfig[User, String]] = js.undefined
    
    var `header-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `header-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `references-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `scope-case`: js.UndefOr[CaseRuleConfig[User]] = js.undefined
    
    var `scope-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `scope-enum`: js.UndefOr[EnumRuleConfig[User]] = js.undefined
    
    var `scope-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `scope-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `signed-off-by`: js.UndefOr[RuleConfig[User, String]] = js.undefined
    
    var `subject-case`: js.UndefOr[CaseRuleConfig[User]] = js.undefined
    
    var `subject-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `subject-full-stop`: js.UndefOr[RuleConfig[User, String]] = js.undefined
    
    var `subject-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `subject-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `trailer-exists`: js.UndefOr[RuleConfig[User, String]] = js.undefined
    
    var `type-case`: js.UndefOr[CaseRuleConfig[User]] = js.undefined
    
    var `type-empty`: js.UndefOr[RuleConfig[User, Unit]] = js.undefined
    
    var `type-enum`: js.UndefOr[EnumRuleConfig[User]] = js.undefined
    
    var `type-max-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
    
    var `type-min-length`: js.UndefOr[LengthRuleConfig[User]] = js.undefined
  }
  object PartialRulesConfigUser {
    
    inline def apply(): PartialRulesConfigUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRulesConfigUser]
    }
    
    extension [Self <: PartialRulesConfigUser](x: Self) {
      
      inline def `setBody-case`(value: CaseRuleConfig[User]): Self = StObject.set(x, "body-case", value.asInstanceOf[js.Any])
      
      inline def `setBody-caseUndefined`: Self = StObject.set(x, "body-case", js.undefined)
      
      inline def `setBody-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "body-empty", value.asInstanceOf[js.Any])
      
      inline def `setBody-emptyUndefined`: Self = StObject.set(x, "body-empty", js.undefined)
      
      inline def `setBody-full-stop`(value: RuleConfig[User, String]): Self = StObject.set(x, "body-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setBody-full-stopUndefined`: Self = StObject.set(x, "body-full-stop", js.undefined)
      
      inline def `setBody-leading-blank`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "body-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setBody-leading-blankUndefined`: Self = StObject.set(x, "body-leading-blank", js.undefined)
      
      inline def `setBody-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "body-max-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-lengthUndefined`: Self = StObject.set(x, "body-max-length", js.undefined)
      
      inline def `setBody-max-line-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "body-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-max-line-lengthUndefined`: Self = StObject.set(x, "body-max-line-length", js.undefined)
      
      inline def `setBody-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "body-min-length", value.asInstanceOf[js.Any])
      
      inline def `setBody-min-lengthUndefined`: Self = StObject.set(x, "body-min-length", js.undefined)
      
      inline def `setFooter-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "footer-empty", value.asInstanceOf[js.Any])
      
      inline def `setFooter-emptyUndefined`: Self = StObject.set(x, "footer-empty", js.undefined)
      
      inline def `setFooter-leading-blank`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "footer-leading-blank", value.asInstanceOf[js.Any])
      
      inline def `setFooter-leading-blankUndefined`: Self = StObject.set(x, "footer-leading-blank", js.undefined)
      
      inline def `setFooter-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "footer-max-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-lengthUndefined`: Self = StObject.set(x, "footer-max-length", js.undefined)
      
      inline def `setFooter-max-line-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "footer-max-line-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-max-line-lengthUndefined`: Self = StObject.set(x, "footer-max-line-length", js.undefined)
      
      inline def `setFooter-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "footer-min-length", value.asInstanceOf[js.Any])
      
      inline def `setFooter-min-lengthUndefined`: Self = StObject.set(x, "footer-min-length", js.undefined)
      
      inline def `setHeader-case`(value: CaseRuleConfig[User]): Self = StObject.set(x, "header-case", value.asInstanceOf[js.Any])
      
      inline def `setHeader-caseUndefined`: Self = StObject.set(x, "header-case", js.undefined)
      
      inline def `setHeader-full-stop`(value: RuleConfig[User, String]): Self = StObject.set(x, "header-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setHeader-full-stopUndefined`: Self = StObject.set(x, "header-full-stop", js.undefined)
      
      inline def `setHeader-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "header-max-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-max-lengthUndefined`: Self = StObject.set(x, "header-max-length", js.undefined)
      
      inline def `setHeader-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "header-min-length", value.asInstanceOf[js.Any])
      
      inline def `setHeader-min-lengthUndefined`: Self = StObject.set(x, "header-min-length", js.undefined)
      
      inline def `setReferences-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "references-empty", value.asInstanceOf[js.Any])
      
      inline def `setReferences-emptyUndefined`: Self = StObject.set(x, "references-empty", js.undefined)
      
      inline def `setScope-case`(value: CaseRuleConfig[User]): Self = StObject.set(x, "scope-case", value.asInstanceOf[js.Any])
      
      inline def `setScope-caseUndefined`: Self = StObject.set(x, "scope-case", js.undefined)
      
      inline def `setScope-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "scope-empty", value.asInstanceOf[js.Any])
      
      inline def `setScope-emptyUndefined`: Self = StObject.set(x, "scope-empty", js.undefined)
      
      inline def `setScope-enum`(value: EnumRuleConfig[User]): Self = StObject.set(x, "scope-enum", value.asInstanceOf[js.Any])
      
      inline def `setScope-enumUndefined`: Self = StObject.set(x, "scope-enum", js.undefined)
      
      inline def `setScope-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "scope-max-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-max-lengthUndefined`: Self = StObject.set(x, "scope-max-length", js.undefined)
      
      inline def `setScope-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "scope-min-length", value.asInstanceOf[js.Any])
      
      inline def `setScope-min-lengthUndefined`: Self = StObject.set(x, "scope-min-length", js.undefined)
      
      inline def `setSigned-off-by`(value: RuleConfig[User, String]): Self = StObject.set(x, "signed-off-by", value.asInstanceOf[js.Any])
      
      inline def `setSigned-off-byUndefined`: Self = StObject.set(x, "signed-off-by", js.undefined)
      
      inline def `setSubject-case`(value: CaseRuleConfig[User]): Self = StObject.set(x, "subject-case", value.asInstanceOf[js.Any])
      
      inline def `setSubject-caseUndefined`: Self = StObject.set(x, "subject-case", js.undefined)
      
      inline def `setSubject-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "subject-empty", value.asInstanceOf[js.Any])
      
      inline def `setSubject-emptyUndefined`: Self = StObject.set(x, "subject-empty", js.undefined)
      
      inline def `setSubject-full-stop`(value: RuleConfig[User, String]): Self = StObject.set(x, "subject-full-stop", value.asInstanceOf[js.Any])
      
      inline def `setSubject-full-stopUndefined`: Self = StObject.set(x, "subject-full-stop", js.undefined)
      
      inline def `setSubject-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "subject-max-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-max-lengthUndefined`: Self = StObject.set(x, "subject-max-length", js.undefined)
      
      inline def `setSubject-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "subject-min-length", value.asInstanceOf[js.Any])
      
      inline def `setSubject-min-lengthUndefined`: Self = StObject.set(x, "subject-min-length", js.undefined)
      
      inline def `setTrailer-exists`(value: RuleConfig[User, String]): Self = StObject.set(x, "trailer-exists", value.asInstanceOf[js.Any])
      
      inline def `setTrailer-existsUndefined`: Self = StObject.set(x, "trailer-exists", js.undefined)
      
      inline def `setType-case`(value: CaseRuleConfig[User]): Self = StObject.set(x, "type-case", value.asInstanceOf[js.Any])
      
      inline def `setType-caseUndefined`: Self = StObject.set(x, "type-case", js.undefined)
      
      inline def `setType-empty`(value: RuleConfig[User, Unit]): Self = StObject.set(x, "type-empty", value.asInstanceOf[js.Any])
      
      inline def `setType-emptyUndefined`: Self = StObject.set(x, "type-empty", js.undefined)
      
      inline def `setType-enum`(value: EnumRuleConfig[User]): Self = StObject.set(x, "type-enum", value.asInstanceOf[js.Any])
      
      inline def `setType-enumUndefined`: Self = StObject.set(x, "type-enum", js.undefined)
      
      inline def `setType-max-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "type-max-length", value.asInstanceOf[js.Any])
      
      inline def `setType-max-lengthUndefined`: Self = StObject.set(x, "type-max-length", js.undefined)
      
      inline def `setType-min-length`(value: LengthRuleConfig[User]): Self = StObject.set(x, "type-min-length", value.asInstanceOf[js.Any])
      
      inline def `setType-min-lengthUndefined`: Self = StObject.set(x, "type-min-length", js.undefined)
    }
  }
}
