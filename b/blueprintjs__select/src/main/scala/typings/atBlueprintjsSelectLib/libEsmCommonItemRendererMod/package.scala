package typings
package atBlueprintjsSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonItemRendererMod {
  type ItemRenderer[T] = js.Function2[
    /* item */ T, 
    /* itemProps */ IItemRendererProps, 
    reactLib.reactMod.Global.JSXNs.Element | scala.Null
  ]
}
