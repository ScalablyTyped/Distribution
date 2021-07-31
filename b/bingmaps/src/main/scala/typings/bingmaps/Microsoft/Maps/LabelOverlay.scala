package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelOverlay extends StObject
@JSGlobal("Microsoft.Maps.LabelOverlay")
@js.native
object LabelOverlay extends StObject {
  
  /**
    * Map labels are hidden. Note that this will have no effect on road maps unless the allowHidingLabelsOfRoad map option
    * is set to true.
    */
  @js.native
  sealed trait hidden
    extends StObject
       with LabelOverlay
  
  /**  Map labels are visible. */
  @js.native
  sealed trait visible
    extends StObject
       with LabelOverlay
}
