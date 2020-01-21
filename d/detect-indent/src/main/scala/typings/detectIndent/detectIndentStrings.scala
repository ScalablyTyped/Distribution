package typings.detectIndent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object detectIndentStrings {
  @js.native
  sealed trait space extends js.Object
  
  @js.native
  sealed trait tab extends js.Object
  
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
}

