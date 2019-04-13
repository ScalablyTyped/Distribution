package typings
package cliDashTable2Lib.cliDashTable2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTable[T]
  extends stdLib.Array[T] {
  var options: TableInstanceOptions = js.native
  val width: scala.Double = js.native
}

