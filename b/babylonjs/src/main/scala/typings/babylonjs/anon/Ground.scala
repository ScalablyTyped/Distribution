package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ground extends StObject {
  
  /**
    * Should the ground be removed (default false)
    */
  var ground: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the skybox be removed (default false)
    */
  var skyBox: js.UndefOr[Boolean] = js.native
}
object Ground {
  
  @scala.inline
  def apply(): Ground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ground]
  }
  
  @scala.inline
  implicit class GroundMutableBuilder[Self <: Ground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGround(value: Boolean): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundUndefined: Self = StObject.set(x, "ground", js.undefined)
    
    @scala.inline
    def setSkyBox(value: Boolean): Self = StObject.set(x, "skyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyBoxUndefined: Self = StObject.set(x, "skyBox", js.undefined)
  }
}
