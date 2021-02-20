package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def InvalidContinuationTokenException(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
    ): typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    @scala.inline
    def InvalidOrderException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException): typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException]
    }
    
    @scala.inline
    def InvalidSortByException(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException): typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException]
    }
  }
}
