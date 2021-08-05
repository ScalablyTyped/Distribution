package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTargetMod {
  
  trait Target extends StObject {
    
    /**
      * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch.</p>
      */
    var destinationReference: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository that contains the pull request.</p>
      */
    var repositoryName: String
    
    /**
      * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
      */
    var sourceReference: String
  }
  object Target {
    
    inline def apply(repositoryName: String, sourceReference: String): Target = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setDestinationReference(value: String): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
      
      inline def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setSourceReference(value: String): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledTarget = Target
}
