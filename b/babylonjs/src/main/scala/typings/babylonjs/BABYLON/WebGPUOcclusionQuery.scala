package typings.babylonjs.BABYLON

import typings.babylonjs.GPUQuerySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUOcclusionQuery extends StObject {
  
  /* private */ var _allocateNewIndices: Any = js.native
  
  /* private */ var _availableIndices: Any = js.native
  
  /* private */ var _bufferManager: Any = js.native
  
  /* private */ var _countIncrement: Any = js.native
  
  /* private */ var _currentTotalIndices: Any = js.native
  
  /* private */ var _delayQuerySetDispose: Any = js.native
  
  /* private */ var _device: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _frameLastBuffer: Any = js.native
  
  /* private */ var _lastBuffer: Any = js.native
  
  /* private */ var _querySet: Any = js.native
  
  /* private */ var _retrieveQueryBuffer: Any = js.native
  
  def canBeginQuery: Boolean = js.native
  
  def createQuery(): Double = js.native
  
  def deleteQuery(index: Double): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def getQueryResult(index: Double): Double = js.native
  
  def hasQueries: Boolean = js.native
  
  def isQueryResultAvailable(index: Double): Boolean = js.native
  
  def querySet: GPUQuerySet = js.native
}
