package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCodeRepositoryInput extends StObject {
  
  /**
    * The name of the Git repository to delete.
    */
  var CodeRepositoryName: EntityName
}
object DeleteCodeRepositoryInput {
  
  inline def apply(CodeRepositoryName: EntityName): DeleteCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCodeRepositoryInput]
  }
  
  extension [Self <: DeleteCodeRepositoryInput](x: Self) {
    
    inline def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
  }
}
