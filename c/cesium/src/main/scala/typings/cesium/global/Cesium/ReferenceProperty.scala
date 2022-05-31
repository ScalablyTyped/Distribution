package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ReferenceProperty")
@js.native
class ReferenceProperty protected ()
  extends typings.cesium.mod.ReferenceProperty {
  def this(
    targetCollection: typings.cesium.mod.EntityCollection,
    targetId: String,
    targetPropertyNames: String
  ) = this()
}
object ReferenceProperty {
  
  @JSGlobal("Cesium.ReferenceProperty")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromString(targetCollection: typings.cesium.mod.Entity, referenceString: String): typings.cesium.mod.ReferenceProperty = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(targetCollection.asInstanceOf[js.Any], referenceString.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ReferenceProperty]
}
