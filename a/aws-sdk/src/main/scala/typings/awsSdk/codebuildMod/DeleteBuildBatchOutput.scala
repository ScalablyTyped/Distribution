package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBuildBatchOutput extends StObject {
  
  /**
    * An array of strings that contain the identifiers of the builds that were deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.undefined
  
  /**
    * An array of BuildNotDeleted objects that specify the builds that could not be deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object DeleteBuildBatchOutput {
  
  @scala.inline
  def apply(): DeleteBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBuildBatchOutput]
  }
  
  @scala.inline
  implicit class DeleteBuildBatchOutputMutableBuilder[Self <: DeleteBuildBatchOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildsDeleted(value: BuildIds): Self = StObject.set(x, "buildsDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsDeletedUndefined: Self = StObject.set(x, "buildsDeleted", js.undefined)
    
    @scala.inline
    def setBuildsDeletedVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildsDeleted", js.Array(value :_*))
    
    @scala.inline
    def setBuildsNotDeleted(value: BuildsNotDeleted): Self = StObject.set(x, "buildsNotDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsNotDeletedUndefined: Self = StObject.set(x, "buildsNotDeleted", js.undefined)
    
    @scala.inline
    def setBuildsNotDeletedVarargs(value: BuildNotDeleted*): Self = StObject.set(x, "buildsNotDeleted", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
