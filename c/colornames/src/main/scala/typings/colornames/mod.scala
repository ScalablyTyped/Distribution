package typings.colornames

import org.scalablytyped.runtime.Shortcut
import typings.colornames.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("colornames", JSImport.Namespace)
  @js.native
  val ^ : GlobalResolver = js.native
  
  trait Color extends StObject {
    
    /**
      * Gets a value indicating whether the color is a valid `CSS`-color.
      */
    var css: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets the name of the color.
      */
    var name: String
    
    /**
      * Gets the value of the color.
      */
    var value: String
    
    /**
      * Gets a value indicating whether the color is a valid `VGA`-color.
      */
    var vga: js.UndefOr[Boolean] = js.undefined
  }
  object Color {
    
    inline def apply(name: String, value: String): Color = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVga(value: Boolean): Self = StObject.set(x, "vga", value.asInstanceOf[js.Any])
      
      inline def setVgaUndefined: Self = StObject.set(x, "vga", js.undefined)
    }
  }
  
  /**
    * Povides the functionality to resolve colors of a specific type by its name.
    */
  @js.native
  trait ColorResolver extends StObject {
    
    /**
      * Gets all colors.
      */
    def apply(): js.Array[Color] = js.native
    /**
      * Gets the color with the specified name.
      *
      * @param name
      * The name of the color to get.
      */
    def apply(name: String): Color = js.native
  }
  
  /**
    * Provides the functionality to resolve any kind of color by its name.
    */
  @js.native
  trait GlobalResolver extends StObject {
    
    /**
      * Gets the color with the specified name.
      */
    def apply(name: String): js.UndefOr[String] = js.native
    
    /**
      * Gets all available colors.
      */
    def all(): js.Array[Color] = js.native
    
    /**
      * Gets the color with the specified name.
      *
      * @param name
      * The name of the color to get.
      */
    /**
      * Provides the functionality to query colors.
      */
    def get(name: String): Color = js.native
    /**
      * Provides the functionality to query colors.
      */
    @JSName("get")
    var get_Original: Call = js.native
  }
  
  type _To = GlobalResolver
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GlobalResolver = ^
}
