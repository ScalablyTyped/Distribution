package typings.axiosCurlirize

import typings.axios.mod.AxiosInstance
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-curlirize", JSImport.Namespace)
  @js.native
  def apply(instance: AxiosInstance): Unit = js.native
  @JSImport("axios-curlirize", JSImport.Namespace)
  @js.native
  def apply(instance: AxiosInstance, callback: Callback): Unit = js.native
  
  type Callback = js.Function2[/* result */ Result, /* error */ Error, Unit]
  
  @js.native
  trait Result extends StObject {
    
    var command: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(command: String): Result = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
}
