package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyReporterOptions
  extends StObject
     with BasicReporterOptions {
  
  var secondaryColor: js.UndefOr[String] = js.undefined
}
object FancyReporterOptions {
  
  inline def apply(): FancyReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyReporterOptions]
  }
  
  extension [Self <: FancyReporterOptions](x: Self) {
    
    inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
  }
}
