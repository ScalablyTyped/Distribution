package typings.bugsnagDashJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesClientMod {
  /* Rewritten from type alias, can be one of: 
    - typings.std.Error
    - typings.bugsnagDashJs.Anon_ErrorClass
    - typings.bugsnagDashJs.Anon_Message
    - js.Any
  */
  type NotifiableError = _NotifiableError | Error | js.Any
}
