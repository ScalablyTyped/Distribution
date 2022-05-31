package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Etc1 extends StObject {
  
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
object Etc1 {
  
  inline def apply(): Etc1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etc1]
  }
  
  extension [Self <: Etc1](x: Self) {
    
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
