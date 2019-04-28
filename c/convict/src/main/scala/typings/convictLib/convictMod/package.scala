package typings
package convictLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convictMod {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = convictLib.convictLibStrings.Overwrite with T with U
  /* Rewritten from type alias, can be one of: 
    - convictLib.convictLibStrings.`*`
    - convictLib.convictLibStrings.int
    - convictLib.convictLibStrings.port
    - convictLib.convictLibStrings.windows_named_pipe
    - convictLib.convictLibStrings.port_or_windows_named_pipe
    - convictLib.convictLibStrings.url
    - convictLib.convictLibStrings.email
    - convictLib.convictLibStrings.ipaddress
    - convictLib.convictLibStrings.duration
    - convictLib.convictLibStrings.timestamp
    - convictLib.convictLibStrings.nat
    - java.lang.String
    - js.Object
    - stdLib.Number
    - stdLib.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = _PredefinedFormat | java.lang.String | js.Object | stdLib.Number | stdLib.RegExp | scala.Boolean
}
