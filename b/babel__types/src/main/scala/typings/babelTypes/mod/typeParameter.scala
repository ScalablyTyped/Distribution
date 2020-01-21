package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "typeParameter")
@js.native
object typeParameter extends js.Object {
  def apply(): TypeParameter_ = js.native
  def apply(bound: Null, _default: Null, variance: Variance_): TypeParameter_ = js.native
  def apply(bound: Null, _default: FlowType): TypeParameter_ = js.native
  def apply(bound: Null, _default: FlowType, variance: Variance_): TypeParameter_ = js.native
  def apply(bound: TypeAnnotation_): TypeParameter_ = js.native
  def apply(bound: TypeAnnotation_, _default: Null, variance: Variance_): TypeParameter_ = js.native
  def apply(bound: TypeAnnotation_, _default: FlowType): TypeParameter_ = js.native
  def apply(bound: TypeAnnotation_, _default: FlowType, variance: Variance_): TypeParameter_ = js.native
}

