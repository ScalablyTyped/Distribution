package typings.colornames

import typings.colornames.mod.Color
import typings.colornames.mod.ColorResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
      * Gets the color with the specified name.
      *
      * @param name
      * The name of the color to get.
      */
    def apply(name: String): Color = js.native
    
    /**
      * Gets all available colors.
      */
    def all(): js.Array[Color] = js.native
    
    /**
      * Gets all colors.
      */
    /**
      * Provides the functionality to resolve `css`-colors.
      */
    def css(): js.Array[Color] = js.native
    /**
      * Gets the color with the specified name.
      *
      * @param name
      * The name of the color to get.
      */
    /**
      * Provides the functionality to resolve `css`-colors.
      */
    def css(name: String): Color = js.native
    /**
      * Provides the functionality to resolve `css`-colors.
      */
    @JSName("css")
    var css_Original: ColorResolver = js.native
    
    /**
      * Gets all colors.
      */
    /**
      * Provides the functionality to resolve `vga`-colors.
      */
    def vga(): js.Array[Color] = js.native
    /**
      * Gets the color with the specified name.
      *
      * @param name
      * The name of the color to get.
      */
    /**
      * Provides the functionality to resolve `vga`-colors.
      */
    def vga(name: String): Color = js.native
    /**
      * Provides the functionality to resolve `vga`-colors.
      */
    @JSName("vga")
    var vga_Original: ColorResolver = js.native
  }
}
