package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITexturePackerOptions extends StObject {
  
  /**
    * number of columns if using custom column count layout(2).  This defaults to 4.
    */
  var colnum: js.UndefOr[Double] = js.native
  
  /**
    * string value representing the context fill style color.  Defaults to 'black'.
    */
  var customFillColor: js.UndefOr[String] = js.native
  
  /**
    * boolean flag to dispose all the source textures.  Defaults to true.
    */
  var disposeSources: js.UndefOr[Boolean] = js.native
  
  /**
    * Fills the blank cells in a set to the customFillColor.  Defaults to true.
    */
  var fillBlanks: js.UndefOr[Boolean] = js.native
  
  /**
    * Width and Height Value of each Frame in the TexturePacker Sets
    */
  var frameSize: js.UndefOr[Double] = js.native
  
  /**
    * number representing the layout style. Defaults to LAYOUT_STRIP
    */
  var layout: js.UndefOr[Double] = js.native
  
  /**
    * Custom targets for the channels of a texture packer.  Default is all the channels of the Standard Material
    */
  var map: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If in SUBUV_COLOR padding mode what color to use.
    */
  var paddingColor: js.UndefOr[Color3 | Color4] = js.native
  
  /**
    * Number that declares the fill method for the padding gutter.
    */
  var paddingMode: js.UndefOr[Double] = js.native
  
  /**
    * Ratio of the value to add padding wise to each cell.  Defaults to 0.0115
    */
  var paddingRatio: js.UndefOr[Double] = js.native
  
  /**
    * flag to update the input meshes to the new packed texture after compilation. Defaults to true.
    */
  var updateInputMeshes: js.UndefOr[Boolean] = js.native
  
  /**
    * the UV input targets, as a single value for all meshes. Defaults to VertexBuffer.UVKind
    */
  var uvsIn: js.UndefOr[String] = js.native
  
  /**
    * the UV output targets, as a single value for all meshes.  Defaults to VertexBuffer.UVKind
    */
  var uvsOut: js.UndefOr[String] = js.native
}
object ITexturePackerOptions {
  
  @scala.inline
  def apply(): ITexturePackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITexturePackerOptions]
  }
  
  @scala.inline
  implicit class ITexturePackerOptionsMutableBuilder[Self <: ITexturePackerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColnum(value: Double): Self = StObject.set(x, "colnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColnumUndefined: Self = StObject.set(x, "colnum", js.undefined)
    
    @scala.inline
    def setCustomFillColor(value: String): Self = StObject.set(x, "customFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFillColorUndefined: Self = StObject.set(x, "customFillColor", js.undefined)
    
    @scala.inline
    def setDisposeSources(value: Boolean): Self = StObject.set(x, "disposeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposeSourcesUndefined: Self = StObject.set(x, "disposeSources", js.undefined)
    
    @scala.inline
    def setFillBlanks(value: Boolean): Self = StObject.set(x, "fillBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillBlanksUndefined: Self = StObject.set(x, "fillBlanks", js.undefined)
    
    @scala.inline
    def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
    
    @scala.inline
    def setLayout(value: Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMap(value: js.Array[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: String*): Self = StObject.set(x, "map", js.Array(value :_*))
    
    @scala.inline
    def setPaddingColor(value: Color3 | Color4): Self = StObject.set(x, "paddingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingColorUndefined: Self = StObject.set(x, "paddingColor", js.undefined)
    
    @scala.inline
    def setPaddingMode(value: Double): Self = StObject.set(x, "paddingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingModeUndefined: Self = StObject.set(x, "paddingMode", js.undefined)
    
    @scala.inline
    def setPaddingRatio(value: Double): Self = StObject.set(x, "paddingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRatioUndefined: Self = StObject.set(x, "paddingRatio", js.undefined)
    
    @scala.inline
    def setUpdateInputMeshes(value: Boolean): Self = StObject.set(x, "updateInputMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInputMeshesUndefined: Self = StObject.set(x, "updateInputMeshes", js.undefined)
    
    @scala.inline
    def setUvsIn(value: String): Self = StObject.set(x, "uvsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvsInUndefined: Self = StObject.set(x, "uvsIn", js.undefined)
    
    @scala.inline
    def setUvsOut(value: String): Self = StObject.set(x, "uvsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvsOutUndefined: Self = StObject.set(x, "uvsOut", js.undefined)
  }
}
