package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsCreateTableCommandMod.CreateTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "CreateTableCommand")
@js.native
open class CreateTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.CreateTableCommand {
  /**
    * @public
    */
  def this(input: CreateTableCommandInput) = this()
}
/* static members */
object CreateTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "CreateTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
