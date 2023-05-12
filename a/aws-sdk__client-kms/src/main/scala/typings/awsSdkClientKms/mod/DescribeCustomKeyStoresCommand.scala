package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDescribeCustomKeyStoresCommandMod.DescribeCustomKeyStoresCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DescribeCustomKeyStoresCommand")
@js.native
open class DescribeCustomKeyStoresCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DescribeCustomKeyStoresCommand {
  /**
    * @public
    */
  def this(input: DescribeCustomKeyStoresCommandInput) = this()
}
/* static members */
object DescribeCustomKeyStoresCommand {
  
  @JSImport("@aws-sdk/client-kms", "DescribeCustomKeyStoresCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
