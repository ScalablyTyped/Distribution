package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var c: cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.ColumnInfo
  var index: scala.Double
  var order: java.lang.String
}

object Anon_C {
  @scala.inline
  def apply(
    c: cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.ColumnInfo,
    index: scala.Double,
    order: java.lang.String
  ): Anon_C = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_C]
  }
}

