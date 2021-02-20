package typings.computeScrollIntoView

import typings.computeScrollIntoView.mod.ScrollLogicalPosition
import typings.computeScrollIntoView.mod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeScrollIntoViewStrings {
  
  @js.native
  sealed trait always extends ScrollMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait center extends ScrollLogicalPosition
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end extends ScrollLogicalPosition
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait `if-needed` extends ScrollMode
  @scala.inline
  def `if-needed`: `if-needed` = "if-needed".asInstanceOf[`if-needed`]
  
  @js.native
  sealed trait nearest extends ScrollLogicalPosition
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait start extends ScrollLogicalPosition
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}
