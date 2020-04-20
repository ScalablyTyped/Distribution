package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/uniqueIdGenerator", JSImport.Namespace)
@js.native
object uniqueIdGeneratorMod extends js.Object {
  @js.native
  class UniqueIdGenerator () extends js.Object
  
  /* static members */
  @js.native
  object UniqueIdGenerator extends js.Object {
    var _UniqueIdCounter: js.Any = js.native
    /**
      * Gets an unique (relatively to the current scene) Id
      */
    def UniqueId: Double = js.native
  }
  
}

