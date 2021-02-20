package typings.cachefactory

import typings.cachefactory.mod.DeleteOnExpire
import typings.cachefactory.mod.StorageMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachefactoryStrings {
  
  @js.native
  sealed trait aggressive extends DeleteOnExpire
  @scala.inline
  def aggressive: aggressive = "aggressive".asInstanceOf[aggressive]
  
  @js.native
  sealed trait localStorage extends StorageMode
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  
  @js.native
  sealed trait memory extends StorageMode
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait none extends DeleteOnExpire
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait passive extends DeleteOnExpire
  @scala.inline
  def passive: passive = "passive".asInstanceOf[passive]
  
  @js.native
  sealed trait sessionStorage extends StorageMode
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}
