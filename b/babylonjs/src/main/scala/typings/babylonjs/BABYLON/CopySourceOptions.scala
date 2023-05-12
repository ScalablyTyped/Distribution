package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySourceOptions extends StObject {
  
  var cloneTexturesOnlyOnce: js.UndefOr[Boolean] = js.undefined
}
object CopySourceOptions {
  
  inline def apply(): CopySourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopySourceOptions] (val x: Self) extends AnyVal {
    
    inline def setCloneTexturesOnlyOnce(value: Boolean): Self = StObject.set(x, "cloneTexturesOnlyOnce", value.asInstanceOf[js.Any])
    
    inline def setCloneTexturesOnlyOnceUndefined: Self = StObject.set(x, "cloneTexturesOnlyOnce", js.undefined)
  }
}
