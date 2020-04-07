package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/guid", JSImport.Namespace)
@js.native
object guidMod extends js.Object {
  @js.native
  class GUID () extends js.Object
  
  /* static members */
  @js.native
  object GUID extends js.Object {
    /**
      * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
      * Be aware Math.random() could cause collisions, but:
      * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
      * @returns a pseudo random id
      */
    def RandomId(): String = js.native
  }
  
}

