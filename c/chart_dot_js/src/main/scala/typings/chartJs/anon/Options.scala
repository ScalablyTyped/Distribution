package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.LinearScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: LinearScaleOptions
}
object Options {
  
  inline def apply(options: LinearScaleOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: LinearScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
