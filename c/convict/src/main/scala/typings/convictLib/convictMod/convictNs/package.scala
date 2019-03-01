package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convictNs {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = convictLib.convictLibStrings.Overwrite with T with U
  type PredefinedFormat = _PredefinedFormat | java.lang.String | js.Object | stdLib.Number | stdLib.RegExp | scala.Boolean
  type Schema[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: object | convict.convict.convict.SchemaObj<T[P]>}
    */ convictLib.convictLibStrings.Schema with T
}
