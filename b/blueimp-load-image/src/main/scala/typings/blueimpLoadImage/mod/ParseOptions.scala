package typings.blueimpLoadImage.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  var disableExif: js.UndefOr[Boolean] = js.undefined
  
  var disableExifOffsets: js.UndefOr[Boolean] = js.undefined
  
  // Disables creating the imageHead property.
  var disableImageHead: js.UndefOr[Boolean] = js.undefined
  
  var disableIptc: js.UndefOr[Boolean] = js.undefined
  
  var disableIptcOffsets: js.UndefOr[Boolean] = js.undefined
  
  var excludeExifTags: js.UndefOr[Record[Double, Boolean]] = js.undefined
  
  var excludeIptcTags: js.UndefOr[Record[Double, Boolean]] = js.undefined
  
  var includeExifTags: js.UndefOr[Record[Double, Boolean]] = js.undefined
  
  var includeIptcTags: js.UndefOr[Record[Double, Boolean]] = js.undefined
  
  // Defines the maximum number of bytes to parse.
  var maxMetaDataSize: js.UndefOr[Double] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableExif(value: Boolean): Self = StObject.set(x, "disableExif", value.asInstanceOf[js.Any])
    
    inline def setDisableExifOffsets(value: Boolean): Self = StObject.set(x, "disableExifOffsets", value.asInstanceOf[js.Any])
    
    inline def setDisableExifOffsetsUndefined: Self = StObject.set(x, "disableExifOffsets", js.undefined)
    
    inline def setDisableExifUndefined: Self = StObject.set(x, "disableExif", js.undefined)
    
    inline def setDisableImageHead(value: Boolean): Self = StObject.set(x, "disableImageHead", value.asInstanceOf[js.Any])
    
    inline def setDisableImageHeadUndefined: Self = StObject.set(x, "disableImageHead", js.undefined)
    
    inline def setDisableIptc(value: Boolean): Self = StObject.set(x, "disableIptc", value.asInstanceOf[js.Any])
    
    inline def setDisableIptcOffsets(value: Boolean): Self = StObject.set(x, "disableIptcOffsets", value.asInstanceOf[js.Any])
    
    inline def setDisableIptcOffsetsUndefined: Self = StObject.set(x, "disableIptcOffsets", js.undefined)
    
    inline def setDisableIptcUndefined: Self = StObject.set(x, "disableIptc", js.undefined)
    
    inline def setExcludeExifTags(value: Record[Double, Boolean]): Self = StObject.set(x, "excludeExifTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeExifTagsUndefined: Self = StObject.set(x, "excludeExifTags", js.undefined)
    
    inline def setExcludeIptcTags(value: Record[Double, Boolean]): Self = StObject.set(x, "excludeIptcTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeIptcTagsUndefined: Self = StObject.set(x, "excludeIptcTags", js.undefined)
    
    inline def setIncludeExifTags(value: Record[Double, Boolean]): Self = StObject.set(x, "includeExifTags", value.asInstanceOf[js.Any])
    
    inline def setIncludeExifTagsUndefined: Self = StObject.set(x, "includeExifTags", js.undefined)
    
    inline def setIncludeIptcTags(value: Record[Double, Boolean]): Self = StObject.set(x, "includeIptcTags", value.asInstanceOf[js.Any])
    
    inline def setIncludeIptcTagsUndefined: Self = StObject.set(x, "includeIptcTags", js.undefined)
    
    inline def setMaxMetaDataSize(value: Double): Self = StObject.set(x, "maxMetaDataSize", value.asInstanceOf[js.Any])
    
    inline def setMaxMetaDataSizeUndefined: Self = StObject.set(x, "maxMetaDataSize", js.undefined)
  }
}
