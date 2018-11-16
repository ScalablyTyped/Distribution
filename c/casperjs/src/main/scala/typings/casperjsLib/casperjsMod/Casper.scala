package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("casperjs", "Casper")
@js.native
class Casper protected () extends js.Object {
  def this(options: CasperOptions) = this()
  // Properties
  var `__utils__`: ClientUtils = js.native
  var options: CasperOptions = js.native
  var test: Tester = js.native
  // Methods
  def back(): Casper = js.native
  def base64encode(url: java.lang.String): java.lang.String = js.native
  def base64encode(url: java.lang.String, method: java.lang.String): java.lang.String = js.native
  def base64encode(url: java.lang.String, method: java.lang.String, data: js.Any): java.lang.String = js.native
  def bypass(nb: scala.Double): Casper = js.native
  def capture(targetFilePath: java.lang.String): Casper = js.native
  def capture(targetFilePath: java.lang.String, clipRect: phantomjsLib.ClipRect): Casper = js.native
  def capture(targetFilePath: java.lang.String, clipRect: phantomjsLib.ClipRect, imgOptions: ImgOptions): Casper = js.native
  def captureBase64(format: java.lang.String): java.lang.String = js.native
  def captureBase64(format: java.lang.String, area: CasperSelector): java.lang.String = js.native
  def captureBase64(format: java.lang.String, area: java.lang.String): java.lang.String = js.native
  def captureBase64(format: java.lang.String, area: phantomjsLib.ClipRect): java.lang.String = js.native
  def captureSelector(targetFile: java.lang.String, selector: java.lang.String): Casper = js.native
  def captureSelector(targetFile: java.lang.String, selector: java.lang.String, imgOptions: ImgOptions): Casper = js.native
  def clear(): Casper = js.native
  def clearCache(): Casper = js.native
  def clearMemoryCache(): Casper = js.native
  def click(selector: java.lang.String): scala.Boolean = js.native
  def click(selector: java.lang.String, X: java.lang.String): scala.Boolean = js.native
  def click(selector: java.lang.String, X: java.lang.String, Y: java.lang.String): scala.Boolean = js.native
  def click(selector: java.lang.String, X: java.lang.String, Y: scala.Double): scala.Boolean = js.native
  def click(selector: java.lang.String, X: scala.Double): scala.Boolean = js.native
  def click(selector: java.lang.String, X: scala.Double, Y: java.lang.String): scala.Boolean = js.native
  def click(selector: java.lang.String, X: scala.Double, Y: scala.Double): scala.Boolean = js.native
  def clickLabel(label: java.lang.String): scala.Boolean = js.native
  def clickLabel(label: java.lang.String, tag: java.lang.String): scala.Boolean = js.native
  def debugHTML(): Casper = js.native
  def debugHTML(selector: java.lang.String): Casper = js.native
  def debugHTML(selector: java.lang.String, outer: scala.Boolean): Casper = js.native
  def debugPage(): Casper = js.native
  def die(message: java.lang.String): Casper = js.native
  def die(message: java.lang.String, status: scala.Double): Casper = js.native
  def download(url: java.lang.String, target: java.lang.String): Casper = js.native
  def download(url: java.lang.String, target: java.lang.String, method: java.lang.String): Casper = js.native
  def download(url: java.lang.String, target: java.lang.String, method: java.lang.String, data: js.Any): Casper = js.native
  def each[T](
    array: js.Array[T],
    fn: js.ThisFunction2[/* this */ this.type, /* item */ T, /* index */ scala.Double, scala.Unit]
  ): Casper = js.native
  def eachThen(array: js.Array[_]): Casper = js.native
  def eachThen(array: js.Array[_], `then`: FunctionThen): Casper = js.native
  def echo(message: java.lang.String): Casper = js.native
  def echo(message: java.lang.String, style: java.lang.String): Casper = js.native
  def evaluate[T](fn: js.Function1[/* repeated */js.Any, T], args: js.Any*): T = js.native
  def evaluateOrDie(fn: js.Function0[_]): Casper = js.native
  def evaluateOrDie(fn: js.Function0[_], message: java.lang.String): Casper = js.native
  def evaluateOrDie(fn: js.Function0[_], message: java.lang.String, status: scala.Double): Casper = js.native
  def exists(selector: java.lang.String): scala.Boolean = js.native
  def exit(): Casper = js.native
  def exit(status: scala.Double): Casper = js.native
  def fetchText(selector: java.lang.String): java.lang.String = js.native
  def fill(selector: java.lang.String, values: js.Any): scala.Unit = js.native
  def fill(selector: java.lang.String, values: js.Any, submit: scala.Boolean): scala.Unit = js.native
  def fillSelectors(selector: java.lang.String, values: js.Any): scala.Unit = js.native
  def fillSelectors(selector: java.lang.String, values: js.Any, submit: scala.Boolean): scala.Unit = js.native
  def fillXPath(selector: java.lang.String, values: js.Any): scala.Unit = js.native
  def fillXPath(selector: java.lang.String, values: js.Any, submit: scala.Boolean): scala.Unit = js.native
  def forward(): Casper = js.native
  def getCurrentUrl(): java.lang.String = js.native
  def getElementAttribute(selector: java.lang.String, attribute: java.lang.String): java.lang.String = js.native
  def getElementBounds(selector: java.lang.String): ElementBounds | scala.Null = js.native
  def getElementBounds(selector: java.lang.String, page: scala.Boolean): ElementBounds | scala.Null = js.native
  def getElementInfo(selector: java.lang.String): ElementInfo = js.native
  def getElementsAttribute(selector: java.lang.String, attribute: java.lang.String): java.lang.String = js.native
  def getElementsBounds(selector: java.lang.String): js.Array[ElementBounds] = js.native
  def getElementsInfo(selector: java.lang.String): ElementInfo = js.native
  def getFormValues(selector: java.lang.String): js.Any = js.native
  def getGlobal(name: java.lang.String): js.Any = js.native
  def getHTML(): java.lang.String = js.native
  def getHTML(selector: java.lang.String): java.lang.String = js.native
  def getHTML(selector: java.lang.String, outer: scala.Boolean): java.lang.String = js.native
  def getPageContent(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def log(message: java.lang.String): Casper = js.native
  def log(message: java.lang.String, level: java.lang.String): Casper = js.native
  def log(message: java.lang.String, level: java.lang.String, space: java.lang.String): Casper = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: java.lang.String): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: java.lang.String, Y: java.lang.String): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: java.lang.String, Y: scala.Double): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: scala.Double): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: scala.Double, Y: java.lang.String): scala.Boolean = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String, X: scala.Double, Y: scala.Double): scala.Boolean = js.native
  def newPage(): js.Any = js.native
  def open(location: java.lang.String, settings: OpenSettings): Casper = js.native
  def reload(): Casper = js.native
  def reload(`then`: FunctionThen): Casper = js.native
  def repeat(times: scala.Double, `then`: FunctionThen): Casper = js.native
  def resourceExists(test: java.lang.String): scala.Boolean = js.native
  def resourceExists(test: js.Function): scala.Boolean = js.native
  def resourceExists(test: stdLib.RegExp): scala.Boolean = js.native
  def run(): Casper = js.native
  def run(onComplete: js.Function): Casper = js.native
  def run(onComplete: js.Function, time: scala.Double): Casper = js.native
  def scrollTo(x: scala.Double, y: scala.Double): Casper = js.native
  def scrollToBottom(): Casper = js.native
  def sendKeys(selector: java.lang.String, keys: java.lang.String): Casper = js.native
  def sendKeys(selector: java.lang.String, keys: java.lang.String, options: KeyOptions): Casper = js.native
  def setHttpAuth(username: java.lang.String, password: java.lang.String): Casper = js.native
  def setMaxListeners(maxListeners: scala.Double): Casper = js.native
  def start(): Casper = js.native
  def start(url: java.lang.String): Casper = js.native
  def start(url: java.lang.String, `then`: FunctionThen): Casper = js.native
  def status(): scala.Double = js.native
  def status(asString: casperjsLib.casperjsLibNumbers.`false`): scala.Double = js.native
  def status(asString: casperjsLib.casperjsLibNumbers.`true`): java.lang.String = js.native
  def switchToFrame(frameInfo: java.lang.String): Casper = js.native
  def switchToFrame(frameInfo: scala.Double): Casper = js.native
  def switchToMainFrame(): Casper = js.native
  def switchToParentFrame(): Casper = js.native
  def `then`(fn: js.ThisFunction0[/* this */ this.type, scala.Unit]): Casper = js.native
  def thenBypass(nb: scala.Double): Casper = js.native
  def thenBypassIf(condition: js.Any, nb: scala.Double): Casper = js.native
  def thenBypassUnless(condition: js.Any, nb: scala.Double): Casper = js.native
  def thenClick(selector: java.lang.String): Casper = js.native
  def thenClick(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def thenEvaluate(fn: js.Function0[_], args: js.Any*): Casper = js.native
  def thenOpen(location: java.lang.String): Casper = js.native
  def thenOpen(location: java.lang.String, options: OpenSettings): Casper = js.native
  def thenOpen(
    location: java.lang.String,
    options: OpenSettings,
    `then`: js.Function1[/* response */ HttpResponse, scala.Unit]
  ): Casper = js.native
  def thenOpen(location: java.lang.String, `then`: js.Function1[/* response */ HttpResponse, scala.Unit]): Casper = js.native
  def thenOpenAndEvaluate(location: java.lang.String): Casper = js.native
  def thenOpenAndEvaluate(location: java.lang.String, `then`: FunctionThen, args: js.Any*): Casper = js.native
  def unwait(): Casper = js.native
  // 2017-10-19 Doc said returning String but code return Casper object.
  def userAgent(agent: java.lang.String): Casper = js.native
  def viewport(width: scala.Double, height: scala.Double): Casper = js.native
  def viewport(width: scala.Double, height: scala.Double, `then`: FunctionThen): Casper = js.native
  def visible(selector: java.lang.String): scala.Boolean = js.native
  def wait(timeout: scala.Double): Casper = js.native
  def wait(timeout: scala.Double, `then`: FunctionThen): Casper = js.native
  def waitFor(testFx: js.Function): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: scala.Double): Casper = js.native
  def waitFor(
    testFx: js.Function,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double,
    details: js.Any
  ): Casper = js.native
  def waitForAlert(`then`: FunctionThen): Casper = js.native
  def waitForAlert(`then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForAlert(`then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: scala.Double): Casper = js.native
  def waitForExec(command: java.lang.String, parameter: js.Array[java.lang.String]): Casper = js.native
  def waitForExec(command: java.lang.String, parameter: js.Array[java.lang.String], `then`: FunctionThen): Casper = js.native
  def waitForExec(
    command: java.lang.String,
    parameter: js.Array[java.lang.String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout
  ): Casper = js.native
  def waitForExec(
    command: java.lang.String,
    parameter: js.Array[java.lang.String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitForExec(command: scala.Null, parameter: js.Array[java.lang.String]): Casper = js.native
  def waitForExec(command: scala.Null, parameter: js.Array[java.lang.String], `then`: FunctionThen): Casper = js.native
  def waitForExec(
    command: scala.Null,
    parameter: js.Array[java.lang.String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout
  ): Casper = js.native
  def waitForExec(
    command: scala.Null,
    parameter: js.Array[java.lang.String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(
    urlPattern: FindByUrlNameTitle,
    `then`: FunctionThen,
    onTimeout: js.Function,
    timeout: scala.Double
  ): Casper = js.native
  def waitForPopup(urlPattern: java.lang.String): Casper = js.native
  def waitForPopup(urlPattern: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: java.lang.String, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: java.lang.String, `then`: FunctionThen, onTimeout: js.Function, timeout: scala.Double): Casper = js.native
  def waitForPopup(urlPattern: scala.Double): Casper = js.native
  def waitForPopup(urlPattern: scala.Double, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: scala.Double, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: scala.Double, `then`: FunctionThen, onTimeout: js.Function, timeout: scala.Double): Casper = js.native
  def waitForPopup(urlPattern: stdLib.RegExp): Casper = js.native
  def waitForPopup(urlPattern: stdLib.RegExp, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: stdLib.RegExp, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: stdLib.RegExp, `then`: FunctionThen, onTimeout: js.Function, timeout: scala.Double): Casper = js.native
  def waitForResource(testFx: java.lang.String): Casper = js.native
  def waitForResource(testFx: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForResource(testFx: java.lang.String, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForResource(testFx: java.lang.String, `then`: FunctionThen, onTimeout: js.Function, timeout: scala.Double): Casper = js.native
  def waitForResource(testFx: js.Function1[/* resource */ casperjsLib.Anon_Url, scala.Boolean]): Casper = js.native
  def waitForResource(testFx: js.Function1[/* resource */ casperjsLib.Anon_Url, scala.Boolean], `then`: FunctionThen): Casper = js.native
  def waitForResource(
    testFx: js.Function1[/* resource */ casperjsLib.Anon_Url, scala.Boolean],
    `then`: FunctionThen,
    onTimeout: js.Function
  ): Casper = js.native
  def waitForResource(
    testFx: js.Function1[/* resource */ casperjsLib.Anon_Url, scala.Boolean],
    `then`: FunctionThen,
    onTimeout: js.Function,
    timeout: scala.Double
  ): Casper = js.native
  def waitForResource(testFx: stdLib.RegExp): Casper = js.native
  def waitForResource(testFx: stdLib.RegExp, `then`: FunctionThen): Casper = js.native
  def waitForResource(testFx: stdLib.RegExp, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForResource(testFx: stdLib.RegExp, `then`: FunctionThen, onTimeout: js.Function, timeout: scala.Double): Casper = js.native
  def waitForSelector(selector: java.lang.String): Casper = js.native
  def waitForSelector(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForSelector(selector: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForSelector(
    selector: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitForSelectorTextChange(selectors: java.lang.String): Casper = js.native
  def waitForSelectorTextChange(selectors: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForSelectorTextChange(selectors: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForSelectorTextChange(
    selectors: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitForText(pattern: java.lang.String): Casper = js.native
  def waitForText(pattern: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForText(pattern: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForText(
    pattern: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitForText(pattern: stdLib.RegExp): Casper = js.native
  def waitForText(pattern: stdLib.RegExp, `then`: FunctionThen): Casper = js.native
  def waitForText(pattern: stdLib.RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForText(pattern: stdLib.RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: scala.Double): Casper = js.native
  def waitForUrl(url: java.lang.String): Casper = js.native
  def waitForUrl(url: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitForUrl(url: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForUrl(url: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: scala.Double): Casper = js.native
  def waitForUrl(url: stdLib.RegExp): Casper = js.native
  def waitForUrl(url: stdLib.RegExp, `then`: FunctionThen): Casper = js.native
  def waitForUrl(url: stdLib.RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForUrl(url: stdLib.RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: scala.Double): Casper = js.native
  def waitUntilVisible(selector: java.lang.String): Casper = js.native
  def waitUntilVisible(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitUntilVisible(selector: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitUntilVisible(
    selector: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitWhileSelector(selector: java.lang.String): Casper = js.native
  def waitWhileSelector(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitWhileSelector(selector: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitWhileSelector(
    selector: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def waitWhileVisible(selector: java.lang.String): Casper = js.native
  def waitWhileVisible(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def waitWhileVisible(selector: java.lang.String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitWhileVisible(
    selector: java.lang.String,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: scala.Double
  ): Casper = js.native
  def warn(message: java.lang.String): Casper = js.native
  def withFrame(frameInfo: java.lang.String, `then`: FunctionThen): Casper = js.native
  def withFrame(frameInfo: scala.Double, `then`: FunctionThen): Casper = js.native
  def withPopup(popupInfo: FindByUrlNameTitle, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: java.lang.String, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: scala.Double, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: stdLib.RegExp, step: FunctionThen): Casper = js.native
  def withSelectorScope(selector: java.lang.String, `then`: FunctionThen): Casper = js.native
  def zoom(factor: scala.Double): Casper = js.native
}

