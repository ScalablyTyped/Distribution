package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var code: Double
  
  var info: js.Any
}
object Info {
  
  @scala.inline
  def apply(code: Double, info: js.Any): Info = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
