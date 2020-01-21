package typings.d3Brush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object d3BrushStrings {
  @js.native
  sealed trait brush extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @scala.inline
  def brush: brush = "brush".asInstanceOf[brush]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

