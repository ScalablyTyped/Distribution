package typings.crumb

import typings.hapi.hapiMod.Request
import typings.hapi.hapiMod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crumbMod {
  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
