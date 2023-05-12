package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultKTX2DecoderOptions extends StObject {
  
  /* private */ var _bypassTranscoders: Any = js.native
  
  /* private */ var _forceR8: Any = js.native
  
  /* private */ var _forceRG8: Any = js.native
  
  /* private */ var _forceRGBA: Any = js.native
  
  /** @internal */
  def _getKTX2DecoderOptions(): IKTX2DecoderOptions = js.native
  
  /* private */ var _isDirty: Any = js.native
  
  /* private */ var _ktx2DecoderOptions: Any = js.native
  
  /* private */ var _useRGBAIfASTCBC7NotAvailableWhenUASTC: Any = js.native
  
  /* private */ var _useRGBAIfOnlyBC1BC3AvailableWhenUASTC: Any = js.native
  
  /**
    * list of transcoders to bypass when looking for a suitable transcoder. The available transcoders are:
    *      UniversalTranscoder_UASTC_ASTC
    *      UniversalTranscoder_UASTC_BC7
    *      UniversalTranscoder_UASTC_RGBA_UNORM
    *      UniversalTranscoder_UASTC_RGBA_SRGB
    *      UniversalTranscoder_UASTC_R8_UNORM
    *      UniversalTranscoder_UASTC_RG8_UNORM
    *      MSCTranscoder
    */
  def bypassTranscoders: js.UndefOr[js.Array[String]] = js.native
  def bypassTranscoders_=(value: js.UndefOr[js.Array[String]]): Unit = js.native
  
  /**
    * force to always use (uncompressed) R8 for transcoded format
    */
  def forceR8: js.UndefOr[Boolean] = js.native
  def forceR8_=(value: js.UndefOr[Boolean]): Unit = js.native
  
  /**
    * force to always use (uncompressed) RG8 for transcoded format
    */
  def forceRG8: js.UndefOr[Boolean] = js.native
  def forceRG8_=(value: js.UndefOr[Boolean]): Unit = js.native
  
  /**
    * force to always use (uncompressed) RGBA for transcoded format
    */
  def forceRGBA: js.UndefOr[Boolean] = js.native
  def forceRGBA_=(value: js.UndefOr[Boolean]): Unit = js.native
  
  /**
    * Gets the dirty flag
    */
  def isDirty: Boolean = js.native
  
  /**
    * force a (uncompressed) RGBA transcoded format if transcoding a UASTC source format and ASTC + BC7 are not available as a compressed transcoded format
    */
  def useRGBAIfASTCBC7NotAvailableWhenUASTC: js.UndefOr[Boolean] = js.native
  def useRGBAIfASTCBC7NotAvailableWhenUASTC_=(value: js.UndefOr[Boolean]): Unit = js.native
  
  /**
    * force a (uncompressed) RGBA transcoded format if transcoding a UASTC source format and only BC1 or BC3 are available as a compressed transcoded format.
    * This property is true by default to favor speed over memory, because currently transcoding from UASTC to BC1/3 is slow because the transcoder transcodes
    * to uncompressed and then recompresses the texture
    */
  def useRGBAIfOnlyBC1BC3AvailableWhenUASTC: js.UndefOr[Boolean] = js.native
  def useRGBAIfOnlyBC1BC3AvailableWhenUASTC_=(value: js.UndefOr[Boolean]): Unit = js.native
}
