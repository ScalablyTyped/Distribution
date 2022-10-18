package typings.chromecastApi

import typings.chromecastApi.chromecastApiStrings.BOLD
import typings.chromecastApi.chromecastApiStrings.BOLD_ITALIC
import typings.chromecastApi.chromecastApiStrings.BUFFERED
import typings.chromecastApi.chromecastApiStrings.CASUAL
import typings.chromecastApi.chromecastApiStrings.CURSIVE
import typings.chromecastApi.chromecastApiStrings.DEPRESSED
import typings.chromecastApi.chromecastApiStrings.DROP_SHADOW
import typings.chromecastApi.chromecastApiStrings.ITALIC
import typings.chromecastApi.chromecastApiStrings.LIVE
import typings.chromecastApi.chromecastApiStrings.MONOSPACED_SANS_SERIF
import typings.chromecastApi.chromecastApiStrings.MONOSPACED_SERIF
import typings.chromecastApi.chromecastApiStrings.NONE
import typings.chromecastApi.chromecastApiStrings.NORMAL
import typings.chromecastApi.chromecastApiStrings.OUTLINE
import typings.chromecastApi.chromecastApiStrings.RAISED
import typings.chromecastApi.chromecastApiStrings.ROUNDED_CORNERS
import typings.chromecastApi.chromecastApiStrings.SANS_SERIF
import typings.chromecastApi.chromecastApiStrings.SERIF
import typings.chromecastApi.chromecastApiStrings.SMALL_CAPITALS
import typings.chromecastApi.libDeviceMod.GenericMediaMetadata
import typings.chromecastApi.libDeviceMod.MovieMediaMetadata
import typings.chromecastApi.libDeviceMod.MusicTrackMediaMetadata
import typings.chromecastApi.libDeviceMod.PhotoMediaMetadata
import typings.chromecastApi.libDeviceMod.TvShowMediaMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var edgeColor: js.UndefOr[String] = js.undefined
    
    var edgeType: js.UndefOr[NONE | OUTLINE | DROP_SHADOW | RAISED | DEPRESSED] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontGenericFamily: js.UndefOr[
        SANS_SERIF | MONOSPACED_SANS_SERIF | SERIF | MONOSPACED_SERIF | CASUAL | CURSIVE | SMALL_CAPITALS
      ] = js.undefined
    
    var fontScale: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[NORMAL | BOLD | ITALIC | BOLD_ITALIC] = js.undefined
    
    var foregroundColor: js.UndefOr[String] = js.undefined
    
    var windowColor: js.UndefOr[String] = js.undefined
    
    var windowRoundedCornerRadius: js.UndefOr[Double] = js.undefined
    
    var windowType: js.UndefOr[NONE | NORMAL | ROUNDED_CORNERS] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
      
      inline def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
      
      inline def setEdgeType(value: NONE | OUTLINE | DROP_SHADOW | RAISED | DEPRESSED): Self = StObject.set(x, "edgeType", value.asInstanceOf[js.Any])
      
      inline def setEdgeTypeUndefined: Self = StObject.set(x, "edgeType", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontGenericFamily(
        value: SANS_SERIF | MONOSPACED_SANS_SERIF | SERIF | MONOSPACED_SERIF | CASUAL | CURSIVE | SMALL_CAPITALS
      ): Self = StObject.set(x, "fontGenericFamily", value.asInstanceOf[js.Any])
      
      inline def setFontGenericFamilyUndefined: Self = StObject.set(x, "fontGenericFamily", js.undefined)
      
      inline def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
      
      inline def setFontScaleUndefined: Self = StObject.set(x, "fontScale", js.undefined)
      
      inline def setFontStyle(value: NORMAL | BOLD | ITALIC | BOLD_ITALIC): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
      
      inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
      
      inline def setWindowColor(value: String): Self = StObject.set(x, "windowColor", value.asInstanceOf[js.Any])
      
      inline def setWindowColorUndefined: Self = StObject.set(x, "windowColor", js.undefined)
      
      inline def setWindowRoundedCornerRadius(value: Double): Self = StObject.set(x, "windowRoundedCornerRadius", value.asInstanceOf[js.Any])
      
      inline def setWindowRoundedCornerRadiusUndefined: Self = StObject.set(x, "windowRoundedCornerRadius", js.undefined)
      
      inline def setWindowType(value: NONE | NORMAL | ROUNDED_CORNERS): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
      
      inline def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
    }
  }
  
  trait ContentId extends StObject {
    
    var contentId: String
    
    var contentType: String
    
    var customData: js.UndefOr[js.Object] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var metadata: js.UndefOr[
        GenericMediaMetadata | MovieMediaMetadata | TvShowMediaMetadata | MusicTrackMediaMetadata | PhotoMediaMetadata
      ] = js.undefined
    
    var streamType: BUFFERED | LIVE | NONE
  }
  object ContentId {
    
    inline def apply(contentId: String, contentType: String, streamType: BUFFERED | LIVE | NONE): ContentId = {
      val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentId]
    }
    
    extension [Self <: ContentId](x: Self) {
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMetadata(
        value: GenericMediaMetadata | MovieMediaMetadata | TvShowMediaMetadata | MusicTrackMediaMetadata | PhotoMediaMetadata
      ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setStreamType(value: BUFFERED | LIVE | NONE): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var name: String
    
    var url: String
  }
  object Language {
    
    inline def apply(language: String, name: String, url: String): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Title extends StObject {
    
    var title: String
    
    var url: String
  }
  object Title {
    
    inline def apply(title: String, url: String): Title = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
