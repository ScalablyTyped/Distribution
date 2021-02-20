package typings.carbonThemes

import typings.carbonThemes.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait G10 extends StObject {
    
    var g10: Theme = js.native
    
    var g100: Theme = js.native
    
    var g90: Theme = js.native
    
    var white: Theme = js.native
  }
  object G10 {
    
    @scala.inline
    def apply(g10: Theme, g100: Theme, g90: Theme, white: Theme): G10 = {
      val __obj = js.Dynamic.literal(g10 = g10.asInstanceOf[js.Any], g100 = g100.asInstanceOf[js.Any], g90 = g90.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[G10]
    }
    
    @scala.inline
    implicit class G10MutableBuilder[Self <: G10] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setG10(value: Theme): Self = StObject.set(x, "g10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG100(value: Theme): Self = StObject.set(x, "g100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG90(value: Theme): Self = StObject.set(x, "g90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhite(value: Theme): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
}
