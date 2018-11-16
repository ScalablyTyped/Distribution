package typings
package blissfuljsLib.BlissNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissBindedElement[T] extends BlissNativeExtentions[T] {
  def after(element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def around(element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def attributes(attrs: js.Object): BlissDecoratedElement[T] = js.native
  def before(element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def contents(elements: blissfuljsLib.Array[_]): BlissDecoratedElement[T] = js.native
  def contents(elements: java.lang.String): BlissDecoratedElement[T] = js.native
  def contents(elements: js.Object): BlissDecoratedElement[T] = js.native
  def contents(elements: stdLib.Node): BlissDecoratedElement[T] = js.native
  def contents(elements: stdLib.Number): BlissDecoratedElement[T] = js.native
  def delegate(
    `type`: java.lang.String,
    selector: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): BlissDecoratedElement[T] = js.native
  def delegate(
    `type`: java.lang.String,
    selectorsToCallbacks: ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def delegate(
    typesToSelectorsToCallbacks: ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
    ]
  ): BlissDecoratedElement[T] = js.native
  def events(
    handlers: ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def events(handlers: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def fire(`type`: java.lang.String): BlissDecoratedElement[T] = js.native
  def fire(`type`: java.lang.String, properties: ScalablyTyped.runtime.StringDictionary[js.Any]): BlissDecoratedElement[T] = js.native
  def inside(element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def once(
    handlers: ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def once(handlers: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def properties(props: js.Object): BlissDecoratedElement[T] = js.native
  def remove(): BlissDecoratedElement[T] = js.native
  def set(options: js.Object): BlissDecoratedElement[T] = js.native
  def start(element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def style(properties: js.Object): BlissDecoratedElement[T] = js.native
  def transition(properties: js.Object): stdLib.Promise[T] = js.native
  def transition(properties: js.Object, duration: scala.Double): stdLib.Promise[T] = js.native
}

