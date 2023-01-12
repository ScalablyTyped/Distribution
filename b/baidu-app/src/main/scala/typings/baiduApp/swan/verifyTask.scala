package typings.baiduApp.swan

import typings.baiduApp.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait verifyTask extends StObject {
  
  var data: Result
  
  var errmsg: String
  
  var errno: String
}
object verifyTask {
  
  inline def apply(data: Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[verifyTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: verifyTask] (val x: Self) extends AnyVal {
    
    inline def setData(value: Result): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    inline def setErrno(value: String): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
  }
}
