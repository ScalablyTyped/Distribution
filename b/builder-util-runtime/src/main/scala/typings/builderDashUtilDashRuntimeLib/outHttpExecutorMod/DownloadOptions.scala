package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadOptions extends js.Object {
  val cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken
  val headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders | scala.Null] = js.undefined
  var onProgress: js.UndefOr[
    js.Function1[
      /* progress */ builderDashUtilDashRuntimeLib.outProgressCallbackTransformMod.ProgressInfo, 
      scala.Unit
    ]
  ] = js.undefined
  val sha2: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val sha512: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

