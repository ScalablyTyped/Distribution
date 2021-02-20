package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitViewLayout extends FlexLayout {
  
  /**
    * Orientation of the views inside split
    */
  var orientation: String = js.native
  
  /**
    * SplitView height
    */
  var splitViewHeight: Double | String = js.native
}
object SplitViewLayout {
  
  @scala.inline
  def apply(orientation: String, splitViewHeight: Double | String): SplitViewLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], splitViewHeight = splitViewHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewLayout]
  }
  
  @scala.inline
  implicit class SplitViewLayoutMutableBuilder[Self <: SplitViewLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitViewHeight(value: Double | String): Self = StObject.set(x, "splitViewHeight", value.asInstanceOf[js.Any])
  }
}
