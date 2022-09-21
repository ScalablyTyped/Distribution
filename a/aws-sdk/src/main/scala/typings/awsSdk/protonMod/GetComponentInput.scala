package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentInput extends StObject {
  
  /**
    * The name of the component that you want to get the detailed data for.
    */
  var name: ResourceName
}
object GetComponentInput {
  
  inline def apply(name: ResourceName): GetComponentInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentInput]
  }
  
  extension [Self <: GetComponentInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
