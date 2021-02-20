package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rebuild extends StObject {
  
  /** the material should be rebuilt */
  var rebuild: js.UndefOr[Boolean] = js.native
  
  /** the preview should be updated */
  var update: js.UndefOr[Boolean] = js.native
}
object Rebuild {
  
  @scala.inline
  def apply(): Rebuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rebuild]
  }
  
  @scala.inline
  implicit class RebuildMutableBuilder[Self <: Rebuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRebuild(value: Boolean): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
