package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeTagExc
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "TagException")
@js.native
open class TagException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTagExc) = this()
  
  @JSName("$fault")
  val $fault_TagException: client = js.native
  
  @JSName("name")
  val name_TagException: typings.awsSdkClientKms.awsSdkClientKmsStrings.TagException = js.native
}
