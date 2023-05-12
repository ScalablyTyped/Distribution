package typings.bwipJs

import typings.bwipJs.bwipJsStrings.C
import typings.bwipJs.bwipJsStrings.L
import typings.bwipJs.bwipJsStrings.M
import typings.bwipJs.bwipJsStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Advance extends StObject {
    
    var advance: Double
    
    var bytes: js.typedarray.Uint8Array
    
    var cachekey: String
    
    var glyph: Double
    
    var height: Double
    
    var left: Double
    
    var offset: Double
    
    var pixels: js.typedarray.Uint8Array
    
    var top: Double
    
    var width: Double
  }
  object Advance {
    
    inline def apply(
      advance: Double,
      bytes: js.typedarray.Uint8Array,
      cachekey: String,
      glyph: Double,
      height: Double,
      left: Double,
      offset: Double,
      pixels: js.typedarray.Uint8Array,
      top: Double,
      width: Double
    ): Advance = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], cachekey = cachekey.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pixels = pixels.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Advance] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCachekey(value: String): Self = StObject.set(x, "cachekey", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: Double): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPixels(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ascent extends StObject {
    
    var ascent: Double
    
    var descent: Double
    
    var width: Double
  }
  object Ascent {
    
    inline def apply(ascent: Double, descent: Double, width: Double): Ascent = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ascent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ascent] (val x: Self) extends AnyVal {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bbs extends StObject {
    
    var bbs: js.Array[Double]
    
    var bhs: js.Array[Double]
    
    var sbs: js.Array[Double]
  }
  object Bbs {
    
    inline def apply(bbs: js.Array[Double], bhs: js.Array[Double], sbs: js.Array[Double]): Bbs = {
      val __obj = js.Dynamic.literal(bbs = bbs.asInstanceOf[js.Any], bhs = bhs.asInstanceOf[js.Any], sbs = sbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bbs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bbs] (val x: Self) extends AnyVal {
      
      inline def setBbs(value: js.Array[Double]): Self = StObject.set(x, "bbs", value.asInstanceOf[js.Any])
      
      inline def setBbsVarargs(value: Double*): Self = StObject.set(x, "bbs", js.Array(value*))
      
      inline def setBhs(value: js.Array[Double]): Self = StObject.set(x, "bhs", value.asInstanceOf[js.Any])
      
      inline def setBhsVarargs(value: Double*): Self = StObject.set(x, "bhs", js.Array(value*))
      
      inline def setSbs(value: js.Array[Double]): Self = StObject.set(x, "sbs", value.asInstanceOf[js.Any])
      
      inline def setSbsVarargs(value: Double*): Self = StObject.set(x, "sbs", js.Array(value*))
    }
  }
  
  trait Cx extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var `type`: Q
    
    var x: Double
    
    var y: Double
  }
  object Cx {
    
    inline def apply(cx: Double, cy: Double, x: Double, y: Double): Cx = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Q")
      __obj.asInstanceOf[Cx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cx] (val x: Self) extends AnyVal {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setType(value: Q): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cx1 extends StObject {
    
    var cx1: Double
    
    var cx2: Double
    
    var cy1: Double
    
    var cy2: Double
    
    var `type`: C
    
    var x: Double
    
    var y: Double
  }
  object Cx1 {
    
    inline def apply(cx1: Double, cx2: Double, cy1: Double, cy2: Double, x: Double, y: Double): Cx1 = {
      val __obj = js.Dynamic.literal(cx1 = cx1.asInstanceOf[js.Any], cx2 = cx2.asInstanceOf[js.Any], cy1 = cy1.asInstanceOf[js.Any], cy2 = cy2.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("C")
      __obj.asInstanceOf[Cx1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cx1] (val x: Self) extends AnyVal {
      
      inline def setCx1(value: Double): Self = StObject.set(x, "cx1", value.asInstanceOf[js.Any])
      
      inline def setCx2(value: Double): Self = StObject.set(x, "cx2", value.asInstanceOf[js.Any])
      
      inline def setCy1(value: Double): Self = StObject.set(x, "cy1", value.asInstanceOf[js.Any])
      
      inline def setCy2(value: Double): Self = StObject.set(x, "cy2", value.asInstanceOf[js.Any])
      
      inline def setType(value: C): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dx extends StObject {
    
    var dx: Double
    
    var height: Double
    
    var name: String
    
    var width: Double
  }
  object Dx {
    
    inline def apply(dx: Double, height: Double, name: String, width: Double): Dx = {
      val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dx] (val x: Self) extends AnyVal {
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var uri: String
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, uri: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pixs extends StObject {
    
    var height: Double
    
    var pixs: js.Array[Double]
    
    var pixx: Double
    
    var pixy: Double
    
    var width: Double
  }
  object Pixs {
    
    inline def apply(height: Double, pixs: js.Array[Double], pixx: Double, pixy: Double, width: Double): Pixs = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pixs = pixs.asInstanceOf[js.Any], pixx = pixx.asInstanceOf[js.Any], pixy = pixy.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pixs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pixs] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPixs(value: js.Array[Double]): Self = StObject.set(x, "pixs", value.asInstanceOf[js.Any])
      
      inline def setPixsVarargs(value: Double*): Self = StObject.set(x, "pixs", js.Array(value*))
      
      inline def setPixx(value: Double): Self = StObject.set(x, "pixx", value.asInstanceOf[js.Any])
      
      inline def setPixy(value: Double): Self = StObject.set(x, "pixy", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: M
    
    var x: Double
    
    var y: Double
  }
  object Type {
    
    inline def apply(x: Double, y: Double): Type = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("M")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: M): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var `type`: L
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("L")
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setType(value: L): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
