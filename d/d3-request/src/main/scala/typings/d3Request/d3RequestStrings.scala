package typings.d3Request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object d3RequestStrings {
  @js.native
  sealed trait beforesend extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @scala.inline
  def beforesend: beforesend = "beforesend".asInstanceOf[beforesend]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
}

