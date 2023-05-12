package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListContributorInsightsPaginatorMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/pagination/ListContributorInsightsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListContributorInsights(
    config: DynamoDBPaginationConfiguration,
    input: ListContributorInsightsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListContributorInsightsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListContributorInsights")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListContributorInsightsCommandOutput]]
}
