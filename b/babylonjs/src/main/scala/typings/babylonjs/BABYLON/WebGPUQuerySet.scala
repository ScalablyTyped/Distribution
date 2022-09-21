package typings.babylonjs.BABYLON

import typings.babylonjs.GPUQuerySet
import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUQuerySet extends StObject {
  
  /* private */ var _bufferManager: Any = js.native
  
  /* private */ var _canUseMultipleBuffers: Any = js.native
  
  /* private */ var _count: Any = js.native
  
  /* private */ var _device: Any = js.native
  
  /* private */ var _dstBuffers: Any = js.native
  
  /* private */ var _getBuffer: Any = js.native
  
  /* private */ var _queryBuffer: Any = js.native
  
  /* private */ var _querySet: Any = js.native
  
  def dispose(): Unit = js.native
  
  def querySet: GPUQuerySet = js.native
  
  def readTwoValuesAndSubtract(): js.Promise[Double | Null] = js.native
  def readTwoValuesAndSubtract(firstQuery: Double): js.Promise[Double | Null] = js.native
  
  def readValue(): js.Promise[Double | Null] = js.native
  def readValue(firstQuery: Double): js.Promise[Double | Null] = js.native
  
  def readValues(): js.Promise[BigUint64Array | Null] = js.native
  def readValues(firstQuery: Double): js.Promise[BigUint64Array | Null] = js.native
  def readValues(firstQuery: Double, queryCount: Double): js.Promise[BigUint64Array | Null] = js.native
  def readValues(firstQuery: Unit, queryCount: Double): js.Promise[BigUint64Array | Null] = js.native
}
