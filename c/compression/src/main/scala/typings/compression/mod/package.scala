package typings.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompressionFilter = js.Function2[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_, 
    scala.Boolean
  ]
}
