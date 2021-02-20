package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRepositoryOutput extends StObject {
  
  /**
    * The ID of the repository that was deleted.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
}
object DeleteRepositoryOutput {
  
  @scala.inline
  def apply(): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  
  @scala.inline
  implicit class DeleteRepositoryOutputMutableBuilder[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
  }
}
