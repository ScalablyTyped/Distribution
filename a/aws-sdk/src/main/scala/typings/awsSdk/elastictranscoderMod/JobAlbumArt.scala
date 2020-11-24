package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobAlbumArt extends js.Object {
  
  /**
    * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20. Valid formats are .jpg and .png 
    */
  var Artwork: js.UndefOr[Artworks] = js.native
  
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple album artwork files.    Replace: The specified album art replaces any existing album art.    Prepend: The specified album art is placed in front of any existing album art.    Append: The specified album art is placed after any existing album art.    Fallback: If the original input file contains artwork, Elastic Transcoder uses that artwork for the output. If the original input does not contain artwork, Elastic Transcoder uses the specified album art file.  
    */
  var MergePolicy: js.UndefOr[typings.awsSdk.elastictranscoderMod.MergePolicy] = js.native
}
object JobAlbumArt {
  
  @scala.inline
  def apply(): JobAlbumArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobAlbumArt]
  }
  
  @scala.inline
  implicit class JobAlbumArtOps[Self <: JobAlbumArt] (val x: Self) extends AnyVal {
    
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
    def setArtworkVarargs(value: Artwork*): Self = this.set("Artwork", js.Array(value :_*))
    
    @scala.inline
    def setArtwork(value: Artworks): Self = this.set("Artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtwork: Self = this.set("Artwork", js.undefined)
    
    @scala.inline
    def setMergePolicy(value: MergePolicy): Self = this.set("MergePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergePolicy: Self = this.set("MergePolicy", js.undefined)
  }
}
