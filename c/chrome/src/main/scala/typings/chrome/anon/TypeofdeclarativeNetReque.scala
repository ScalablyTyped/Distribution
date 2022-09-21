package typings.chrome.anon

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

@js.native
trait TypeofdeclarativeNetReque extends StObject {
  
  val DYNAMIC_RULESET_ID: String = js.native
  
  val GETMATCHEDRULES_QUOTA_INTERVAL: Double = js.native
  
  val GUARANTEED_MINIMUM_STATIC_RULES: Double = js.native
  
  val MAX_GETMATCHEDRULES_CALLS_PER_INTERVAL: Double = js.native
  
  val MAX_NUMBER_OF_DYNAMIC_AND_SESSION_RULES: Double = js.native
  
  val MAX_NUMBER_OF_REGEX_RULES: Double = js.native
  
  val MAX_NUMBER_OF_STATIC_RULESETS: Double = js.native
  
  val SESSION_RULESET_ID: String = js.native
  
  def getAvailableStaticRuleCount(): js.Promise[Double] = js.native
  def getAvailableStaticRuleCount(callback: js.Function1[/* count */ Double, Unit]): Unit = js.native
  
  def getDynamicRules(): js.Promise[js.Array[Rule]] = js.native
  def getDynamicRules(callback: js.Function1[/* rules */ js.Array[Rule], Unit]): Unit = js.native
  
  def getEnabledRulesets(): js.Promise[js.Array[String]] = js.native
  def getEnabledRulesets(callback: js.Function1[/* rulesetIds */ js.Array[String], Unit]): Unit = js.native
  
  def getMatchedRules(): js.Promise[RulesMatchedDetails] = js.native
  def getMatchedRules(callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = js.native
  def getMatchedRules(filter: Unit, callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = js.native
  def getMatchedRules(filter: MatchedRulesFilter): js.Promise[RulesMatchedDetails] = js.native
  def getMatchedRules(filter: MatchedRulesFilter, callback: js.Function1[/* details */ RulesMatchedDetails, Unit]): Unit = js.native
  
  def getSessionRules(): js.Promise[js.Array[Rule]] = js.native
  def getSessionRules(callback: js.Function1[/* rules */ js.Array[Rule], Unit]): Unit = js.native
  
  def isRegexSupported(regexOptions: RegexOptions): js.Promise[IsRegexSupportedResult] = js.native
  def isRegexSupported(regexOptions: RegexOptions, callback: js.Function1[/* result */ IsRegexSupportedResult, Unit]): Unit = js.native
  
  var onRuleMatchedDebug: RuleMatchedDebugEvent = js.native
  
  def setExtensionActionOptions(options: ExtensionActionOptions): js.Promise[Unit] = js.native
  def setExtensionActionOptions(options: ExtensionActionOptions, callback: js.Function): Unit = js.native
  
  def updateDynamicRules(options: UpdateRuleOptions): js.Promise[Unit] = js.native
  def updateDynamicRules(options: UpdateRuleOptions, callback: js.Function): Unit = js.native
  
  def updateEnabledRulesets(options: UpdateRulesetOptions): js.Promise[Unit] = js.native
  def updateEnabledRulesets(options: UpdateRulesetOptions, callback: js.Function): Unit = js.native
  
  def updateSessionRules(options: UpdateRuleOptions): js.Promise[Unit] = js.native
  def updateSessionRules(options: UpdateRuleOptions, callback: js.Function): Unit = js.native
}
