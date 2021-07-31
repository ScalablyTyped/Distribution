package typings.baiduApp.swan

import typings.baiduApp.anon.Swanid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwanIdTask extends StObject {
  
  var data: Swanid
  
  var errno: String
}
object SwanIdTask {
  
  @scala.inline
  def apply(data: Swanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwanIdTask]
  }
  
  @scala.inline
  implicit class SwanIdTaskMutableBuilder[Self <: SwanIdTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Swanid): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrno(value: String): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
  }
}
