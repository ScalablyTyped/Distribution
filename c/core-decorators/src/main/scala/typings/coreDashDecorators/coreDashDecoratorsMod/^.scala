package typings.coreDashDecorators.coreDashDecoratorsMod

import typings.std.Console
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-decorators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val autobind: js.Function = js.native
  val deprecate: Deprecate = js.native
  val deprecated: Deprecate = js.native
  val lazyInitialize: PropertyDecorator = js.native
  val memoize: MethodDecorator = js.native
  val nonconfigurable: PropertyOrMethodDecorator = js.native
  val nonenumerable: PropertyOrMethodDecorator = js.native
  val `override`: MethodDecorator = js.native
  val readonly: PropertyOrMethodDecorator = js.native
  val suppressWarnings: MethodDecorator = js.native
  def decorate(func: js.Function, args: js.Any*): MethodDecorator = js.native
  def time(label: String): MethodDecorator = js.native
  def time(label: String, console: Console): MethodDecorator = js.native
}

