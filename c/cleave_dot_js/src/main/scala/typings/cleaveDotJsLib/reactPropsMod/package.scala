package typings
package cleaveDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactPropsMod {
  type ChangeEventHandler[T] = reactLib.reactMod.ReactNs.EventHandler[ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ reactLib.reactMod.ReactNs.ReactInstance, scala.Unit]
}
