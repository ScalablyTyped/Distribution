package typings.babelCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialConfig extends StObject {
  
  var babelignore: js.UndefOr[String] = js.native
  
  var babelrc: js.UndefOr[String] = js.native
  
  var config: js.UndefOr[String] = js.native
  
  def hasFilesystemConfig(): Boolean = js.native
  
  var options: TransformOptions = js.native
}
object PartialConfig {
  
  @scala.inline
  def apply(hasFilesystemConfig: () => Boolean, options: TransformOptions): PartialConfig = {
    val __obj = js.Dynamic.literal(hasFilesystemConfig = js.Any.fromFunction0(hasFilesystemConfig), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
  
  @scala.inline
  implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBabelignore(value: String): Self = StObject.set(x, "babelignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelignoreUndefined: Self = StObject.set(x, "babelignore", js.undefined)
    
    @scala.inline
    def setBabelrc(value: String): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setHasFilesystemConfig(value: () => Boolean): Self = StObject.set(x, "hasFilesystemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: TransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
