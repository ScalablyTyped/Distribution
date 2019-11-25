package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.failed_
import typings.chromeDashApps.chromeDashAppsStrings.rejected
import typings.chromeDashApps.chromeDashAppsStrings.succeeded
import typings.chromeDashApps.chromeDashAppsStrings.unhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILED extends js.Object {
  var FAILED: failed_
  var REJECTED: rejected
  var SUCCEEDED: succeeded
  var UNHANDLED: unhandled
}

object Anon_FAILED {
  @scala.inline
  def apply(FAILED: failed_, REJECTED: rejected, SUCCEEDED: succeeded, UNHANDLED: unhandled): Anon_FAILED = {
    val __obj = js.Dynamic.literal(FAILED = FAILED.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCEEDED = SUCCEEDED.asInstanceOf[js.Any], UNHANDLED = UNHANDLED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FAILED]
  }
}

