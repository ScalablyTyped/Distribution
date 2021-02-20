package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryNameIdPair extends StObject {
  
  /**
    * The ID associated with the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
  
  /**
    * The name associated with the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object RepositoryNameIdPair {
  
  @scala.inline
  def apply(): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
  
  @scala.inline
  implicit class RepositoryNameIdPairMutableBuilder[Self <: RepositoryNameIdPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
