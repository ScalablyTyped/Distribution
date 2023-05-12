package typings.culori.anon

import typings.culori.culoriStrings.mode
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply[M /* <: typings.culori.srcCommonMod.Mode */](color: Omit[typings.culori.srcLrgbTypesMod.Lrgb, mode]): FindColorByMode[M, Color] = js.native
  def apply[M /* <: typings.culori.srcCommonMod.Mode */](color: Omit[typings.culori.srcLrgbTypesMod.Lrgb, mode], mode: M): FindColorByMode[M, Color] = js.native
}
