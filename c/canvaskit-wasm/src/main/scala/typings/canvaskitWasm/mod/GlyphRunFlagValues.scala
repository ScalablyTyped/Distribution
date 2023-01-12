package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlyphRunFlagValues extends StObject {
  
  var IsWhiteSpace: Double
}
object GlyphRunFlagValues {
  
  inline def apply(IsWhiteSpace: Double): GlyphRunFlagValues = {
    val __obj = js.Dynamic.literal(IsWhiteSpace = IsWhiteSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphRunFlagValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlyphRunFlagValues] (val x: Self) extends AnyVal {
    
    inline def setIsWhiteSpace(value: Double): Self = StObject.set(x, "IsWhiteSpace", value.asInstanceOf[js.Any])
  }
}
