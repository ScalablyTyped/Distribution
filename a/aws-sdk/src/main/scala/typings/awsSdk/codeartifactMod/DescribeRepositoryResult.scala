package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRepositoryResult extends StObject {
  
  /**
    *  A RepositoryDescription object that contains the requested repository information. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.undefined
}
object DescribeRepositoryResult {
  
  inline def apply(): DescribeRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoryResult]
  }
  
  extension [Self <: DescribeRepositoryResult](x: Self) {
    
    inline def setRepository(value: RepositoryDescription): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
