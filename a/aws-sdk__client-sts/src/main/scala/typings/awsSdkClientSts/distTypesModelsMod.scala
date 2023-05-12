package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typings.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typings.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typings.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "IDPCommunicationErrorException")
  @js.native
  open class IDPCommunicationErrorException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.IDPCommunicationErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPCom) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "IDPRejectedClaimException")
  @js.native
  open class IDPRejectedClaimException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.IDPRejectedClaimException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPRej) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "InvalidAuthorizationMessageException")
  @js.native
  open class InvalidAuthorizationMessageException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.InvalidAuthorizationMessageException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "InvalidIdentityTokenException")
  @js.native
  open class InvalidIdentityTokenException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.InvalidIdentityTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "MalformedPolicyDocumentException")
  @js.native
  open class MalformedPolicyDocumentException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.MalformedPolicyDocumentException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMalfor) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "PackedPolicyTooLargeException")
  @js.native
  open class PackedPolicyTooLargeException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.PackedPolicyTooLargeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePacked) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "RegionDisabledException")
  @js.native
  open class RegionDisabledException protected ()
    extends typings.awsSdkClientSts.distTypesModelsModels0Mod.RegionDisabledException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeRegion) = this()
  }
}
