package typings
package coreDashDecoratorsLib.coreDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stdLib.PropertyDecorator because var conflicts: length. Inlined `<apply>` */ @js.native
trait PropertyOrMethodDecorator
  extends stdLib.MethodDecorator {
  def apply(T0: /* target */ js.Object, T1: /* propertyKey */ java.lang.String | js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): scala.Unit = js.native
}

