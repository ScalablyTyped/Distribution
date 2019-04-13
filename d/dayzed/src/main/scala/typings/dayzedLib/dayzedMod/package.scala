package typings
package dayzedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dayzedMod {
  type Dayzed = reactLib.reactMod.Component[Props, js.Object, js.Any]
  type RenderFn = js.Function1[/* renderProps */ RenderProps, reactLib.reactMod.ReactNode]
}
