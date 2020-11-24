package typings.carbonMotion

import typings.carbonMotion.anon.Expressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@carbon/motion", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object easings extends js.Object {
    
    var entrance: Expressive = js.native
    
    var exit: Expressive = js.native
    
    var standard: Expressive = js.native
  }
  
  @js.native
  object motion extends js.Object {
    
    def apply(name: String, mode: String): String = js.native
  }
}
