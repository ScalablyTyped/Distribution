package typings.awsSdkSmithyClient

import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/command", "Command")
  @js.native
  abstract class Command[Input /* <: ClientInput */, Output /* <: ClientOutput */, ResolvedClientConfiguration, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */] ()
    extends StObject
       with typings.awsSdkTypes.commandMod.Command[ClientInput, Input, ClientOutput, Output, ResolvedClientConfiguration] {
    
    /* CompleteClass */
    override val input: Input = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[Input, Output] = js.native
    
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[ClientInput, ClientOutput],
      configuration: ResolvedClientConfiguration,
      options: Any
    ): Handler[Input, Output] = js.native
  }
}
