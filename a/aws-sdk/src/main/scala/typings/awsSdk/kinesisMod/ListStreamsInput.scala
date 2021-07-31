package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsInput extends StObject {
  
  /**
    * The name of the stream to start the list with.
    */
  var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined
  
  /**
    * The maximum number of streams to list.
    */
  var Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
}
object ListStreamsInput {
  
  @scala.inline
  def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  
  @scala.inline
  implicit class ListStreamsInputMutableBuilder[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartStreamName(value: StreamName): Self = StObject.set(x, "ExclusiveStartStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartStreamNameUndefined: Self = StObject.set(x, "ExclusiveStartStreamName", js.undefined)
    
    @scala.inline
    def setLimit(value: ListStreamsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
