package typings.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonPropsMod {
  import typings.atBlueprintjsCore.atBlueprintjsCoreNumbers.`false`
  import typings.react.reactMod.Global.JSX.Element
  import typings.react.reactMod.HTMLAttributes
  import typings.react.reactMod.InputHTMLAttributes
  import typings.std.HTMLDivElement
  import typings.std.HTMLInputElement

  type HTMLDivProps = HTMLAttributes[HTMLDivElement]
  type HTMLInputProps = InputHTMLAttributes[HTMLInputElement]
  type MaybeElement = js.UndefOr[Element | `false` | Null]
}
