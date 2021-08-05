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
  
  inline def apply(): RenderingEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingEngine]
  }
  
  extension [Self <: RenderingEngine](x: Self) {
    
    inline def setName(value: RenderingEngineType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: RenderingEngineVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
