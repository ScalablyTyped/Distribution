package typings.coreDecorators.mod

import typings.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typings.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait PropertyOrMethodDecorator extends MethodDecorator {
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
}

