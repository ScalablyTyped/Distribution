package typings
package chaiDashJestDashSnapshotLib.chaiDashJestDashSnapshotMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  /** Assert that the object matches the snapshot */
  def matchSnapshot(): Assertion = js.native
  def matchSnapshot(snapshotFilename: java.lang.String): Assertion = js.native
  def matchSnapshot(snapshotFilename: java.lang.String, snapshotName: java.lang.String): Assertion = js.native
  def matchSnapshot(snapshotFilename: java.lang.String, snapshotName: java.lang.String, update: scala.Boolean): Assertion = js.native
  def matchSnapshot(update: scala.Boolean): Assertion = js.native
}

