package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  def addRules(rules: js.Array[OnRequestRule]): scala.Unit = js.native
  def addRules(
    rules: js.Array[OnRequestRule],
    callback: js.Function1[/* rules */ js.Array[OnRequestRule], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns currentlt registered rules.
    * @param callback Called with registered rules.
    */
  def getRules(callback: js.Function1[/* rules */ js.Array[OnRequestRule], scala.Unit]): scala.Unit = js.native
  /**
    * Returns currentlt registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
    * @param callback Called with registered rules.
    */
  def getRules(
    ruleIdentifiers: js.Array[java.lang.String],
    callback: js.Function1[/* rules */ js.Array[OnRequestRule], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unregisters currently registered rules.
    * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are unregistered.
    * @param [callback] Called when rules were unregistered.
    */
  def removeRules(): scala.Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[java.lang.String]): scala.Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

