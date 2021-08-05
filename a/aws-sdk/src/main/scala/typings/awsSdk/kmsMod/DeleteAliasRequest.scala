package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAliasRequest extends StObject {
  
  /**
    * The alias to be deleted. The alias name must begin with alias/ followed by the alias name, such as alias/ExampleAlias.
    */
  var AliasName: AliasNameType
}
object DeleteAliasRequest {
  
  inline def apply(AliasName: AliasNameType): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasRequest]
  }
  
  extension [Self <: DeleteAliasRequest](x: Self) {
    
    inline def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
  }
}
