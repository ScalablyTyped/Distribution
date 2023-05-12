package typings.axeCore.mod

import typings.axeCore.anon.RequiredStandards
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils_ extends StObject {
  
  def getFrameContexts(): js.Array[FrameContext] = js.native
  def getFrameContexts(context: Unit, options: RunOptions): js.Array[FrameContext] = js.native
  def getFrameContexts(context: ElementContext): js.Array[FrameContext] = js.native
  def getFrameContexts(context: ElementContext, options: RunOptions): js.Array[FrameContext] = js.native
  
  def getStandards(): RequiredStandards = js.native
  
  def shadowSelect(selector: CrossTreeSelector): Element | Null = js.native
  
  def shadowSelectAll(selector: CrossTreeSelector): js.Array[Element] = js.native
}
