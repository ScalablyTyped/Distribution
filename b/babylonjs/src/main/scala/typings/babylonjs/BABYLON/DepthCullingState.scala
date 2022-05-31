package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthCullingState extends StObject {
  
  /* private */ var _cull: js.Any = js.native
  
  /* private */ var _cullFace: js.Any = js.native
  
  /* private */ var _depthFunc: js.Any = js.native
  
  /* private */ var _depthMask: js.Any = js.native
  
  /* private */ var _depthTest: js.Any = js.native
  
  /* private */ var _frontFace: js.Any = js.native
  
  /* private */ var _isCullDirty: js.Any = js.native
  
  /* private */ var _isCullFaceDirty: js.Any = js.native
  
  /* private */ var _isDepthFuncDirty: js.Any = js.native
  
  /* private */ var _isDepthMaskDirty: js.Any = js.native
  
  /* private */ var _isDepthTestDirty: js.Any = js.native
  
  /* private */ var _isFrontFaceDirty: js.Any = js.native
  
  /* private */ var _isZOffsetDirty: js.Any = js.native
  
  /* private */ var _zOffset: js.Any = js.native
  
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
  
  def cull: Nullable[Boolean] = js.native
  
  def cullFace: Nullable[Double] = js.native
  def cullFace_=(value: Nullable[Double]): Unit = js.native
  
  def cull_=(value: Nullable[Boolean]): Unit = js.native
  
  def depthFunc: Nullable[Double] = js.native
  def depthFunc_=(value: Nullable[Double]): Unit = js.native
  
  def depthMask: Boolean = js.native
  def depthMask_=(value: Boolean): Unit = js.native
  
  def depthTest: Boolean = js.native
  def depthTest_=(value: Boolean): Unit = js.native
  
  def frontFace: Nullable[Double] = js.native
  def frontFace_=(value: Nullable[Double]): Unit = js.native
  
  def isDirty: Boolean = js.native
  
  def reset(): Unit = js.native
  
  def zOffset: Double = js.native
  def zOffset_=(value: Double): Unit = js.native
}
