package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artwork extends js.Object {
  
  /**
    * The format of album art, if any. Valid formats are .jpg and .png.
    */
  var AlbumArtFormat: js.UndefOr[JpgOrPng] = js.native
  
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
    */
  var Encryption: js.UndefOr[typings.awsSdk.elastictranscoderMod.Encryption] = js.native
  
  /**
    * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file, Elastic Transcoder checks the pipeline specified by PipelineId; the InputBucket object in that pipeline identifies the bucket. If the file name includes a prefix, for example, cooking/pie.jpg, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
    */
  var InputKey: js.UndefOr[WatermarkKey] = js.native
  
  /**
    * The maximum height of the output album art in pixels. If you specify auto, Elastic Transcoder uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.native
  
  /**
    * The maximum width of the output album art in pixels. If you specify auto, Elastic Transcoder uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.native
  
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add white bars to the top and bottom and/or left and right sides of the output album art to make the total size of the output art match the values that you specified for MaxWidth and MaxHeight.
    */
  var PaddingPolicy: js.UndefOr[typings.awsSdk.elastictranscoderMod.PaddingPolicy] = js.native
  
  /**
    * Specify one of the following values to control scaling of the output album art:    Fit: Elastic Transcoder scales the output art so it matches the value that you specified in either MaxWidth or MaxHeight without exceeding the other value.    Fill: Elastic Transcoder scales the output art so it matches the value that you specified in either MaxWidth or MaxHeight and matches or exceeds the other value. Elastic Transcoder centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.     Stretch: Elastic Transcoder stretches the output art to match the values that you specified for MaxWidth and MaxHeight. If the relative proportions of the input art and the output art are different, the output art will be distorted.    Keep: Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds the values that you specified for MaxWidth and MaxHeight, Elastic Transcoder crops the output art.    ShrinkToFit: Elastic Transcoder scales the output art down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale the art up.    ShrinkToFill Elastic Transcoder scales the output art down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale the art up.  
    */
  var SizingPolicy: js.UndefOr[typings.awsSdk.elastictranscoderMod.SizingPolicy] = js.native
}
object Artwork {
  
  @scala.inline
  def apply(): Artwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artwork]
  }
  
  @scala.inline
  implicit class ArtworkOps[Self <: Artwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlbumArtFormat(value: JpgOrPng): Self = this.set("AlbumArtFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumArtFormat: Self = this.set("AlbumArtFormat", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setInputKey(value: WatermarkKey): Self = this.set("InputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputKey: Self = this.set("InputKey", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: DigitsOrAuto): Self = this.set("MaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("MaxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: DigitsOrAuto): Self = this.set("MaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("MaxWidth", js.undefined)
    
    @scala.inline
    def setPaddingPolicy(value: PaddingPolicy): Self = this.set("PaddingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingPolicy: Self = this.set("PaddingPolicy", js.undefined)
    
    @scala.inline
    def setSizingPolicy(value: SizingPolicy): Self = this.set("SizingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizingPolicy: Self = this.set("SizingPolicy", js.undefined)
  }
}
