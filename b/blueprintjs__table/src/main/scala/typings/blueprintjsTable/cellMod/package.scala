package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellMod {
  type ICellRenderer = js.Function2[
    /* rowIndex */ scala.Double, 
    /* columnIndex */ scala.Double, 
    typings.react.mod.ReactElement
  ]
}
