package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeNotFou
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "NotFoundException")
@js.native
open class NotFoundException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeNotFou) = this()
  
  @JSName("$fault")
  val $fault_NotFoundException: client = js.native
  
  @JSName("name")
  val name_NotFoundException: typings.awsSdkClientKms.awsSdkClientKmsStrings.NotFoundException = js.native
}
