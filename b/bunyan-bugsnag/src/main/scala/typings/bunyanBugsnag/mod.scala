package typings.bunyanBugsnag

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-bugsnag", JSImport.Default)
  @js.native
  def default(options: Options): Writable = js.native
  
  @js.native
  trait Options extends StObject {
    
    var bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any = js.native
    
    var errorLevel: js.UndefOr[Double | String] = js.native
    
    var systemInfo: js.UndefOr[js.Array[String]] = js.native
    
    var warningLevel: js.UndefOr[Double | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
    ): Options = {
      val __obj = js.Dynamic.literal(bugsnagClient = bugsnagClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBugsnagClient(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
      ): Self = StObject.set(x, "bugsnagClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLevel(value: Double | String): Self = StObject.set(x, "errorLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLevelUndefined: Self = StObject.set(x, "errorLevel", js.undefined)
      
      @scala.inline
      def setSystemInfo(value: js.Array[String]): Self = StObject.set(x, "systemInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemInfoUndefined: Self = StObject.set(x, "systemInfo", js.undefined)
      
      @scala.inline
      def setSystemInfoVarargs(value: String*): Self = StObject.set(x, "systemInfo", js.Array(value :_*))
      
      @scala.inline
      def setWarningLevel(value: Double | String): Self = StObject.set(x, "warningLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningLevelUndefined: Self = StObject.set(x, "warningLevel", js.undefined)
    }
  }
}
