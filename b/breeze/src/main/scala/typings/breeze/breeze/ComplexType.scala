package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexType
  extends StObject
     with IStructuralType {
  
  def addProperty(dataProperty: DataProperty): ComplexType
  
  def getProperties(): js.Array[DataProperty]
}
object ComplexType {
  
  inline def apply(
    addProperty: DataProperty => ComplexType,
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    getProperties: () => js.Array[DataProperty],
    name: String,
    namespace: String,
    shortName: String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): ComplexType = {
    val __obj = js.Dynamic.literal(addProperty = js.Any.fromFunction1(addProperty), complexProperties = complexProperties.asInstanceOf[js.Any], dataProperties = dataProperties.asInstanceOf[js.Any], getProperties = js.Any.fromFunction0(getProperties), name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], unmappedProperties = unmappedProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexType]
  }
  
  extension [Self <: ComplexType](x: Self) {
    
    inline def setAddProperty(value: DataProperty => ComplexType): Self = StObject.set(x, "addProperty", js.Any.fromFunction1(value))
    
    inline def setGetProperties(value: () => js.Array[DataProperty]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
  }
}
