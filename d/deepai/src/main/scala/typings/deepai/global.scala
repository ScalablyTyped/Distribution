package typings.deepai

import typings.deepai.mod.Models
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object deepai {
    
    @JSGlobal("deepai")
    @js.native
    val ^ : js.Any = js.native
    
    inline def callStandardApi[T /* <: Models */](
      modelName: T,
      inputs_object: /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelInputs[T] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelOutputs[T] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("callStandardApi")(modelName.asInstanceOf[js.Any], inputs_object.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelOutputs[T] */ js.Any
      ]]
    
    inline def setApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
