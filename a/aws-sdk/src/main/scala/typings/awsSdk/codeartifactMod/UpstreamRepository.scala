package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpstreamRepository extends StObject {
  
  /**
    *  The name of an upstream repository. 
    */
  var repositoryName: RepositoryName = js.native
}
object UpstreamRepository {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): UpstreamRepository = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpstreamRepository]
  }
  
  @scala.inline
  implicit class UpstreamRepositoryMutableBuilder[Self <: UpstreamRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
