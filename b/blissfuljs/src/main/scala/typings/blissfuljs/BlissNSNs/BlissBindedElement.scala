package typings.blissfuljs.BlissNSNs

import org.scalablytyped.runtime.StringDictionary
import typings.blissfuljs.Array
import typings.blissfuljs.Element
import typings.std.Event
import typings.std.Node
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissBindedElement[T] extends BlissNativeExtentions[T] {
  def after(element: Element): BlissDecoratedElement[T] = js.native
  def around(element: Element): BlissDecoratedElement[T] = js.native
  def attributes(attrs: js.Object): BlissDecoratedElement[T] = js.native
  def before(element: Element): BlissDecoratedElement[T] = js.native
  def contents(elements: String): BlissDecoratedElement[T] = js.native
  def contents(elements: js.Object): BlissDecoratedElement[T] = js.native
  def contents(elements: Array[_]): BlissDecoratedElement[T] = js.native
  def contents(elements: Node): BlissDecoratedElement[T] = js.native
  def contents(elements: Number): BlissDecoratedElement[T] = js.native
  def delegate(`type`: String, selector: String, callback: js.Function1[/* event */ Event, Unit]): BlissDecoratedElement[T] = js.native
  def delegate(`type`: String, selectorsToCallbacks: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissDecoratedElement[T] = js.native
  def delegate(
    typesToSelectorsToCallbacks: StringDictionary[StringDictionary[js.Function1[/* event */ Event, Unit]]]
  ): BlissDecoratedElement[T] = js.native
  def events(handlers: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissDecoratedElement[T] = js.native
  def events(handlers: Element): BlissDecoratedElement[T] = js.native
  def fire(`type`: String): BlissDecoratedElement[T] = js.native
  def fire(`type`: String, properties: StringDictionary[js.Any]): BlissDecoratedElement[T] = js.native
  def inside(element: Element): BlissDecoratedElement[T] = js.native
  def once(handlers: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissDecoratedElement[T] = js.native
  def once(handlers: Element): BlissDecoratedElement[T] = js.native
  def properties(props: js.Object): BlissDecoratedElement[T] = js.native
  def remove(): BlissDecoratedElement[T] = js.native
  def set(options: js.Object): BlissDecoratedElement[T] = js.native
  def start(element: Element): BlissDecoratedElement[T] = js.native
  def style(properties: js.Object): BlissDecoratedElement[T] = js.native
  def transition(properties: js.Object): js.Promise[T] = js.native
  def transition(properties: js.Object, duration: Double): js.Promise[T] = js.native
}

