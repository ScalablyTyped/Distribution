package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/export
  */
@js.native
trait ExportOptions extends StObject {
  
  /**
    * The background colour of the image (transparent by default).
    */
  var bg: js.UndefOr[String] = js.native
  
  /**
    * Whether to export the current viewport view (false, default) or the entire graph (true).
    */
  var full: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the scale automatically in combination with maxWidth such that the resultant image is no taller than maxHeight.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the scale automatically in combination with maxHeight such that the resultant image is no wider than maxWidth.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * This value specifies a positive number that scales the size of the resultant image.
    */
  var scale: js.UndefOr[Double] = js.native
}
object ExportOptions {
  
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  
  @scala.inline
  implicit class ExportOptionsMutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
