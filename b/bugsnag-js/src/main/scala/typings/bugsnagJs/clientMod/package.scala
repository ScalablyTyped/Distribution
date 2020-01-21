package typings.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  /* Rewritten from type alias, can be one of: 
    - typings.std.Error
    - typings.bugsnagJs.AnonErrorClass
    - typings.bugsnagJs.AnonMessage
    - js.Any
  */
  type NotifiableError = typings.bugsnagJs.clientMod._NotifiableError | typings.std.Error | js.Any
}
