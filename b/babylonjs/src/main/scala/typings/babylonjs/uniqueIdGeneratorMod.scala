package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/uniqueIdGenerator", JSImport.Namespace)
@js.native
object uniqueIdGeneratorMod extends js.Object {
  
  @js.native
  class UniqueIdGenerator () extends js.Object
  /* static members */
  @js.native
  object UniqueIdGenerator extends js.Object {
    
    /**
      * Gets an unique (relatively to the current scene) Id
      */
    def UniqueId: Double = js.native
    
    var _UniqueIdCounter: js.Any = js.native
  }
}
