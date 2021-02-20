package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancingAttributeInfo extends StObject {
  
  /**
    * Name of the GLSL attribute
    * if attribute index is not specified, this is used to retrieve the index from the effect
    */
  var attributeName: String = js.native
  
  /**
    * size of the attribute, 1, 2, 3 or 4
    */
  var attributeSize: Double = js.native
  
  /**
    * type of the attribute, gl.BYTE, gl.UNSIGNED_BYTE, gl.SHORT, gl.UNSIGNED_SHORT, gl.FIXED, gl.FLOAT.
    * default is FLOAT
    */
  var attributeType: js.UndefOr[Double] = js.native
  
  /**
    * Modifies the rate at which generic vertex attributes advance when rendering multiple instances
    * default to 1
    */
  var divisor: js.UndefOr[Double] = js.native
  
  /**
    * Index/offset of the attribute in the vertex shader
    * if not specified, this will be computes from the name.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * normalization of fixed-point data. behavior unclear, use FALSE, default is FALSE
    */
  var normalized: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset of the data in the Vertex Buffer acting as the instancing buffer
    */
  var offset: Double = js.native
}
object InstancingAttributeInfo {
  
  @scala.inline
  def apply(attributeName: String, attributeSize: Double, offset: Double): InstancingAttributeInfo = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeSize = attributeSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancingAttributeInfo]
  }
  
  @scala.inline
  implicit class InstancingAttributeInfoMutableBuilder[Self <: InstancingAttributeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeSize(value: Double): Self = StObject.set(x, "attributeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(value: Double): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
    
    @scala.inline
    def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedUndefined: Self = StObject.set(x, "normalized", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
