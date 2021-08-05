package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchedLogStream extends StObject {
  
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * Indicates whether all the events in this log stream were searched.
    */
  var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.undefined
}
object SearchedLogStream {
  
  inline def apply(): SearchedLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedLogStream]
  }
  
  extension [Self <: SearchedLogStream](x: Self) {
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    inline def setSearchedCompletely(value: LogStreamSearchedCompletely): Self = StObject.set(x, "searchedCompletely", value.asInstanceOf[js.Any])
    
    inline def setSearchedCompletelyUndefined: Self = StObject.set(x, "searchedCompletely", js.undefined)
  }
}
