package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object blenoLib {
  type Property = blenoLib.blenoLibStrings.read | blenoLib.blenoLibStrings.write | blenoLib.blenoLibStrings.indicate | blenoLib.blenoLibStrings.notify | blenoLib.blenoLibStrings.writeWithoutResponse
  type State = blenoLib.blenoLibStrings.poweredOn | blenoLib.blenoLibStrings.poweredOff | blenoLib.blenoLibStrings.unauthorized | blenoLib.blenoLibStrings.unsupported | blenoLib.blenoLibStrings.unknown | blenoLib.blenoLibStrings.resetting
}
