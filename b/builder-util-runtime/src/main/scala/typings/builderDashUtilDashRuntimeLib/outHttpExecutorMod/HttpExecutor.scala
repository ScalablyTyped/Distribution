package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
abstract class HttpExecutor[REQUEST] () extends js.Object {
  var addTimeOutHandler: js.Any = js.native
  var handleResponse: js.Any = js.native
  val maxRedirects: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibNumbers.`10` = js.native
  def addErrorAndTimeoutHandlers(request: js.Any, reject: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /* protected */ def addRedirectHandlers(
    request: js.Any,
    options: nodeLib.httpMod.RequestOptions,
    reject: js.Function1[/* error */ stdLib.Error, scala.Unit],
    redirectCount: scala.Double,
    handler: js.Function1[/* options */ nodeLib.httpMod.RequestOptions, scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def createMaxRedirectError(): stdLib.Error = js.native
  def createRequest(options: js.Any, callback: js.Function1[/* response */ js.Any, scala.Unit]): js.Any = js.native
  def doApiRequest(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    requestProcessor: js.Function2[
      /* request */ REQUEST, 
      /* reject */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
      scala.Unit
    ]
  ): js.Promise[java.lang.String] = js.native
  def doApiRequest(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    requestProcessor: js.Function2[
      /* request */ REQUEST, 
      /* reject */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
      scala.Unit
    ],
    redirectCount: scala.Double
  ): js.Promise[java.lang.String] = js.native
  /* protected */ def doDownload(requestOptions: js.Any, options: DownloadCallOptions, redirectCount: scala.Double): scala.Unit = js.native
  def downloadToBuffer(url: nodeLib.urlMod.URL, options: DownloadOptions): js.Promise[nodeLib.Buffer] = js.native
  def request(options: nodeLib.httpMod.RequestOptions): js.Promise[java.lang.String | scala.Null] = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken
  ): js.Promise[java.lang.String | scala.Null] = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    cancellationToken: builderDashUtilDashRuntimeLib.outCancellationTokenMod.CancellationToken,
    data: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[java.lang.String | scala.Null] = js.native
}

/* static members */
@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
object HttpExecutor extends js.Object {
  def prepareRedirectUrlOptions(redirectUrl: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.RequestOptions = js.native
}

