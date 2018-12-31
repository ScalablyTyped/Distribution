package typings
package chaiDashJestDashSnapshotLib.chaiDashJestDashSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiJestSnapshot extends js.Object {
  /** Chai bootstrapper */
  def apply(chai: js.Any, utils: js.Any): scala.Unit = js.native
  /** Add a serializer plugin */
  def addSerializer(serializer: js.Any): scala.Unit = js.native
  /** Configure snapshot name using mocha context */
  def configureUsingMochaContext(context: mochaLib.MochaNs.IBeforeAndAfterContext): scala.Unit = js.native
  /** Reset snapshot registry */
  def resetSnapshotRegistry(): scala.Unit = js.native
  /** Set snapshot file name */
  def setFilename(filename: java.lang.String): scala.Unit = js.native
  /**
    * Set snapshot test name
    */
  def setTestName(testname: java.lang.String): scala.Unit = js.native
}

