package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitViewLayout
  extends StObject
     with FlexLayout {
  
  /**
    * Orientation of the views inside split
    */
  var orientation: String
  
  /**
    * SplitView height
    */
  var splitViewHeight: Double | String
}
object SplitViewLayout {
  
  inline def apply(orientation: String, splitViewHeight: Double | String): SplitViewLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], splitViewHeight = splitViewHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewLayout]
  }
  
  extension [Self <: SplitViewLayout](x: Self) {
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSplitViewHeight(value: Double | String): Self = StObject.set(x, "splitViewHeight", value.asInstanceOf[js.Any])
  }
}
