package typings.deglob

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deglob", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String], cb: Callback): Unit = js.native
  @JSImport("deglob", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String], opts: Options, cb: Callback): Unit = js.native
  
  type Callback = js.Function2[/* err */ Error | Null, /* files */ js.Array[String], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var configKey: js.UndefOr[String] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var gitIgnoreFile: js.UndefOr[String] = js.native
    
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    var useGitIgnore: js.UndefOr[Boolean] = js.native
    
    var usePackageJson: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigKey(value: String): Self = StObject.set(x, "configKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigKeyUndefined: Self = StObject.set(x, "configKey", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setGitIgnoreFile(value: String): Self = StObject.set(x, "gitIgnoreFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitIgnoreFileUndefined: Self = StObject.set(x, "gitIgnoreFile", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setUseGitIgnore(value: Boolean): Self = StObject.set(x, "useGitIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGitIgnoreUndefined: Self = StObject.set(x, "useGitIgnore", js.undefined)
      
      @scala.inline
      def setUsePackageJson(value: Boolean): Self = StObject.set(x, "usePackageJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePackageJsonUndefined: Self = StObject.set(x, "usePackageJson", js.undefined)
    }
  }
}
