package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOCUMENTATION_URL: java.lang.String = js.native
  val EmitterMixin: Emitter = js.native
  val ObservableMixin: Observable = js.native
  val keyCodes: atCkeditorCkeditor5DashUtilsLib.Anon_0 = js.native
  def add(
    language: java.lang.String,
    translations: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): scala.Unit = js.native
  def as(Class: js.Function): scala.Unit = js.native
  def attachLinkToDocumentation(message: java.lang.String): java.lang.String = js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): scala.Double | ArrayRelation = js.native
  def count(iterator: stdLib.Iterable[_]): scala.Double = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String): stdLib.Element = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String, attributes: js.Object): stdLib.Element = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String, attributes: js.Object, children: java.lang.String): stdLib.Element = js.native
  def createElement(
    doc: stdLib.Document,
    name: java.lang.String,
    attributes: js.Object,
    children: js.Array[stdLib.Node | java.lang.String]
  ): stdLib.Element = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String, attributes: js.Object, children: stdLib.Node): stdLib.Element = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String, attributes: scala.Null, children: java.lang.String): stdLib.Element = js.native
  def createElement(
    doc: stdLib.Document,
    name: java.lang.String,
    attributes: scala.Null,
    children: js.Array[stdLib.Node | java.lang.String]
  ): stdLib.Element = js.native
  def createElement(doc: stdLib.Document, name: java.lang.String, attributes: scala.Null, children: stdLib.Node): stdLib.Element = js.native
  def diff(a: java.lang.String, b: java.lang.String): js.Array[Change] = js.native
  def diff(
    a: java.lang.String,
    b: java.lang.String,
    cmp: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Boolean]
  ): js.Array[Change] = js.native
  def diff(a: js.Array[java.lang.String], b: js.Array[java.lang.String]): js.Array[Change] = js.native
  def diff(
    a: js.Array[java.lang.String],
    b: js.Array[java.lang.String],
    cmp: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Boolean]
  ): js.Array[Change] = js.native
  def diffToChanges(diff: js.Array[Change], output: java.lang.String): js.Array[DeleteChange | InsertChange] = js.native
  def diffToChanges(diff: js.Array[Change], output: js.Array[java.lang.String]): js.Array[DeleteChange | InsertChange] = js.native
  def fastDiff(oldText: java.lang.String, newText: java.lang.String): js.Array[DeleteChange | InsertChange] = js.native
  def first[T](iterable: stdLib.Iterable[T]): T = js.native
  def getAncestors(node: stdLib.Node): js.Array[stdLib.Node | stdLib.DocumentFragment] = js.native
  def getBorderWidths(element: stdLib.HTMLElement): atCkeditorCkeditor5DashUtilsLib.Anon_Bottom = js.native
  def getCode(key: KeystrokeInfo): scala.Double = js.native
  def getCode(key: java.lang.String): scala.Double = js.native
  def getCommonAncestor(nodeA: stdLib.Node, nodeB: stdLib.Node): stdLib.Node | stdLib.DocumentFragment | stdLib.Document | scala.Null = js.native
  def getDataFromElement(el: stdLib.HTMLElement): java.lang.String = js.native
  def getEnvKeystrokeText(keystroke: java.lang.String): java.lang.String = js.native
  def getOptimalPosition(options: Options): Position = js.native
  def getPositionedAncestor(): stdLib.HTMLElement | scala.Null = js.native
  def getPositionedAncestor(element: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def indexOf(node: stdLib.Node): scala.Double = js.native
  def insertAt(parentElement: stdLib.Element, index: scala.Double, nodeToInsert: stdLib.Node): scala.Unit = js.native
  def isCombiningMark(character: java.lang.String): scala.Boolean = js.native
  def isHighSurrogateHalf(character: java.lang.String): scala.Boolean = js.native
  def isInsideCombinedSymbol(string: java.lang.String, offset: scala.Double): scala.Boolean = js.native
  def isInsideSurrogatePair(string: java.lang.String, offset: scala.Double): scala.Boolean = js.native
  def isIterable(value: js.Any): /* is std.Iterable<any> */ scala.Boolean = js.native
  def isLowSurrogateHalf(character: java.lang.String): scala.Boolean = js.native
  def isNode(obj: js.Any): /* is std.Node */ scala.Boolean = js.native
  def isRange(obj: js.Any): /* is std.Range */ scala.Boolean = js.native
  def isText(obj: js.Any): /* is std.Text */ scala.Boolean = js.native
  def isWindow(obj: js.Any): /* is std.Window */ scala.Boolean = js.native
  def mapsEqual[K, V](mapsA: stdLib.Map[K, V], mapsB: stdLib.Map[K, V]): scala.Boolean = js.native
  def mix[T](baseClass: atCkeditorCkeditor5DashUtilsLib.Anon_P[T], mixins: stdLib.Partial[T]*): scala.Unit = js.native
  def nth[T](index: scala.Double, iterable: stdLib.Iterable[T]): T = js.native
  def objectToMap[T /* <: js.Object */](obj: T): stdLib.Map[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def parseKeystroke(keystroke: java.lang.String): scala.Double = js.native
  def parseKeystroke(keystroke: js.Array[scala.Double | java.lang.String]): scala.Double = js.native
  def remove(node: stdLib.Node): scala.Unit = js.native
  def scrollAncestorsToShowTarget(target: stdLib.HTMLElement): scala.Unit = js.native
  def scrollAncestorsToShowTarget(target: stdLib.Range): scala.Unit = js.native
  def scrollViewportToShowTarget(options: atCkeditorCkeditor5DashUtilsLib.Anon_Target): scala.Unit = js.native
  def setDataInElement(el: stdLib.HTMLElement, data: java.lang.String): scala.Unit = js.native
  def spy(): atCkeditorCkeditor5DashUtilsLib.Anon_Called = js.native
  def toMap[T /* <: js.Object */](data: T): stdLib.Map[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def toMap[K /* <: java.lang.String */, V](data: js.Array[js.Tuple2[K, V]]): stdLib.Map[K, V] = js.native
  def toMap[K, V](data: stdLib.Map[K, V]): stdLib.Map[K, V] = js.native
  def toUnit(unit: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def translate(language: java.lang.String, translationKey: java.lang.String): java.lang.String = js.native
  def uid(): java.lang.String = js.native
  def using(callbackOrProperty: java.lang.String): scala.Unit = js.native
  def using(callbackOrProperty: js.Function): scala.Unit = js.native
}

