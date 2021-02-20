package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSegmentExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException
    - typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException
    - typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException
    - typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException
    - typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  */
  trait CreateSegmentExceptionsUnion extends StObject
  object CreateSegmentExceptionsUnion {
    
    @scala.inline
    def BadRequestException(name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.BadRequestException): typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException]
    }
    
    @scala.inline
    def ForbiddenException(name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ForbiddenException): typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException]
    }
    
    @scala.inline
    def InternalServerErrorException(
      name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.InternalServerErrorException
    ): typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException]
    }
    
    @scala.inline
    def MethodNotAllowedException(
      name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MethodNotAllowedException
    ): typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException]
    }
    
    @scala.inline
    def NotFoundException(name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NotFoundException): typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
    
    @scala.inline
    def TooManyRequestsException(
      name: typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TooManyRequestsException
    ): typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
