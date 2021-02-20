package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAliasExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typings.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod.AlreadyExistsException
    - typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
    - typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait CreateAliasExceptionsUnion extends StObject
  object CreateAliasExceptionsUnion {
    
    @scala.inline
    def AlreadyExistsException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException): typings.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod.AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod.AlreadyExistsException]
    }
    
    @scala.inline
    def DependencyTimeoutException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DependencyTimeoutException): typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidAliasNameException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException): typings.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod.InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod.InvalidAliasNameException]
    }
    
    @scala.inline
    def KMSInternalException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException): typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def KMSInvalidStateException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInvalidStateException): typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def LimitExceededException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException): typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def NotFoundException(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.NotFoundException): typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
