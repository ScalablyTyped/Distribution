package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkClientDynamodb.mod.^
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterConfiguration
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def paginateListContributorInsights(
  config: DynamoDBPaginationConfiguration,
  input: ListContributorInsightsCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[ListContributorInsightsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListContributorInsights")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListContributorInsightsCommandOutput]]

inline def paginateListExports(
  config: DynamoDBPaginationConfiguration,
  input: ListExportsCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[ListExportsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListExports")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListExportsCommandOutput]]

inline def paginateListImports(
  config: DynamoDBPaginationConfiguration,
  input: ListImportsCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[ListImportsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListImports")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListImportsCommandOutput]]

inline def paginateListTables(
  config: DynamoDBPaginationConfiguration,
  input: ListTablesCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[ListTablesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListTables")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListTablesCommandOutput]]

inline def paginateQuery(
  config: DynamoDBPaginationConfiguration,
  input: QueryCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[QueryCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateQuery")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[QueryCommandOutput]]

inline def paginateScan(
  config: DynamoDBPaginationConfiguration,
  input: ScanCommandInput,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
): Paginator[ScanCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateScan")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ScanCommandOutput]]

inline def waitForTableExists(
  params: WaiterConfiguration[typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient],
  input: DescribeTableCommandInput
): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForTableExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]

inline def waitForTableNotExists(
  params: WaiterConfiguration[typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient],
  input: DescribeTableCommandInput
): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForTableNotExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]

inline def waitUntilTableExists(
  params: WaiterConfiguration[typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient],
  input: DescribeTableCommandInput
): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilTableExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]

inline def waitUntilTableNotExists(
  params: WaiterConfiguration[typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient],
  input: DescribeTableCommandInput
): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilTableNotExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]
