package typings.cesium.anon

import typings.cesium.mod.MetadataComponentType
import typings.cesium.mod.MetadataEnum
import typings.cesium.mod.MetadataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayLength extends StObject {
  
  var default: js.UndefOr[Boolean | Double | String | js.Array[Any]] = js.undefined
  
  var arrayLength: js.UndefOr[Double] = js.undefined
  
  var componentType: js.UndefOr[MetadataComponentType] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var enumType: js.UndefOr[MetadataEnum] = js.undefined
  
  var extensions: js.UndefOr[Any] = js.undefined
  
  var extras: js.UndefOr[Any] = js.undefined
  
  var id: String
  
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var isVariableLengthArray: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
  
  var min: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noData: js.UndefOr[Boolean | Double | String | js.Array[Any]] = js.undefined
  
  var normalized: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
  
  var semantic: js.UndefOr[String] = js.undefined
  
  var `type`: MetadataType
}
object ArrayLength {
  
  inline def apply(id: String, `type`: MetadataType): ArrayLength = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayLength] (val x: Self) extends AnyVal {
    
    inline def setArrayLength(value: Double): Self = StObject.set(x, "arrayLength", value.asInstanceOf[js.Any])
    
    inline def setArrayLengthUndefined: Self = StObject.set(x, "arrayLength", js.undefined)
    
    inline def setComponentType(value: MetadataComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "componentType", js.undefined)
    
    inline def setDefault(value: Boolean | Double | String | js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnumType(value: MetadataEnum): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setExtensions(value: Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtras(value: Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    inline def setIsVariableLengthArray(value: Boolean): Self = StObject.set(x, "isVariableLengthArray", value.asInstanceOf[js.Any])
    
    inline def setIsVariableLengthArrayUndefined: Self = StObject.set(x, "isVariableLengthArray", js.undefined)
    
    inline def setMax(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMin(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "min", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoData(value: Boolean | Double | String | js.Array[Any]): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setNoDataVarargs(value: Any*): Self = StObject.set(x, "noData", js.Array(value*))
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setNormalizedUndefined: Self = StObject.set(x, "normalized", js.undefined)
    
    inline def setOffset(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setScale(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
    
    inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
