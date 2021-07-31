package typings.defineLazyProp

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[ObjectType /* <: StringDictionary[js.Any] */, PropertyNameType /* <: String */, PropertyValueType](`object`: ObjectType, propertyName: PropertyNameType, fn: js.Function0[PropertyValueType]): ObjectType & typings.defineLazyProp.defineLazyPropStrings.^ & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[ObjectType & typings.defineLazyProp.defineLazyPropStrings.^ & TopLevel[js.Any]]
  
  @JSImport("define-lazy-prop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
