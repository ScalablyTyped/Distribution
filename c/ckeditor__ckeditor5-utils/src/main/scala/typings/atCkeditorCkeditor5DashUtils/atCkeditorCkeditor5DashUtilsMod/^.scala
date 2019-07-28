package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atCkeditorCkeditor5DashUtils.Anon_Bottom
import typings.atCkeditorCkeditor5DashUtils.Anon_Called
import typings.atCkeditorCkeditor5DashUtils.Anon_P
import typings.atCkeditorCkeditor5DashUtils.Anon_Target
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Iterable
import typings.std.Map
import typings.std.Node
import typings.std.Partial
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOCUMENTATION_URL: String = js.native
  val EmitterMixin: Emitter = js.native
  val ObservableMixin: Observable = js.native
  def add(language: String, translations: StringDictionary[String]): Unit = js.native
  def as(Class: js.Function): Unit = js.native
  def attachLinkToDocumentation(message: String): String = js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): Double | ArrayRelation = js.native
  def count(iterator: Iterable[_]): Double = js.native
  def createElement(doc: Document, name: String): Element = js.native
  def createElement(doc: Document, name: String, attributes: js.Object): Element = js.native
  def createElement(doc: Document, name: String, attributes: js.Object, children: String): Element = js.native
  def createElement(doc: Document, name: String, attributes: js.Object, children: js.Array[Node | String]): Element = js.native
  def createElement(doc: Document, name: String, attributes: js.Object, children: Node): Element = js.native
  def createElement(doc: Document, name: String, attributes: Null, children: String): Element = js.native
  def createElement(doc: Document, name: String, attributes: Null, children: js.Array[Node | String]): Element = js.native
  def createElement(doc: Document, name: String, attributes: Null, children: Node): Element = js.native
  def diff(a: String, b: String): js.Array[Change] = js.native
  def diff(a: String, b: String, cmp: js.Function2[/* a */ String, /* b */ String, Boolean]): js.Array[Change] = js.native
  def diff(a: js.Array[String], b: js.Array[String]): js.Array[Change] = js.native
  def diff(
    a: js.Array[String],
    b: js.Array[String],
    cmp: js.Function2[/* a */ String, /* b */ String, Boolean]
  ): js.Array[Change] = js.native
  def diffToChanges(diff: js.Array[Change], output: String): js.Array[DeleteChange | InsertChange] = js.native
  def diffToChanges(diff: js.Array[Change], output: js.Array[String]): js.Array[DeleteChange | InsertChange] = js.native
  def fastDiff(oldText: String, newText: String): js.Array[DeleteChange | InsertChange] = js.native
  def first[T](iterable: Iterable[T]): T = js.native
  def getAncestors(node: Node): js.Array[Node | DocumentFragment] = js.native
  def getBorderWidths(element: HTMLElement): Anon_Bottom = js.native
  def getCode(key: String): Double = js.native
  def getCode(key: KeystrokeInfo): Double = js.native
  def getCommonAncestor(nodeA: Node, nodeB: Node): Node | DocumentFragment | Document | Null = js.native
  def getDataFromElement(el: HTMLElement): String = js.native
  def getEnvKeystrokeText(keystroke: String): String = js.native
  def getOptimalPosition(options: Options): Position = js.native
  def getPositionedAncestor(): HTMLElement | Null = js.native
  def getPositionedAncestor(element: HTMLElement): HTMLElement | Null = js.native
  def indexOf(node: Node): Double = js.native
  def insertAt(parentElement: Element, index: Double, nodeToInsert: Node): Unit = js.native
  def isCombiningMark(character: String): Boolean = js.native
  def isHighSurrogateHalf(character: String): Boolean = js.native
  def isInsideCombinedSymbol(string: String, offset: Double): Boolean = js.native
  def isInsideSurrogatePair(string: String, offset: Double): Boolean = js.native
  def isIterable(value: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  def isLowSurrogateHalf(character: String): Boolean = js.native
  def isNode(obj: js.Any): /* is std.Node */ Boolean = js.native
  def isRange(obj: js.Any): /* is std.Range */ Boolean = js.native
  def isText(obj: js.Any): /* is std.Text */ Boolean = js.native
  def isWindow(obj: js.Any): /* is std.Window */ Boolean = js.native
  def mapsEqual[K, V](mapsA: Map[K, V], mapsB: Map[K, V]): Boolean = js.native
  def mix[T](baseClass: Anon_P[T], mixins: Partial[T]*): Unit = js.native
  def nth[T](index: Double, iterable: Iterable[T]): T = js.native
  def objectToMap[T /* <: js.Object */](obj: T): Map[
    String, 
    /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def parseKeystroke(keystroke: String): Double = js.native
  def parseKeystroke(keystroke: js.Array[Double | String]): Double = js.native
  def remove(node: Node): Unit = js.native
  def scrollAncestorsToShowTarget(target: HTMLElement): Unit = js.native
  def scrollAncestorsToShowTarget(target: Range): Unit = js.native
  def scrollViewportToShowTarget(options: Anon_Target): Unit = js.native
  def setDataInElement(el: HTMLElement, data: String): Unit = js.native
  def spy(): Anon_Called = js.native
  def toMap[T /* <: js.Object */](data: T): Map[
    String, 
    /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def toMap[K /* <: String */, V](data: js.Array[js.Tuple2[K, V]]): Map[K, V] = js.native
  def toMap[K, V](data: Map[K, V]): Map[K, V] = js.native
  def toUnit(unit: String): js.Function1[/* value */ Double, String] = js.native
  def translate(language: String, translationKey: String): String = js.native
  def uid(): String = js.native
  def using(callbackOrProperty: String): Unit = js.native
  def using(callbackOrProperty: js.Function): Unit = js.native
}

