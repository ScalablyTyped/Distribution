package typings.calidation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationProps[T /* <: js.Object */] extends js.Object {
  var config: FieldsConfig[T] = js.native
  var initialValues: js.UndefOr[T] = js.native
  var transforms: js.UndefOr[Transforms[T]] = js.native
  def children(context: ValidationContext[T]): ReactNode = js.native
}

object ValidationProps {
  @scala.inline
  def apply[/* <: js.Object */ T](children: ValidationContext[T] => ReactNode, config: FieldsConfig[T]): ValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationProps[T]]
  }
  @scala.inline
  implicit class ValidationPropsOps[Self <: ValidationProps[_], /* <: js.Object */ T] (val x: Self with ValidationProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ValidationContext[T] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: FieldsConfig[T]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialValues(value: T): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    @scala.inline
    def setTransforms(value: Transforms[T]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

