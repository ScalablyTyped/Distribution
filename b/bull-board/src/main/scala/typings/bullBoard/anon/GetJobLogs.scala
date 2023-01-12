package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobLogs extends StObject {
  
  def getJobLogs(): js.Promise[js.Array[String]]
}
object GetJobLogs {
  
  inline def apply(getJobLogs: () => js.Promise[js.Array[String]]): GetJobLogs = {
    val __obj = js.Dynamic.literal(getJobLogs = js.Any.fromFunction0(getJobLogs))
    __obj.asInstanceOf[GetJobLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobLogs] (val x: Self) extends AnyVal {
    
    inline def setGetJobLogs(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getJobLogs", js.Any.fromFunction0(value))
  }
}
