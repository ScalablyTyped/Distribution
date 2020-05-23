package typings.breeze.global.breeze

import typings.breeze.breeze.EntityTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityType")
@js.native
class EntityType protected ()
  extends typings.breeze.breeze.EntityType {
  def this(config: EntityTypeOptions) = this()
  def this(config: typings.breeze.breeze.MetadataStore) = this()
  /* CompleteClass */
  override var complexProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  /* CompleteClass */
  override var dataProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var namespace: String = js.native
  /* CompleteClass */
  override var shortName: String = js.native
  /* CompleteClass */
  override var unmappedProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  /* CompleteClass */
  override var validators: js.Array[typings.breeze.breeze.Validator] = js.native
}

