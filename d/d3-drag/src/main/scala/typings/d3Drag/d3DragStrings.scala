package typings.d3Drag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object d3DragStrings {
  @js.native
  sealed trait drag extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait mouse extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

