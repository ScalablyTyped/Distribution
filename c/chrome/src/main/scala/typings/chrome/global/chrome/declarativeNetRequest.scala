package typings.chrome.global.chrome

import typings.chrome.chrome.declarativeNetRequest.ExtensionActionOptions
import typings.chrome.chrome.declarativeNetRequest.IsRegexSupportedResult
import typings.chrome.chrome.declarativeNetRequest.MatchedRulesFilter
import typings.chrome.chrome.declarativeNetRequest.RegexOptions
import typings.chrome.chrome.declarativeNetRequest.Rule
import typings.chrome.chrome.declarativeNetRequest.RuleMatchedDebugEvent
import typings.chrome.chrome.declarativeNetRequest.RulesMatchedDetails
import typings.chrome.chrome.declarativeNetRequest.UpdateRuleOptions
import typings.chrome.chrome.declarativeNetRequest.UpdateRulesetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarativeNetRequest {
  
  @JSGlobal("chrome.declarativeNetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.DYNAMIC_RULESET_ID")
  @js.native
  val DYNAMIC_RULESET_ID: String = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.DomainType")
  @js.native
  object DomainType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.DomainType & String] = js.native
    
    /* "firstParty" */ val FIRST_PARTY: typings.chrome.chrome.declarativeNetRequest.DomainType.FIRST_PARTY & String = js.native
    
    /* "thirdParty" */ val THIRD_PARTY: typings.chrome.chrome.declarativeNetRequest.DomainType.THIRD_PARTY & String = js.native
  }
  
  @JSGlobal("chrome.declarativeNetRequest.GETMATCHEDRULES_QUOTA_INTERVAL")
  @js.native
  val GETMATCHEDRULES_QUOTA_INTERVAL: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.GUARANTEED_MINIMUM_STATIC_RULES")
  @js.native
  val GUARANTEED_MINIMUM_STATIC_RULES: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.HeaderOperation")
  @js.native
  object HeaderOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.HeaderOperation & String] = js.native
    
    /* "append" */ val APPEND: typings.chrome.chrome.declarativeNetRequest.HeaderOperation.APPEND & String = js.native
    
    /* "remove" */ val REMOVE: typings.chrome.chrome.declarativeNetRequest.HeaderOperation.REMOVE & String = js.native
    
    /* "set" */ val SET: typings.chrome.chrome.declarativeNetRequest.HeaderOperation.SET & String = js.native
  }
  
  @JSGlobal("chrome.declarativeNetRequest.MAX_GETMATCHEDRULES_CALLS_PER_INTERVAL")
  @js.native
  val MAX_GETMATCHEDRULES_CALLS_PER_INTERVAL: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.MAX_NUMBER_OF_DYNAMIC_AND_SESSION_RULES")
  @js.native
  val MAX_NUMBER_OF_DYNAMIC_AND_SESSION_RULES: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.MAX_NUMBER_OF_REGEX_RULES")
  @js.native
  val MAX_NUMBER_OF_REGEX_RULES: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.MAX_NUMBER_OF_STATIC_RULESETS")
  @js.native
  val MAX_NUMBER_OF_STATIC_RULESETS: Double = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.RequestMethod & String] = js.native
    
    /* "connect" */ val CONNECT: typings.chrome.chrome.declarativeNetRequest.RequestMethod.CONNECT & String = js.native
    
    /* "delete" */ val DELETE: typings.chrome.chrome.declarativeNetRequest.RequestMethod.DELETE & String = js.native
    
    /* "get" */ val GET: typings.chrome.chrome.declarativeNetRequest.RequestMethod.GET & String = js.native
    
    /* "head" */ val HEAD: typings.chrome.chrome.declarativeNetRequest.RequestMethod.HEAD & String = js.native
    
    /* "options" */ val OPTIONS: typings.chrome.chrome.declarativeNetRequest.RequestMethod.OPTIONS & String = js.native
    
    /* "patch" */ val PATCH: typings.chrome.chrome.declarativeNetRequest.RequestMethod.PATCH & String = js.native
    
    /* "post" */ val POST: typings.chrome.chrome.declarativeNetRequest.RequestMethod.POST & String = js.native
    
    /* "put" */ val PUT: typings.chrome.chrome.declarativeNetRequest.RequestMethod.PUT & String = js.native
  }
  
  @JSGlobal("chrome.declarativeNetRequest.ResourceType")
  @js.native
  object ResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.ResourceType & String] = js.native
    
    /* "csp_report" */ val CSP_REPORT: typings.chrome.chrome.declarativeNetRequest.ResourceType.CSP_REPORT & String = js.native
    
    /* "font" */ val FONT: typings.chrome.chrome.declarativeNetRequest.ResourceType.FONT & String = js.native
    
    /* "image" */ val IMAGE: typings.chrome.chrome.declarativeNetRequest.ResourceType.IMAGE & String = js.native
    
    /* "main_frame" */ val MAIN_FRAME: typings.chrome.chrome.declarativeNetRequest.ResourceType.MAIN_FRAME & String = js.native
    
    /* "media" */ val MEDIA: typings.chrome.chrome.declarativeNetRequest.ResourceType.MEDIA & String = js.native
    
    /* "object" */ val OBJECT: typings.chrome.chrome.declarativeNetRequest.ResourceType.OBJECT & String = js.native
    
    /* "other" */ val OTHER: typings.chrome.chrome.declarativeNetRequest.ResourceType.OTHER & String = js.native
    
    /* "ping" */ val PING: typings.chrome.chrome.declarativeNetRequest.ResourceType.PING & String = js.native
    
    /* "script" */ val SCRIPT: typings.chrome.chrome.declarativeNetRequest.ResourceType.SCRIPT & String = js.native
    
    /* "stylesheet" */ val STYLESHEET: typings.chrome.chrome.declarativeNetRequest.ResourceType.STYLESHEET & String = js.native
    
    /* "sub_frame" */ val SUB_FRAME: typings.chrome.chrome.declarativeNetRequest.ResourceType.SUB_FRAME & String = js.native
    
    /* "websocket" */ val WEBSOCKET: typings.chrome.chrome.declarativeNetRequest.ResourceType.WEBSOCKET & String = js.native
    
    /* "xmlhttprequest" */ val XMLHTTPREQUEST: typings.chrome.chrome.declarativeNetRequest.ResourceType.XMLHTTPREQUEST & String = js.native
  }
  
  @JSGlobal("chrome.declarativeNetRequest.RuleActionType")
  @js.native
  object RuleActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.RuleActionType & String] = js.native
    
    /* "allow" */ val ALLOW: typings.chrome.chrome.declarativeNetRequest.RuleActionType.ALLOW & String = js.native
    
    /* "allowAllRequests" */ val ALLOW_ALL_REQUESTS: typings.chrome.chrome.declarativeNetRequest.RuleActionType.ALLOW_ALL_REQUESTS & String = js.native
    
    /* "block" */ val BLOCK: typings.chrome.chrome.declarativeNetRequest.RuleActionType.BLOCK & String = js.native
    
    /* "modifyHeaders" */ val MODIFY_HEADERS: typings.chrome.chrome.declarativeNetRequest.RuleActionType.MODIFY_HEADERS & String = js.native
    
    /* "redirect" */ val REDIRECT: typings.chrome.chrome.declarativeNetRequest.RuleActionType.REDIRECT & String = js.native
    
    /* "upgradeScheme" */ val UPGRADE_SCHEME: typings.chrome.chrome.declarativeNetRequest.RuleActionType.UPGRADE_SCHEME & String = js.native
  }
  
  @JSGlobal("chrome.declarativeNetRequest.SESSION_RULESET_ID")
  @js.native
  val SESSION_RULESET_ID: String = js.native
  
  @JSGlobal("chrome.declarativeNetRequest.UnsupportedRegexReason")
  @js.native
  object UnsupportedRegexReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.declarativeNetRequest.UnsupportedRegexReason & String] = js.native
    
    /* "memoryLimitExceeded" */ val MEMORY_LIMIT_EXCEEDED: typings.chrome.chrome.declarativeNetRequest.UnsupportedRegexReason.MEMORY_LIMIT_EXCEEDED & String = js.native
    
    /* "syntaxError" */ val SYNTAX_ERROR: typings.chrome.chrome.declarativeNetRequest.UnsupportedRegexReason.SYNTAX_ERROR & String = js.native
  }
  
  inline def getAvailableStaticRuleCount(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableStaticRuleCount")().asInstanceOf[js.Promise[Double]]
  inline def getAvailableStaticRuleCount(callback: js.Function1[/* count */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableStaticRuleCount")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getDynamicRules(): js.Promise[js.Array[Rule]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicRules")().asInstanceOf[js.Promise[js.Array[Rule]]]
  inline def getDynamicRules(callback: js.Function1[/* rules */ js.Array[Rule], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicRules")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getEnabledRulesets(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledRulesets")().asInstanceOf[js.Promise[js.Array[String]]]
  inline def getEnabledRulesets(callback: js.Function1[/* rulesetIds */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledRulesets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getMatchedRules(): js.Promise[RulesMatchedDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchedRules")().asInstanceOf[js.Promise[RulesMatchedDetails]]
  inline def getMatchedRules(callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchedRules")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getMatchedRules(filter: Unit, callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchedRules")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getMatchedRules(filter: MatchedRulesFilter): js.Promise[RulesMatchedDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchedRules")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RulesMatchedDetails]]
  inline def getMatchedRules(filter: MatchedRulesFilter, callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchedRules")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSessionRules(): js.Promise[js.Array[Rule]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionRules")().asInstanceOf[js.Promise[js.Array[Rule]]]
  inline def getSessionRules(callback: js.Function1[/* rules */ js.Array[Rule], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionRules")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isRegexSupported(regexOptions: RegexOptions): js.Promise[IsRegexSupportedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegexSupported")(regexOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IsRegexSupportedResult]]
  inline def isRegexSupported(regexOptions: RegexOptions, callback: js.Function1[/* result */ IsRegexSupportedResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegexSupported")(regexOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.declarativeNetRequest.onRuleMatchedDebug")
  @js.native
  def onRuleMatchedDebug: RuleMatchedDebugEvent = js.native
  inline def onRuleMatchedDebug_=(x: RuleMatchedDebugEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRuleMatchedDebug")(x.asInstanceOf[js.Any])
  
  inline def setExtensionActionOptions(options: ExtensionActionOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionActionOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setExtensionActionOptions(options: ExtensionActionOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionActionOptions")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateDynamicRules(options: UpdateRuleOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateDynamicRules")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateDynamicRules(options: UpdateRuleOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDynamicRules")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateEnabledRulesets(options: UpdateRulesetOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateEnabledRulesets")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateEnabledRulesets(options: UpdateRulesetOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEnabledRulesets")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSessionRules(options: UpdateRuleOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSessionRules")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateSessionRules(options: UpdateRuleOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSessionRules")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
