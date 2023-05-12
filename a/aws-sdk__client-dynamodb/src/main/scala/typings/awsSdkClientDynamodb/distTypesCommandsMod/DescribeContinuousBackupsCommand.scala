package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeContinuousBackupsCommandMod.DescribeContinuousBackupsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeContinuousBackupsCommand")
@js.native
open class DescribeContinuousBackupsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeContinuousBackupsCommandMod.DescribeContinuousBackupsCommand {
  /**
    * @public
    */
  def this(input: DescribeContinuousBackupsCommandInput) = this()
}
/* static members */
object DescribeContinuousBackupsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeContinuousBackupsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
