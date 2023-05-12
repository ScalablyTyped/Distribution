package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompressedFormatCapabilities extends StObject {
  
  /**
    * Whether the browser supports ASTC
    */
  var astc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the browser supports BPTC
    */
  var bptc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the browser supports ETC1
    */
  var etc1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the browser supports ETC2
    */
  var etc2: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the browser supports PVRTC
    */
  var pvrtc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the browser supports S3TC
    */
  var s3tc: js.UndefOr[Boolean] = js.undefined
}
object ICompressedFormatCapabilities {
  
  inline def apply(): ICompressedFormatCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompressedFormatCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompressedFormatCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAstc(value: Boolean): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAstcUndefined: Self = StObject.set(x, "astc", js.undefined)
    
    inline def setBptc(value: Boolean): Self = StObject.set(x, "bptc", value.asInstanceOf[js.Any])
    
    inline def setBptcUndefined: Self = StObject.set(x, "bptc", js.undefined)
    
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
