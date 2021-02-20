package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeedAlphaBlending extends StObject {
  
  var needAlphaBlending: Boolean = js.native
  
  var needAlphaTesting: Boolean = js.native
  
  var needWorldViewMatrix: Boolean = js.native
  
  var needWorldViewProjectionMatrix: Boolean = js.native
}
object NeedAlphaBlending {
  
  @scala.inline
  def apply(
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    needWorldViewMatrix: Boolean,
    needWorldViewProjectionMatrix: Boolean
  ): NeedAlphaBlending = {
    val __obj = js.Dynamic.literal(needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], needWorldViewMatrix = needWorldViewMatrix.asInstanceOf[js.Any], needWorldViewProjectionMatrix = needWorldViewProjectionMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedAlphaBlending]
  }
  
  @scala.inline
  implicit class NeedAlphaBlendingMutableBuilder[Self <: NeedAlphaBlending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedWorldViewMatrix(value: Boolean): Self = StObject.set(x, "needWorldViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedWorldViewProjectionMatrix(value: Boolean): Self = StObject.set(x, "needWorldViewProjectionMatrix", value.asInstanceOf[js.Any])
  }
}
