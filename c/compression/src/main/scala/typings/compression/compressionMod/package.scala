package typings.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type CompressionFilter = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
}
