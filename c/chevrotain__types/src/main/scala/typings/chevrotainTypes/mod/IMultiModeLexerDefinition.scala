package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiModeLexerDefinition extends StObject {
  
  var defaultMode: String
  
  var modes: MultiModesDefinition
}
object IMultiModeLexerDefinition {
  
  inline def apply(defaultMode: String, modes: MultiModesDefinition): IMultiModeLexerDefinition = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiModeLexerDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMultiModeLexerDefinition] (val x: Self) extends AnyVal {
    
    inline def setDefaultMode(value: String): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setModes(value: MultiModesDefinition): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
  }
}
