package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TGATools {
  
  @JSImport("babylonjs/index", "TGATools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the header of a TGA file
    * @param data defines the TGA data
    * @returns the header
    */
  @JSImport("babylonjs/index", "TGATools.GetTGAHeader")
  @js.native
  def GetTGAHeader: js.Function1[/* data */ js.typedarray.Uint8Array, Any] = js.native
  /**
    * Gets the header of a TGA file
    * @param data defines the TGA data
    * @returns the header
    */
  inline def GetTGAHeader(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTGAHeader")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def GetTGAHeader_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetTGAHeader")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads TGA content to a Babylon Texture
    * @internal
    */
  @JSImport("babylonjs/index", "TGATools.UploadContent")
  @js.native
  def UploadContent: js.Function2[
    /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
    /* data */ js.typedarray.Uint8Array, 
    Unit
  ] = js.native
  /**
    * Uploads TGA content to a Babylon Texture
    * @internal
    */
  inline def UploadContent(texture: typings.babylonjs.internalTextureMod.InternalTexture, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadContent")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadContent_=(
    x: js.Function2[
      /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
      /* data */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadContent")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageData16bits")
  @js.native
  def getImageData16bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageData16bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData16bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageData16bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageData16bits")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageData24bits")
  @js.native
  def getImageData24bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageData24bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData24bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageData24bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageData24bits")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageData32bits")
  @js.native
  def getImageData32bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageData32bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData32bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageData32bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageData32bits")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageData8bits")
  @js.native
  def getImageData8bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageData8bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData8bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageData8bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageData8bits")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageDataGrey16bits")
  @js.native
  def getImageDataGrey16bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageDataGrey16bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageDataGrey16bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageDataGrey16bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageDataGrey16bits")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "TGATools._getImageDataGrey8bits")
  @js.native
  def getImageDataGrey8bits: js.Function9[
    /* header */ Any, 
    /* palettes */ js.typedarray.Uint8Array, 
    /* pixel_data */ js.typedarray.Uint8Array, 
    /* y_start */ Double, 
    /* y_step */ Double, 
    /* y_end */ Double, 
    /* x_start */ Double, 
    /* x_step */ Double, 
    /* x_end */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  /** @internal */
  inline def getImageDataGrey8bits(
    header: Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageDataGrey8bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getImageDataGrey8bits_=(
    x: js.Function9[
      /* header */ Any, 
      /* palettes */ js.typedarray.Uint8Array, 
      /* pixel_data */ js.typedarray.Uint8Array, 
      /* y_start */ Double, 
      /* y_step */ Double, 
      /* y_end */ Double, 
      /* x_start */ Double, 
      /* x_step */ Double, 
      /* x_end */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getImageDataGrey8bits")(x.asInstanceOf[js.Any])
}
