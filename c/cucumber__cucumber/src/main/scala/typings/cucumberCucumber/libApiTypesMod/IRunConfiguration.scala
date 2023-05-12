package typings.cucumberCucumber.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunConfiguration extends StObject {
  
  var formats: IRunOptionsFormats
  
  var runtime: IRunOptionsRuntime
  
  var sources: ISourcesCoordinates
  
  var support: ISupportCodeCoordinates
}
object IRunConfiguration {
  
  inline def apply(
    formats: IRunOptionsFormats,
    runtime: IRunOptionsRuntime,
    sources: ISourcesCoordinates,
    support: ISupportCodeCoordinates
  ): IRunConfiguration = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFormats(value: IRunOptionsFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: IRunOptionsRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setSources(value: ISourcesCoordinates): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: ISupportCodeCoordinates): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
