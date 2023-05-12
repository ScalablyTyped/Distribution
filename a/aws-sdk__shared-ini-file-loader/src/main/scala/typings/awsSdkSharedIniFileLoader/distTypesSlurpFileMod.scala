package typings.awsSdkSharedIniFileLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSlurpFileMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/slurpFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def slurpFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("slurpFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def slurpFile(path: String, options: SlurpFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slurpFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait SlurpFileOptions extends StObject {
    
    var ignoreCache: js.UndefOr[Boolean] = js.undefined
  }
  object SlurpFileOptions {
    
    inline def apply(): SlurpFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlurpFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlurpFileOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
    }
  }
}
