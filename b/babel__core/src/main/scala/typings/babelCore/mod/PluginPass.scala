package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginPass
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var cwd: String
  
  var file: BabelFile
  
  var filename: String
  
  var key: String
  
  var opts: PluginOptions
}
object PluginPass {
  
  @scala.inline
  def apply(cwd: String, file: BabelFile, filename: String, key: String): PluginPass = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPass]
  }
  
  @scala.inline
  implicit class PluginPassMutableBuilder[Self <: PluginPass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: BabelFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: PluginOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
  }
}
