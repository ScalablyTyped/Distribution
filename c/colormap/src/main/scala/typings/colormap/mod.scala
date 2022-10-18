package typings.colormap

import typings.colormap.anon.Alpha
import typings.colormap.colormapStrings.float
import typings.colormap.colormapStrings.hex
import typings.colormap.colormapStrings.rgba
import typings.colormap.colormapStrings.rgbaString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: hex | rgbaString | rgba | float */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends 'rgba' | 'float' ? std.Array<[number, number, number, number]> : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends 'rgba' | 'float' ? std.Array<[number, number, number, number]> : std.Array<string> */ js.Any]
  inline def apply[T /* <: hex | rgbaString | rgba | float */](spec: Alpha[T]): /* import warning: importer.ImportType#apply Failed type conversion: T extends 'rgba' | 'float' ? std.Array<[number, number, number, number]> : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends 'rgba' | 'float' ? std.Array<[number, number, number, number]> : std.Array<string> */ js.Any]
  
  @JSImport("colormap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
