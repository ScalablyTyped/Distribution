package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rebuild extends StObject {
  
  /** the material should be rebuilt */
  var rebuild: js.UndefOr[Boolean] = js.undefined
  
  /** the preview should be updated */
  var update: js.UndefOr[Boolean] = js.undefined
}
object Rebuild {
  
  inline def apply(): Rebuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rebuild]
  }
  
  extension [Self <: Rebuild](x: Self) {
    
    inline def setRebuild(value: Boolean): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
