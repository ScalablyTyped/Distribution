package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The environment account connection detail data that's returned by Proton.
    */
  var environmentAccountConnection: EnvironmentAccountConnection
}
object UpdateEnvironmentAccountConnectionOutput {
  
  inline def apply(environmentAccountConnection: EnvironmentAccountConnection): UpdateEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnection = environmentAccountConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentAccountConnectionOutput]
  }
  
  extension [Self <: UpdateEnvironmentAccountConnectionOutput](x: Self) {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
  }
}
