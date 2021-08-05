package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBlobOptions
  extends StObject
     with ExportOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.undefined
}
object ExportBlobOptions {
  
  inline def apply(): ExportBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBlobOptions]
  }
  
  extension [Self <: ExportBlobOptions](x: Self) {
    
    inline def setOutput(value: blob): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
