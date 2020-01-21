package typings.bootstrapMenu

import typings.bootstrapMenu.mod.BootstrapMenuEvent
import typings.bootstrapMenu.mod.BootstrapMenuPosition
import typings.bootstrapMenu.mod.BootstrapMenuSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bootstrapMenuStrings {
  @js.native
  sealed trait aboveLeft extends BootstrapMenuPosition
  
  @js.native
  sealed trait aboveRight extends BootstrapMenuPosition
  
  @js.native
  sealed trait belowLeft extends BootstrapMenuPosition
  
  @js.native
  sealed trait belowRight extends BootstrapMenuPosition
  
  @js.native
  sealed trait click extends BootstrapMenuEvent
  
  @js.native
  sealed trait element extends BootstrapMenuSource
  
  @js.native
  sealed trait hover extends BootstrapMenuEvent
  
  @js.native
  sealed trait mouse extends BootstrapMenuSource
  
  @js.native
  sealed trait `right-click` extends BootstrapMenuEvent
  
  @scala.inline
  def aboveLeft: aboveLeft = "aboveLeft".asInstanceOf[aboveLeft]
  @scala.inline
  def aboveRight: aboveRight = "aboveRight".asInstanceOf[aboveRight]
  @scala.inline
  def belowLeft: belowLeft = "belowLeft".asInstanceOf[belowLeft]
  @scala.inline
  def belowRight: belowRight = "belowRight".asInstanceOf[belowRight]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  @scala.inline
  def `right-click`: `right-click` = "right-click".asInstanceOf[`right-click`]
}

