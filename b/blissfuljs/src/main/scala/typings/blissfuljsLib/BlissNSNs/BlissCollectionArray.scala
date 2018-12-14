package typings
package blissfuljsLib.BlissNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissCollectionArray[T] extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): BlissCollectionArray[T] = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): BlissCollectionArray[T] = js.native
  def after(element: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def around(element: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def attributes(attrs: js.Object): BlissCollectionArray[T] = js.native
  def before(element: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def contents(elements: blissfuljsLib.Array[_]): BlissCollectionArray[T] = js.native
  def contents(elements: java.lang.String): BlissCollectionArray[T] = js.native
  def contents(elements: js.Object): BlissCollectionArray[T] = js.native
  def contents(elements: stdLib.Node): BlissCollectionArray[T] = js.native
  def contents(elements: stdLib.Number): BlissCollectionArray[T] = js.native
  def delegate(
    `type`: java.lang.String,
    selector: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): BlissCollectionArray[T] = js.native
  def delegate(
    `type`: java.lang.String,
    selectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissCollectionArray[T] = js.native
  def delegate(
    typesToSelectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
    ]
  ): BlissCollectionArray[T] = js.native
  def events(handlers: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def events(
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissCollectionArray[T] = js.native
  def fire(`type`: java.lang.String): BlissCollectionArray[T] = js.native
  def fire(`type`: java.lang.String, properties: org.scalablytyped.runtime.StringDictionary[js.Any]): BlissCollectionArray[T] = js.native
  def inside(element: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def once(handlers: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def once(
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissCollectionArray[T] = js.native
  def properties(props: js.Object): BlissCollectionArray[T] = js.native
  def remove(): BlissCollectionArray[T] = js.native
  def set(options: js.Object): BlissCollectionArray[T] = js.native
  def start(element: blissfuljsLib.Element): BlissCollectionArray[T] = js.native
  def style(properties: js.Object): BlissCollectionArray[T] = js.native
  def transition(properties: js.Object): blissfuljsLib.Array[js.Promise[T]] = js.native
  def transition(properties: js.Object, duration: scala.Double): blissfuljsLib.Array[js.Promise[T]] = js.native
}

