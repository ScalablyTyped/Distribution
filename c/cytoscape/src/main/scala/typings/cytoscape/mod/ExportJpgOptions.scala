package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJpgOptions
  extends StObject
     with ExportOptions {
  
  /**
    * quality Specifies the quality of the image from 0
    * (low quality, low filesize) to 1 (high quality, high filesize).
    * If not set, the browser's default quality value is used.
    */
  var quality: js.UndefOr[Double] = js.undefined
}
object ExportJpgOptions {
  
  inline def apply(): ExportJpgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgOptions]
  }
  
  extension [Self <: ExportJpgOptions](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
