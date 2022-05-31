package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedAlphaBlending extends StObject {
  
  var needAlphaBlending: Boolean
  
  var needAlphaTesting: Boolean
  
  var needWorldViewMatrix: Boolean
  
  var needWorldViewProjectionMatrix: Boolean
}
object NeedAlphaBlending {
  
  inline def apply(
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    needWorldViewMatrix: Boolean,
    needWorldViewProjectionMatrix: Boolean
  ): NeedAlphaBlending = {
    val __obj = js.Dynamic.literal(needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], needWorldViewMatrix = needWorldViewMatrix.asInstanceOf[js.Any], needWorldViewProjectionMatrix = needWorldViewProjectionMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedAlphaBlending]
  }
  
  extension [Self <: NeedAlphaBlending](x: Self) {
    
    inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    inline def setNeedWorldViewMatrix(value: Boolean): Self = StObject.set(x, "needWorldViewMatrix", value.asInstanceOf[js.Any])
    
    inline def setNeedWorldViewProjectionMatrix(value: Boolean): Self = StObject.set(x, "needWorldViewProjectionMatrix", value.asInstanceOf[js.Any])
  }
}
