package typings.blueprintjsTable

import typings.blueprintjsTable.tableQuadrantStackCacheMod.ScrollKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object blueprintjsTableStrings {
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait scrollLeft extends ScrollKey
  
  @js.native
  sealed trait scrollTop extends ScrollKey
  
  @js.native
  sealed trait vertical extends js.Object
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def scrollLeft: scrollLeft = "scrollLeft".asInstanceOf[scrollLeft]
  @scala.inline
  def scrollTop: scrollTop = "scrollTop".asInstanceOf[scrollTop]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

