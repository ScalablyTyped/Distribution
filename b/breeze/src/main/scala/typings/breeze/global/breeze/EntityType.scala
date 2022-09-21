package typings.breeze.global.breeze

import typings.breeze.breeze.EntityTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityType")
@js.native
open class EntityType protected ()
  extends StObject
     with typings.breeze.breeze.EntityType {
  def this(config: EntityTypeOptions) = this()
  def this(config: typings.breeze.breeze.MetadataStore) = this()
  
  /* CompleteClass */
  var complexProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var custom: Any = js.native
  
  /* CompleteClass */
  var dataProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var namespace: String = js.native
  
  /* CompleteClass */
  var shortName: String = js.native
  
  /* CompleteClass */
  var unmappedProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var validators: js.Array[typings.breeze.breeze.Validator] = js.native
}
