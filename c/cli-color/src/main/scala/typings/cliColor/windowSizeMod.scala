package typings.cliColor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowSizeMod extends Shortcut {
  
  @JSImport("cli-color/window-size", JSImport.Namespace)
  @js.native
  val ^ : WindowSize = js.native
  
  trait WindowSize extends StObject {
    
    /**
      * Returns terminal height
      */
    val height: Double
    
    /**
      * Returns terminal width
      */
    val width: Double
  }
  object WindowSize {
    
    inline def apply(height: Double, width: Double): WindowSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowSize]
    }
    
    extension [Self <: WindowSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = WindowSize
  
  /* This means you don't have to write `^`, but can instead just say `windowSizeMod.foo` */
  override def _to: WindowSize = ^
}
