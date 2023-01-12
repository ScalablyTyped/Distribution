package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryNameIdPairMod {
  
  trait RepositoryNameIdPair extends StObject {
    
    /**
      * <p>The ID associated with the repository.</p>
      */
    var repositoryId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name associated with the repository.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object RepositoryNameIdPair {
    
    inline def apply(): RepositoryNameIdPair = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryNameIdPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepositoryNameIdPair] (val x: Self) extends AnyVal {
      
      inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  type UnmarshalledRepositoryNameIdPair = RepositoryNameIdPair
}
