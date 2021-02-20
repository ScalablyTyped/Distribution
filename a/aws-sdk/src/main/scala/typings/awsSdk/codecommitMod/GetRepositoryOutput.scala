package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryOutput extends StObject {
  
  /**
    * Information about the repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}
object GetRepositoryOutput {
  
  @scala.inline
  def apply(): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryOutput]
  }
  
  @scala.inline
  implicit class GetRepositoryOutputMutableBuilder[Self <: GetRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryMetadata(value: RepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
  }
}
