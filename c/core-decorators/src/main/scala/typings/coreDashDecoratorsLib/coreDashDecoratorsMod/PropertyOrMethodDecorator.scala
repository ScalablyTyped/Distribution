package typings
package coreDashDecoratorsLib.coreDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(stdLib.PropertyDecorator because Would inherit conflicting mutable fields List(length))*/
@js.native
trait PropertyOrMethodDecorator
  extends stdLib.MethodDecorator {
  def apply(target: js.Object, propertyKey: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): scala.Unit = js.native
}

