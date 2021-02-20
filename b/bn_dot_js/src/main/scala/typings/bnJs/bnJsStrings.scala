package typings.bnJs

import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bnJsStrings {
  
  @js.native
  sealed trait be extends Endianness
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait hex extends StObject
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait k256 extends IPrimeName
  @scala.inline
  def k256: k256 = "k256".asInstanceOf[k256]
  
  @js.native
  sealed trait le extends Endianness
  @scala.inline
  def le: le = "le".asInstanceOf[le]
  
  @js.native
  sealed trait p192 extends IPrimeName
  @scala.inline
  def p192: p192 = "p192".asInstanceOf[p192]
  
  @js.native
  sealed trait p224 extends IPrimeName
  @scala.inline
  def p224: p224 = "p224".asInstanceOf[p224]
  
  @js.native
  sealed trait p25519 extends IPrimeName
  @scala.inline
  def p25519: p25519 = "p25519".asInstanceOf[p25519]
}
