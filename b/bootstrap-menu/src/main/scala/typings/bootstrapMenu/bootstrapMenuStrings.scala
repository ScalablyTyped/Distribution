package typings.bootstrapMenu

import typings.bootstrapMenu.mod.BootstrapMenuEvent
import typings.bootstrapMenu.mod.BootstrapMenuPosition
import typings.bootstrapMenu.mod.BootstrapMenuSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapMenuStrings {
  
  @js.native
  sealed trait aboveLeft
    extends StObject
       with BootstrapMenuPosition
  inline def aboveLeft: aboveLeft = "aboveLeft".asInstanceOf[aboveLeft]
  
  @js.native
  sealed trait aboveRight
    extends StObject
       with BootstrapMenuPosition
  inline def aboveRight: aboveRight = "aboveRight".asInstanceOf[aboveRight]
  
  @js.native
  sealed trait belowLeft
    extends StObject
       with BootstrapMenuPosition
  inline def belowLeft: belowLeft = "belowLeft".asInstanceOf[belowLeft]
  
  @js.native
  sealed trait belowRight
    extends StObject
       with BootstrapMenuPosition
  inline def belowRight: belowRight = "belowRight".asInstanceOf[belowRight]
  
  @js.native
  sealed trait click
    extends StObject
       with BootstrapMenuEvent
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait element
    extends StObject
       with BootstrapMenuSource
  inline def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait hover
    extends StObject
       with BootstrapMenuEvent
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait mouse
    extends StObject
       with BootstrapMenuSource
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait `right-click`
    extends StObject
       with BootstrapMenuEvent
  inline def `right-click`: `right-click` = "right-click".asInstanceOf[`right-click`]
}
