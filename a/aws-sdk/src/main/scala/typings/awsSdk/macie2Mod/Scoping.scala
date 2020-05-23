package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scoping extends js.Object {
  /**
    * Reserved for future use.
    */
  var excludes: js.UndefOr[JobScopingBlock] = js.native
  /**
    * Reserved for future use.
    */
  var includes: js.UndefOr[JobScopingBlock] = js.native
}

object Scoping {
  @scala.inline
  def apply(excludes: JobScopingBlock = null, includes: JobScopingBlock = null): Scoping = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scoping]
  }
}

