package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioGroupMod {
  type Radio = typings.react.mod.ComponentType[typings.cathoQuantum.radioGroupMod.RadioProps[typings.std.HTMLInputElement]]
  type RadioButton = typings.react.mod.ComponentType[
    typings.cathoQuantum.radioGroupMod.RadioButtonProps[typings.std.HTMLInputElement]
  ]
  type RadioGroup[T] = typings.react.mod.Component[typings.cathoQuantum.radioGroupMod.RadioGroupProps[T], js.Object, js.Any]
}
