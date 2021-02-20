package typings.cosmiconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFileMod {
  
  @JSImport("cosmiconfig/dist/readFile", "readFile")
  @js.native
  def readFile(filepath: String): js.Promise[String | Null] = js.native
  @JSImport("cosmiconfig/dist/readFile", "readFile")
  @js.native
  def readFile(filepath: String, options: Options): js.Promise[String | Null] = js.native
  
  @JSImport("cosmiconfig/dist/readFile", "readFileSync")
  @js.native
  def readFileSync(filepath: String): String | Null = js.native
  @JSImport("cosmiconfig/dist/readFile", "readFileSync")
  @js.native
  def readFileSync(filepath: String, options: Options): String | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var throwNotFound: js.UndefOr[Boolean] = js.native
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
