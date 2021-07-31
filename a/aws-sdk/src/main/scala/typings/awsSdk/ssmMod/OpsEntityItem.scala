package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsEntityItem extends StObject {
  
  /**
    * The time OpsItem data was captured.
    */
  var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.undefined
  
  /**
    * The detailed data content for an OpsItem summaries result item.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.undefined
}
object OpsEntityItem {
  
  @scala.inline
  def apply(): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntityItem]
  }
  
  @scala.inline
  implicit class OpsEntityItemMutableBuilder[Self <: OpsEntityItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTime(value: OpsEntityItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    @scala.inline
    def setContent(value: OpsEntityItemEntryList): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: OpsEntityItemEntry*): Self = StObject.set(x, "Content", js.Array(value :_*))
  }
}
