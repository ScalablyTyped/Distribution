package typings.chaiDashJestDashSnapshot.chaiDashJestDashSnapshotMod

import typings.mocha.MochaNs.IBeforeAndAfterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiJestSnapshot extends js.Object {
  /** Chai bootstrapper */
  def apply(chai: js.Any, utils: js.Any): Unit = js.native
  /** Add a serializer plugin */
  def addSerializer(serializer: js.Any): Unit = js.native
  /** Configure snapshot name using mocha context */
  def configureUsingMochaContext(context: IBeforeAndAfterContext): Unit = js.native
  /** Reset snapshot registry */
  def resetSnapshotRegistry(): Unit = js.native
  /** Set snapshot file name */
  def setFilename(filename: String): Unit = js.native
  /**
    * Set snapshot test name
    */
  def setTestName(testname: String): Unit = js.native
}

