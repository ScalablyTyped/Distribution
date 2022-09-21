package typings.babylonjs.BABYLON

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthCullingState extends StObject {
  
  /* protected */ var _cull: Nullable[Boolean] = js.native
  
  /* protected */ var _cullFace: Nullable[Double] = js.native
  
  /* protected */ var _depthFunc: Nullable[Double] = js.native
  
  /* protected */ var _depthMask: Boolean = js.native
  
  /* protected */ var _depthTest: Boolean = js.native
  
  /* protected */ var _frontFace: Nullable[Double] = js.native
  
  /* protected */ var _isCullDirty: Boolean = js.native
  
  /* protected */ var _isCullFaceDirty: Boolean = js.native
  
  /* protected */ var _isDepthFuncDirty: Boolean = js.native
  
  /* protected */ var _isDepthMaskDirty: Boolean = js.native
  
  /* protected */ var _isDepthTestDirty: Boolean = js.native
  
  /* protected */ var _isFrontFaceDirty: Boolean = js.native
  
  /* protected */ var _isZOffsetDirty: Boolean = js.native
  
  /* protected */ var _zOffset: Double = js.native
  
  /* protected */ var _zOffsetUnits: Double = js.native
  
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
  
  def zOffsetUnits: Double = js.native
  def zOffsetUnits_=(value: Double): Unit = js.native
  
  def zOffset_=(value: Double): Unit = js.native
}
