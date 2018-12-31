package typings
package chromeLib.chromeNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[T /* <: js.Function */] extends js.Object {
  /**
    * Registers an event listener callback to an event.
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * The callback parameter should be a function that looks like this:
    * function() {...};
    */
  def addListener(callback: T): scala.Unit = js.native
  /**
    * Registers rules to handle events.
    * @param rules Rules to be registered. These do not replace previously registered rules.
    * @param callback Called with registered rules.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function(array of Rule rules) {...};
    * Parameter rules: Rules that were registered, the optional parameters are filled with values.
    */
  def addRules(rules: js.Array[Rule]): scala.Unit = js.native
  def addRules(rules: js.Array[Rule], callback: js.Function1[/* rules */ js.Array[Rule], scala.Unit]): scala.Unit = js.native
  /**
    * Returns currently registered rules.
    * @param callback Called with registered rules.
    * The callback parameter should be a function that looks like this:
    * function(array of Rule rules) {...};
    * Parameter rules: Rules that were registered, the optional parameters are filled with values.
    */
  def getRules(callback: js.Function1[/* rules */ js.Array[Rule], scala.Unit]): scala.Unit = js.native
  /**
    * Returns currently registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
    * @param callback Called with registered rules.
    * The callback parameter should be a function that looks like this:
    * function(array of Rule rules) {...};
    * Parameter rules: Rules that were registered, the optional parameters are filled with values.
    */
  def getRules(
    ruleIdentifiers: js.Array[java.lang.String],
    callback: js.Function1[/* rules */ js.Array[Rule], scala.Unit]
  ): scala.Unit = js.native
  /**
    * @param callback Listener whose registration status shall be tested.
    */
  def hasListener(callback: T): scala.Boolean = js.native
  def hasListeners(): scala.Boolean = js.native
  /**
    * Deregisters an event listener callback from an event.
    * @param callback Listener that shall be unregistered.
    * The callback parameter should be a function that looks like this:
    * function() {...};
    */
  def removeListener(callback: T): scala.Unit = js.native
  /**
    * Unregisters currently registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are unregistered.
    * @param callback Called when rules were unregistered.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def removeRules(): scala.Unit = js.native
  def removeRules(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[java.lang.String]): scala.Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

