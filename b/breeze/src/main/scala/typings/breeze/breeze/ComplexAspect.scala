package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexAspect extends js.Object {
  
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
  implicit class ComplexAspectOps[Self <: ComplexAspect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplexObject(value: ComplexObject): Self = this.set("complexObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEntityAspect(value: () => EntityAspect): Self = this.set("getEntityAspect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyPath(value: String => String): Self = this.set("getPropertyPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalValues(value: js.Object): Self = this.set("originalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Object): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProperty(value: DataProperty): Self = this.set("parentProperty", value.asInstanceOf[js.Any])
  }
}
