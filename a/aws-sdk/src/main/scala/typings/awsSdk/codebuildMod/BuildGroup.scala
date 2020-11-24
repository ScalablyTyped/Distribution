package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildGroup extends js.Object {
  
  /**
    * A BuildSummary object that contains a summary of the current build group.
    */
  var currentBuildSummary: js.UndefOr[BuildSummary] = js.native
  
  /**
    * An array of strings that contain the identifiers of the build groups that this build group depends on.
    */
  var dependsOn: js.UndefOr[Identifiers] = js.native
  
  /**
    * Contains the identifier of the build group.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * Specifies if failures in this build group can be ignored.
    */
  var ignoreFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of BuildSummary objects that contain summaries of previous build groups.
    */
  var priorBuildSummaryList: js.UndefOr[BuildSummaries] = js.native
}
object BuildGroup {
  
  @scala.inline
  def apply(): BuildGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildGroup]
  }
  
  @scala.inline
  implicit class BuildGroupOps[Self <: BuildGroup] (val x: Self) extends AnyVal {
    
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
    def setCurrentBuildSummary(value: BuildSummary): Self = this.set("currentBuildSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentBuildSummary: Self = this.set("currentBuildSummary", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: NonEmptyString*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: Identifiers): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIgnoreFailure(value: Boolean): Self = this.set("ignoreFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFailure: Self = this.set("ignoreFailure", js.undefined)
    
    @scala.inline
    def setPriorBuildSummaryListVarargs(value: BuildSummary*): Self = this.set("priorBuildSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setPriorBuildSummaryList(value: BuildSummaries): Self = this.set("priorBuildSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorBuildSummaryList: Self = this.set("priorBuildSummaryList", js.undefined)
  }
}
