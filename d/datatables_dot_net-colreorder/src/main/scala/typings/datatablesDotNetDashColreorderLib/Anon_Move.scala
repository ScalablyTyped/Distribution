package typings
package datatablesDotNetDashColreorderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Move extends js.Object {
  /*
    * Programmatically reorder columns
    */
  def move(from: scala.Double, to: scala.Double, drop: scala.Boolean, invalidate: scala.Boolean): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  /*
    * Get / set column order
    */
  def order(): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  def order(newOrder: js.Array[scala.Double]): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  def order(newOrder: js.Array[scala.Double], originalIndexes: scala.Boolean): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  /*
    * Restore the loaded column order
    */
  def reset(): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  /*
    * Convert one or more column indexes to and from current and original indexes
    */
  def transpose(): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  def transpose(idx: js.Array[scala.Double]): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  def transpose(idx: scala.Double): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_fromCurrent(
    idx: js.Array[scala.Double],
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.fromCurrent
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_fromCurrent(
    idx: scala.Double,
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.fromCurrent
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_fromOriginal(
    idx: js.Array[scala.Double],
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.fromOriginal
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_fromOriginal(
    idx: scala.Double,
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.fromOriginal
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_toCurrent(
    idx: js.Array[scala.Double],
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.toCurrent
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_toCurrent(
    idx: scala.Double,
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.toCurrent
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_toOriginal(
    idx: js.Array[scala.Double],
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.toOriginal
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
  @JSName("transpose")
  def transpose_toOriginal(
    idx: scala.Double,
    direction: datatablesDotNetDashColreorderLib.datatablesDotNetDashColreorderLibStrings.toOriginal
  ): datatablesDotNetDashColreorderLib.DataTablesNs.Api = js.native
}

