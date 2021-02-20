package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildGroup extends StObject {
  
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
  implicit class BuildGroupMutableBuilder[Self <: BuildGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentBuildSummary(value: BuildSummary): Self = StObject.set(x, "currentBuildSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBuildSummaryUndefined: Self = StObject.set(x, "currentBuildSummary", js.undefined)
    
    @scala.inline
    def setDependsOn(value: Identifiers): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: NonEmptyString*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIgnoreFailure(value: Boolean): Self = StObject.set(x, "ignoreFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFailureUndefined: Self = StObject.set(x, "ignoreFailure", js.undefined)
    
    @scala.inline
    def setPriorBuildSummaryList(value: BuildSummaries): Self = StObject.set(x, "priorBuildSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorBuildSummaryListUndefined: Self = StObject.set(x, "priorBuildSummaryList", js.undefined)
    
    @scala.inline
    def setPriorBuildSummaryListVarargs(value: BuildSummary*): Self = StObject.set(x, "priorBuildSummaryList", js.Array(value :_*))
  }
}
