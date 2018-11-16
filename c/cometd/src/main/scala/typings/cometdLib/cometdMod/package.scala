package typings
package cometdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cometdMod {
  type Callback = js.Function1[/* data */ js.Any, scala.Unit]
  type Listener = js.Function1[/* message */ Message, scala.Unit]
}
