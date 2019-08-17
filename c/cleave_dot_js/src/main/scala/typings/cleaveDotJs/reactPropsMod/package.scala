package typings.cleaveDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactPropsMod {
  import typings.react.reactMod.EventHandler
  import typings.react.reactMod.ReactInstance

  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ ReactInstance, Unit]
}
