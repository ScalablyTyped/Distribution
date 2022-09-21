package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtensionMapField
  extends StObject
     with IMapField
     with AnyExtensionField {
  
  /** Extended type */
  var extend: String
}
object IExtensionMapField {
  
  inline def apply(extend: String, id: Double, keyType: String, `type`: String): IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionMapField]
  }
  
  extension [Self <: IExtensionMapField](x: Self) {
    
    inline def setExtend(value: String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
