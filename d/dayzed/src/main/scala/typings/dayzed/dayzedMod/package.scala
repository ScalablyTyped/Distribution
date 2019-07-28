package typings.dayzed

import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dayzedMod {
  type Dayzed = Component[Props, js.Object, js.Any]
  type RenderFn = js.Function1[/* renderProps */ RenderProps, ReactNode]
}
