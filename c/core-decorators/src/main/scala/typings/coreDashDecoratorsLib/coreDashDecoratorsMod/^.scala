package typings
package coreDashDecoratorsLib.coreDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-decorators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val autobind: js.Function = js.native
  val deprecate: coreDashDecoratorsLib.coreDashDecoratorsMod.Deprecate = js.native
  val deprecated: coreDashDecoratorsLib.coreDashDecoratorsMod.Deprecate = js.native
  val lazyInitialize: stdLib.PropertyDecorator = js.native
  val memoize: stdLib.MethodDecorator = js.native
  val nonconfigurable: coreDashDecoratorsLib.coreDashDecoratorsMod.PropertyOrMethodDecorator = js.native
  val nonenumerable: coreDashDecoratorsLib.coreDashDecoratorsMod.PropertyOrMethodDecorator = js.native
  val `override`: stdLib.MethodDecorator = js.native
  val readonly: coreDashDecoratorsLib.coreDashDecoratorsMod.PropertyOrMethodDecorator = js.native
  val suppressWarnings: stdLib.MethodDecorator = js.native
  def decorate(func: js.Function, args: js.Any*): stdLib.MethodDecorator = js.native
  def time(label: java.lang.String): stdLib.MethodDecorator = js.native
  def time(label: java.lang.String, console: stdLib.Console): stdLib.MethodDecorator = js.native
}

