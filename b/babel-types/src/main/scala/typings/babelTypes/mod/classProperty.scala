package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "classProperty")
@js.native
object classProperty extends js.Object {
  def apply(): ClassProperty_ = js.native
  def apply(key: Identifier_): ClassProperty_ = js.native
  def apply(key: Identifier_, value: Expression): ClassProperty_ = js.native
  def apply(key: Identifier_, value: Expression, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
  def apply(
    key: Identifier_,
    value: Expression,
    typeAnnotation: TypeAnnotation_,
    decorators: js.Array[Decorator_]
  ): ClassProperty_ = js.native
}

