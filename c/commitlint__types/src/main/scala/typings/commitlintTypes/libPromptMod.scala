package typings.commitlintTypes

import org.scalablytyped.runtime.StringDictionary
import typings.commitlintTypes.anon.EnableMultipleScopes
import typings.commitlintTypes.anon.PartialRecordPromptNamede
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? {[ K in keyof T[P] ]:? T[P][K]}}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  trait PromptConfig extends StObject {
    
    var messages: PromptMessages
    
    var questions: PartialRecordPromptNamede
    
    var settings: EnableMultipleScopes
  }
  object PromptConfig {
    
    inline def apply(messages: PromptMessages, questions: PartialRecordPromptNamede, settings: EnableMultipleScopes): PromptConfig = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptConfig] (val x: Self) extends AnyVal {
      
      inline def setMessages(value: PromptMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setQuestions(value: PartialRecordPromptNamede): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: EnableMultipleScopes): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptMessages
    extends StObject
       with /* _key */ StringDictionary[String] {
    
    var emptyWarning: String
    
    var lowerLimitWarning: String
    
    var max: String
    
    var min: String
    
    var skip: String
    
    var upperLimitWarning: String
  }
  object PromptMessages {
    
    inline def apply(
      emptyWarning: String,
      lowerLimitWarning: String,
      max: String,
      min: String,
      skip: String,
      upperLimitWarning: String
    ): PromptMessages = {
      val __obj = js.Dynamic.literal(emptyWarning = emptyWarning.asInstanceOf[js.Any], lowerLimitWarning = lowerLimitWarning.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], upperLimitWarning = upperLimitWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptMessages] (val x: Self) extends AnyVal {
      
      inline def setEmptyWarning(value: String): Self = StObject.set(x, "emptyWarning", value.asInstanceOf[js.Any])
      
      inline def setLowerLimitWarning(value: String): Self = StObject.set(x, "lowerLimitWarning", value.asInstanceOf[js.Any])
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setUpperLimitWarning(value: String): Self = StObject.set(x, "upperLimitWarning", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintTypes.commitlintTypesStrings.isBreaking
    - typings.commitlintTypes.commitlintTypesStrings.breakingBody
    - typings.commitlintTypes.commitlintTypesStrings.breaking
    - typings.commitlintTypes.commitlintTypesStrings.isIssueAffected
    - typings.commitlintTypes.commitlintTypesStrings.issuesBody
    - typings.commitlintTypes.commitlintTypesStrings.issues
    - typings.commitlintTypes.commitlintTypesStrings.header
    - typings.commitlintTypes.commitlintTypesStrings.`type`
    - typings.commitlintTypes.commitlintTypesStrings.scope
    - typings.commitlintTypes.commitlintTypesStrings.subject
    - typings.commitlintTypes.commitlintTypesStrings.body
    - typings.commitlintTypes.commitlintTypesStrings.footer
  */
  trait PromptName extends StObject
  object PromptName {
    
    inline def body: typings.commitlintTypes.commitlintTypesStrings.body = "body".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.body]
    
    inline def breaking: typings.commitlintTypes.commitlintTypesStrings.breaking = "breaking".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.breaking]
    
    inline def breakingBody: typings.commitlintTypes.commitlintTypesStrings.breakingBody = "breakingBody".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.breakingBody]
    
    inline def footer: typings.commitlintTypes.commitlintTypesStrings.footer = "footer".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.footer]
    
    inline def header: typings.commitlintTypes.commitlintTypesStrings.header = "header".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.header]
    
    inline def isBreaking: typings.commitlintTypes.commitlintTypesStrings.isBreaking = "isBreaking".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.isBreaking]
    
    inline def isIssueAffected: typings.commitlintTypes.commitlintTypesStrings.isIssueAffected = "isIssueAffected".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.isIssueAffected]
    
    inline def issues: typings.commitlintTypes.commitlintTypesStrings.issues = "issues".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.issues]
    
    inline def issuesBody: typings.commitlintTypes.commitlintTypesStrings.issuesBody = "issuesBody".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.issuesBody]
    
    inline def scope: typings.commitlintTypes.commitlintTypesStrings.scope = "scope".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.scope]
    
    inline def subject: typings.commitlintTypes.commitlintTypesStrings.subject = "subject".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.subject]
    
    inline def `type`: typings.commitlintTypes.commitlintTypesStrings.`type` = "type".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.`type`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commitlintTypes.commitlintTypesStrings.header
    - typings.commitlintTypes.commitlintTypesStrings.`type`
    - typings.commitlintTypes.commitlintTypesStrings.scope
    - typings.commitlintTypes.commitlintTypesStrings.subject
    - typings.commitlintTypes.commitlintTypesStrings.body
    - typings.commitlintTypes.commitlintTypesStrings.footer
  */
  trait RuleField extends StObject
  object RuleField {
    
    inline def body: typings.commitlintTypes.commitlintTypesStrings.body = "body".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.body]
    
    inline def footer: typings.commitlintTypes.commitlintTypesStrings.footer = "footer".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.footer]
    
    inline def header: typings.commitlintTypes.commitlintTypesStrings.header = "header".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.header]
    
    inline def scope: typings.commitlintTypes.commitlintTypesStrings.scope = "scope".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.scope]
    
    inline def subject: typings.commitlintTypes.commitlintTypesStrings.subject = "subject".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.subject]
    
    inline def `type`: typings.commitlintTypes.commitlintTypesStrings.`type` = "type".asInstanceOf[typings.commitlintTypes.commitlintTypesStrings.`type`]
  }
  
  /* Inlined @commitlint/types.@commitlint/types/lib/prompt.DeepPartial<@commitlint/types.@commitlint/types/lib/prompt.PromptConfig> */
  trait UserPromptConfig extends StObject {
    
    var messages: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? @commitlint/types.@commitlint/types/lib/prompt.PromptMessages[K]} */ js.Any
      ] = js.undefined
    
    var questions: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? / * Inlined std.Partial<std.Record<@commitlint/types.@commitlint/types/lib/prompt.PromptName, {  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined}>> * /
    {  isBreaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issuesBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breakingBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issues :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   header :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   scope :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   isIssueAffected :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   body :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   subject :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   type :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   footer :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined}[K]} */ js.Any
      ] = js.undefined
    
    var settings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? {  scopeEnumSeparator :string,   enableMultipleScopes :boolean}[K]} */ js.Any
      ] = js.undefined
  }
  object UserPromptConfig {
    
    inline def apply(): UserPromptConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPromptConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserPromptConfig] (val x: Self) extends AnyVal {
      
      inline def setMessages(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? @commitlint/types.@commitlint/types/lib/prompt.PromptMessages[K]} */ js.Any
      ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setQuestions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? / * Inlined std.Partial<std.Record<@commitlint/types.@commitlint/types/lib/prompt.PromptName, {  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined}>> * /
      {  isBreaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issuesBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breakingBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issues :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   header :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   scope :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   isIssueAffected :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   body :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   subject :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   type :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   footer :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined}[K]} */ js.Any
      ): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
      
      inline def setSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? {  scopeEnumSeparator :string,   enableMultipleScopes :boolean}[K]} */ js.Any
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
