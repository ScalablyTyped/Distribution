package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the Declarative Event API consisting of addRules, removeRules, and getRules.
  */
@js.native
trait OnRequestEvent extends js.Object {
  /**
    * Registers rules to handle events.
    * @param rules Rules to be registered. These do not replace previously registered rules.
    * @param [callback] Called with registered rules.
    */
  def addRules(rules: js.Array[OnRequestRule]): Unit = js.native
  def addRules(rules: js.Array[OnRequestRule], callback: js.Function1[/* rules */ js.Array[OnRequestRule], Unit]): Unit = js.native
  /**
    * Returns currentlt registered rules.
    * @param callback Called with registered rules.
    */
  def getRules(callback: js.Function1[/* rules */ js.Array[OnRequestRule], Unit]): Unit = js.native
  /**
    * Returns currentlt registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
    * @param callback Called with registered rules.
    */
  def getRules(
    ruleIdentifiers: js.Array[String],
    callback: js.Function1[/* rules */ js.Array[OnRequestRule], Unit]
  ): Unit = js.native
  /**
    * Unregisters currently registered rules.
    * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are unregistered.
    * @param [callback] Called when rules were unregistered.
    */
  def removeRules(): Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[String]): Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
}

