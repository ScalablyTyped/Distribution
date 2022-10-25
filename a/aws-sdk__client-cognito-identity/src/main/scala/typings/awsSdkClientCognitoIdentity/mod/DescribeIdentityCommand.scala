package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "DescribeIdentityCommand")
@js.native
open class DescribeIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.DescribeIdentityCommand {
  def this(input: DescribeIdentityCommandInput) = this()
}
/* static members */
object DescribeIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "DescribeIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
