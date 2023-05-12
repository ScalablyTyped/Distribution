package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDescribeKeyCommandMod.DescribeKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DescribeKeyCommand")
@js.native
open class DescribeKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DescribeKeyCommand {
  /**
    * @public
    */
  def this(input: DescribeKeyCommandInput) = this()
}
/* static members */
object DescribeKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "DescribeKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
