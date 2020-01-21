package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvalidationsResult extends js.Object {
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsSdk.cloudfrontMod.InvalidationList] = js.native
}

object ListInvalidationsResult {
  @scala.inline
  def apply(InvalidationList: InvalidationList = null): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidationList != null) __obj.updateDynamic("InvalidationList")(InvalidationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvalidationsResult]
  }
}

