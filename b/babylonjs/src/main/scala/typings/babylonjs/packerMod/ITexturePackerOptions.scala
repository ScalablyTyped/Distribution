package typings.babylonjs.packerMod

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathColorMod.Color4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITexturePackerOptions extends js.Object {
  
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
  implicit class ITexturePackerOptionsOps[Self <: ITexturePackerOptions] (val x: Self) extends AnyVal {
    
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
    def setColnum(value: Double): Self = this.set("colnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColnum: Self = this.set("colnum", js.undefined)
    
    @scala.inline
    def setCustomFillColor(value: String): Self = this.set("customFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFillColor: Self = this.set("customFillColor", js.undefined)
    
    @scala.inline
    def setDisposeSources(value: Boolean): Self = this.set("disposeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposeSources: Self = this.set("disposeSources", js.undefined)
    
    @scala.inline
    def setFillBlanks(value: Boolean): Self = this.set("fillBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillBlanks: Self = this.set("fillBlanks", js.undefined)
    
    @scala.inline
    def setFrameSize(value: Double): Self = this.set("frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameSize: Self = this.set("frameSize", js.undefined)
    
    @scala.inline
    def setLayout(value: Double): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: String*): Self = this.set("map", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: js.Array[String]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPaddingColor(value: Color3 | Color4): Self = this.set("paddingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingColor: Self = this.set("paddingColor", js.undefined)
    
    @scala.inline
    def setPaddingMode(value: Double): Self = this.set("paddingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingMode: Self = this.set("paddingMode", js.undefined)
    
    @scala.inline
    def setPaddingRatio(value: Double): Self = this.set("paddingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRatio: Self = this.set("paddingRatio", js.undefined)
    
    @scala.inline
    def setUpdateInputMeshes(value: Boolean): Self = this.set("updateInputMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateInputMeshes: Self = this.set("updateInputMeshes", js.undefined)
    
    @scala.inline
    def setUvsIn(value: String): Self = this.set("uvsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvsIn: Self = this.set("uvsIn", js.undefined)
    
    @scala.inline
    def setUvsOut(value: String): Self = this.set("uvsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvsOut: Self = this.set("uvsOut", js.undefined)
  }
}
