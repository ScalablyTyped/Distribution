package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivContainerProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Indicates whether the element is clickable
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Matches the overflow-y CSS property and its available values.
    */
  var overflowY: js.UndefOr[String] = js.undefined
  
  /**
    * Setting the scroll based on the y offset
    * This is used when its child component is webview
    */
  var yOffsetChange: js.UndefOr[Double] = js.undefined
}
object DivContainerProperties {
  
  @scala.inline
  def apply(): DivContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivContainerProperties]
  }
  
  @scala.inline
  implicit class DivContainerPropertiesMutableBuilder[Self <: DivContainerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    @scala.inline
    def setYOffsetChange(value: Double): Self = StObject.set(x, "yOffsetChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetChangeUndefined: Self = StObject.set(x, "yOffsetChange", js.undefined)
  }
}
