package typings.breeze.mod

import typings.breeze.breeze.DataPropertyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "DataProperty")
@js.native
open class DataProperty protected ()
  extends StObject
     with typings.breeze.breeze.DataProperty {
  def this(config: DataPropertyOptions) = this()
  
  /* CompleteClass */
  var complexTypeName: String = js.native
  
  /* CompleteClass */
  var concurrencyMode: String = js.native
  
  /* CompleteClass */
  var custom: Any = js.native
  
  /* CompleteClass */
  var dataType: typings.breeze.breeze.DataTypeSymbol = js.native
  
  /* CompleteClass */
  var defaultValue: Any = js.native
  
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var isComplexProperty: Boolean = js.native
  
  /* CompleteClass */
  var isDataProperty: Boolean = js.native
  
  /* CompleteClass */
  var isInherited: Boolean = js.native
  
  /* CompleteClass */
  var isNavigationProperty: Boolean = js.native
  
  /* CompleteClass */
  var isNullable: Boolean = js.native
  
  /* CompleteClass */
  var isPartOfKey: Boolean = js.native
  
  /* CompleteClass */
  var isSettable: Boolean = js.native
  
  /* CompleteClass */
  var isUnmapped: Boolean = js.native
  
  /* CompleteClass */
  var maxLength: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var nameOnServer: String = js.native
  
  /* CompleteClass */
  var parentType: typings.breeze.breeze.EntityType | typings.breeze.breeze.ComplexType = js.native
  
  /* CompleteClass */
  var relatedNavigationProperty: typings.breeze.breeze.NavigationProperty = js.native
  
  /* CompleteClass */
  var validators: js.Array[typings.breeze.breeze.Validator] = js.native
}
/* static members */
object DataProperty {
  
  @JSImport("breeze", "DataProperty")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRawValueFromClient(rawEntity: Any, dp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawValueFromClient")(rawEntity.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getRawValueFromServer(rawEntity: Any, dp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawValueFromServer")(rawEntity.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[Any]
}
