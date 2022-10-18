package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.RequestOptionsBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcOperationArgumentsMod {
  
  trait OperationArguments
    extends StObject
       with /**
    * May contain other properties.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * The optional arugments that are provided to an operation.
      */
    var options: js.UndefOr[RequestOptionsBase] = js.undefined
  }
  object OperationArguments {
    
    inline def apply(): OperationArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationArguments]
    }
    
    extension [Self <: OperationArguments](x: Self) {
      
      inline def setOptions(value: RequestOptionsBase): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
