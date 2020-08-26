package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceProfilesResult extends js.Object {
  /**
    * An object that contains information about your instance profiles.
    */
  var instanceProfiles: js.UndefOr[InstanceProfiles] = js.native
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInstanceProfilesResult {
  @scala.inline
  def apply(): ListInstanceProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceProfilesResult]
  }
  @scala.inline
  implicit class ListInstanceProfilesResultOps[Self <: ListInstanceProfilesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceProfilesVarargs(value: InstanceProfile*): Self = this.set("instanceProfiles", js.Array(value :_*))
    @scala.inline
    def setInstanceProfiles(value: InstanceProfiles): Self = this.set("instanceProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProfiles: Self = this.set("instanceProfiles", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

