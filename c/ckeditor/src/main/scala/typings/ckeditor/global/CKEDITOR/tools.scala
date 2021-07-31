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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  @JSGlobal("CKEDITOR.tools")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addFunction(fn: js.Function0[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("addFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def addFunction(fn: js.Function0[js.Any], scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addFunction")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object array {
    
    @JSGlobal("CKEDITOR.tools.array")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    @scala.inline
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: StringDictionary[js.Any]
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    @scala.inline
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: StringDictionary[js.Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def isArray(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
    @scala.inline
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K], thisArg: StringDictionary[js.Any]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
    
    @scala.inline
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K
    ): K = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[K]
    @scala.inline
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ Double, /* array */ js.Array[T], K],
      initial: K,
      thisArg: StringDictionary[js.Any]
    ): K = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[K]
  }
  
  @scala.inline
  def arrayCompare(arrayA: js.Array[js.Any], arrayB: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayCompare")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def clone_(source: StringDictionary[js.Any]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def copy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def createClass(definition: StringDictionary[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(definition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def cssStyleToDomStyle(cssName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssStyleToDomStyle")(cssName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def cssVendorPrefix(property: String, value: String): StringDictionary[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssVendorPrefix")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | Double]]
  @scala.inline
  def cssVendorPrefix(property: String, value: String, asString: Boolean): StringDictionary[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssVendorPrefix")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], asString.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | Double]]
  
  @scala.inline
  def defer[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def enableHtml5Elements(doc: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableHtml5Elements")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableHtml5Elements(doc: DocumentFragment): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableHtml5Elements")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableHtml5Elements(doc: DocumentFragment, withAppend: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHtml5Elements")(doc.asInstanceOf[js.Any], withAppend.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def enableHtml5Elements(doc: Document, withAppend: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHtml5Elements")(doc.asInstanceOf[js.Any], withAppend.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def escapeCss(selector: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeCss")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def eventsBuffer(minInterval: Double, output: js.Function0[Unit], scopeObj: js.Any): Input = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsBuffer")(minInterval.asInstanceOf[js.Any], output.asInstanceOf[js.Any], scopeObj.asInstanceOf[js.Any])).asInstanceOf[Input]
  
  @scala.inline
  def extend(
    target: StringDictionary[js.Any],
    source: StringDictionary[js.Any],
    overwrite: Boolean,
    properties: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def fixDomain(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fixDomain")().asInstanceOf[Boolean]
  
  @scala.inline
  def genKey(subKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genKey")(subKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getCookie(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getCsrfToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCsrfToken")().asInstanceOf[String]
  
  @scala.inline
  def getIndex[T](array: js.Array[T], compareFunction: js.Function1[/* element */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")(array.asInstanceOf[js.Any], compareFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getMouseButton(evt: typings.ckeditor.CKEDITOR.dom.event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseButton")(evt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getNextId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")().asInstanceOf[String]
  
  @scala.inline
  def getNextNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextNumber")().asInstanceOf[Double]
  
  @scala.inline
  def getUniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueId")().asInstanceOf[String]
  
  @scala.inline
  def htmlDecode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def htmlDecodeAttr(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecodeAttr")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def htmlEncode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def htmlEncodeAttr(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncodeAttr")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def indexOf[T](array: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf[T](array: js.Array[T], value: js.Function1[/* el */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isArray[T](`object`: js.Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  @scala.inline
  def isEmpty(`object`: StringDictionary[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def keystrokeToArray(lang: StringDictionary[js.Any], keystroke: Double): Aria = (^.asInstanceOf[js.Dynamic].applyDynamic("keystrokeToArray")(lang.asInstanceOf[js.Any], keystroke.asInstanceOf[js.Any])).asInstanceOf[Aria]
  
  @scala.inline
  def keystrokeToString(lang: StringDictionary[js.Any], keystroke: Double): Display = (^.asInstanceOf[js.Dynamic].applyDynamic("keystrokeToString")(lang.asInstanceOf[js.Any], keystroke.asInstanceOf[js.Any])).asInstanceOf[Display]
  
  @scala.inline
  def ltrim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ltrim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeCssText(styleText: String, nativeNormalize: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeCssText")(styleText.asInstanceOf[js.Any], nativeNormalize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def normalizeHex(styleText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHex")(styleText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object `object` {
    
    @JSGlobal("CKEDITOR.tools.object")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def findKey(obj: StringDictionary[js.Any], value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findKey")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def merge(obj1: StringDictionary[js.Any], obj2: StringDictionary[js.Any]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  }
  
  @scala.inline
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objectCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def objectCompare(left: StringDictionary[js.Any], right: StringDictionary[js.Any], onlyLef: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objectCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], onlyLef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def objectKeys(obj: StringDictionary[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def `override`[T /* <: js.Function */](originalFunction: T, functionBuilder: js.Function1[/* originalFunction */ T, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("override")(originalFunction.asInstanceOf[js.Any], functionBuilder.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def parseCssText(styleText: String): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCssText")(styleText.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def parseCssText(styleText: String, normalize: Boolean): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssText")(styleText.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def parseCssText(styleText: String, normalize: Boolean, nativeNormalize: Boolean): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssText")(styleText.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], nativeNormalize.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def parseCssText(styleText: String, normalize: Unit, nativeNormalize: Boolean): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssText")(styleText.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], nativeNormalize.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def prototypedCopy(source: StringDictionary[js.Any]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prototypedCopy")(source.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def removeFunction(ref: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFunction")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def repeat(str: String, times: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def rtrim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rtrim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def search[T](array: js.Array[T], value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def search[T](array: js.Array[T], value: js.Function1[/* element */ T, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def setCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTimeout(func: js.Function): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double, scope: StringDictionary[js.Any], args: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(
    func: js.Function,
    milliseconds: Double,
    scope: StringDictionary[js.Any],
    args: Unit,
    ownerWindow: Window
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double, scope: Unit, args: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double, scope: Unit, args: js.Any, ownerWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Double, scope: Unit, args: Unit, ownerWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Unit, scope: StringDictionary[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Unit, scope: StringDictionary[js.Any], args: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(
    func: js.Function,
    milliseconds: Unit,
    scope: StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: Window
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(
    func: js.Function,
    milliseconds: Unit,
    scope: StringDictionary[js.Any],
    args: Unit,
    ownerWindow: Window
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Unit, scope: Unit, args: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Unit, scope: Unit, args: js.Any, ownerWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(func: js.Function, milliseconds: Unit, scope: Unit, args: Unit, ownerWindow: Window): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], ownerWindow.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object style {
    
    object parse {
      
      @JSGlobal("CKEDITOR.tools.style.parse")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def background(value: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("background")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
      
      @scala.inline
      def border(value: String): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("border")(value.asInstanceOf[js.Any]).asInstanceOf[Style]
      
      @scala.inline
      def margin(value: String): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("margin")(value.asInstanceOf[js.Any]).asInstanceOf[Bottom]
    }
  }
  
  @scala.inline
  def transformPlainTextToHtml(text: String, etnerMode: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPlainTextToHtml")(text.asInstanceOf[js.Any], etnerMode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def tryThese(fn: js.Array[js.Function]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tryThese")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def writeCssText(styles: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCssText")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def writeCssText(styles: StringDictionary[js.Any], sort: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCssText")(styles.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[String]
}
