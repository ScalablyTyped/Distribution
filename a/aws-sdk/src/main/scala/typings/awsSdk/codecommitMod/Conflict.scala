package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflict extends js.Object {
  /**
    * Metadata about a conflict in a merge operation.
    */
  var conflictMetadata: js.UndefOr[ConflictMetadata] = js.native
  /**
    * A list of hunks that contain the differences between files or lines causing the conflict.
    */
  var mergeHunks: js.UndefOr[MergeHunks] = js.native
}

object Conflict {
  @scala.inline
  def apply(conflictMetadata: ConflictMetadata = null, mergeHunks: MergeHunks = null): Conflict = {
    val __obj = js.Dynamic.literal()
    if (conflictMetadata != null) __obj.updateDynamic("conflictMetadata")(conflictMetadata.asInstanceOf[js.Any])
    if (mergeHunks != null) __obj.updateDynamic("mergeHunks")(mergeHunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
}

