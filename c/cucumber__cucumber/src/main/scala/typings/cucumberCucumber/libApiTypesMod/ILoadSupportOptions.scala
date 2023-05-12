package typings.cucumberCucumber.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadSupportOptions extends StObject {
  
  var sources: ISourcesCoordinates
  
  var support: ISupportCodeCoordinates
}
object ILoadSupportOptions {
  
  inline def apply(sources: ISourcesCoordinates, support: ISupportCodeCoordinates): ILoadSupportOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadSupportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoadSupportOptions] (val x: Self) extends AnyVal {
    
    inline def setSources(value: ISourcesCoordinates): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: ISupportCodeCoordinates): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
