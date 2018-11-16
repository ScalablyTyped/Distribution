package typings
package camoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object camoMod {
  type SchemaType = TypeOrArrayOfType[java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Object]
  type SchemaTypeConstructor = TypeOrArrayOfType[stdLib.StringConstructor] | TypeOrArrayOfType[stdLib.NumberConstructor] | TypeOrArrayOfType[stdLib.BooleanConstructor] | TypeOrArrayOfType[stdLib.ArrayBufferConstructor] | TypeOrArrayOfType[stdLib.DateConstructor] | TypeOrArrayOfType[stdLib.ObjectConstructor] | TypeOrArrayOfType[stdLib.ArrayConstructor]
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
