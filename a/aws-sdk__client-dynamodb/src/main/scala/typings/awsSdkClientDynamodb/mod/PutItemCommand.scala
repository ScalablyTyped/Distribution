package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsPutItemCommandMod.PutItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "PutItemCommand")
@js.native
open class PutItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.PutItemCommand {
  /**
    * @public
    */
  def this(input: PutItemCommandInput) = this()
}
/* static members */
object PutItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "PutItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
