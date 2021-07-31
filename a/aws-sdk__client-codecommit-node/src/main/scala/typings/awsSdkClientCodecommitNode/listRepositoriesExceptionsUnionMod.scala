package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listRepositoriesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException
    - typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException
    - typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
  */
  trait ListRepositoriesExceptionsUnion extends StObject
  object ListRepositoriesExceptionsUnion {
    
    @scala.inline
    def InvalidContinuationTokenException(): typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidContinuationTokenException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    @scala.inline
    def InvalidOrderException(): typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = "InvalidOrderException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException]
    }
    
    @scala.inline
    def InvalidSortByException(): typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = "InvalidSortByException")
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException]
    }
  }
}
