package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesClientMod {
  /* Rewritten from type alias, can be one of: 
    - stdLib.Error
    - bugsnagDashJsLib.Anon_ErrorClass
    - bugsnagDashJsLib.Anon_Message
    - js.Any
  */
  type NotifiableError = _NotifiableError | stdLib.Error | js.Any
}
