package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The detailed data of the requested environment account connection.
    */
  var environmentAccountConnection: EnvironmentAccountConnection
}
object GetEnvironmentAccountConnectionOutput {
  
  inline def apply(environmentAccountConnection: EnvironmentAccountConnection): GetEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnection = environmentAccountConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentAccountConnectionOutput]
  }
  
  extension [Self <: GetEnvironmentAccountConnectionOutput](x: Self) {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
  }
}
