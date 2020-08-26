package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructuralType extends js.Object {
  var complexProperties: js.Array[DataProperty] = js.native
  var dataProperties: js.Array[DataProperty] = js.native
  var name: String = js.native
  var namespace: String = js.native
  var shortName: String = js.native
  var unmappedProperties: js.Array[DataProperty] = js.native
  var validators: js.Array[Validator] = js.native
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
  implicit class IStructuralTypeOps[Self <: IStructuralType] (val x: Self) extends AnyVal {
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
    def setComplexPropertiesVarargs(value: DataProperty*): Self = this.set("complexProperties", js.Array(value :_*))
    @scala.inline
    def setComplexProperties(value: js.Array[DataProperty]): Self = this.set("complexProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataPropertiesVarargs(value: DataProperty*): Self = this.set("dataProperties", js.Array(value :_*))
    @scala.inline
    def setDataProperties(value: js.Array[DataProperty]): Self = this.set("dataProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmappedPropertiesVarargs(value: DataProperty*): Self = this.set("unmappedProperties", js.Array(value :_*))
    @scala.inline
    def setUnmappedProperties(value: js.Array[DataProperty]): Self = this.set("unmappedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
  
}

