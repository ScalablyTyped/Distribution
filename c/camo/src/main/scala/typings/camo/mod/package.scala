package typings.camo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SchemaType = typings.camo.mod.TypeOrArrayOfType[java.lang.String | scala.Double | scala.Boolean | typings.std.Date | js.Object]
  type SchemaTypeConstructor = typings.camo.mod.TypeOrArrayOfType[
    typings.std.ArrayBufferConstructor | typings.std.ArrayConstructor | typings.std.BooleanConstructor | typings.std.DateConstructor | typings.std.NumberConstructor | typings.std.ObjectConstructor | typings.std.StringConstructor
  ]
  type SchemaTypeExtended = typings.camo.mod.SchemaTypeConstructor | typings.camo.mod.SchemaTypeOptions[typings.camo.mod.SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
