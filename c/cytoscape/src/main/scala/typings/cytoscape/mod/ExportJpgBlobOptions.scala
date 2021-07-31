package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.ExportOptions because Already inherited
- typings.cytoscape.mod.ExportBlobOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ trait ExportJpgBlobOptions
  extends StObject
     with ExportJpgOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.undefined
}
object ExportJpgBlobOptions {
  
  @scala.inline
  def apply(): ExportJpgBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgBlobOptions]
  }
  
  @scala.inline
  implicit class ExportJpgBlobOptionsMutableBuilder[Self <: ExportJpgBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: blob): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
