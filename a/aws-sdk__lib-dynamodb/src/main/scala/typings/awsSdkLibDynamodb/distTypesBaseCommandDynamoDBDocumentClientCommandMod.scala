package typings.awsSdkLibDynamodb

import typings.awsSdkLibDynamodb.distTypesCommandsUtilsMod.KeyNode
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClientResolvedConfig
import typings.awsSdkSmithyClient.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseCommandDynamoDBDocumentClientCommandMod {
  
  /* note: abstract class */ @JSImport("@aws-sdk/lib-dynamodb/dist-types/baseCommand/DynamoDBDocumentClientCommand", "DynamoDBDocumentClientCommand")
  @js.native
  open class DynamoDBDocumentClientCommand[Input /* <: js.Object */, Output /* <: js.Object */, BaseInput /* <: js.Object */, BaseOutput /* <: js.Object */, ResolvedClientConfiguration] () extends Command[Input | BaseInput, Output | BaseOutput, ResolvedClientConfiguration, Any, Any] {
    
    /* protected */ def addMarshallingMiddleware(configuration: DynamoDBDocumentClientResolvedConfig): Unit = js.native
    
    /* protected */ var clientCommand: Command[Input | BaseInput, Output | BaseOutput, ResolvedClientConfiguration, Any, Any] = js.native
    
    /* protected */ val inputKeyNodes: js.Array[KeyNode] = js.native
    
    /* protected */ val outputKeyNodes: js.Array[KeyNode] = js.native
  }
  /* static members */
  object DynamoDBDocumentClientCommand {
    
    @JSImport("@aws-sdk/lib-dynamodb/dist-types/baseCommand/DynamoDBDocumentClientCommand", "DynamoDBDocumentClientCommand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/lib-dynamodb/dist-types/baseCommand/DynamoDBDocumentClientCommand", "DynamoDBDocumentClientCommand.defaultLogFilterOverrides")
    @js.native
    def defaultLogFilterOverrides: Any = js.native
    inline def defaultLogFilterOverrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLogFilterOverrides")(x.asInstanceOf[js.Any])
  }
}
