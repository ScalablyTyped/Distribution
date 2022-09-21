package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentTemplateInput extends StObject {
  
  /**
    * The name of the environment template to delete.
    */
  var name: ResourceName
}
object DeleteEnvironmentTemplateInput {
  
  inline def apply(name: ResourceName): DeleteEnvironmentTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentTemplateInput]
  }
  
  extension [Self <: DeleteEnvironmentTemplateInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
