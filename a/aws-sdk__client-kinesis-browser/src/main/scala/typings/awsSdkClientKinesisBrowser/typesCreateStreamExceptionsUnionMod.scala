package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateStreamExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
    - typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  */
  trait CreateStreamExceptionsUnion extends StObject
  object CreateStreamExceptionsUnion {
    
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
  }
}
