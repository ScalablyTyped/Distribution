package typings
package cachefactoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cachefactoryLibStrings {
  @js.native
  sealed trait aggressive
    extends cachefactoryLib.cachefactoryMod.DeleteOnExpire
  
  @js.native
  sealed trait localStorage
    extends cachefactoryLib.cachefactoryMod.StorageMode
  
  @js.native
  sealed trait memory
    extends cachefactoryLib.cachefactoryMod.StorageMode
  
  @js.native
  sealed trait none
    extends cachefactoryLib.cachefactoryMod.DeleteOnExpire
  
  @js.native
  sealed trait passive
    extends cachefactoryLib.cachefactoryMod.DeleteOnExpire
  
  @js.native
  sealed trait sessionStorage
    extends cachefactoryLib.cachefactoryMod.StorageMode
  
  @scala.inline
  def aggressive: aggressive = "aggressive".asInstanceOf[aggressive]
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def passive: passive = "passive".asInstanceOf[passive]
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}

