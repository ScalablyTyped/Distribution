package typings.atBlueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonItemRendererMod {
  import typings.react.reactMod.Global.JSXNs.Element

  type ItemRenderer[T] = js.Function2[/* item */ T, /* itemProps */ IItemRendererProps, Element | Null]
}
