package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRestrictions extends js.Object {
  /**
    * An array of strings that specify the compute types that are allowed for the batch build. See Build environment compute types in the AWS CodeBuild User Guide for these values. 
    */
  var computeTypesAllowed: js.UndefOr[ComputeTypesAllowed] = js.native
  /**
    * Specifies the maximum number of builds allowed.
    */
  var maximumBuildsAllowed: js.UndefOr[WrapperInt] = js.native
}

object BatchRestrictions {
  @scala.inline
  def apply(): BatchRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRestrictions]
  }
  @scala.inline
  implicit class BatchRestrictionsOps[Self <: BatchRestrictions] (val x: Self) extends AnyVal {
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
    def setComputeTypesAllowedVarargs(value: NonEmptyString*): Self = this.set("computeTypesAllowed", js.Array(value :_*))
    @scala.inline
    def setComputeTypesAllowed(value: ComputeTypesAllowed): Self = this.set("computeTypesAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeTypesAllowed: Self = this.set("computeTypesAllowed", js.undefined)
    @scala.inline
    def setMaximumBuildsAllowed(value: WrapperInt): Self = this.set("maximumBuildsAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumBuildsAllowed: Self = this.set("maximumBuildsAllowed", js.undefined)
  }
  
}

