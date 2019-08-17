package typings.bugsnagDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesClientMod {
  import typings.std.Error

  /* Rewritten from type alias, can be one of: 
    - typings.std.Error
    - typings.bugsnagDashJs.Anon_ErrorClass
    - typings.bugsnagDashJs.Anon_Message
    - js.Any
  */
  type NotifiableError = _NotifiableError | Error | js.Any
}
