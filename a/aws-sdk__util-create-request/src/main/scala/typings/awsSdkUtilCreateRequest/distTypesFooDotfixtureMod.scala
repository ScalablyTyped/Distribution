package typings.awsSdkUtilCreateRequest

import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFooDotfixtureMod {
  
  @JSImport("@aws-sdk/util-create-request/dist-types/foo.fixture", "fooClient")
  @js.native
  val fooClient: Client[Any, InputTypesUnion, OutputTypesUnion, Any] = js.native
  
  @JSImport("@aws-sdk/util-create-request/dist-types/foo.fixture", "httpRequest")
  @js.native
  val httpRequest: HttpRequest = js.native
  
  @JSImport("@aws-sdk/util-create-request/dist-types/foo.fixture", "operationCommand")
  @js.native
  val operationCommand: Command[InputTypesUnion, OutputTypesUnion, Any, OperationInput, MetadataBearer] = js.native
  
  type InputTypesUnion = OperationInput
  
  trait OperationInput extends StObject {
    
    var String: java.lang.String
  }
  object OperationInput {
    
    inline def apply(String: String): OperationInput = {
      val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationInput]
    }
    
    extension [Self <: OperationInput](x: Self) {
      
      inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationOutput
    extends StObject
       with MetadataBearer {
    
    var Data: String
  }
  object OperationOutput {
    
    inline def apply($metadata: ResponseMetadata, Data: String): OperationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationOutput]
    }
    
    extension [Self <: OperationOutput](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputTypesUnion = OperationOutput
}
