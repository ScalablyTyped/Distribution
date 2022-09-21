package typings.webpackCdYQfbEx.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateTimeout extends StObject {
  
  /**
  		 * Delay the rebuilt after the first change. Value is a time in ms.
  		 */
  var aggregateTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Ignore some files from watching
  		 */
  var ignored: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  		 * Enable polling mode for watching
  		 */
  var poll: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
  		 * Stop watching when stdin stream has ended
  		 */
  var stdin: js.UndefOr[Boolean] = js.undefined
}
object AggregateTimeout {
  
  inline def apply(): AggregateTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateTimeout]
  }
  
  extension [Self <: AggregateTimeout](x: Self) {
    
    inline def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
    
    inline def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
    
    inline def setIgnored(value: StringDictionary[Any]): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
  }
}
