package typings.deglob

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(patterns: js.Array[String], cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(patterns: js.Array[String], opts: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("deglob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ Error | Null, /* files */ js.Array[String], Unit]
  
  trait Options extends StObject {
    
    var configKey: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var gitIgnoreFile: js.UndefOr[String] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var useGitIgnore: js.UndefOr[Boolean] = js.undefined
    
    var usePackageJson: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConfigKey(value: String): Self = StObject.set(x, "configKey", value.asInstanceOf[js.Any])
      
      inline def setConfigKeyUndefined: Self = StObject.set(x, "configKey", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setGitIgnoreFile(value: String): Self = StObject.set(x, "gitIgnoreFile", value.asInstanceOf[js.Any])
      
      inline def setGitIgnoreFileUndefined: Self = StObject.set(x, "gitIgnoreFile", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setUseGitIgnore(value: Boolean): Self = StObject.set(x, "useGitIgnore", value.asInstanceOf[js.Any])
      
      inline def setUseGitIgnoreUndefined: Self = StObject.set(x, "useGitIgnore", js.undefined)
      
      inline def setUsePackageJson(value: Boolean): Self = StObject.set(x, "usePackageJson", value.asInstanceOf[js.Any])
      
      inline def setUsePackageJsonUndefined: Self = StObject.set(x, "usePackageJson", js.undefined)
    }
  }
}
