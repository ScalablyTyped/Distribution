package typings
package cavyLib.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "TestScope")
@js.native
class TestScope () extends js.Object {
  var component: Tester = js.native
  def beforeEach(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def describe(label: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def exists(identifier: java.lang.String): js.Promise[cavyLib.cavyLibNumbers.`true`] = js.native
  def fillIn(identifier: java.lang.String, str: java.lang.String): js.Promise[scala.Unit] = js.native
  def findComponent(identifier: java.lang.String): js.Promise[reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def it(label: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def notExists(identifier: java.lang.String): js.Promise[cavyLib.cavyLibNumbers.`true`] = js.native
  def pause(time: scala.Double): js.Promise[scala.Unit] = js.native
  def press(identifier: java.lang.String): js.Promise[scala.Unit] = js.native
}

