package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancingAttributeInfo extends js.Object {
  
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
  implicit class InstancingAttributeInfoOps[Self <: InstancingAttributeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeSize(value: Double): Self = this.set("attributeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(value: Double): Self = this.set("attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("attributeType", js.undefined)
    
    @scala.inline
    def setDivisor(value: Double): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNormalized(value: Boolean): Self = this.set("normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalized: Self = this.set("normalized", js.undefined)
  }
}
