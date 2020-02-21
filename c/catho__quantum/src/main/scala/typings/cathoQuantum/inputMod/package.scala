package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  type CustomValidate = (js.Function1[/* param */ js.UndefOr[typings.cathoQuantum.AnonValueString], java.lang.String]) | typings.cathoQuantum.AnonError
  type Input[T] = typings.react.mod.Component[typings.cathoQuantum.inputMod.InputProps[T], js.Object, js.Any]
  type Mask = scala.Boolean | typings.std.RegExp | java.lang.String | typings.cathoQuantum.inputMod.MaskFunction
  type MaskFunction = js.Function1[/* rawValue */ java.lang.String, js.Array[java.lang.String]]
  type Validate = (js.Function1[
    (/* params */ typings.cathoQuantum.AnonMaxLength) | (/* params */ typings.cathoQuantum.AnonMinLength) | (/* params */ typings.cathoQuantum.AnonValue), 
    java.lang.String
  ]) | (js.Function2[
    /* params */ typings.cathoQuantum.AnonValue, 
    /* cpf */ js.UndefOr[java.lang.String], 
    java.lang.String
  ])
}
