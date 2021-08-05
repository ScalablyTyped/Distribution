package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistryInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typings.awsSdk.glueMod.RegistryId
}
object GetRegistryInput {
  
  inline def apply(RegistryId: RegistryId): GetRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegistryInput]
  }
  
  extension [Self <: GetRegistryInput](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
  }
}
