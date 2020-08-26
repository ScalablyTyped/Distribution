package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsInput extends js.Object {
  /**
    * A unique identifier for a build to return fleets for. Use this parameter to return only fleets using a specified build. Use either the build ID or ARN value. To retrieve all fleets, do not include either a BuildId and ScriptID parameter.
    */
  var BuildId: js.UndefOr[BuildIdOrArn] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a Realtime script to return fleets for. Use this parameter to return only fleets using a specified script. Use either the script ID or ARN value. To retrieve all fleets, leave this parameter empty.
    */
  var ScriptId: js.UndefOr[ScriptIdOrArn] = js.native
}

object ListFleetsInput {
  @scala.inline
  def apply(): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsInput]
  }
  @scala.inline
  implicit class ListFleetsInputOps[Self <: ListFleetsInput] (val x: Self) extends AnyVal {
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
    def setBuildId(value: BuildIdOrArn): Self = this.set("BuildId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildId: Self = this.set("BuildId", js.undefined)
    @scala.inline
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScriptId(value: ScriptIdOrArn): Self = this.set("ScriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("ScriptId", js.undefined)
  }
  
}

