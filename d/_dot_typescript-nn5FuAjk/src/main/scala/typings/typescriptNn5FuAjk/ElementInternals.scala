package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementInternals
  extends StObject
     with ARIAMixin {
  
  /** Returns the form owner of internals's target element. */
  val form: HTMLFormElement | Null = js.native
  
  /** Returns a NodeList of all the label elements that internals's target element is associated with. */
  val labels: NodeList = js.native
  
  /**
    * Sets both the state and submission value of internals's target element to value.
    *
    * If value is null, the element won't participate in form submission.
    */
  def setFormValue(): Unit = js.native
  def setFormValue(value: java.lang.String): Unit = js.native
  def setFormValue(value: java.lang.String, state: java.lang.String): Unit = js.native
  def setFormValue(value: java.lang.String, state: File): Unit = js.native
  def setFormValue(value: java.lang.String, state: FormData): Unit = js.native
  def setFormValue(value: Null, state: java.lang.String): Unit = js.native
  def setFormValue(value: Null, state: File): Unit = js.native
  def setFormValue(value: Null, state: FormData): Unit = js.native
  def setFormValue(value: File): Unit = js.native
  def setFormValue(value: File, state: java.lang.String): Unit = js.native
  def setFormValue(value: File, state: File): Unit = js.native
  def setFormValue(value: File, state: FormData): Unit = js.native
  def setFormValue(value: FormData): Unit = js.native
  def setFormValue(value: FormData, state: java.lang.String): Unit = js.native
  def setFormValue(value: FormData, state: File): Unit = js.native
  def setFormValue(value: FormData, state: FormData): Unit = js.native
  
  /** Returns the ShadowRoot for internals's target element, if the target element is a shadow host, or null otherwise. */
  val shadowRoot: ShadowRoot | Null = js.native
  
  /** Returns true if internals's target element will be validated when the form is submitted; false otherwise. */
  val willValidate: scala.Boolean = js.native
}
