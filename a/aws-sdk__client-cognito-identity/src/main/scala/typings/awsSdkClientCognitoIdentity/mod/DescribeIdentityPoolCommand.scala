package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "DescribeIdentityPoolCommand")
@js.native
open class DescribeIdentityPoolCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.DescribeIdentityPoolCommand {
  def this(input: DescribeIdentityPoolCommandInput) = this()
}
/* static members */
object DescribeIdentityPoolCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "DescribeIdentityPoolCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
