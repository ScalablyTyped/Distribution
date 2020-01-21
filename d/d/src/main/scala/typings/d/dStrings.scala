package typings.d

import typings.d.mod.Flags
import typings.d.mod.GetSetFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dStrings {
  @js.native
  sealed trait c
    extends Flags
       with GetSetFlags
  
  @js.native
  sealed trait ce
    extends Flags
       with GetSetFlags
  
  @js.native
  sealed trait cew extends Flags
  
  @js.native
  sealed trait cw extends Flags
  
  @js.native
  sealed trait e
    extends Flags
       with GetSetFlags
  
  @js.native
  sealed trait ew extends Flags
  
  @js.native
  sealed trait w extends Flags
  
  @scala.inline
  def c: c = "c".asInstanceOf[c]
  @scala.inline
  def ce: ce = "ce".asInstanceOf[ce]
  @scala.inline
  def cew: cew = "cew".asInstanceOf[cew]
  @scala.inline
  def cw: cw = "cw".asInstanceOf[cw]
  @scala.inline
  def e: e = "e".asInstanceOf[e]
  @scala.inline
  def ew: ew = "ew".asInstanceOf[ew]
  @scala.inline
  def w: w = "w".asInstanceOf[w]
}

