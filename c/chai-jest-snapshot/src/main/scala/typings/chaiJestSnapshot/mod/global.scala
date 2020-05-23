package typings.chaiJestSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Chai extends js.Object {
    @js.native
    trait Assertion extends js.Object {
      /** Assert that the object matches the snapshot */
      def matchSnapshot(): Assertion = js.native
      def matchSnapshot(snapshotFilename: String): Assertion = js.native
      def matchSnapshot(snapshotFilename: String, snapshotName: String): Assertion = js.native
      def matchSnapshot(snapshotFilename: String, snapshotName: String, update: Boolean): Assertion = js.native
      def matchSnapshot(update: Boolean): Assertion = js.native
    }
    
  }
  
}

