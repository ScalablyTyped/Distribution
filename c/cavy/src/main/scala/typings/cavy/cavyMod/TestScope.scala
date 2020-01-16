package typings.cavy.cavyMod

import typings.cavy.cavyBooleans.`true`
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "TestScope")
@js.native
class TestScope () extends js.Object {
  var component: Tester = js.native
  def beforeEach(fn: js.Function0[Unit]): Unit = js.native
  def containsText(identifier: String, text: String): js.Promise[Unit] = js.native
  def describe(label: String, fn: js.Function0[Unit]): Unit = js.native
  def exists(identifier: String): js.Promise[`true`] = js.native
  def fillIn(identifier: String, str: String): js.Promise[Unit] = js.native
  def findComponent(identifier: String): js.Promise[Component[js.Object, js.Object, _]] = js.native
  def focus(identifier: String): js.Promise[Unit] = js.native
  def it(label: String, fn: js.Function0[Unit]): Unit = js.native
  def notExists(identifier: String): js.Promise[`true`] = js.native
  def pause(time: Double): js.Promise[Unit] = js.native
  def press(identifier: String): js.Promise[Unit] = js.native
}

