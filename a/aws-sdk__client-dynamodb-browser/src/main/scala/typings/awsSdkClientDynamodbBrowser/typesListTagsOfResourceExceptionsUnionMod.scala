package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTagsOfResourceExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait ListTagsOfResourceExceptionsUnion extends StObject
  object ListTagsOfResourceExceptionsUnion {
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
