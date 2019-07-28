package typings.cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.typesSinonMod.SinonSpy
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CypressNs {
  type Agent[T /* <: SinonSpy */] = SinonSpyAgent[T] with T
  // Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type FileContents = String | js.Array[js.Any] | js.Object
  type HttpMethod = String
  type ObjectLike = StringDictionary[js.Any]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type RequestBody = String | js.Object
}
