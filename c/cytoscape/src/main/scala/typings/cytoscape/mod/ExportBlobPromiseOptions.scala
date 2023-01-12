package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.`blob-promise`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBlobPromiseOptions
  extends StObject
     with ExportOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', 'blob', or 'blob-promise'.
    */
  var output: js.UndefOr[`blob-promise`] = js.undefined
}
object ExportBlobPromiseOptions {
  
  inline def apply(): ExportBlobPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBlobPromiseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportBlobPromiseOptions] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: `blob-promise`): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
