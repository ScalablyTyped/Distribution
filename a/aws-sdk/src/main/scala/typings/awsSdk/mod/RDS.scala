package typings.awsSdk.mod

import typings.awsSdk.clientsRdsMod.ClientConfiguration
import typings.awsSdk.libRdsSignerMod.Signer.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class RDS ()
  extends typings.awsSdk.clientsAllMod.RDS {
  def this(options: ClientConfiguration) = this()
}
object RDS {
  
  @JSImport("aws-sdk", "RDS.Signer")
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  open class Signer ()
    extends typings.awsSdk.clientsAllMod.RDS.Signer {
    def this(options: SignerOptions) = this()
  }
}
