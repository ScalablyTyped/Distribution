package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalResources extends StObject {
  
  /**
    * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can be specified.
    */
  var Content: js.UndefOr[Urls] = js.undefined
  
  /**
    * Type of additional resource.
    */
  var Type: js.UndefOr[AdditionalResourceType] = js.undefined
}
object AdditionalResources {
  
  inline def apply(): AdditionalResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalResources]
  }
  
  extension [Self <: AdditionalResources](x: Self) {
    
    inline def setContent(value: Urls): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: ChoiceContent*): Self = StObject.set(x, "Content", js.Array(value*))
    
    inline def setType(value: AdditionalResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
