package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContainersOutput extends StObject {
  
  /**
    * The names of the containers.
    */
  var Containers: ContainerList = js.native
  
  /**
    *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListContainersOutput {
  
  @scala.inline
  def apply(Containers: ContainerList): ListContainersOutput = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersOutput]
  }
  
  @scala.inline
  implicit class ListContainersOutputMutableBuilder[Self <: ListContainersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ContainerList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersVarargs(value: Container*): Self = StObject.set(x, "Containers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
