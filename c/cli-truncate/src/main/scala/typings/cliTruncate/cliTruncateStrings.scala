package typings.cliTruncate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cliTruncateStrings {
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

