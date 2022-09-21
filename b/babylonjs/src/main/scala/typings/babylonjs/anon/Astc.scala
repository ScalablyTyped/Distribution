package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Astc extends StObject {
  
  /**
    * astc compression format
    */
  var astc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * bc7 compression format
    */
  var bc7: js.UndefOr[Boolean] = js.undefined
  
  /**
    * etc1 compression format
    */
  var etc1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * etc2 compression format
    */
  var etc2: js.UndefOr[Boolean] = js.undefined
  
  /**
    * pvrtc compression format
    */
  var pvrtc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * s3tc compression format
    */
  var s3tc: js.UndefOr[Boolean] = js.undefined
}
object Astc {
  
  inline def apply(): Astc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Astc]
  }
  
  extension [Self <: Astc](x: Self) {
    
    inline def setAstc(value: Boolean): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAstcUndefined: Self = StObject.set(x, "astc", js.undefined)
    
    inline def setBc7(value: Boolean): Self = StObject.set(x, "bc7", value.asInstanceOf[js.Any])
    
    inline def setBc7Undefined: Self = StObject.set(x, "bc7", js.undefined)
    
    inline def setEtc1(value: Boolean): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    inline def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
    
    inline def setEtc2(value: Boolean): Self = StObject.set(x, "etc2", value.asInstanceOf[js.Any])
    
    inline def setEtc2Undefined: Self = StObject.set(x, "etc2", js.undefined)
    
    inline def setPvrtc(value: Boolean): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    inline def setPvrtcUndefined: Self = StObject.set(x, "pvrtc", js.undefined)
    
    inline def setS3tc(value: Boolean): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
  }
}
