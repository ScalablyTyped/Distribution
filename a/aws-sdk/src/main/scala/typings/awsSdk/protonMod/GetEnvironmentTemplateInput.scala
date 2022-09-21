package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentTemplateInput extends StObject {
  
  /**
    * The name of the environment template that you want to get the detailed data for.
    */
  var name: ResourceName
}
object GetEnvironmentTemplateInput {
  
  inline def apply(name: ResourceName): GetEnvironmentTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentTemplateInput]
  }
  
  extension [Self <: GetEnvironmentTemplateInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
