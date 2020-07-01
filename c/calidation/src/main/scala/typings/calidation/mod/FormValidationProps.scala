package typings.calidation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormValidationProps[T /* <: js.Object */]
  extends FormProps[T]
     with ValidationProps[T] {
  @JSName("children")
  def children_MFormValidationProps(context: ValidationContext[T]): ReactNode = js.native
}

