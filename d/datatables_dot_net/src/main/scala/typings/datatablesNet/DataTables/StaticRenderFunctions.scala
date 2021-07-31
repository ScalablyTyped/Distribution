package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRenderFunctions extends StObject {
  
  /**
    * Will format numeric data (defined by `columns.data`) for display, retaining the original unformatted data for sorting and filtering.
    *
    * @param thousands Thousands grouping separator.
    * @param decimal Decimal point indicator.
    * @param precision Integer number of decimal points to show.
    * @param prefix Prefix (optional).
    * @param postfix Postfix (/suffix) (optional).
    */
  def number(thousands: String, decimal: String, precision: Double): ObjectColumnRender = js.native
  def number(thousands: String, decimal: String, precision: Double, prefix: String): ObjectColumnRender = js.native
  def number(thousands: String, decimal: String, precision: Double, prefix: String, postfix: String): ObjectColumnRender = js.native
  def number(thousands: String, decimal: String, precision: Double, prefix: Unit, postfix: String): ObjectColumnRender = js.native
  
  /**
    * Escape HTML to help prevent XSS attacks. It has no optional parameters.
    */
  def text(): ObjectColumnRender = js.native
}
