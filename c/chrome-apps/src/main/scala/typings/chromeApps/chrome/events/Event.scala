package typings.chromeApps.chrome.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object which allows the addition and removal of listeners for a Chrome event. */
@js.native
trait Event[T /* <: js.Function */] extends js.Object {
  
  /**
    * Registers an event listener callback to an event.
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    */
  def addListener(callback: T): Unit = js.native
  
  /**
    * Registers rules to handle events.
    * @param rules Rules to be registered. These do not replace previously registered rules.
    * @param callback Called with registered rules.
    * Parameter rules: Rules that were registered, the optional parameters are filled with values.
    */
  def addRules(rules: js.Array[Rule[_, _]]): Unit = js.native
  def addRules(rules: js.Array[Rule[_, _]], callback: js.Function1[/* rules */ js.Array[Rule[_, _]], Unit]): Unit = js.native
  
  /**
    * Returns currently registered rules.
    * @param callback Called with registered rules.
    * Parameter *rules*: Rules that were registered, the optional parameters are filled with values.
    */
  def getRules(callback: js.Function1[/* rules */ js.Array[Rule[_, _]], Unit]): Unit = js.native
  /**
    * Returns currently registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
    * @param callback Called with registered rules.
    * Parameter *rules*: Rules that were registered, the optional parameters are filled with values.
    */
  def getRules(ruleIdentifiers: js.Array[String], callback: js.Function1[/* rules */ js.Array[Rule[_, _]], Unit]): Unit = js.native
  
  /**
    * Has this event this provided listener?
    * @param listener Listener whose registration status shall be tested.
    * @return If it has the provided listener
    */
  def hasListener(callback: T): Boolean = js.native
  def hasListener(callback: js.Function): Boolean = js.native
  
  /**
    * Has this event listeners?
    */
  def hasListeners(): Boolean = js.native
  
  /**
    * Deregisters an event listener callback from an event.
    * @param callback Listener that shall be unregistered.
    */
  def removeListener(callback: T): Unit = js.native
  
  /**
    * Unregisters currently registered rules.
    * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are unregistered.
    * @param callback Called when rules were unregistered.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def removeRules(): Unit = js.native
  def removeRules(callback: js.Function0[Unit]): Unit = js.native
  def removeRules(ruleIdentifiers: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[String]): Unit = js.native
  def removeRules(ruleIdentifiers: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
}
