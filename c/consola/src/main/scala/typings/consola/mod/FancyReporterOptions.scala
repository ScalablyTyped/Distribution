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
  
  @scala.inline
  def apply(): FancyReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyReporterOptions]
  }
  
  @scala.inline
  implicit class FancyReporterOptionsMutableBuilder[Self <: FancyReporterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
  }
}
