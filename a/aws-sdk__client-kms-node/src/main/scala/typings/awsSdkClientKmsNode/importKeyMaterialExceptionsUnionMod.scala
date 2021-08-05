package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importKeyMaterialExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
    - typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
    - typings.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException
    - typings.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException
    - typings.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod.InvalidImportTokenException
  */
  trait ImportKeyMaterialExceptionsUnion extends StObject
  object ImportKeyMaterialExceptionsUnion {
    
    inline def DependencyTimeoutException(): typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def ExpiredImportTokenException(): typings.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException = {
      val __obj = js.Dynamic.literal(name = "ExpiredImportTokenException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod.ExpiredImportTokenException]
    }
    
    inline def IncorrectKeyMaterialException(): typings.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException = {
      val __obj = js.Dynamic.literal(name = "IncorrectKeyMaterialException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod.IncorrectKeyMaterialException]
    }
    
    inline def InvalidArnException(): typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def InvalidCiphertextException(): typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = "InvalidCiphertextException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod.InvalidCiphertextException]
    }
    
    inline def InvalidImportTokenException(): typings.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod.InvalidImportTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidImportTokenException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod.InvalidImportTokenException]
    }
    
    inline def KMSInternalException(): typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def NotFoundException(): typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
    
    inline def UnsupportedOperationException(): typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperationException")
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
