package typings.colorNamer

import typings.colorNamer.anon.Omit
import typings.colorNamer.anon.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: Palette */](color: String): Colors[T] = ^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any]).asInstanceOf[Colors[T]]
  @scala.inline
  def apply[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = (^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[Diff[Palette, T]]]
  @scala.inline
  def apply[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = (^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[T]]
  
  @JSImport("color-namer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Color extends StObject {
    
    var distance: Double
    
    var hex: String
    
    var name: String
  }
  object Color {
    
    @scala.inline
    def apply(distance: Double, hex: String, name: String): Color = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Colors[T /* <: Palette */] = Record[T, js.Array[Color]]
  
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.colorNamer.colorNamerStrings.roygbiv
    - typings.colorNamer.colorNamerStrings.basic
    - typings.colorNamer.colorNamerStrings.html
    - typings.colorNamer.colorNamerStrings.x11
    - typings.colorNamer.colorNamerStrings.pantone
    - typings.colorNamer.colorNamerStrings.ntc
  */
  trait Palette extends StObject
  object Palette {
    
    @scala.inline
    def basic: typings.colorNamer.colorNamerStrings.basic = "basic".asInstanceOf[typings.colorNamer.colorNamerStrings.basic]
    
    @scala.inline
    def html: typings.colorNamer.colorNamerStrings.html = "html".asInstanceOf[typings.colorNamer.colorNamerStrings.html]
    
    @scala.inline
    def ntc: typings.colorNamer.colorNamerStrings.ntc = "ntc".asInstanceOf[typings.colorNamer.colorNamerStrings.ntc]
    
    @scala.inline
    def pantone: typings.colorNamer.colorNamerStrings.pantone = "pantone".asInstanceOf[typings.colorNamer.colorNamerStrings.pantone]
    
    @scala.inline
    def roygbiv: typings.colorNamer.colorNamerStrings.roygbiv = "roygbiv".asInstanceOf[typings.colorNamer.colorNamerStrings.roygbiv]
    
    @scala.inline
    def x11: typings.colorNamer.colorNamerStrings.x11 = "x11".asInstanceOf[typings.colorNamer.colorNamerStrings.x11]
  }
}
