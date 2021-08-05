package typings.cosmiconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFileMod {
  
  @JSImport("cosmiconfig/dist/readFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(filepath: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  inline def readFile(filepath: String, options: Options): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  inline def readFileSync(filepath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def readFileSync(filepath: String, options: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  trait Options extends StObject {
    
    var throwNotFound: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setThrowNotFound(value: Boolean): Self = StObject.set(x, "throwNotFound", value.asInstanceOf[js.Any])
      
      inline def setThrowNotFoundUndefined: Self = StObject.set(x, "throwNotFound", js.undefined)
    }
  }
}
