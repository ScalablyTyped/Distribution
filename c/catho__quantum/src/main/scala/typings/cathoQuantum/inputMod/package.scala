package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  type CustomValidate = (js.Function1[/* param */ js.UndefOr[typings.cathoQuantum.anon.ValueString], java.lang.String]) | typings.cathoQuantum.anon.Error
  type Input = typings.react.mod.Component[typings.cathoQuantum.inputMod.InputProps, js.Object, js.Any]
  type Mask = scala.Boolean | typings.std.RegExp | java.lang.String | typings.cathoQuantum.inputMod.MaskFunction
  type MaskFunction = js.Function1[/* rawValue */ java.lang.String, js.Array[java.lang.String]]
  type Validate = (js.Function1[
    (/* params */ typings.cathoQuantum.anon.MaxLength) | (/* params */ typings.cathoQuantum.anon.MinLength) | (/* params */ typings.cathoQuantum.anon.Value), 
    java.lang.String
  ]) | (js.Function2[
    /* params */ typings.cathoQuantum.anon.Value, 
    /* cpf */ js.UndefOr[java.lang.String], 
    java.lang.String
  ])
}
