package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateItemCommandMod.UpdateItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "UpdateItemCommand")
@js.native
open class UpdateItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.UpdateItemCommand {
  /**
    * @public
    */
  def this(input: UpdateItemCommandInput) = this()
}
/* static members */
object UpdateItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "UpdateItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
