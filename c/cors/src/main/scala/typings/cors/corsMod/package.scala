package typings.cors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object corsMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.std.Error

  type CorsOptionsDelegate = js.Function2[
    /* req */ Request[ParamsDictionary], 
    /* callback */ js.Function2[/* err */ Error | Null, /* options */ js.UndefOr[CorsOptions], Unit], 
    Unit
  ]
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[String], 
    /* callback */ js.Function2[/* err */ Error | Null, /* allow */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
}
