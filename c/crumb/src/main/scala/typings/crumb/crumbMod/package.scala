package typings.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crumbMod {
  import typings.hapi.hapiMod.Request
  import typings.hapi.hapiMod.ResponseToolkit

  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
