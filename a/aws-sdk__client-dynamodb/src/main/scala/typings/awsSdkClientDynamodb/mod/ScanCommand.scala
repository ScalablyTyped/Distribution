package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ScanCommand")
@js.native
open class ScanCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ScanCommand {
  /**
    * @public
    */
  def this(input: ScanCommandInput) = this()
}
/* static members */
object ScanCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ScanCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
