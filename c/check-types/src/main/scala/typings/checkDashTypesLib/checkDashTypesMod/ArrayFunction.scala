package typings
package checkDashTypesLib.checkDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFunction extends js.Object {
  // TODO: Maybe there is a way to create type guards for array type checks
  // Since syntax is like check.array.of.number(2) - it's not yet clear to me how this even works, so...
  // I might use of: CheckType, but it will just return type guards for primitives and object type
  // and will make variable simply non array type in conditionals.
  var of: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def apply(a: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
}

