package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexAspect extends StObject {
  
  var complexObject: ComplexObject
  
  def getEntityAspect(): EntityAspect
  
  def getPropertyPath(propName: String): String
  
  var originalValues: js.Object
  
  var parent: js.Object
  
  var parentProperty: DataProperty
}
object ComplexAspect {
  
  inline def apply(
    complexObject: ComplexObject,
    getEntityAspect: () => EntityAspect,
    getPropertyPath: String => String,
    originalValues: js.Object,
    parent: js.Object,
    parentProperty: DataProperty
  ): ComplexAspect = {
    val __obj = js.Dynamic.literal(complexObject = complexObject.asInstanceOf[js.Any], getEntityAspect = js.Any.fromFunction0(getEntityAspect), getPropertyPath = js.Any.fromFunction1(getPropertyPath), originalValues = originalValues.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentProperty = parentProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexAspect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplexAspect] (val x: Self) extends AnyVal {
    
    inline def setComplexObject(value: ComplexObject): Self = StObject.set(x, "complexObject", value.asInstanceOf[js.Any])
    
    inline def setGetEntityAspect(value: () => EntityAspect): Self = StObject.set(x, "getEntityAspect", js.Any.fromFunction0(value))
    
    inline def setGetPropertyPath(value: String => String): Self = StObject.set(x, "getPropertyPath", js.Any.fromFunction1(value))
    
    inline def setOriginalValues(value: js.Object): Self = StObject.set(x, "originalValues", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentProperty(value: DataProperty): Self = StObject.set(x, "parentProperty", value.asInstanceOf[js.Any])
  }
}
