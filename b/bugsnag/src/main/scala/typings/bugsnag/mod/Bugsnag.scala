package typings.bugsnag.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bugsnag extends js.Object {
  
  def autoNotify(cb: js.Function0[Unit]): js.Any = js.native
  def autoNotify(options: NotifyOptions, cb: js.Function0[Unit]): js.Any = js.native
  
  def configure(options: ConfigurationOptions): Unit = js.native
  
  def createErrorHandler(apiKey: String): ErrorHandler = js.native
  def createErrorHandler(apiKey: String, options: ConfigurationOptions): ErrorHandler = js.native
  
  def createRequestHandler(apiKey: String): RequestHandler = js.native
  def createRequestHandler(apiKey: String, options: ConfigurationOptions): RequestHandler = js.native
  
  def errorHandler(err: js.Any, req: js.Any, res: js.Any, next: NextFunction): Unit = js.native
  def errorHandler(err: Error, req: js.Any, res: js.Any, next: NextFunction): Unit = js.native
  @JSName("errorHandler")
  var errorHandler_Original: ErrorHandler = js.native
  
  def intercept[T](): js.Function2[/* error */ js.Any, /* repeated */ js.Any, T with Unit] = js.native
  def intercept[T](cb: js.Function1[/* repeated */ js.Any, T]): js.Function2[/* error */ js.Any, /* repeated */ js.Any, T with Unit] = js.native
  
  def koaHandler(err: Error, ctx: js.Any): Unit = js.native
  
  var metaData: StringDictionary[js.Any] = js.native
  
  def notify(error: String): Unit = js.native
  def notify(error: String, cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def notify(error: String, options: NotifyOptions): Unit = js.native
  def notify(
    error: String,
    options: NotifyOptions,
    cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  def notify(error: Error): Unit = js.native
  def notify(error: Error, cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def notify(error: Error, options: NotifyOptions): Unit = js.native
  def notify(
    error: Error,
    options: NotifyOptions,
    cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def onBeforeNotify(cb: js.Function1[/* notification */ js.Any, Boolean | Unit]): Unit = js.native
  def onBeforeNotify(cb: js.Function1[/* notification */ js.Any, Boolean | Unit], error: Error): Unit = js.native
  
  def register(apiKey: String): Bugsnag = js.native
  def register(apiKey: String, options: ConfigurationOptions): Bugsnag = js.native
  
  var requestData: StringDictionary[js.Any] = js.native
  
  def requestHandler(req: js.Any, res: js.Any, next: NextFunction): js.Any = js.native
  @JSName("requestHandler")
  var requestHandler_Original: RequestHandler = js.native
  
  def restifyHandler(req: js.Any, res: js.Any, route: js.Any, err: Error): Unit = js.native
  
  def shouldNotify(): Boolean = js.native
}
