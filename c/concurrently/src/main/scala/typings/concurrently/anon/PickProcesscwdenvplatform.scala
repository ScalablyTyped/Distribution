package typings.concurrently.anon

import typings.node.processMod.global.NodeJS.Platform
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<node.process.<global>.NodeJS.Process, 'cwd' | 'env' | 'platform'> */
trait PickProcesscwdenvplatform extends StObject {
  
  def cwd(): String
  @JSName("cwd")
  var cwd_Original: js.Function0[String]
  
  var env: ProcessEnv
  
  var platform: Platform
}
object PickProcesscwdenvplatform {
  
  inline def apply(cwd: () => String, env: ProcessEnv, platform: Platform): PickProcesscwdenvplatform = {
    val __obj = js.Dynamic.literal(cwd = js.Any.fromFunction0(cwd), env = env.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProcesscwdenvplatform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickProcesscwdenvplatform] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: () => String): Self = StObject.set(x, "cwd", js.Any.fromFunction0(value))
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
