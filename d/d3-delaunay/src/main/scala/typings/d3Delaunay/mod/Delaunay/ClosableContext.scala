package typings.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the closePath() method of the CanvasPathMethods API.
  */
trait ClosableContext extends js.Object {
  /**
    * closePath() method of the CanvasPathMethods API.
    */
  def closePath(): Unit
}

object ClosableContext {
  @scala.inline
  def apply(closePath: () => Unit): ClosableContext = {
    val __obj = js.Dynamic.literal(closePath = js.Any.fromFunction0(closePath))
  
    __obj.asInstanceOf[ClosableContext]
  }
}

