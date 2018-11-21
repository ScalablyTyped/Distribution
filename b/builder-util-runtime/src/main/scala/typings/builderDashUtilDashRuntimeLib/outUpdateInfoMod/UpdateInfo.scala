package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateInfo extends js.Object {
  val files: js.Array[UpdateFileInfo]
  /** @deprecated */
  val path: java.lang.String
  /**
       * The release date.
       */
  var releaseDate: java.lang.String
  /**
       * The release name.
       */
  var releaseName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
       */
  var releaseNotes: js.UndefOr[java.lang.String | js.Array[ReleaseNoteInfo] | scala.Null] = js.undefined
  /** @deprecated */
  val sha512: java.lang.String
  /**
       * The [staged rollout](auto-update.md#staged-rollouts) percentage, 0-100.
       */
  val stagingPercentage: js.UndefOr[scala.Double] = js.undefined
  /**
       * The version.
       */
  val version: java.lang.String
}

