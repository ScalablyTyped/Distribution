package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPU extends StObject {
  
  def getPreferredCanvasFormat(): GPUTextureFormat = js.native
  
  def requestAdapter(): js.Promise[js.UndefOr[GPUAdapter]] = js.native
  def requestAdapter(options: GPURequestAdapterOptions): js.Promise[js.UndefOr[GPUAdapter]] = js.native
}
