package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Etc1 extends StObject {
  
  /**
    * etc1 compression format
    */
  var etc1: js.UndefOr[Boolean] = js.native
  
  /**
    * etc2 compression format
    */
  var etc2: js.UndefOr[Boolean] = js.native
  
  /**
    * pvrtc compression format
    */
  var pvrtc: js.UndefOr[Boolean] = js.native
  
  /**
    * s3tc compression format
    */
  var s3tc: js.UndefOr[Boolean] = js.native
}
object Etc1 {
  
  @scala.inline
  def apply(): Etc1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etc1]
  }
  
  @scala.inline
  implicit class Etc1MutableBuilder[Self <: Etc1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtc1(value: Boolean): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
    
    @scala.inline
    def setEtc2(value: Boolean): Self = StObject.set(x, "etc2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtc2Undefined: Self = StObject.set(x, "etc2", js.undefined)
    
    @scala.inline
    def setPvrtc(value: Boolean): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvrtcUndefined: Self = StObject.set(x, "pvrtc", js.undefined)
    
    @scala.inline
    def setS3tc(value: Boolean): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
  }
}
