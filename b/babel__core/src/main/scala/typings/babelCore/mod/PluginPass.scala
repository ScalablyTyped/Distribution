package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginPass
  extends /* key */ StringDictionary[js.Any] {
  
  var cwd: String = js.native
  
  var file: BabelFile = js.native
  
  var filename: String = js.native
  
  var key: String = js.native
  
  var opts: PluginOptions = js.native
}
object PluginPass {
  
  @scala.inline
  def apply(cwd: String, file: BabelFile, filename: String, key: String): PluginPass = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPass]
  }
  
  @scala.inline
  implicit class PluginPassOps[Self <: PluginPass] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: BabelFile): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: PluginOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
}
