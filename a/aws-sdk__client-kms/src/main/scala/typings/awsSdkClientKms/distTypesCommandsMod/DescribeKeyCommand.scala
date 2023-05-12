package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsDescribeKeyCommandMod.DescribeKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "DescribeKeyCommand")
@js.native
open class DescribeKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsDescribeKeyCommandMod.DescribeKeyCommand {
  /**
    * @public
    */
  def this(input: DescribeKeyCommandInput) = this()
}
/* static members */
object DescribeKeyCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "DescribeKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
