package typings.defineLazyProp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("define-lazy-prop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ObjectType /* <: Record[String, Any] */, PropertyNameType /* <: String */, PropertyValueType](`object`: ObjectType, propertyName: PropertyNameType, valueGetter: js.Function0[PropertyValueType]): ObjectType & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropertyNameType ]: PropertyValueType} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], valueGetter.asInstanceOf[js.Any])).asInstanceOf[ObjectType & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropertyNameType ]: PropertyValueType} */ js.Any)]
}
