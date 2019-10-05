package typings.coreDashDecorators.coreDashDecoratorsMod

import org.scalablytyped.runtime.TopLevel
import typings.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecate extends MethodDecorator {
  def apply(): MethodDecorator = js.native
  def apply(message: String): MethodDecorator = js.native
  def apply(message: String, option: DeprecateOption): MethodDecorator = js.native
}

@JSImport("core-decorators", "deprecate")
@js.native
object deprecate extends TopLevel[Deprecate]

