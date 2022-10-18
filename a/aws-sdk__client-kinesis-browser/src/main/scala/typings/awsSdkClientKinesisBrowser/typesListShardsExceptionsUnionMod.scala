package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListShardsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
    - typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException
    - typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  */
  trait ListShardsExceptionsUnion extends StObject
  object ListShardsExceptionsUnion {
    
    inline def ExpiredNextTokenException(): typings.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException = {
      val __obj = js.Dynamic.literal(name = "ExpiredNextTokenException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException]
    }
    
    inline def InvalidArgumentException(): typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException = {
      val __obj = js.Dynamic.literal(name = "InvalidArgumentException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def ResourceInUseException(): typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
