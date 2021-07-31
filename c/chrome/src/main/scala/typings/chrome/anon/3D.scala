package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3D` extends StObject {
  
  var `3D`: js.UndefOr[Features] = js.undefined
  
  var plugins: js.UndefOr[Npapi] = js.undefined
}
object `3D` {
  
  @scala.inline
  def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  
  @scala.inline
  implicit class `3DMutableBuilder`[Self <: `3D`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set3D(value: Features): Self = StObject.set(x, "3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3DUndefined: Self = StObject.set(x, "3D", js.undefined)
    
    @scala.inline
    def setPlugins(value: Npapi): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
