package typings.cathoQuantum

import org.scalablytyped.runtime.Shortcut
import typings.cathoQuantum.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakpointsMod extends Shortcut {
  
  @JSImport("@catho/quantum/Breakpoints", JSImport.Default)
  @js.native
  val default: Breakpoints = js.native
  
  trait Breakpoints extends StObject {
    
    var large: Columns
    
    var medium: Columns
    
    var small: Columns
    
    var xsmall: Columns
  }
  object Breakpoints {
    
    inline def apply(large: Columns, medium: Columns, small: Columns, xsmall: Columns): Breakpoints = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breakpoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Breakpoints] (val x: Self) extends AnyVal {
      
      inline def setLarge(value: Columns): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Columns): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: Columns): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setXsmall(value: Columns): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Breakpoints
  
  /* This means you don't have to write `default`, but can instead just say `breakpointsMod.foo` */
  override def _to: Breakpoints = default
}
