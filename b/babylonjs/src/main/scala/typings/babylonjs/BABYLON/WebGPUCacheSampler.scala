package typings.babylonjs.BABYLON

import typings.babylonjs.GPUSampler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUCacheSampler extends StObject {
  
  /* private */ var _device: Any = js.native
  
  /* private */ var _samplers: Any = js.native
  
  var disabled: Boolean = js.native
  
  def getSampler(sampler: TextureSampler): GPUSampler = js.native
  def getSampler(sampler: TextureSampler, bypassCache: Boolean): GPUSampler = js.native
  def getSampler(sampler: TextureSampler, bypassCache: Boolean, hash: Double): GPUSampler = js.native
  def getSampler(sampler: TextureSampler, bypassCache: Unit, hash: Double): GPUSampler = js.native
}
