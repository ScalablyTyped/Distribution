package typings.blissfuljs.BlissNSNs

import org.scalablytyped.runtime.StringDictionary
import typings.blissfuljs.Array
import typings.blissfuljs.Element
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.Node
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissCollectionArray[T] extends js.Object {
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): BlissCollectionArray[T] = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, useCapture: Boolean): BlissCollectionArray[T] = js.native
  def after(element: Element): BlissCollectionArray[T] = js.native
  def around(element: Element): BlissCollectionArray[T] = js.native
  def attributes(attrs: js.Object): BlissCollectionArray[T] = js.native
  def before(element: Element): BlissCollectionArray[T] = js.native
  def contents(elements: String): BlissCollectionArray[T] = js.native
  def contents(elements: js.Object): BlissCollectionArray[T] = js.native
  def contents(elements: Array[_]): BlissCollectionArray[T] = js.native
  def contents(elements: Node): BlissCollectionArray[T] = js.native
  def contents(elements: Number): BlissCollectionArray[T] = js.native
  def delegate(`type`: String, selector: String, callback: js.Function1[/* event */ Event, Unit]): BlissCollectionArray[T] = js.native
  def delegate(`type`: String, selectorsToCallbacks: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissCollectionArray[T] = js.native
  def delegate(
    typesToSelectorsToCallbacks: StringDictionary[StringDictionary[js.Function1[/* event */ Event, Unit]]]
  ): BlissCollectionArray[T] = js.native
  def events(handlers: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissCollectionArray[T] = js.native
  def events(handlers: Element): BlissCollectionArray[T] = js.native
  def fire(`type`: String): BlissCollectionArray[T] = js.native
  def fire(`type`: String, properties: StringDictionary[js.Any]): BlissCollectionArray[T] = js.native
  def inside(element: Element): BlissCollectionArray[T] = js.native
  def once(handlers: StringDictionary[js.Function1[/* event */ Event, Unit]]): BlissCollectionArray[T] = js.native
  def once(handlers: Element): BlissCollectionArray[T] = js.native
  def properties(props: js.Object): BlissCollectionArray[T] = js.native
  def remove(): BlissCollectionArray[T] = js.native
  def set(options: js.Object): BlissCollectionArray[T] = js.native
  def start(element: Element): BlissCollectionArray[T] = js.native
  def style(properties: js.Object): BlissCollectionArray[T] = js.native
  def transition(properties: js.Object): Array[js.Promise[T]] = js.native
  def transition(properties: js.Object, duration: Double): Array[js.Promise[T]] = js.native
}

