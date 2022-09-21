package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontBlock extends StObject {
  
  var fakeBold: Boolean
  
  var fakeItalic: Boolean
  
  var length: Double
  
  var size: Double
  
  // number of text codepoints this block is applied to
  var typeface: Typeface
}
object FontBlock {
  
  inline def apply(fakeBold: Boolean, fakeItalic: Boolean, length: Double, size: Double, typeface: Typeface): FontBlock = {
    val __obj = js.Dynamic.literal(fakeBold = fakeBold.asInstanceOf[js.Any], fakeItalic = fakeItalic.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], typeface = typeface.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontBlock]
  }
  
  extension [Self <: FontBlock](x: Self) {
    
    inline def setFakeBold(value: Boolean): Self = StObject.set(x, "fakeBold", value.asInstanceOf[js.Any])
    
    inline def setFakeItalic(value: Boolean): Self = StObject.set(x, "fakeItalic", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTypeface(value: Typeface): Self = StObject.set(x, "typeface", value.asInstanceOf[js.Any])
  }
}
