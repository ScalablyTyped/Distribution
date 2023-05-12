package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeMessag
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "MessageNotInflight")
@js.native
open class MessageNotInflight protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeMessag) = this()
  
  @JSName("$fault")
  val $fault_MessageNotInflight: client = js.native
  
  @JSName("name")
  val name_MessageNotInflight: typings.awsSdkClientSqs.awsSdkClientSqsStrings.MessageNotInflight = js.native
}
