package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesCommandsListDeadLetterSourceQueuesCommandMod.ListDeadLetterSourceQueuesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsListDeadLetterSourceQueuesCommandMod.ListDeadLetterSourceQueuesCommandOutput
import typings.awsSdkClientSqs.distTypesPaginationInterfacesMod.SQSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListDeadLetterSourceQueuesPaginatorMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/pagination/ListDeadLetterSourceQueuesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListDeadLetterSourceQueues(
    config: SQSPaginationConfiguration,
    input: ListDeadLetterSourceQueuesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListDeadLetterSourceQueuesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListDeadLetterSourceQueues")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListDeadLetterSourceQueuesCommandOutput]]
}
