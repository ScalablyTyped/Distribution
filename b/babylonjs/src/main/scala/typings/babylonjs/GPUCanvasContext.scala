package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUCanvasContext extends StObject {
  
  val canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  
  def configure(): Unit = js.native
  def configure(configuration: GPUCanvasConfiguration): Unit = js.native
  
  def getCurrentTexture(): GPUTexture = js.native
  
  def unconfigure(): Unit = js.native
}
