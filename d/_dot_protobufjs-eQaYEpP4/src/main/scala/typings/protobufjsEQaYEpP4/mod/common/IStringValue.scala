package typings.protobufjsEQaYEpP4.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.StringValue message. */
trait IStringValue extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object IStringValue {
  
  inline def apply(): IStringValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStringValue]
  }
  
  extension [Self <: IStringValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
