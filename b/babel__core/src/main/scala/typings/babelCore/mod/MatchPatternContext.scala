package typings.babelCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchPatternContext extends StObject {
  
  var caller: js.UndefOr[TransformCaller] = js.native
  
  var dirname: String = js.native
  
  var envName: String = js.native
}
object MatchPatternContext {
  
  @scala.inline
  def apply(dirname: String, envName: String): MatchPatternContext = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], envName = envName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPatternContext]
  }
  
  @scala.inline
  implicit class MatchPatternContextMutableBuilder[Self <: MatchPatternContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
  }
}
