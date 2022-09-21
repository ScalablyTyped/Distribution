package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToJSONOptions extends StObject {
  
  /** Serializes comments. */
  var keepComments: js.UndefOr[Boolean] = js.undefined
}
object IToJSONOptions {
  
  inline def apply(): IToJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToJSONOptions]
  }
  
  extension [Self <: IToJSONOptions](x: Self) {
    
    inline def setKeepComments(value: Boolean): Self = StObject.set(x, "keepComments", value.asInstanceOf[js.Any])
    
    inline def setKeepCommentsUndefined: Self = StObject.set(x, "keepComments", js.undefined)
  }
}
