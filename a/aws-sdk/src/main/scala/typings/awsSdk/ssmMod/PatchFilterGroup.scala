package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchFilterGroup extends js.Object {
  /**
    * The set of patch filters that make up the group.
    */
  var PatchFilters: PatchFilterList = js.native
}

object PatchFilterGroup {
  @scala.inline
  def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchFilterGroup]
  }
}

