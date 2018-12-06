package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convictNs {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = convictLib.convictLibStrings.Overwrite with T with U
  type PredefinedFormat = convictLib.convictLibStrings.`*` | convictLib.convictLibStrings.int | convictLib.convictLibStrings.port | convictLib.convictLibStrings.windows_named_pipe | convictLib.convictLibStrings.port_or_windows_named_pipe | convictLib.convictLibStrings.url | convictLib.convictLibStrings.email | convictLib.convictLibStrings.ipaddress | convictLib.convictLibStrings.duration | convictLib.convictLibStrings.timestamp | convictLib.convictLibStrings.nat | java.lang.String | js.Object | stdLib.Number | stdLib.RegExp | scala.Boolean
  type Schema[T] = convictLib.convictLibStrings.Schema with T
  type ValidationMethod = convictLib.convictLibStrings.strict | convictLib.convictLibStrings.warn
}
