package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/deepCopier", JSImport.Namespace)
@js.native
object deepCopierMod extends js.Object {
  @js.native
  class DeepCopier () extends js.Object
  
  /* static members */
  @js.native
  object DeepCopier extends js.Object {
    /**
      * Tries to copy an object by duplicating every property
      * @param source defines the source object
      * @param destination defines the target object
      * @param doNotCopyList defines a list of properties to avoid
      * @param mustCopyList defines a list of properties to copy (even if they start with _)
      */
    def DeepCopy(source: js.Any, destination: js.Any): Unit = js.native
    def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = js.native
    def DeepCopy(
      source: js.Any,
      destination: js.Any,
      doNotCopyList: js.Array[String],
      mustCopyList: js.Array[String]
    ): Unit = js.native
  }
  
}

