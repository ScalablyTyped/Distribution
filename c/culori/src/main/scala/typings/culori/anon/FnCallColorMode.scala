package typings.culori.anon

import typings.culori.culoriStrings.dlch
import typings.culori.culoriStrings.lch
import typings.culori.culoriStrings.lch65
import typings.culori.culoriStrings.mode
import typings.culori.culoriStrings.oklch
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallColorMode extends StObject {
  
  def apply[M /* <: dlch | lch65 | oklch | lch */](color: Omit[typings.culori.srcLabTypesMod.Lab, mode]): FindColorByMode[M, Color] = js.native
  def apply[M /* <: dlch | lch65 | oklch | lch */](color: Omit[typings.culori.srcLabTypesMod.Lab, mode], mode: M): FindColorByMode[M, Color] = js.native
}
