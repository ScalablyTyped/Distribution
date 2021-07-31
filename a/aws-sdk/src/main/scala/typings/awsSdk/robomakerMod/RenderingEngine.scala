package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingEngine extends StObject {
  
  /**
    * The name of the rendering engine.
    */
  var name: js.UndefOr[RenderingEngineType] = js.undefined
  
  /**
    * The version of the rendering engine.
    */
  var version: js.UndefOr[RenderingEngineVersionType] = js.undefined
}
object RenderingEngine {
  
  @scala.inline
  def apply(): RenderingEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingEngine]
  }
  
  @scala.inline
  implicit class RenderingEngineMutableBuilder[Self <: RenderingEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RenderingEngineType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: RenderingEngineVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
