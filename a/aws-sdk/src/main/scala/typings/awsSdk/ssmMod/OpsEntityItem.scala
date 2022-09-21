package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsEntityItem extends StObject {
  
  /**
    * The time the OpsData was captured.
    */
  var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.undefined
  
  /**
    * The details of an OpsData summary.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.undefined
}
object OpsEntityItem {
  
  inline def apply(): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntityItem]
  }
  
  extension [Self <: OpsEntityItem](x: Self) {
    
    inline def setCaptureTime(value: OpsEntityItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    inline def setContent(value: OpsEntityItemEntryList): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: OpsEntityItemEntry*): Self = StObject.set(x, "Content", js.Array(value*))
  }
}
