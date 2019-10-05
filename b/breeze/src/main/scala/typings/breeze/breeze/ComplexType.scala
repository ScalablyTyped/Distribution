package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ComplexType")
@js.native
class ComplexType () extends IStructuralType {
  /* CompleteClass */
  override var complexProperties: js.Array[DataProperty] = js.native
  /* CompleteClass */
  override var dataProperties: js.Array[DataProperty] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var namespace: String = js.native
  /* CompleteClass */
  override var shortName: String = js.native
  /* CompleteClass */
  override var unmappedProperties: js.Array[DataProperty] = js.native
  /* CompleteClass */
  override var validators: js.Array[Validator] = js.native
  def addProperty(dataProperty: DataProperty): ComplexType = js.native
  def getProperties(): js.Array[DataProperty] = js.native
}

