package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateRepositoryNameExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException
    - typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
  */
  trait UpdateRepositoryNameExceptionsUnion extends StObject
  object UpdateRepositoryNameExceptionsUnion {
    
    inline def InvalidRepositoryNameException(): typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    inline def RepositoryDoesNotExistException(): typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "RepositoryDoesNotExistException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    inline def RepositoryNameExistsException(): typings.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameExistsException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException]
    }
    
    inline def RepositoryNameRequiredException(): typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameRequiredException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
  }
}
