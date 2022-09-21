package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlyphRun extends StObject {
  
  var fakeBold: Boolean
  
  var fakeItalic: Boolean
  
  var flags: Double
  
  var glyphs: js.typedarray.Uint16Array
  
  // alternating x0, y0, x1, y1, ...
  var offsets: js.typedarray.Uint32Array
  
  var positions: js.typedarray.Float32Array
  
  // currently set to null (temporary)
  var size: Double
  
  var typeface: Typeface
}
object GlyphRun {
  
  inline def apply(
    fakeBold: Boolean,
    fakeItalic: Boolean,
    flags: Double,
    glyphs: js.typedarray.Uint16Array,
    offsets: js.typedarray.Uint32Array,
    positions: js.typedarray.Float32Array,
    size: Double,
    typeface: Typeface
  ): GlyphRun = {
    val __obj = js.Dynamic.literal(fakeBold = fakeBold.asInstanceOf[js.Any], fakeItalic = fakeItalic.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], typeface = typeface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphRun]
  }
  
  extension [Self <: GlyphRun](x: Self) {
    
    inline def setFakeBold(value: Boolean): Self = StObject.set(x, "fakeBold", value.asInstanceOf[js.Any])
    
    inline def setFakeItalic(value: Boolean): Self = StObject.set(x, "fakeItalic", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGlyphs(value: js.typedarray.Uint16Array): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: js.typedarray.Uint32Array): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.typedarray.Float32Array): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTypeface(value: Typeface): Self = StObject.set(x, "typeface", value.asInstanceOf[js.Any])
  }
}
