package typings.bootstrapSelect

import typings.bootstrapSelect.anon.BootstrapVersion
import typings.bootstrapSelect.anon.PartialBootstrapSelectOpt
import typings.bootstrapSelect.bootstrapSelectStrings.`val`
import typings.bootstrapSelect.bootstrapSelectStrings.add
import typings.bootstrapSelect.bootstrapSelectStrings.deselectAll
import typings.bootstrapSelect.bootstrapSelectStrings.destroy
import typings.bootstrapSelect.bootstrapSelectStrings.hide
import typings.bootstrapSelect.bootstrapSelectStrings.mobile
import typings.bootstrapSelect.bootstrapSelectStrings.refresh
import typings.bootstrapSelect.bootstrapSelectStrings.remove
import typings.bootstrapSelect.bootstrapSelectStrings.render
import typings.bootstrapSelect.bootstrapSelectStrings.selectAll
import typings.bootstrapSelect.bootstrapSelectStrings.setStyle
import typings.bootstrapSelect.bootstrapSelectStrings.show
import typings.bootstrapSelect.bootstrapSelectStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSelect[T] extends StObject {
  
  /**
    * Main function
    */
  def apply(): JQuery[T] = js.native
  def apply(method: selectAll | deselectAll | render | mobile | refresh | toggle | hide | show | destroy): JQuery[T] = js.native
  /**
    * Methods
    * @see {@link https://developer.snapappointments.com/bootstrap-select/methods/}
    */
  def apply(method: `val`, value: String): JQuery[T] = js.native
  def apply(method: `val`, value: js.Array[String]): JQuery[T] = js.native
  def apply(method: setStyle): JQuery[T] = js.native
  def apply(method: setStyle, className: String): JQuery[T] = js.native
  def apply(method: setStyle, className: String, action: add | remove): JQuery[T] = js.native
  def apply(method: setStyle, className: Unit, action: add | remove): JQuery[T] = js.native
  def apply(opts: PartialBootstrapSelectOpt): JQuery[T] = js.native
  
  val Constructor: BootstrapVersion = js.native
}
