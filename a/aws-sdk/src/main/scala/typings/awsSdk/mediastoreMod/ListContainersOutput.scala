package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainersOutput extends StObject {
  
  /**
    * The names of the containers.
    */
  var Containers: ContainerList
  
  /**
    *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListContainersOutput {
  
  inline def apply(Containers: ContainerList): ListContainersOutput = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersOutput]
  }
  
  extension [Self <: ListContainersOutput](x: Self) {
    
    inline def setContainers(value: ContainerList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
