package typings.cryptoHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cryptoHashStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait hex extends js.Object
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
}

