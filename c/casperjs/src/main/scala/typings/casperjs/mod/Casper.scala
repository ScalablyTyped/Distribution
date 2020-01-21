package typings.casperjs.mod

import typings.casperjs.AnonUrl
import typings.casperjs.casperjsBooleans.`false`
import typings.casperjs.casperjsBooleans.`true`
import typings.phantomjs.ClipRect
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("casperjs", "Casper")
@js.native
class Casper protected () extends js.Object {
  def this(options: CasperOptions) = this()
  // Properties
  var __utils__ : ClientUtils = js.native
  var options: CasperOptions = js.native
  var test: Tester = js.native
  // Methods
  def back(): Casper = js.native
  def base64encode(url: String): String = js.native
  def base64encode(url: String, method: String): String = js.native
  def base64encode(url: String, method: String, data: js.Any): String = js.native
  def bypass(nb: Double): Casper = js.native
  def capture(targetFilePath: String): Casper = js.native
  def capture(targetFilePath: String, clipRect: ClipRect): Casper = js.native
  def capture(targetFilePath: String, clipRect: ClipRect, imgOptions: ImgOptions): Casper = js.native
  def captureBase64(format: String): String = js.native
  def captureBase64(format: String, area: String): String = js.native
  def captureBase64(format: String, area: CasperSelector): String = js.native
  def captureBase64(format: String, area: ClipRect): String = js.native
  def captureSelector(targetFile: String, selector: String): Casper = js.native
  def captureSelector(targetFile: String, selector: String, imgOptions: ImgOptions): Casper = js.native
  def clear(): Casper = js.native
  def clearCache(): Casper = js.native
  def clearMemoryCache(): Casper = js.native
  def click(selector: String): Boolean = js.native
  def click(selector: String, X: String): Boolean = js.native
  def click(selector: String, X: String, Y: String): Boolean = js.native
  def click(selector: String, X: String, Y: Double): Boolean = js.native
  def click(selector: String, X: Double): Boolean = js.native
  def click(selector: String, X: Double, Y: String): Boolean = js.native
  def click(selector: String, X: Double, Y: Double): Boolean = js.native
  def clickLabel(label: String): Boolean = js.native
  def clickLabel(label: String, tag: String): Boolean = js.native
  def debugHTML(): Casper = js.native
  def debugHTML(selector: String): Casper = js.native
  def debugHTML(selector: String, outer: Boolean): Casper = js.native
  def debugPage(): Casper = js.native
  def die(message: String): Casper = js.native
  def die(message: String, status: Double): Casper = js.native
  def download(url: String, target: String): Casper = js.native
  def download(url: String, target: String, method: String): Casper = js.native
  def download(url: String, target: String, method: String, data: js.Any): Casper = js.native
  def each[T](
    array: js.Array[T],
    fn: js.ThisFunction2[/* this */ this.type, /* item */ T, /* index */ Double, Unit]
  ): Casper = js.native
  def eachThen(array: js.Array[_]): Casper = js.native
  def eachThen(array: js.Array[_], `then`: FunctionThen): Casper = js.native
  def echo(message: String): Casper = js.native
  def echo(message: String, style: String): Casper = js.native
  def evaluate[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
  def evaluateOrDie(fn: js.Function0[_]): Casper = js.native
  def evaluateOrDie(fn: js.Function0[_], message: String): Casper = js.native
  def evaluateOrDie(fn: js.Function0[_], message: String, status: Double): Casper = js.native
  def exists(selector: String): Boolean = js.native
  def exit(): Casper = js.native
  def exit(status: Double): Casper = js.native
  def fetchText(selector: String): String = js.native
  def fill(selector: String, values: js.Any): Unit = js.native
  def fill(selector: String, values: js.Any, submit: Boolean): Unit = js.native
  def fillSelectors(selector: String, values: js.Any): Unit = js.native
  def fillSelectors(selector: String, values: js.Any, submit: Boolean): Unit = js.native
  def fillXPath(selector: String, values: js.Any): Unit = js.native
  def fillXPath(selector: String, values: js.Any, submit: Boolean): Unit = js.native
  def forward(): Casper = js.native
  def getCurrentUrl(): String = js.native
  def getElementAttribute(selector: String, attribute: String): String = js.native
  def getElementBounds(selector: String): ElementBounds | Null = js.native
  def getElementBounds(selector: String, page: Boolean): ElementBounds | Null = js.native
  def getElementInfo(selector: String): ElementInfo = js.native
  def getElementsAttribute(selector: String, attribute: String): String = js.native
  def getElementsBounds(selector: String): js.Array[ElementBounds] = js.native
  def getElementsInfo(selector: String): ElementInfo = js.native
  def getFormValues(selector: String): js.Any = js.native
  def getGlobal(name: String): js.Any = js.native
  def getHTML(): String = js.native
  def getHTML(selector: String): String = js.native
  def getHTML(selector: String, outer: Boolean): String = js.native
  def getPageContent(): String = js.native
  def getTitle(): String = js.native
  def log(message: String): Casper = js.native
  def log(message: String, level: String): Casper = js.native
  def log(message: String, level: String, space: String): Casper = js.native
  def mouseEvent(`type`: String, selector: String): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: String): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: String, Y: String): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: String, Y: Double): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: Double): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: Double, Y: String): Boolean = js.native
  def mouseEvent(`type`: String, selector: String, X: Double, Y: Double): Boolean = js.native
  def newPage(): js.Any = js.native
  def open(location: String, settings: OpenSettings): Casper = js.native
  def reload(): Casper = js.native
  def reload(`then`: FunctionThen): Casper = js.native
  def repeat(times: Double, `then`: FunctionThen): Casper = js.native
  def resourceExists(test: String): Boolean = js.native
  def resourceExists(test: js.Function): Boolean = js.native
  def resourceExists(test: RegExp): Boolean = js.native
  def run(): Casper = js.native
  def run(onComplete: js.Function): Casper = js.native
  def run(onComplete: js.Function, time: Double): Casper = js.native
  def scrollTo(x: Double, y: Double): Casper = js.native
  def scrollToBottom(): Casper = js.native
  def sendKeys(selector: String, keys: String): Casper = js.native
  def sendKeys(selector: String, keys: String, options: KeyOptions): Casper = js.native
  def setHttpAuth(username: String, password: String): Casper = js.native
  def setMaxListeners(maxListeners: Double): Casper = js.native
  def start(): Casper = js.native
  def start(url: String): Casper = js.native
  def start(url: String, `then`: FunctionThen): Casper = js.native
  def status(): Double = js.native
  @JSName("status")
  def status_false(asString: `false`): Double = js.native
  @JSName("status")
  def status_true(asString: `true`): String = js.native
  def switchToFrame(frameInfo: String): Casper = js.native
  def switchToFrame(frameInfo: Double): Casper = js.native
  def switchToMainFrame(): Casper = js.native
  def switchToParentFrame(): Casper = js.native
  def `then`(fn: js.ThisFunction0[/* this */ this.type, Unit]): Casper = js.native
  def thenBypass(nb: Double): Casper = js.native
  def thenBypassIf(condition: js.Any, nb: Double): Casper = js.native
  def thenBypassUnless(condition: js.Any, nb: Double): Casper = js.native
  def thenClick(selector: String): Casper = js.native
  def thenClick(selector: String, `then`: FunctionThen): Casper = js.native
  def thenEvaluate(fn: js.Function0[_], args: js.Any*): Casper = js.native
  def thenOpen(location: String): Casper = js.native
  def thenOpen(location: String, options: OpenSettings): Casper = js.native
  def thenOpen(location: String, options: OpenSettings, `then`: js.Function1[/* response */ HttpResponse, Unit]): Casper = js.native
  def thenOpen(location: String, `then`: js.Function1[/* response */ HttpResponse, Unit]): Casper = js.native
  def thenOpenAndEvaluate(location: String): Casper = js.native
  def thenOpenAndEvaluate(location: String, `then`: FunctionThen, args: js.Any*): Casper = js.native
  def unwait(): Casper = js.native
  // 2017-10-19 Doc said returning String but code return Casper object.
  def userAgent(agent: String): Casper = js.native
  def viewport(width: Double, height: Double): Casper = js.native
  def viewport(width: Double, height: Double, `then`: FunctionThen): Casper = js.native
  def visible(selector: String): Boolean = js.native
  def wait(timeout: Double): Casper = js.native
  def wait(timeout: Double, `then`: FunctionThen): Casper = js.native
  def waitFor(testFx: js.Function): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitFor(testFx: js.Function, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitFor(
    testFx: js.Function,
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: Double,
    details: js.Any
  ): Casper = js.native
  def waitForAlert(`then`: FunctionThen): Casper = js.native
  def waitForAlert(`then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForAlert(`then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForExec(command: String, parameter: js.Array[String]): Casper = js.native
  def waitForExec(command: String, parameter: js.Array[String], `then`: FunctionThen): Casper = js.native
  def waitForExec(command: String, parameter: js.Array[String], `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForExec(
    command: String,
    parameter: js.Array[String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: Double
  ): Casper = js.native
  def waitForExec(command: Null, parameter: js.Array[String]): Casper = js.native
  def waitForExec(command: Null, parameter: js.Array[String], `then`: FunctionThen): Casper = js.native
  def waitForExec(command: Null, parameter: js.Array[String], `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForExec(
    command: Null,
    parameter: js.Array[String],
    `then`: FunctionThen,
    onTimeout: FunctionOnTimeout,
    timeout: Double
  ): Casper = js.native
  def waitForPopup(urlPattern: String): Casper = js.native
  def waitForPopup(urlPattern: String, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: String, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: String, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForPopup(urlPattern: Double): Casper = js.native
  def waitForPopup(urlPattern: Double, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: Double, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: Double, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: FindByUrlNameTitle, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForPopup(urlPattern: RegExp): Casper = js.native
  def waitForPopup(urlPattern: RegExp, `then`: FunctionThen): Casper = js.native
  def waitForPopup(urlPattern: RegExp, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForPopup(urlPattern: RegExp, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForResource(testFx: String): Casper = js.native
  def waitForResource(testFx: String, `then`: FunctionThen): Casper = js.native
  def waitForResource(testFx: String, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForResource(testFx: String, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForResource(testFx: js.Function1[/* resource */ AnonUrl, Boolean]): Casper = js.native
  def waitForResource(testFx: js.Function1[/* resource */ AnonUrl, Boolean], `then`: FunctionThen): Casper = js.native
  def waitForResource(
    testFx: js.Function1[/* resource */ AnonUrl, Boolean],
    `then`: FunctionThen,
    onTimeout: js.Function
  ): Casper = js.native
  def waitForResource(
    testFx: js.Function1[/* resource */ AnonUrl, Boolean],
    `then`: FunctionThen,
    onTimeout: js.Function,
    timeout: Double
  ): Casper = js.native
  def waitForResource(testFx: RegExp): Casper = js.native
  def waitForResource(testFx: RegExp, `then`: FunctionThen): Casper = js.native
  def waitForResource(testFx: RegExp, `then`: FunctionThen, onTimeout: js.Function): Casper = js.native
  def waitForResource(testFx: RegExp, `then`: FunctionThen, onTimeout: js.Function, timeout: Double): Casper = js.native
  def waitForSelector(selector: String): Casper = js.native
  def waitForSelector(selector: String, `then`: FunctionThen): Casper = js.native
  def waitForSelector(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForSelector(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForSelectorTextChange(selectors: String): Casper = js.native
  def waitForSelectorTextChange(selectors: String, `then`: FunctionThen): Casper = js.native
  def waitForSelectorTextChange(selectors: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForSelectorTextChange(selectors: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForText(pattern: String): Casper = js.native
  def waitForText(pattern: String, `then`: FunctionThen): Casper = js.native
  def waitForText(pattern: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForText(pattern: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForText(pattern: RegExp): Casper = js.native
  def waitForText(pattern: RegExp, `then`: FunctionThen): Casper = js.native
  def waitForText(pattern: RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForText(pattern: RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForUrl(url: String): Casper = js.native
  def waitForUrl(url: String, `then`: FunctionThen): Casper = js.native
  def waitForUrl(url: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForUrl(url: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitForUrl(url: RegExp): Casper = js.native
  def waitForUrl(url: RegExp, `then`: FunctionThen): Casper = js.native
  def waitForUrl(url: RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitForUrl(url: RegExp, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitUntilVisible(selector: String): Casper = js.native
  def waitUntilVisible(selector: String, `then`: FunctionThen): Casper = js.native
  def waitUntilVisible(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitUntilVisible(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitWhileSelector(selector: String): Casper = js.native
  def waitWhileSelector(selector: String, `then`: FunctionThen): Casper = js.native
  def waitWhileSelector(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitWhileSelector(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def waitWhileVisible(selector: String): Casper = js.native
  def waitWhileVisible(selector: String, `then`: FunctionThen): Casper = js.native
  def waitWhileVisible(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout): Casper = js.native
  def waitWhileVisible(selector: String, `then`: FunctionThen, onTimeout: FunctionOnTimeout, timeout: Double): Casper = js.native
  def warn(message: String): Casper = js.native
  def withFrame(frameInfo: String, `then`: FunctionThen): Casper = js.native
  def withFrame(frameInfo: Double, `then`: FunctionThen): Casper = js.native
  def withPopup(popupInfo: String, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: Double, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: FindByUrlNameTitle, step: FunctionThen): Casper = js.native
  def withPopup(popupInfo: RegExp, step: FunctionThen): Casper = js.native
  def withSelectorScope(selector: String, `then`: FunctionThen): Casper = js.native
  def zoom(factor: Double): Casper = js.native
}

