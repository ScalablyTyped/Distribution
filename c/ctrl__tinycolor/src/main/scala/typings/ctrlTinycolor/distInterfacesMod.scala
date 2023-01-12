package typings.ctrlTinycolor

import typings.ctrlTinycolor.distMod._ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  trait HSL
    extends StObject
       with _ColorInput {
    
    var h: Double | String
    
    var l: Double | String
    
    var s: Double | String
  }
  object HSL {
    
    inline def apply(h: Double | String, l: Double | String, s: Double | String): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double | String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ctrlTinycolor.distMod._ColorInput because Already inherited */ trait HSLA
    extends StObject
       with HSL {
    
    var a: Double
  }
  object HSLA {
    
    inline def apply(a: Double, h: Double | String, l: Double | String, s: Double | String): HSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSLA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSV
    extends StObject
       with _ColorInput {
    
    var h: Double | String
    
    var s: Double | String
    
    var v: Double | String
  }
  object HSV {
    
    inline def apply(h: Double | String, s: Double | String, v: Double | String): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double | String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ctrlTinycolor.distMod._ColorInput because Already inherited */ trait HSVA
    extends StObject
       with HSV {
    
    var a: Double
  }
  object HSVA {
    
    inline def apply(a: Double, h: Double | String, s: Double | String, v: Double | String): HSVA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSVA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSVA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: number}
    }}}
    */
  @js.native
  trait Numberify[T] extends StObject
  
  trait RGB
    extends StObject
       with _ColorInput {
    
    var b: Double | String
    
    var g: Double | String
    
    var r: Double | String
  }
  object RGB {
    
    inline def apply(b: Double | String, g: Double | String, r: Double | String): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ctrlTinycolor.distMod._ColorInput because Already inherited */ trait RGBA
    extends StObject
       with RGB {
    
    var a: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double | String, g: Double | String, r: Double | String): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
}
