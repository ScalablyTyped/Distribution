package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchPatternContext extends js.Object {
  
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
  implicit class MatchPatternContextOps[Self <: MatchPatternContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvName(value: String): Self = this.set("envName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaller(value: TransformCaller): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
  }
}
