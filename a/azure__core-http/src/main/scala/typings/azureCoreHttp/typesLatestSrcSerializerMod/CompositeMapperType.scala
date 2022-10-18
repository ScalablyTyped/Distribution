package typings.azureCoreHttp.typesLatestSrcSerializerMod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.azureCoreHttpStrings.Composite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeMapperType
  extends StObject
     with MapperType {
  
  /**
    * Used when a model has `additionalProperties: true`. Allows the generic processing of unnamed model properties on the response object.
    */
  var additionalProperties: js.UndefOr[Mapper] = js.undefined
  
  /**
    * Use `className` to reference another type definition.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Use `modelProperties` when the reference to the other type has been resolved.
    */
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.undefined
  
  /**
    * Name of the composite mapper type.
    */
  var name: Composite
  
  /**
    * A polymorphic discriminator.
    */
  var polymorphicDiscriminator: js.UndefOr[PolymorphicDiscriminator] = js.undefined
  
  /**
    * The name of the top-most parent scheme, the one that has no parents.
    */
  var uberParent: js.UndefOr[String] = js.undefined
}
object CompositeMapperType {
  
  inline def apply(): CompositeMapperType = {
    val __obj = js.Dynamic.literal(name = "Composite")
    __obj.asInstanceOf[CompositeMapperType]
  }
  
  extension [Self <: CompositeMapperType](x: Self) {
    
    inline def setAdditionalProperties(value: Mapper): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setModelProperties(value: StringDictionary[Mapper]): Self = StObject.set(x, "modelProperties", value.asInstanceOf[js.Any])
    
    inline def setModelPropertiesUndefined: Self = StObject.set(x, "modelProperties", js.undefined)
    
    inline def setName(value: Composite): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolymorphicDiscriminator(value: PolymorphicDiscriminator): Self = StObject.set(x, "polymorphicDiscriminator", value.asInstanceOf[js.Any])
    
    inline def setPolymorphicDiscriminatorUndefined: Self = StObject.set(x, "polymorphicDiscriminator", js.undefined)
    
    inline def setUberParent(value: String): Self = StObject.set(x, "uberParent", value.asInstanceOf[js.Any])
    
    inline def setUberParentUndefined: Self = StObject.set(x, "uberParent", js.undefined)
  }
}
