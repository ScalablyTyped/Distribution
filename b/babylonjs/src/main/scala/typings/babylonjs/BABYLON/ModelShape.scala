package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelShape extends StObject {
  
  /**
    * indices array of the model
    * @hidden
    */
  var _indices: js.Array[Double] = js.native
  
  /**
    * length of the shape in the model indices array (internal use)
    * @hidden
    */
  var _indicesLength: Double = js.native
  
  /**
    * Model material (internal use)
    * @hidden
    */
  var _material: Nullable[Material] = js.native
  
  /**
    * normals array of the model
    * @hidden
    */
  var _normals: js.Array[Double] = js.native
  
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]] = js.native
  
  /**
    * flat array of model positions (internal use)
    * @hidden
    */
  var _shape: js.Array[Vector3] = js.native
  
  /**
    * color array of the model
    * @hidden
    */
  var _shapeColors: js.Array[Double] = js.native
  
  /**
    * flat array of model UVs (internal use)
    * @hidden
    */
  var _shapeUV: js.Array[Double] = js.native
  
  /**
    * Custom vertex function (internal use)
    * @hidden
    */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
  ] = js.native
  
  /**
    * The shape id
    * @hidden
    */
  var shapeID: Double = js.native
}
object ModelShape {
  
  @scala.inline
  def apply(
    _indices: js.Array[Double],
    _indicesLength: Double,
    _normals: js.Array[Double],
    _shape: js.Array[Vector3],
    _shapeColors: js.Array[Double],
    _shapeUV: js.Array[Double],
    shapeID: Double
  ): ModelShape = {
    val __obj = js.Dynamic.literal(_indices = _indices.asInstanceOf[js.Any], _indicesLength = _indicesLength.asInstanceOf[js.Any], _normals = _normals.asInstanceOf[js.Any], _shape = _shape.asInstanceOf[js.Any], _shapeColors = _shapeColors.asInstanceOf[js.Any], _shapeUV = _shapeUV.asInstanceOf[js.Any], shapeID = shapeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelShape]
  }
  
  @scala.inline
  implicit class ModelShapeMutableBuilder[Self <: ModelShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShapeID(value: Double): Self = StObject.set(x, "shapeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indices(value: js.Array[Double]): Self = StObject.set(x, "_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indicesLength(value: Double): Self = StObject.set(x, "_indicesLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indicesVarargs(value: Double*): Self = StObject.set(x, "_indices", js.Array(value :_*))
    
    @scala.inline
    def set_material(value: Nullable[Material]): Self = StObject.set(x, "_material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_materialNull: Self = StObject.set(x, "_material", null)
    
    @scala.inline
    def set_normals(value: js.Array[Double]): Self = StObject.set(x, "_normals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_normalsVarargs(value: Double*): Self = StObject.set(x, "_normals", js.Array(value :_*))
    
    @scala.inline
    def set_positionFunction(value: (/* particle */ SolidParticle, /* i */ Double, /* s */ Double) => Unit): Self = StObject.set(x, "_positionFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_positionFunctionNull: Self = StObject.set(x, "_positionFunction", null)
    
    @scala.inline
    def set_shape(value: js.Array[Vector3]): Self = StObject.set(x, "_shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shapeColors(value: js.Array[Double]): Self = StObject.set(x, "_shapeColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shapeColorsVarargs(value: Double*): Self = StObject.set(x, "_shapeColors", js.Array(value :_*))
    
    @scala.inline
    def set_shapeUV(value: js.Array[Double]): Self = StObject.set(x, "_shapeUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shapeUVVarargs(value: Double*): Self = StObject.set(x, "_shapeUV", js.Array(value :_*))
    
    @scala.inline
    def set_shapeVarargs(value: Vector3*): Self = StObject.set(x, "_shape", js.Array(value :_*))
    
    @scala.inline
    def set_vertexFunction(value: (/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double) => Unit): Self = StObject.set(x, "_vertexFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_vertexFunctionNull: Self = StObject.set(x, "_vertexFunction", null)
  }
}
