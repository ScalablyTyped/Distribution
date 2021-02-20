package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtteranceData extends StObject {
  
  /**
    * The number of times that the utterance was processed.
    */
  var count: js.UndefOr[Count] = js.native
  
  /**
    * The total number of individuals that used the utterance.
    */
  var distinctUsers: js.UndefOr[Count] = js.native
  
  /**
    * The date that the utterance was first recorded.
    */
  var firstUtteredDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date that the utterance was last recorded.
    */
  var lastUtteredDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The text that was entered by the user or the text representation of an audio clip.
    */
  var utteranceString: js.UndefOr[UtteranceString] = js.native
}
object UtteranceData {
  
  @scala.inline
  def apply(): UtteranceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceData]
  }
  
  @scala.inline
  implicit class UtteranceDataMutableBuilder[Self <: UtteranceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDistinctUsers(value: Count): Self = StObject.set(x, "distinctUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUsersUndefined: Self = StObject.set(x, "distinctUsers", js.undefined)
    
    @scala.inline
    def setFirstUtteredDate(value: Timestamp): Self = StObject.set(x, "firstUtteredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUtteredDateUndefined: Self = StObject.set(x, "firstUtteredDate", js.undefined)
    
    @scala.inline
    def setLastUtteredDate(value: Timestamp): Self = StObject.set(x, "lastUtteredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUtteredDateUndefined: Self = StObject.set(x, "lastUtteredDate", js.undefined)
    
    @scala.inline
    def setUtteranceString(value: UtteranceString): Self = StObject.set(x, "utteranceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtteranceStringUndefined: Self = StObject.set(x, "utteranceString", js.undefined)
  }
}
