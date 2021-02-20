package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  var renderer: String = js.native
  
  var vendor: String = js.native
  
  var version: String = js.native
}
object Renderer {
  
  @scala.inline
  def apply(renderer: String, vendor: String, version: String): Renderer = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
