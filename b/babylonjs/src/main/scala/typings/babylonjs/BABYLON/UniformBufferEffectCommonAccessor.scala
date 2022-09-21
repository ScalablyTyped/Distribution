package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniformBufferEffectCommonAccessor extends StObject {
  
  /* private */ var _isUbo: Any = js.native
  
  def setArray(name: String, array: js.Array[Double]): Unit = js.native
  
  def setColor3(name: String, color: IColor3Like): Unit = js.native
  def setColor3(name: String, color: IColor3Like, suffix: String): Unit = js.native
  
  def setColor4(name: String, color: IColor3Like, alpha: Double): Unit = js.native
  def setColor4(name: String, color: IColor3Like, alpha: Double, suffix: String): Unit = js.native
  
  def setDirectColor4(name: String, color: IColor4Like): Unit = js.native
  
  def setFloat(name: String, x: Double): Unit = js.native
  
  def setFloat2(name: String, x: Double, y: Double): Unit = js.native
  def setFloat2(name: String, x: Double, y: Double, suffix: String): Unit = js.native
  
  def setFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
  def setFloat3(name: String, x: Double, y: Double, z: Double, suffix: String): Unit = js.native
  
  def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double, suffix: String): Unit = js.native
  
  def setFloatArray(name: String, array: js.typedarray.Float32Array): Unit = js.native
  
  def setInt(name: String, x: Double): Unit = js.native
  def setInt(name: String, x: Double, suffix: String): Unit = js.native
  
  def setInt2(name: String, x: Double, y: Double): Unit = js.native
  def setInt2(name: String, x: Double, y: Double, suffix: String): Unit = js.native
  
  def setInt3(name: String, x: Double, y: Double, z: Double): Unit = js.native
  def setInt3(name: String, x: Double, y: Double, z: Double, suffix: String): Unit = js.native
  
  def setInt4(name: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setInt4(name: String, x: Double, y: Double, z: Double, w: Double, suffix: String): Unit = js.native
  
  def setIntArray(name: String, array: js.typedarray.Int32Array): Unit = js.native
  
  def setMatrices(name: String, mat: js.typedarray.Float32Array): Unit = js.native
  
  def setMatrix(name: String, mat: IMatrixLike): Unit = js.native
  
  def setMatrix2x2(name: String, matrix: js.typedarray.Float32Array): Unit = js.native
  
  def setMatrix3x3(name: String, matrix: js.typedarray.Float32Array): Unit = js.native
  
  def setVector3(name: String, vector: IVector3Like): Unit = js.native
  
  def setVector4(name: String, vector: IVector4Like): Unit = js.native
}
