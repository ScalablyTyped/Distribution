package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasKitInitOptions extends StObject {
  
  /**
    * This callback will be invoked when the CanvasKit loader needs to fetch a file (e.g.
    * the blob of WASM code). The correct url prefix should be applied.
    * @param file - the name of the file that is about to be loaded.
    */
  def locateFile(file: String): String = js.native
}
object CanvasKitInitOptions {
  
  @scala.inline
  def apply(locateFile: String => String): CanvasKitInitOptions = {
    val __obj = js.Dynamic.literal(locateFile = js.Any.fromFunction1(locateFile))
    __obj.asInstanceOf[CanvasKitInitOptions]
  }
  
  @scala.inline
  implicit class CanvasKitInitOptionsMutableBuilder[Self <: CanvasKitInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocateFile(value: String => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction1(value))
  }
}
