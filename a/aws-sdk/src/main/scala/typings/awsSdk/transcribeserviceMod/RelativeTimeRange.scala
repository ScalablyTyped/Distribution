package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeTimeRange extends StObject {
  
  /**
    * The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media file. If you include EndPercentage in your request, you must also include StartPercentage.
    */
  var EndPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The time, in percentage, from the start of your media file until the value you specify in which Amazon Transcribe searches for your specified criteria.
    */
  var First: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The time, in percentage, from the value you specify until the end of your media file in which Amazon Transcribe searches for your specified criteria.
    */
  var Last: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media file. If you include StartPercentage in your request, you must also include EndPercentage.
    */
  var StartPercentage: js.UndefOr[Percentage] = js.undefined
}
object RelativeTimeRange {
  
  inline def apply(): RelativeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeRange]
  }
  
  extension [Self <: RelativeTimeRange](x: Self) {
    
    inline def setEndPercentage(value: Percentage): Self = StObject.set(x, "EndPercentage", value.asInstanceOf[js.Any])
    
    inline def setEndPercentageUndefined: Self = StObject.set(x, "EndPercentage", js.undefined)
    
    inline def setFirst(value: Percentage): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "First", js.undefined)
    
    inline def setLast(value: Percentage): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "Last", js.undefined)
    
    inline def setStartPercentage(value: Percentage): Self = StObject.set(x, "StartPercentage", value.asInstanceOf[js.Any])
    
    inline def setStartPercentageUndefined: Self = StObject.set(x, "StartPercentage", js.undefined)
  }
}
