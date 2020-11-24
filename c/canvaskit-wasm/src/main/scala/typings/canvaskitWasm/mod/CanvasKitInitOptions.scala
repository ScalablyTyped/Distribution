package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasKitInitOptions extends js.Object {
  
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
  implicit class CanvasKitInitOptionsOps[Self <: CanvasKitInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocateFile(value: String => String): Self = this.set("locateFile", js.Any.fromFunction1(value))
  }
}
