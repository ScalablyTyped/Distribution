package typings
package camoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object camoMod {
  type SchemaType = TypeOrArrayOfType[java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Object]
  type SchemaTypeConstructor = TypeOrArrayOfType[
    stdLib.ArrayBufferConstructor | stdLib.ArrayConstructor | stdLib.BooleanConstructor | stdLib.DateConstructor | stdLib.NumberConstructor | stdLib.ObjectConstructor | stdLib.StringConstructor
  ]
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
