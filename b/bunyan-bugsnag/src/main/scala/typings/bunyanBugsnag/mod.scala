package typings.bunyanBugsnag

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-bugsnag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
  
  trait Options extends StObject {
    
    var bugsnagClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bugsnag */ Any
    
    var errorLevel: js.UndefOr[Double | String] = js.undefined
    
    var systemInfo: js.UndefOr[js.Array[String]] = js.undefined
    
    var warningLevel: js.UndefOr[Double | String] = js.undefined
  }
  object Options {
    
    inline def apply(
      bugsnagClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bugsnag */ Any
    ): Options = {
      val __obj = js.Dynamic.literal(bugsnagClient = bugsnagClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBugsnagClient(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bugsnag */ Any): Self = StObject.set(x, "bugsnagClient", value.asInstanceOf[js.Any])
      
      inline def setErrorLevel(value: Double | String): Self = StObject.set(x, "errorLevel", value.asInstanceOf[js.Any])
      
      inline def setErrorLevelUndefined: Self = StObject.set(x, "errorLevel", js.undefined)
      
      inline def setSystemInfo(value: js.Array[String]): Self = StObject.set(x, "systemInfo", value.asInstanceOf[js.Any])
      
      inline def setSystemInfoUndefined: Self = StObject.set(x, "systemInfo", js.undefined)
      
      inline def setSystemInfoVarargs(value: String*): Self = StObject.set(x, "systemInfo", js.Array(value*))
      
      inline def setWarningLevel(value: Double | String): Self = StObject.set(x, "warningLevel", value.asInstanceOf[js.Any])
      
      inline def setWarningLevelUndefined: Self = StObject.set(x, "warningLevel", js.undefined)
    }
  }
}
