package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CypressNs {
  // Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type FileContents = java.lang.String | js.Array[js.Any] | js.Object
  type ObjectLike = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type RequestBody = java.lang.String | js.Object
}
