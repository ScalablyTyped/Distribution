package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeKMSInt
import typings.awsSdkClientKms.awsSdkClientKmsStrings.server
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "KMSInternalException")
@js.native
open class KMSInternalException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeKMSInt) = this()
  
  @JSName("$fault")
  val $fault_KMSInternalException: server = js.native
  
  @JSName("name")
  val name_KMSInternalException: typings.awsSdkClientKms.awsSdkClientKmsStrings.KMSInternalException = js.native
}
