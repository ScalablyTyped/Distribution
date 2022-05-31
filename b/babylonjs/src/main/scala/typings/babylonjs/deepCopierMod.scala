package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCopierMod {
  
  @JSImport("babylonjs/Misc/deepCopier", "DeepCopier")
  @js.native
  class DeepCopier () extends StObject
  /* static members */
  object DeepCopier {
    
    @JSImport("babylonjs/Misc/deepCopier", "DeepCopier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tries to copy an object by duplicating every property
      * @param source defines the source object
      * @param destination defines the target object
      * @param doNotCopyList defines a list of properties to avoid
      * @param mustCopyList defines a list of properties to copy (even if they start with _)
      */
    inline def DeepCopy(source: js.Any, destination: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(
      source: js.Any,
      destination: js.Any,
      doNotCopyList: js.Array[String],
      mustCopyList: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: Unit, mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
