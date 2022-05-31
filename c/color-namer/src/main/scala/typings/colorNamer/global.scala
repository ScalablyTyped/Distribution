package typings.colorNamer

import typings.colorNamer.anon.Omit
import typings.colorNamer.anon.Pick
import typings.colorNamer.mod.Colors
import typings.colorNamer.mod.Diff
import typings.colorNamer.mod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def ColorNamer[T /* <: Palette */](color: String): Colors[T] = js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any]).asInstanceOf[Colors[T]]
  inline def ColorNamer[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = (js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[Diff[Palette, T]]]
  inline def ColorNamer[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = (js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[T]]
}
