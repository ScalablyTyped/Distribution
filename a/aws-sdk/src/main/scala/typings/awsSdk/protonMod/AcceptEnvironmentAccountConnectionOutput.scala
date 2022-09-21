package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The environment account connection data that's returned by Proton.
    */
  var environmentAccountConnection: EnvironmentAccountConnection
}
object AcceptEnvironmentAccountConnectionOutput {
  
  inline def apply(environmentAccountConnection: EnvironmentAccountConnection): AcceptEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnection = environmentAccountConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptEnvironmentAccountConnectionOutput]
  }
  
  extension [Self <: AcceptEnvironmentAccountConnectionOutput](x: Self) {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
  }
}
