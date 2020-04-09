package typings.contentDisposition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object contentDispositionStrings {
  @js.native
  sealed trait attachment extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
}

