package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "ExpiredImportTokenException")
@js.native
open class ExpiredImportTokenException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeExpire) = this()
  
  @JSName("$fault")
  val $fault_ExpiredImportTokenException: client = js.native
  
  @JSName("name")
  val name_ExpiredImportTokenException: typings.awsSdkClientKms.awsSdkClientKmsStrings.ExpiredImportTokenException = js.native
}
