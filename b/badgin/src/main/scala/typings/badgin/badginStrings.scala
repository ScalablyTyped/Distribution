package typings.badgin

import typings.badgin.mod.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object badginStrings {
  @js.native
  sealed trait Badging extends Method
  
  @js.native
  sealed trait Favicon extends Method
  
  @js.native
  sealed trait Title extends Method
  
  @scala.inline
  def Badging: Badging = "Badging".asInstanceOf[Badging]
  @scala.inline
  def Favicon: Favicon = "Favicon".asInstanceOf[Favicon]
  @scala.inline
  def Title: Title = "Title".asInstanceOf[Title]
}

