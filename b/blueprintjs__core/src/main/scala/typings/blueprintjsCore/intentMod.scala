package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.danger
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.primary
import typings.blueprintjsCore.blueprintjsCoreStrings.success
import typings.blueprintjsCore.blueprintjsCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/intent", JSImport.Namespace)
@js.native
object intentMod extends js.Object {
  /* Inlined {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}[keyof {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.none
    - typings.blueprintjsCore.blueprintjsCoreStrings.primary
    - typings.blueprintjsCore.blueprintjsCoreStrings.danger
    - typings.blueprintjsCore.blueprintjsCoreStrings.warning
    - typings.blueprintjsCore.blueprintjsCoreStrings.success
  */
  trait Intent extends js.Object
  
  @js.native
  object Intent extends js.Object {
    var DANGER: danger = js.native
    var NONE: none = js.native
    var PRIMARY: primary = js.native
    var SUCCESS: success = js.native
    var WARNING: warning = js.native
  }
  
}

