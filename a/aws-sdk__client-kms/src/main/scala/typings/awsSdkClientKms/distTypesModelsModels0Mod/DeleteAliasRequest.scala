package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAliasRequest extends StObject {
  
  /**
    * <p>The alias to be deleted. The alias name must begin with <code>alias/</code> followed by
    *       the alias name, such as <code>alias/ExampleAlias</code>.</p>
    */
  var AliasName: js.UndefOr[String] = js.undefined
}
object DeleteAliasRequest {
  
  inline def apply(): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: String): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
  }
}
