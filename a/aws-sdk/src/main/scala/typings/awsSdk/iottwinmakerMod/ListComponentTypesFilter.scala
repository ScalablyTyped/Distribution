package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentTypesFilter extends StObject {
  
  /**
    * The component type that the component types in the list extend.
    */
  var extendsFrom: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * A Boolean value that specifies whether the component types in the list are abstract.
    */
  var isAbstract: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The namespace to which the component types in the list belong.
    */
  var namespace: js.UndefOr[String] = js.undefined
}
object ListComponentTypesFilter {
  
  inline def apply(): ListComponentTypesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentTypesFilter]
  }
  
  extension [Self <: ListComponentTypesFilter](x: Self) {
    
    inline def setExtendsFrom(value: ComponentTypeId): Self = StObject.set(x, "extendsFrom", value.asInstanceOf[js.Any])
    
    inline def setExtendsFromUndefined: Self = StObject.set(x, "extendsFrom", js.undefined)
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setIsAbstractUndefined: Self = StObject.set(x, "isAbstract", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
