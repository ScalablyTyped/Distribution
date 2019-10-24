package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Cypress {
  import org.scalablytyped.runtime.StringDictionary
  import typings.cypress.typesSinonMod.SinonSpy
  import typings.std.Exclude
  import typings.std.Pick

  type Agent[T /* <: SinonSpy */] = SinonSpyAgent[T] with T
  // Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type FileContents = String | js.Array[js.Any] | js.Object
  type HttpMethod = String
  type ObjectLike = StringDictionary[js.Any]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Padding = Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  type RequestBody = String | js.Object
  /**
    * Public interface for the global "cy" object. If you want to add
    * a custom property to this object, you should extend this interface.
    * @see https://on.cypress.io/typescript#Types-for-custom-commands
    *
    ```
    // in your TS file
    declare namespace Cypress {
    interface cy {
    // declare additional properties on "cy" object, like
    // label: string
    }
    interface Chainable {
    // declare additional custom commands as methods, like
    // login(username: string, password: string)
    }
    }
    ```
    */
  type cy = Chainable[js.UndefOr[scala.Nothing]]
}
