package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRepositoryOutput extends StObject {
  
  /**
    * Information about the newly created repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}
object CreateRepositoryOutput {
  
  @scala.inline
  def apply(): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
  
  @scala.inline
  implicit class CreateRepositoryOutputMutableBuilder[Self <: CreateRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryMetadata(value: RepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
  }
}
