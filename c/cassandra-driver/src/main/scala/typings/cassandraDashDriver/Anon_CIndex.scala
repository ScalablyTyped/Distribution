package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.metadata.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CIndex extends js.Object {
  var c: ColumnInfo
  var index: Double
}

object Anon_CIndex {
  @scala.inline
  def apply(c: ColumnInfo, index: Double): Anon_CIndex = {
    val __obj = js.Dynamic.literal(c = c, index = index)
  
    __obj.asInstanceOf[Anon_CIndex]
  }
}

