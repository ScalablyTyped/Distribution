package typings.cleaveDotJs

import typings.react.reactMod.EventHandler
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactPropsMod {
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ ReactInstance, Unit]
}
