package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingTaskCount extends StObject {
  
  /**
    * The number of tasks in the task list.
    */
  var count: Count
  
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.undefined
}
object PendingTaskCount {
  
  inline def apply(count: Count): PendingTaskCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingTaskCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingTaskCount] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTruncated(value: Truncated): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
  }
}
