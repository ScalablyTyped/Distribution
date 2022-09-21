package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.protobufjsEQaYEpP4.mod.IExtensionField
  - typings.protobufjsEQaYEpP4.mod.IExtensionMapField
*/
trait AnyExtensionField
  extends StObject
     with AnyNestedObject
object AnyExtensionField {
  
  inline def IExtensionField(extend: String, id: Double, `type`: String): typings.protobufjsEQaYEpP4.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.IExtensionField]
  }
  
  inline def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typings.protobufjsEQaYEpP4.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.IExtensionMapField]
  }
}
