package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsCreateAliasCommandMod.CreateAliasCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "CreateAliasCommand")
@js.native
open class CreateAliasCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsCreateAliasCommandMod.CreateAliasCommand {
  /**
    * @public
    */
  def this(input: CreateAliasCommandInput) = this()
}
/* static members */
object CreateAliasCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "CreateAliasCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
