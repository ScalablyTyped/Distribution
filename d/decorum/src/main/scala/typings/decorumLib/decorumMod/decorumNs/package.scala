package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decorumNs {
  type MessageHandler[TValidator /* <: BaseValidator */] = js.Function2[/* opts */ IMessageOpts, /* validator */ TValidator, java.lang.String]
}
