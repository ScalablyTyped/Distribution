package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.protobufjsEQaYEpP4.mod.IEnum
  - typings.protobufjsEQaYEpP4.mod.IType
  - typings.protobufjsEQaYEpP4.mod.IService
  - typings.protobufjsEQaYEpP4.mod.AnyExtensionField
  - typings.protobufjsEQaYEpP4.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  inline def IEnum(values: StringDictionary[Double]): typings.protobufjsEQaYEpP4.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.IEnum]
  }
  
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
  
  inline def INamespace(): typings.protobufjsEQaYEpP4.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.INamespace]
  }
  
  inline def IService(methods: StringDictionary[IMethod]): typings.protobufjsEQaYEpP4.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.IService]
  }
  
  inline def IType(fields: StringDictionary[IField]): typings.protobufjsEQaYEpP4.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjsEQaYEpP4.mod.IType]
  }
}
