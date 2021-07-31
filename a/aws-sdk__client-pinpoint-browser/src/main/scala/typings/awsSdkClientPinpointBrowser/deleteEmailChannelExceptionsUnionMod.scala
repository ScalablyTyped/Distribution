package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEmailChannelExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException
    - typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException
    - typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException
    - typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException
    - typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException
    - typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  */
  trait DeleteEmailChannelExceptionsUnion extends StObject
  object DeleteEmailChannelExceptionsUnion {
    
    @scala.inline
    def BadRequestException(): typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException = {
      val __obj = js.Dynamic.literal(name = "BadRequestException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException]
    }
    
    @scala.inline
    def ForbiddenException(): typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException = {
      val __obj = js.Dynamic.literal(name = "ForbiddenException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException]
    }
    
    @scala.inline
    def InternalServerErrorException(): typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException = {
      val __obj = js.Dynamic.literal(name = "InternalServerErrorException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException]
    }
    
    @scala.inline
    def MethodNotAllowedException(): typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException = {
      val __obj = js.Dynamic.literal(name = "MethodNotAllowedException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException]
    }
    
    @scala.inline
    def NotFoundException(): typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
    
    @scala.inline
    def TooManyRequestsException(): typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
