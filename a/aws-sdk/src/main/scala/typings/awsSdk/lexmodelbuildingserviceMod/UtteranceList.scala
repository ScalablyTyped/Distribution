package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtteranceList extends StObject {
  
  /**
    * The version of the bot that processed the list.
    */
  var botVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * One or more UtteranceData objects that contain information about the utterances that have been made to a bot. The maximum number of object is 100.
    */
  var utterances: js.UndefOr[ListOfUtterance] = js.undefined
}
object UtteranceList {
  
  inline def apply(): UtteranceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceList]
  }
  
  extension [Self <: UtteranceList](x: Self) {
    
    inline def setBotVersion(value: Version): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setUtterances(value: ListOfUtterance): Self = StObject.set(x, "utterances", value.asInstanceOf[js.Any])
    
    inline def setUtterancesUndefined: Self = StObject.set(x, "utterances", js.undefined)
    
    inline def setUtterancesVarargs(value: UtteranceData*): Self = StObject.set(x, "utterances", js.Array(value :_*))
  }
}
