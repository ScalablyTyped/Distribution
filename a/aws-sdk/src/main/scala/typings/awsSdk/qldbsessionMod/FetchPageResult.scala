package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPageResult extends StObject {
  
  /**
    * Contains metrics about the number of I/O requests that were consumed.
    */
  var ConsumedIOs: js.UndefOr[IOUsage] = js.undefined
  
  /**
    * Contains details of the fetched page.
    */
  var Page: js.UndefOr[typings.awsSdk.qldbsessionMod.Page] = js.undefined
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typings.awsSdk.qldbsessionMod.TimingInformation] = js.undefined
}
object FetchPageResult {
  
  inline def apply(): FetchPageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPageResult]
  }
  
  extension [Self <: FetchPageResult](x: Self) {
    
    inline def setConsumedIOs(value: IOUsage): Self = StObject.set(x, "ConsumedIOs", value.asInstanceOf[js.Any])
    
    inline def setConsumedIOsUndefined: Self = StObject.set(x, "ConsumedIOs", js.undefined)
    
    inline def setPage(value: Page): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
  }
}
