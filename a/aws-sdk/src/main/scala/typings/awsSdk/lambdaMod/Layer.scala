package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[LayerVersionArn] = js.undefined
  
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
}
object Layer {
  
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: LayerVersionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCodeSize(value: Long): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
  }
}
