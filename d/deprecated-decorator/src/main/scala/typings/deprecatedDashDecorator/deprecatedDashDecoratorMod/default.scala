package typings.deprecatedDashDecorator.deprecatedDashDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deprecated-decorator", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): DeprecatedDecorator = js.native
  def apply(alternative: String): DeprecatedDecorator = js.native
  def apply(alternative: String, version: String): DeprecatedDecorator = js.native
  def apply(alternative: String, version: String, url: String): DeprecatedDecorator = js.native
  def apply(options: DeprecatedOptions): DeprecatedDecorator = js.native
  def apply[T /* <: js.Function */](alternative: String, fn: T): T = js.native
  def apply[T /* <: js.Function */](alternative: String, version: String, fn: T): T = js.native
  def apply[T /* <: js.Function */](alternative: String, version: String, url: String, fn: T): T = js.native
  def apply[T /* <: js.Function */](fn: T): T = js.native
  def apply[T /* <: js.Function */](options: DeprecatedOptions, fn: T): T = js.native
}

