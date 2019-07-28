package typings.camo

import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.Date
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object camoMod {
  type SchemaType = TypeOrArrayOfType[String | Double | Boolean | Date | js.Object]
  type SchemaTypeConstructor = TypeOrArrayOfType[
    ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor
  ]
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
