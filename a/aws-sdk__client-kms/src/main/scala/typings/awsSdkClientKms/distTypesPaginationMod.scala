package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsDescribeCustomKeyStoresCommandMod.DescribeCustomKeyStoresCommandInput
import typings.awsSdkClientKms.distTypesCommandsDescribeCustomKeyStoresCommandMod.DescribeCustomKeyStoresCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommandInput
import typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListGrantsCommandMod.ListGrantsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListGrantsCommandMod.ListGrantsCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommandInput
import typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommandInput
import typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommandOutput
import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateDescribeCustomKeyStores(
    config: KMSPaginationConfiguration,
    input: DescribeCustomKeyStoresCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[DescribeCustomKeyStoresCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateDescribeCustomKeyStores")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[DescribeCustomKeyStoresCommandOutput]]
  
  inline def paginateListAliases(
    config: KMSPaginationConfiguration,
    input: ListAliasesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAliasesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAliases")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAliasesCommandOutput]]
  
  inline def paginateListGrants(
    config: KMSPaginationConfiguration,
    input: ListGrantsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListGrantsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListGrants")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListGrantsCommandOutput]]
  
  inline def paginateListKeyPolicies(
    config: KMSPaginationConfiguration,
    input: ListKeyPoliciesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListKeyPoliciesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListKeyPolicies")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListKeyPoliciesCommandOutput]]
  
  inline def paginateListKeys(
    config: KMSPaginationConfiguration,
    input: ListKeysCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListKeysCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListKeys")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListKeysCommandOutput]]
  
  inline def paginateListResourceTags(
    config: KMSPaginationConfiguration,
    input: ListResourceTagsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListResourceTagsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListResourceTags")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListResourceTagsCommandOutput]]
  
  inline def paginateListRetirableGrants(
    config: KMSPaginationConfiguration,
    input: ListRetirableGrantsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListRetirableGrantsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListRetirableGrants")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListRetirableGrantsCommandOutput]]
}
