package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  var env: String
}
object Env {
  
  @scala.inline
  def apply(env: String): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
  }
}
