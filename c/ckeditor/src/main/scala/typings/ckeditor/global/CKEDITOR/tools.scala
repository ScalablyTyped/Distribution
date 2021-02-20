package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Window
import typings.ckeditor.anon.Aria
import typings.ckeditor.anon.Bottom
import typings.ckeditor.anon.Color
import typings.ckeditor.anon.Display
import typings.ckeditor.anon.Input
import typings.ckeditor.anon.Style
import typings.std.Document
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  @JSGlobal("CKEDITOR.tools.addFunction")
  @js.native
  def addFunction(fn: js.Function0[_]): Double = js.native
  @JSGlobal("CKEDITOR.tools.addFunction")
  @js.native
  def addFunction(fn: js.Function0[_], scope: js.Any): Double = js.native
  
  object array {
    
    @JSGlobal("CKEDITOR.tools.array.every")
    @js.native
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): Boolean = js.native
    @JSGlobal("CKEDITOR.tools.array.every")
    @js.native
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): Boolean = js.native
    
    @JSGlobal("CKEDITOR.tools.array.filter")
    @js.native
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): js.Array[T] = js.native
    @JSGlobal("CKEDITOR.tools.array.filter")
    @js.native
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): js.Array[T] = js.native
    
    @JSGlobal("CKEDITOR.tools.array.forEach")
    @js.native
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]
    ): Unit = js.native
    @JSGlobal("CKEDITOR.tools.array.forEach")
    @js.native
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: StringDictionary[js.Any]
    ): Unit = js.native
    
    @JSGlobal("CKEDITOR.tools.array.isArray")
    @js.native
    def isArray(`object`: js.Any): Boolean = js.native
    
    @JSGlobal("CKEDITOR.tools.array.map")
    @js.native
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K]): js.Array[K] = js.native
    @JSGlobal("CKEDITOR.tools.array.map")
    @js.native
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K], thisArg: StringDictionary[js.Any]): js.Array[K] = js.native
    
    @JSGlobal("CKEDITOR.tools.array.reduce")
    @js.native
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K
    ): K = js.native
    @JSGlobal("CKEDITOR.tools.array.reduce")
    @js.native
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K,
      thisArg: StringDictionary[js.Any]
    ): K = js.native
  }
  
  @JSGlobal("CKEDITOR.tools.arrayCompare")
  @js.native
  def arrayCompare(arrayA: js.Array[_], arrayB: js.Array[_]): Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.clone")
  @js.native
  def clone_(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  @JSGlobal("CKEDITOR.tools.copy")
  @js.native
  def copy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  @JSGlobal("CKEDITOR.tools.createClass")
  @js.native
  def createClass(definition: StringDictionary[js.Any]): js.Any = js.native
  
  @JSGlobal("CKEDITOR.tools.cssStyleToDomStyle")
  @js.native
  def cssStyleToDomStyle(cssName: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.cssVendorPrefix")
  @js.native
  def cssVendorPrefix(property: String, value: String): StringDictionary[String | Double] = js.native
  @JSGlobal("CKEDITOR.tools.cssVendorPrefix")
  @js.native
  def cssVendorPrefix(property: String, value: String, asString: Boolean): StringDictionary[String | Double] = js.native
  
  @JSGlobal("CKEDITOR.tools.defer")
  @js.native
  def defer[T /* <: js.Function */](fn: T): T = js.native
  
  @JSGlobal("CKEDITOR.tools.enableHtml5Elements")
  @js.native
  def enableHtml5Elements(doc: Document): Unit = js.native
  @JSGlobal("CKEDITOR.tools.enableHtml5Elements")
  @js.native
  def enableHtml5Elements(doc: DocumentFragment): Unit = js.native
  @JSGlobal("CKEDITOR.tools.enableHtml5Elements")
  @js.native
  def enableHtml5Elements(doc: DocumentFragment, withAppend: Boolean): Unit = js.native
  @JSGlobal("CKEDITOR.tools.enableHtml5Elements")
  @js.native
  def enableHtml5Elements(doc: Document, withAppend: Boolean): Unit = js.native
  
  @JSGlobal("CKEDITOR.tools.escapeCss")
  @js.native
  def escapeCss(selector: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.eventsBuffer")
  @js.native
  def eventsBuffer(minInterval: Double, output: js.Function0[Unit], scopeObj: js.Any): Input = js.native
  
  @JSGlobal("CKEDITOR.tools.extend")
  @js.native
  def extend(
    target: StringDictionary[js.Any],
    source: StringDictionary[js.Any],
    overwrite: Boolean,
    properties: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = js.native
  
  @JSGlobal("CKEDITOR.tools.fixDomain")
  @js.native
  def fixDomain(): Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.genKey")
  @js.native
  def genKey(subKey: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.getCookie")
  @js.native
  def getCookie(name: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.getCsrfToken")
  @js.native
  def getCsrfToken(): String = js.native
  
  @JSGlobal("CKEDITOR.tools.getIndex")
  @js.native
  def getIndex[T](array: js.Array[T], compareFunction: js.Function1[/* element */ T, Boolean]): Double = js.native
  
  @JSGlobal("CKEDITOR.tools.getMouseButton")
  @js.native
  def getMouseButton(evt: typings.ckeditor.CKEDITOR.dom.event): Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.getNextId")
  @js.native
  def getNextId(): String = js.native
  
  @JSGlobal("CKEDITOR.tools.getNextNumber")
  @js.native
  def getNextNumber(): Double = js.native
  
  @JSGlobal("CKEDITOR.tools.getUniqueId")
  @js.native
  def getUniqueId(): String = js.native
  
  @JSGlobal("CKEDITOR.tools.htmlDecode")
  @js.native
  def htmlDecode(text: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.htmlDecodeAttr")
  @js.native
  def htmlDecodeAttr(text: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.htmlEncode")
  @js.native
  def htmlEncode(text: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.htmlEncodeAttr")
  @js.native
  def htmlEncodeAttr(text: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], value: T): Double = js.native
  @JSGlobal("CKEDITOR.tools.indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], value: js.Function1[/* el */ T, Boolean]): Double = js.native
  
  @JSGlobal("CKEDITOR.tools.isArray")
  @js.native
  def isArray[T](`object`: js.Any): /* is std.Array<T> */ Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.isEmpty")
  @js.native
  def isEmpty(`object`: StringDictionary[js.Any]): Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.keystrokeToArray")
  @js.native
  def keystrokeToArray(lang: StringDictionary[js.Any], keystroke: Double): Aria = js.native
  
  @JSGlobal("CKEDITOR.tools.keystrokeToString")
  @js.native
  def keystrokeToString(lang: StringDictionary[js.Any], keystroke: Double): Display = js.native
  
  @JSGlobal("CKEDITOR.tools.ltrim")
  @js.native
  def ltrim(str: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.normalizeCssText")
  @js.native
  def normalizeCssText(styleText: String, nativeNormalize: Boolean): String = js.native
  
  @JSGlobal("CKEDITOR.tools.normalizeHex")
  @js.native
  def normalizeHex(styleText: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.objectCompare")
  @js.native
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any]): Boolean = js.native
  @JSGlobal("CKEDITOR.tools.objectCompare")
  @js.native
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any], onlyLef: Boolean): Boolean = js.native
  
  @JSGlobal("CKEDITOR.tools.objectKeys")
  @js.native
  def objectKeys(obj: StringDictionary[js.Any]): js.Array[String] = js.native
  
  @JSGlobal("CKEDITOR.tools.parseCssText")
  @js.native
  def parseCssText(styleText: String): StringDictionary[js.Any] = js.native
  @JSGlobal("CKEDITOR.tools.parseCssText")
  @js.native
  def parseCssText(styleText: String, normalize: js.UndefOr[scala.Nothing], nativeNormalize: Boolean): StringDictionary[js.Any] = js.native
  @JSGlobal("CKEDITOR.tools.parseCssText")
  @js.native
  def parseCssText(styleText: String, normalize: Boolean): StringDictionary[js.Any] = js.native
  @JSGlobal("CKEDITOR.tools.parseCssText")
  @js.native
  def parseCssText(styleText: String, normalize: Boolean, nativeNormalize: Boolean): StringDictionary[js.Any] = js.native
  
  @JSGlobal("CKEDITOR.tools.prototypedCopy")
  @js.native
  def prototypedCopy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  @JSGlobal("CKEDITOR.tools.removeFunction")
  @js.native
  def removeFunction(ref: Double): Unit = js.native
  
  @JSGlobal("CKEDITOR.tools.repeat")
  @js.native
  def repeat(str: String, times: Double): String = js.native
  
  @JSGlobal("CKEDITOR.tools.rtrim")
  @js.native
  def rtrim(str: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.search")
  @js.native
  def search[T](array: js.Array[T], value: T): T = js.native
  @JSGlobal("CKEDITOR.tools.search")
  @js.native
  def search[T](array: js.Array[T], value: js.Function1[/* element */ T, Boolean]): T = js.native
  
  @JSGlobal("CKEDITOR.tools.setCookie")
  @js.native
  def setCookie(name: String, value: String): Unit = js.native
  
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.Any
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function, milliseconds: js.UndefOr[scala.Nothing], scope: StringDictionary[js.Any]): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.Any
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: js.UndefOr[scala.Nothing],
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function, milliseconds: Double): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: js.UndefOr[scala.Nothing],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: js.UndefOr[scala.Nothing], args: js.Any): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: js.UndefOr[scala.Nothing],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any]): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: js.UndefOr[scala.Nothing],
    ownerWindow: Window
  ): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any], args: js.Any): Double = js.native
  @JSGlobal("CKEDITOR.tools.setTimeout")
  @js.native
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = js.native
  
  object style {
    
    object parse {
      
      @JSGlobal("CKEDITOR.tools.style.parse.background")
      @js.native
      def background(value: String): Color = js.native
      
      @JSGlobal("CKEDITOR.tools.style.parse.border")
      @js.native
      def border(value: String): Style = js.native
      
      @JSGlobal("CKEDITOR.tools.style.parse.margin")
      @js.native
      def margin(value: String): Bottom = js.native
    }
  }
  
  @JSGlobal("CKEDITOR.tools.transformPlainTextToHtml")
  @js.native
  def transformPlainTextToHtml(text: String, etnerMode: Double): String = js.native
  
  @JSGlobal("CKEDITOR.tools.trim")
  @js.native
  def trim(str: String): String = js.native
  
  @JSGlobal("CKEDITOR.tools.tryThese")
  @js.native
  def tryThese(fn: js.Array[js.Function]): js.Any = js.native
  
  @JSGlobal("CKEDITOR.tools.writeCssText")
  @js.native
  def writeCssText(styles: StringDictionary[js.Any]): String = js.native
  @JSGlobal("CKEDITOR.tools.writeCssText")
  @js.native
  def writeCssText(styles: StringDictionary[js.Any], sort: Boolean): String = js.native
  
  object `object` {
    
    @JSGlobal("CKEDITOR.tools.object.findKey")
    @js.native
    def findKey(obj: StringDictionary[js.Any], value: js.Any): String = js.native
    
    @JSGlobal("CKEDITOR.tools.object.merge")
    @js.native
    def merge(obj1: StringDictionary[js.Any], obj2: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  }
  
  @JSGlobal("CKEDITOR.tools.override")
  @js.native
  def `override`[T /* <: js.Function */](originalFunction: T, functionBuilder: js.Function1[/* originalFunction */ T, T]): T = js.native
}
