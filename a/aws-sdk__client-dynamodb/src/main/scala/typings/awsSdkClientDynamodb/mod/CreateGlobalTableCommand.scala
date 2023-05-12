package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsCreateGlobalTableCommandMod.CreateGlobalTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "CreateGlobalTableCommand")
@js.native
open class CreateGlobalTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.CreateGlobalTableCommand {
  /**
    * @public
    */
  def this(input: CreateGlobalTableCommandInput) = this()
}
/* static members */
object CreateGlobalTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "CreateGlobalTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
