package typings.blake2

import typings.blake2.mod.Blake2Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake2Strings {
  
  @scala.inline
  def blake2b: blake2b = "blake2b".asInstanceOf[blake2b]
  
  @scala.inline
  def blake2bp: blake2bp = "blake2bp".asInstanceOf[blake2bp]
  
  @scala.inline
  def blake2s: blake2s = "blake2s".asInstanceOf[blake2s]
  
  @scala.inline
  def blake2sp: blake2sp = "blake2sp".asInstanceOf[blake2sp]
  
  @scala.inline
  def bypass: bypass = "bypass".asInstanceOf[bypass]
  
  @js.native
  sealed trait blake2b extends Blake2Algorithm
  
  @js.native
  sealed trait blake2bp extends Blake2Algorithm
  
  @js.native
  sealed trait blake2s extends Blake2Algorithm
  
  @js.native
  sealed trait blake2sp extends Blake2Algorithm
  
  @js.native
  sealed trait bypass extends Blake2Algorithm
}
