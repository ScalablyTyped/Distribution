package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "objectProperty")
@js.native
object objectProperty extends js.Object {
  def apply(): ObjectProperty_ = js.native
  def apply(key: Expression): ObjectProperty_ = js.native
  def apply(key: Expression, value: Expression): ObjectProperty_ = js.native
  def apply(key: Expression, value: Expression, computed: Boolean): ObjectProperty_ = js.native
  def apply(key: Expression, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
  def apply(
    key: Expression,
    value: Expression,
    computed: Boolean,
    shorthand: Boolean,
    decorators: js.Array[Decorator_]
  ): ObjectProperty_ = js.native
}

