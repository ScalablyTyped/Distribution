package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.blueimpLoadImage.mod.MetaTrueOptions
  - typings.blueimpLoadImage.mod.MetaFalseOptions
*/
trait MetaOptions extends StObject
object MetaOptions {
  
  inline def MetaFalseOptions(): typings.blueimpLoadImage.mod.MetaFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaFalseOptions]
  }
  
  inline def MetaTrueOptions(orientation: Orientation): typings.blueimpLoadImage.mod.MetaTrueOptions = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.blueimpLoadImage.mod.MetaTrueOptions]
  }
}
