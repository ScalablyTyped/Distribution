package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStructuralType extends StObject {
  
  var complexProperties: js.Array[DataProperty]
  
  var dataProperties: js.Array[DataProperty]
  
  var name: String
  
  var namespace: String
  
  var shortName: String
  
  var unmappedProperties: js.Array[DataProperty]
  
  var validators: js.Array[Validator]
}
object IStructuralType {
  
  @scala.inline
  def apply(
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    name: String,
    namespace: String,
    shortName: String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): IStructuralType = {
    val __obj = js.Dynamic.literal(complexProperties = complexProperties.asInstanceOf[js.Any], dataProperties = dataProperties.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], unmappedProperties = unmappedProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructuralType]
  }
  
  @scala.inline
  implicit class IStructuralTypeMutableBuilder[Self <: IStructuralType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplexProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "complexProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "complexProperties", js.Array(value :_*))
    
    @scala.inline
    def setDataProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "dataProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "dataProperties", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "unmappedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "unmappedProperties", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
