package typings.cswAasJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js/dist/config/configs", JSImport.Namespace)
@js.native
object configsMod extends js.Object {
  @js.native
  object AASConfig extends js.Object {
    var `ssl-required`: String = js.native
    var `use-resource-role-mappings`: Boolean = js.native
    var `verify-token-audience`: Boolean = js.native
  }
  
  @js.native
  object Config extends js.Object {
    var `AAS-server-name`: String = js.native
    var `AAS-server-url`: String = js.native
    var `location-server-url`: String = js.native
  }
  
}

