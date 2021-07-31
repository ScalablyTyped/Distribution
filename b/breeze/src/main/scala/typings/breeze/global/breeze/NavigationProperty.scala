package typings.breeze.global.breeze

import typings.breeze.breeze.IStructuralType
import typings.breeze.breeze.NavigationPropertyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.NavigationProperty")
@js.native
class NavigationProperty protected ()
  extends StObject
     with typings.breeze.breeze.NavigationProperty {
  def this(config: NavigationPropertyOptions) = this()
  
  /* CompleteClass */
  var associationName: String = js.native
  
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var entityType: typings.breeze.breeze.EntityType = js.native
  
  /* CompleteClass */
  var foreignKeyNames: js.Array[String] = js.native
  
  /* CompleteClass */
  var inverse: typings.breeze.breeze.NavigationProperty = js.native
  
  /* CompleteClass */
  var isDataProperty: Boolean = js.native
  
  /* CompleteClass */
  var isNavigationProperty: Boolean = js.native
  
  /* CompleteClass */
  var isScalar: Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var nameOnServer: String = js.native
  
  /* CompleteClass */
  var parentType: IStructuralType = js.native
  
  /* CompleteClass */
  var relatedDataProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var validators: js.Array[typings.breeze.breeze.Validator] = js.native
}
