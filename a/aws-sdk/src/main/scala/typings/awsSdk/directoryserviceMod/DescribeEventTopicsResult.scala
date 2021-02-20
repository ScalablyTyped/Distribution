package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventTopicsResult extends StObject {
  
  /**
    * A list of SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[typings.awsSdk.directoryserviceMod.EventTopics] = js.native
}
object DescribeEventTopicsResult {
  
  @scala.inline
  def apply(): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
  
  @scala.inline
  implicit class DescribeEventTopicsResultMutableBuilder[Self <: DescribeEventTopicsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTopics(value: EventTopics): Self = StObject.set(x, "EventTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTopicsUndefined: Self = StObject.set(x, "EventTopics", js.undefined)
    
    @scala.inline
    def setEventTopicsVarargs(value: EventTopic*): Self = StObject.set(x, "EventTopics", js.Array(value :_*))
  }
}
