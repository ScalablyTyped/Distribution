package typings.cosmiconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFileMod {
  
  @JSImport("cosmiconfig/dist/readFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readFile(filepath: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  @scala.inline
  def readFile(filepath: String, options: Options): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  @scala.inline
  def readFileSync(filepath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def readFileSync(filepath: String, options: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  trait Options extends StObject {
    
    var throwNotFound: js.UndefOr[Boolean] = js.undefined
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
      def setThrowNotFound(value: Boolean): Self = StObject.set(x, "throwNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowNotFoundUndefined: Self = StObject.set(x, "throwNotFound", js.undefined)
    }
  }
}
