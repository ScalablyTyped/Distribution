package typings
package compressionLib.compressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eNs {
  type CompressionFilter = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Boolean
  ]
}
