package typings.awsSdk.mod

import typings.awsSdk.pollyMod.ClientConfiguration
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Polly ()
  extends typings.awsSdk.allMod.Polly {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("aws-sdk", "Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  open class Presigner ()
    extends typings.awsSdk.allMod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
