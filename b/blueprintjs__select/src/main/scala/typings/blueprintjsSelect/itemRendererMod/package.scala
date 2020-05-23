package typings.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object itemRendererMod {
  type ItemRenderer[T] = js.Function2[
    /* item */ T, 
    /* itemProps */ typings.blueprintjsSelect.itemRendererMod.IItemRendererProps, 
    typings.react.mod.global.JSX.Element | scala.Null
  ]
}
