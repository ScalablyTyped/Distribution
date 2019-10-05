package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.metadata.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var c: ColumnInfo
  var index: Double
  var order: String
}

object Anon_C {
  @scala.inline
  def apply(c: ColumnInfo, index: Double, order: String): Anon_C = {
    val __obj = js.Dynamic.literal(c = c, index = index, order = order)
  
    __obj.asInstanceOf[Anon_C]
  }
}

