package typings
package bodyDashParserLib.bodyDashParserMod.bodyParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var inflate: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, _])
  ] = js.undefined
  var verify: js.UndefOr[
    js.Function4[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* buf */ nodeLib.Buffer, 
      /* encoding */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
}

