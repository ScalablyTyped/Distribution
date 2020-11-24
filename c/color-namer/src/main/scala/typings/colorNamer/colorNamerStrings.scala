package typings.colorNamer

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorNamerStrings {
  
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @scala.inline
  def ntc: ntc = "ntc".asInstanceOf[ntc]
  
  @scala.inline
  def pantone: pantone = "pantone".asInstanceOf[pantone]
  
  @scala.inline
  def roygbiv: roygbiv = "roygbiv".asInstanceOf[roygbiv]
  
  @scala.inline
  def x11: x11 = "x11".asInstanceOf[x11]
  
  @js.native
  sealed trait basic extends Palette
  
  @js.native
  sealed trait html extends Palette
  
  @js.native
  sealed trait ntc extends Palette
  
  @js.native
  sealed trait pantone extends Palette
  
  @js.native
  sealed trait roygbiv extends Palette
  
  @js.native
  sealed trait x11 extends Palette
}
