package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandInput
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterConfiguration
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaitersWaitForTableNotExistsMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/waiters/waitForTableNotExists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitForTableNotExists(params: WaiterConfiguration[DynamoDBClient], input: DescribeTableCommandInput): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForTableNotExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]
  
  inline def waitUntilTableNotExists(params: WaiterConfiguration[DynamoDBClient], input: DescribeTableCommandInput): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilTableNotExists")(params.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]
}
