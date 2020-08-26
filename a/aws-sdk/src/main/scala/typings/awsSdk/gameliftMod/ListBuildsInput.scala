package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildsInput extends js.Object {
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * Build status to filter results by. To retrieve all builds, leave this parameter empty. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
    */
  var Status: js.UndefOr[BuildStatus] = js.native
}

object ListBuildsInput {
  @scala.inline
  def apply(): ListBuildsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsInput]
  }
  @scala.inline
  implicit class ListBuildsInputOps[Self <: ListBuildsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatus(value: BuildStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

