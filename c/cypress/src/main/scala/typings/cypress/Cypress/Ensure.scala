package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ensure extends StObject {
  
  /**
    * Throws an error if `subject` is not a DOM element attached to the application under test.
    */
  def isAttached(subject: Any, commandName: String, cy: Chainable[Any]): Unit = js.native
  def isAttached(subject: Any, commandName: String, cy: Chainable[Any], onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is not a `document`.
    */
  def isDocument(subject: Any, commandName: String, cy: Chainable[Any]): Unit = js.native
  
  /**
    * Throws an error if `subject` is not a DOM element.
    */
  def isElement(subject: Any, commandName: String, cy: Chainable[Any]): Unit = js.native
  
  /**
    * Throws an error if `subject` is a disabled DOM element.
    */
  def isNotDisabled(subject: Any, commandName: String): Unit = js.native
  def isNotDisabled(subject: Any, commandName: String, onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is a DOM element hidden by any of its parent elements.
    */
  def isNotHiddenByAncestors(subject: Any, commandName: String): Unit = js.native
  def isNotHiddenByAncestors(subject: Any, commandName: String, onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is a read-only form element.
    */
  def isNotReadonly(subject: Any, commandName: String): Unit = js.native
  def isNotReadonly(subject: Any, commandName: String, onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is a read-only form element.
    */
  def isScrollable(subject: Any, commandName: String): Unit = js.native
  def isScrollable(subject: Any, commandName: String, onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is not one of the passed in `type`s.
    */
  def isType(subject: Any, `type`: js.Array[PrevSubject], commandName: String, cy: Chainable[Any]): Unit = js.native
  
  /**
    * Throws an error if `subject` is not a DOM element visible in the AUT.
    */
  def isVisible(subject: Any, commandName: String): Unit = js.native
  def isVisible(subject: Any, commandName: String, onFail: Log): Unit = js.native
  
  /**
    * Throws an error if `subject` is not a `window`.
    */
  def isWindow(subject: Any, commandName: String, cy: Chainable[Any]): Unit = js.native
}
