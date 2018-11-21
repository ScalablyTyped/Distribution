package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
abstract class HttpExecutor[REQUEST] () extends js.Object {
  var handleResponse: js.Any = js.native
  val maxRedirects: scala.Double = js.native
  def addErrorAndTimeoutHandlers(request: js.Any, reject: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /* protected */ def addRedirectHandlers(
    request: js.Any,
    options: nodeLib.httpMod.RequestOptions,
    reject: js.Function1[/* error */ nodeLib.Error, scala.Unit],
    redirectCount: scala.Double,
    handler: js.Function1[/* options */ nodeLib.httpMod.RequestOptions, scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def addTimeOutHandler(request: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def doApiRequest(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    requestProcessor: js.Function2[
      /* request */ REQUEST, 
      /* reject */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ): stdLib.Promise[java.lang.String] = js.native
  def doApiRequest(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    requestProcessor: js.Function2[
      /* request */ REQUEST, 
      /* reject */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ],
    redirectCount: scala.Double
  ): stdLib.Promise[java.lang.String] = js.native
  /* protected */ def doDownload(
    requestOptions: js.Any,
    destination: java.lang.String,
    redirectCount: scala.Double,
    options: DownloadOptions,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit],
    onCancel: js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def doRequest(options: js.Any, callback: js.Function1[/* response */ js.Any, scala.Unit]): js.Any = js.native
  def request(options: nodeLib.httpMod.RequestOptions): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken
  ): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    data: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): stdLib.Promise[java.lang.String | scala.Null] = js.native
}

@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
object HttpExecutor extends js.Object {
  def prepareRedirectUrlOptions(redirectUrl: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.RequestOptions = js.native
}

