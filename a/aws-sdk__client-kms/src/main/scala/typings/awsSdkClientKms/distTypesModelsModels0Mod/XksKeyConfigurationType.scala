package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XksKeyConfigurationType extends StObject {
  
  /**
    * <p>The ID of the external key in its external key manager. This is the ID that the external key store proxy uses to identify the external key.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
}
object XksKeyConfigurationType {
  
  inline def apply(): XksKeyConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XksKeyConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XksKeyConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
