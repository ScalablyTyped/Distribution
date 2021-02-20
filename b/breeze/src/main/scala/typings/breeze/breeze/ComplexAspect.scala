package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexAspect extends StObject {
  
  var complexObject: ComplexObject = js.native
  
  def getEntityAspect(): EntityAspect = js.native
  
  def getPropertyPath(propName: String): String = js.native
  
  var originalValues: js.Object = js.native
  
  var parent: js.Object = js.native
  
  var parentProperty: DataProperty = js.native
}
object ComplexAspect {
  
  @scala.inline
  def apply(
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
  implicit class ComplexAspectMutableBuilder[Self <: ComplexAspect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplexObject(value: ComplexObject): Self = StObject.set(x, "complexObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEntityAspect(value: () => EntityAspect): Self = StObject.set(x, "getEntityAspect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyPath(value: String => String): Self = StObject.set(x, "getPropertyPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalValues(value: js.Object): Self = StObject.set(x, "originalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProperty(value: DataProperty): Self = StObject.set(x, "parentProperty", value.asInstanceOf[js.Any])
  }
}
