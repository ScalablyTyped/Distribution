package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexType extends IStructuralType {
  def addProperty(dataProperty: DataProperty): ComplexType = js.native
  def getProperties(): js.Array[DataProperty] = js.native
}

object ComplexType {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ComplexTypeOps[Self <: ComplexType] (val x: Self) extends AnyVal {
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
    def setAddProperty(value: DataProperty => ComplexType): Self = this.set("addProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperties(value: () => js.Array[DataProperty]): Self = this.set("getProperties", js.Any.fromFunction0(value))
  }
  
}

