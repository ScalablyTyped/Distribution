package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkSmithyClient.distTypesClientMod.Client
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateAggregatedClientMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/create-aggregated-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAggregatedClient(commands: Record[String, Any], Client: Instantiable1[/* args */ Any, Client[Any, Any, Any, Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAggregatedClient")(commands.asInstanceOf[js.Any], Client.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
