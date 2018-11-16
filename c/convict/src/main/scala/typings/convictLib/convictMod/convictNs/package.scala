package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convictNs {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = convictLib.convictLibStrings.Overwrite with T with U
  type Schema[T] = convictLib.convictLibStrings.Schema with T
  type ValidationMethod = convictLib.convictLibStrings.strict | convictLib.convictLibStrings.warn
}
