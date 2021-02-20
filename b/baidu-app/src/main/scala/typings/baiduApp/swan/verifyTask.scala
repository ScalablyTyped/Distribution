package typings.baiduApp.swan

import typings.baiduApp.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait verifyTask extends StObject {
  
  var data: Result = js.native
  
  var errmsg: String = js.native
  
  var errno: String = js.native
}
object verifyTask {
  
  @scala.inline
  def apply(data: Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[verifyTask]
  }
  
  @scala.inline
  implicit class verifyTaskMutableBuilder[Self <: verifyTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Result): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrno(value: String): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
  }
}
