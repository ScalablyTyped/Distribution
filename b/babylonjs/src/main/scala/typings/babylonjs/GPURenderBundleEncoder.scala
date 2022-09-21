package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderBundleEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin
     with GPURenderCommandsMixin {
  
  def finish(): GPURenderBundle = js.native
  def finish(descriptor: GPURenderBundleDescriptor): GPURenderBundle = js.native
}
