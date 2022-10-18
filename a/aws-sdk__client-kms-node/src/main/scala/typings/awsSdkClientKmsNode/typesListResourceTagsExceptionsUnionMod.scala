package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListResourceTagsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
  */
  trait ListResourceTagsExceptionsUnion extends StObject
  object ListResourceTagsExceptionsUnion {
    
    inline def InvalidArnException(): typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def InvalidMarkerException(): typings.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = "InvalidMarkerException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
