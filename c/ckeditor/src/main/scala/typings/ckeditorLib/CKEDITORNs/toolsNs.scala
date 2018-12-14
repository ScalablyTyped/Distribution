package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.tools")
@js.native
object toolsNs extends js.Object {
  def addFunction(fn: js.Function0[_]): scala.Double = js.native
  def addFunction(fn: js.Function0[_], scope: js.Any): scala.Double = js.native
  def arrayCompare(arrayA: js.Array[_], arrayB: js.Array[_]): scala.Boolean = js.native
  def clone(source: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def copy(source: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def createClass(definition: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def cssStyleToDomStyle(cssName: java.lang.String): java.lang.String = js.native
  def cssVendorPrefix(property: java.lang.String, value: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = js.native
  def cssVendorPrefix(property: java.lang.String, value: java.lang.String, asString: scala.Boolean): org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = js.native
  def defer[T /* <: js.Function */](fn: T): T = js.native
  def enableHtml5Elements(doc: stdLib.Document): scala.Unit = js.native
  def enableHtml5Elements(doc: stdLib.DocumentFragment): scala.Unit = js.native
  def enableHtml5Elements(doc: stdLib.DocumentFragment, withAppend: scala.Boolean): scala.Unit = js.native
  def enableHtml5Elements(doc: stdLib.Document, withAppend: scala.Boolean): scala.Unit = js.native
  def escapeCss(selector: java.lang.String): java.lang.String = js.native
  def eventsBuffer(minInterval: scala.Double, output: js.Function0[scala.Unit], scopeObj: js.Any): ckeditorLib.Anon_Input = js.native
  def extend(
    target: org.scalablytyped.runtime.StringDictionary[js.Any],
    source: org.scalablytyped.runtime.StringDictionary[js.Any],
    overwrite: scala.Boolean,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def fixDomain(): scala.Boolean = js.native
  def genKey(subKey: java.lang.String): java.lang.String = js.native
  def getCookie(name: java.lang.String): java.lang.String = js.native
  def getCsrfToken(): java.lang.String = js.native
  def getIndex[T](array: js.Array[T], compareFunction: js.Function1[/* element */ T, scala.Boolean]): scala.Double = js.native
  def getMouseButton(evt: ckeditorLib.CKEDITORNs.domNs.event): scala.Boolean = js.native
  def getNextId(): java.lang.String = js.native
  def getNextNumber(): scala.Double = js.native
  def getUniqueId(): java.lang.String = js.native
  def htmlDecode(text: java.lang.String): java.lang.String = js.native
  def htmlDecodeAttr(text: java.lang.String): java.lang.String = js.native
  def htmlEncode(text: java.lang.String): java.lang.String = js.native
  def htmlEncodeAttr(text: java.lang.String): java.lang.String = js.native
  def indexOf[T](array: js.Array[T], value: T): scala.Double = js.native
  def indexOf[T](array: js.Array[T], value: js.Function1[/* el */ T, scala.Boolean]): scala.Double = js.native
  def isArray[T](`object`: js.Any): /* is Array */scala.Boolean = js.native
  def isEmpty(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
  def keystrokeToArray(lang: org.scalablytyped.runtime.StringDictionary[js.Any], keystroke: scala.Double): ckeditorLib.Anon_AriaDisplay = js.native
  def keystrokeToString(lang: org.scalablytyped.runtime.StringDictionary[js.Any], keystroke: scala.Double): ckeditorLib.Anon_Aria = js.native
  def ltrim(str: java.lang.String): java.lang.String = js.native
  def normalizeCssText(styleText: java.lang.String, nativeNormalize: scala.Boolean): java.lang.String = js.native
  def normalizeHex(styleText: java.lang.String): java.lang.String = js.native
  def objectCompare(
    left: org.scalablytyped.runtime.StringDictionary[js.Any],
    right: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
  def objectCompare(
    left: org.scalablytyped.runtime.StringDictionary[js.Any],
    right: org.scalablytyped.runtime.StringDictionary[js.Any],
    onlyLef: scala.Boolean
  ): scala.Boolean = js.native
  def objectKeys(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Array[java.lang.String] = js.native
  def `override`[T /* <: js.Function */](originalFunction: T, functionBuilder: js.Function1[/* originalFunction */ T, T]): T = js.native
  def parseCssText(styleText: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def parseCssText(styleText: java.lang.String, normalize: scala.Boolean): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def parseCssText(styleText: java.lang.String, normalize: scala.Boolean, nativeNormalize: scala.Boolean): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def prototypedCopy(source: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def removeFunction(ref: scala.Double): scala.Unit = js.native
  def repeat(str: java.lang.String, times: scala.Double): java.lang.String = js.native
  def rtrim(str: java.lang.String): java.lang.String = js.native
  def search[T](array: js.Array[T], value: T): T = js.native
  def search[T](array: js.Array[T], value: js.Function1[/* element */ T, scala.Boolean]): T = js.native
  def setCookie(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setTimeout(func: js.Function): scala.Double = js.native
  def setTimeout(func: js.Function, milliseconds: scala.Double): scala.Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: scala.Double,
    scope: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: scala.Double,
    scope: org.scalablytyped.runtime.StringDictionary[js.Any],
    args: js.Any
  ): scala.Double = js.native
  def setTimeout(
    func: js.Function,
    milliseconds: scala.Double,
    scope: org.scalablytyped.runtime.StringDictionary[js.Any],
    args: js.Any,
    ownerWindow: ckeditorLib.Window
  ): scala.Double = js.native
  def transformPlainTextToHtml(text: java.lang.String, etnerMode: scala.Double): java.lang.String = js.native
  def trim(str: java.lang.String): java.lang.String = js.native
  def tryThese(fn: js.Array[js.Function]): js.Any = js.native
  def writeCssText(styles: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def writeCssText(styles: org.scalablytyped.runtime.StringDictionary[js.Any], sort: scala.Boolean): java.lang.String = js.native
  @JSName("array")
  @js.native
  object arrayNs extends js.Object {
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
    ): scala.Boolean = js.native
    def every[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
      thisArg: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): scala.Boolean = js.native
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
    ): js.Array[T] = js.native
    def filter[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
      thisArg: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): js.Array[T] = js.native
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
    ): scala.Unit = js.native
    def forEach[T](
      array: js.Array[T],
      fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit],
      thisArg: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): scala.Unit = js.native
    def isArray(`object`: js.Any): scala.Boolean = js.native
    def map[T, K](array: js.Array[T], fn: js.Function1[/* value */ T, K]): js.Array[K] = js.native
    def map[T, K](
      array: js.Array[T],
      fn: js.Function1[/* value */ T, K],
      thisArg: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): js.Array[K] = js.native
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ scala.Double, /* array */ js.Array[T], K],
      initial: K
    ): K = js.native
    def reduce[T, K](
      array: js.Array[T],
      fn: js.Function4[/* accumulator */ K, /* a */ T, /* index */ scala.Double, /* array */ js.Array[T], K],
      initial: K,
      thisArg: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): K = js.native
  }
  
  @JSName("object")
  @js.native
  object objectNs extends js.Object {
    def findKey(obj: org.scalablytyped.runtime.StringDictionary[js.Any], value: js.Any): java.lang.String = js.native
    def merge(
      obj1: org.scalablytyped.runtime.StringDictionary[js.Any],
      obj2: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  @JSName("style")
  @js.native
  object styleNs extends js.Object {
    @JSName("parse")
    @js.native
    object parseNs extends js.Object {
      def background(value: java.lang.String): ckeditorLib.Anon_ColorUnprocessed = js.native
      def border(value: java.lang.String): ckeditorLib.Anon_Color = js.native
      def margin(value: java.lang.String): ckeditorLib.Anon_Bottom = js.native
    }
    
  }
  
}

