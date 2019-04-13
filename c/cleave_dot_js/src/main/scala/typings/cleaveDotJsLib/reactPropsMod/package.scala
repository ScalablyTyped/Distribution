package typings
package cleaveDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactPropsMod {
  type ChangeEventHandler[T] = reactLib.reactMod.EventHandler[ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ reactLib.reactMod.ReactInstance, scala.Unit]
}
