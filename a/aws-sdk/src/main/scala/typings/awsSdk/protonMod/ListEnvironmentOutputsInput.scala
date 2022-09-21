package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentOutputsInput extends StObject {
  
  /**
    * The environment name.
    */
  var environmentName: ResourceName
  
  /**
    * A token that indicates the location of the next environment output in the array of environment outputs, after the list of environment outputs that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
}
object ListEnvironmentOutputsInput {
  
  inline def apply(environmentName: ResourceName): ListEnvironmentOutputsInput = {
    val __obj = js.Dynamic.literal(environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentOutputsInput]
  }
  
  extension [Self <: ListEnvironmentOutputsInput](x: Self) {
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
