package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeepCopier")
@js.native
open class DeepCopier ()
  extends StObject
     with typings.babylonjs.BABYLON.DeepCopier
/* static members */
object DeepCopier {
  
  @JSGlobal("BABYLON.DeepCopier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  inline def DeepCopy(source: Any, destination: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(source: Any, destination: Any, doNotCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(source: Any, destination: Any, doNotCopyList: js.Array[String], mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(source: Any, destination: Any, doNotCopyList: Unit, mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
