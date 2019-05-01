package typings
package bnDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bnDotJsLibStrings {
  @js.native
  sealed trait be
    extends bnDotJsLib.bnDotJsMod.Endianness
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait k256
    extends bnDotJsLib.bnDotJsMod.IPrimeName
  
  @js.native
  sealed trait le
    extends bnDotJsLib.bnDotJsMod.Endianness
  
  @js.native
  sealed trait p192
    extends bnDotJsLib.bnDotJsMod.IPrimeName
  
  @js.native
  sealed trait p224
    extends bnDotJsLib.bnDotJsMod.IPrimeName
  
  @js.native
  sealed trait p25519
    extends bnDotJsLib.bnDotJsMod.IPrimeName
  
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def k256: k256 = "k256".asInstanceOf[k256]
  @scala.inline
  def le: le = "le".asInstanceOf[le]
  @scala.inline
  def p192: p192 = "p192".asInstanceOf[p192]
  @scala.inline
  def p224: p224 = "p224".asInstanceOf[p224]
  @scala.inline
  def p25519: p25519 = "p25519".asInstanceOf[p25519]
}

