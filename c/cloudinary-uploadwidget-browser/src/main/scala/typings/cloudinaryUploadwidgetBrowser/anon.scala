package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.INVALID_PUBLIC_ID
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.MAX_EXCEEDED
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.auto
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.custom
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.default
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.face
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.image
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.minimal
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.purple
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.raw
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.video
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.white
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    var all: Boolean
    
    var ids: js.Array[String]
  }
  object All {
    
    inline def apply(all: Boolean, ids: js.Array[String]): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    }
  }
  
  trait Cancel extends StObject {
    
    var cancel: Boolean
  }
  object Cancel {
    
    inline def apply(cancel: Boolean): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var file: Any
    
    var publicId: String | Null
  }
  object File {
    
    inline def apply(file: Any): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], publicId = null)
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    }
  }
  
  trait Id extends StObject {
    
    var id: String | Null
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[Any]
  }
  object Items {
    
    inline def apply(items: js.Array[Any]): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Iv extends StObject {
    
    var iv: String
    
    var key: String
  }
  object Iv {
    
    inline def apply(iv: String, key: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    extension [Self <: Iv](x: Self) {
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Omit<cloudinary-uploadwidget-browser.CloudinaryUploadWidgetOptions, cloudinary-uploadwidget-browser.NotSupportedForUpdates>> */
  trait PartialOmitCloudinaryUplo extends StObject {
    
    var autoMinimize: js.UndefOr[Boolean] = js.undefined
    
    var buttonCaption: js.UndefOr[String] = js.undefined
    
    var buttonClass: js.UndefOr[String] = js.undefined
    
    var clientAllowedFormats: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var cloudName: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Record[String, Any]] = js.undefined
    
    var cropping: js.UndefOr[Boolean] = js.undefined
    
    var croppingAspectRatio: js.UndefOr[Double | Null] = js.undefined
    
    var croppingCoordinatesMode: js.UndefOr[custom | face] = js.undefined
    
    var croppingDefaultSelectionRatio: js.UndefOr[Double] = js.undefined
    
    var croppingShowBackButton: js.UndefOr[Boolean] = js.undefined
    
    var croppingShowDimensions: js.UndefOr[Boolean] = js.undefined
    
    var croppingValidateDimensions: js.UndefOr[Boolean] = js.undefined
    
    var defaultSource: js.UndefOr[typings.cloudinaryUploadwidgetBrowser.Source] = js.undefined
    
    var dropboxAppKey: js.UndefOr[String] = js.undefined
    
    var encryption: js.UndefOr[Iv] = js.undefined
    
    var facebookAppId: js.UndefOr[String] = js.undefined
    
    var folder: js.UndefOr[String | Null] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var getUploadPresets: js.UndefOr[js.Function1[/* cb */ js.Function1[/* presets */ js.Array[String], Unit], Unit]] = js.undefined
    
    var googleApiKey: js.UndefOr[String] = js.undefined
    
    var googleDriveClientId: js.UndefOr[String] = js.undefined
    
    var instagramClientId: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var maxChunkSize: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var maxImageFileSize: js.UndefOr[Double] = js.undefined
    
    var maxImageHeight: js.UndefOr[Double | Null] = js.undefined
    
    var maxImageWidth: js.UndefOr[Double | Null] = js.undefined
    
    var maxRawFileSize: js.UndefOr[Double] = js.undefined
    
    var maxVideoFileSize: js.UndefOr[Double] = js.undefined
    
    var minImageHeight: js.UndefOr[Double | Null] = js.undefined
    
    var minImageWidth: js.UndefOr[Double | Null] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var prepareUploadParams: js.UndefOr[
        js.Function2[/* cb */ js.Function1[/* results */ Any, Unit], /* params */ Any, Unit]
      ] = js.undefined
    
    var publicId: js.UndefOr[String | Null] = js.undefined
    
    var queueViewPosition: js.UndefOr[String] = js.undefined
    
    var resourceType: js.UndefOr[auto | image | video | raw] = js.undefined
    
    var searchByRights: js.UndefOr[Boolean] = js.undefined
    
    var searchBySites: js.UndefOr[js.Array[String]] = js.undefined
    
    var showAdvancedOptions: js.UndefOr[Boolean] = js.undefined
    
    var showCompletedButton: js.UndefOr[Boolean] = js.undefined
    
    var showInsecurePreview: js.UndefOr[Boolean] = js.undefined
    
    var showPoweredBy: js.UndefOr[Boolean] = js.undefined
    
    var showSkipCropButton: js.UndefOr[Boolean] = js.undefined
    
    var showUploadMoreButton: js.UndefOr[Boolean] = js.undefined
    
    var singleUploadAutoClose: js.UndefOr[Boolean] = js.undefined
    
    var sources: js.UndefOr[js.Array[typings.cloudinaryUploadwidgetBrowser.Source]] = js.undefined
    
    var styles: js.UndefOr[CustomizedStyles] = js.undefined
    
    var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var text: js.UndefOr[CustomizedText] = js.undefined
    
    var theme: js.UndefOr[default | white | minimal | purple] = js.undefined
    
    var thumbnailTransformation: js.UndefOr[String | js.Array[ThumbnailTransformation]] = js.undefined
    
    var thumbnails: js.UndefOr[String | Null] = js.undefined
    
    var uploadPreset: js.UndefOr[String] = js.undefined
    
    var uploadSignatureTimestamp: js.UndefOr[Double] = js.undefined
    
    var validateMaxWidthHeight: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOmitCloudinaryUplo {
    
    inline def apply(): PartialOmitCloudinaryUplo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitCloudinaryUplo]
    }
    
    extension [Self <: PartialOmitCloudinaryUplo](x: Self) {
      
      inline def setAutoMinimize(value: Boolean): Self = StObject.set(x, "autoMinimize", value.asInstanceOf[js.Any])
      
      inline def setAutoMinimizeUndefined: Self = StObject.set(x, "autoMinimize", js.undefined)
      
      inline def setButtonCaption(value: String): Self = StObject.set(x, "buttonCaption", value.asInstanceOf[js.Any])
      
      inline def setButtonCaptionUndefined: Self = StObject.set(x, "buttonCaption", js.undefined)
      
      inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
      
      inline def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
      
      inline def setClientAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "clientAllowedFormats", value.asInstanceOf[js.Any])
      
      inline def setClientAllowedFormatsNull: Self = StObject.set(x, "clientAllowedFormats", null)
      
      inline def setClientAllowedFormatsUndefined: Self = StObject.set(x, "clientAllowedFormats", js.undefined)
      
      inline def setClientAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "clientAllowedFormats", js.Array(value*))
      
      inline def setCloudName(value: String): Self = StObject.set(x, "cloudName", value.asInstanceOf[js.Any])
      
      inline def setCloudNameUndefined: Self = StObject.set(x, "cloudName", js.undefined)
      
      inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCropping(value: Boolean): Self = StObject.set(x, "cropping", value.asInstanceOf[js.Any])
      
      inline def setCroppingAspectRatio(value: Double): Self = StObject.set(x, "croppingAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setCroppingAspectRatioNull: Self = StObject.set(x, "croppingAspectRatio", null)
      
      inline def setCroppingAspectRatioUndefined: Self = StObject.set(x, "croppingAspectRatio", js.undefined)
      
      inline def setCroppingCoordinatesMode(value: custom | face): Self = StObject.set(x, "croppingCoordinatesMode", value.asInstanceOf[js.Any])
      
      inline def setCroppingCoordinatesModeUndefined: Self = StObject.set(x, "croppingCoordinatesMode", js.undefined)
      
      inline def setCroppingDefaultSelectionRatio(value: Double): Self = StObject.set(x, "croppingDefaultSelectionRatio", value.asInstanceOf[js.Any])
      
      inline def setCroppingDefaultSelectionRatioUndefined: Self = StObject.set(x, "croppingDefaultSelectionRatio", js.undefined)
      
      inline def setCroppingShowBackButton(value: Boolean): Self = StObject.set(x, "croppingShowBackButton", value.asInstanceOf[js.Any])
      
      inline def setCroppingShowBackButtonUndefined: Self = StObject.set(x, "croppingShowBackButton", js.undefined)
      
      inline def setCroppingShowDimensions(value: Boolean): Self = StObject.set(x, "croppingShowDimensions", value.asInstanceOf[js.Any])
      
      inline def setCroppingShowDimensionsUndefined: Self = StObject.set(x, "croppingShowDimensions", js.undefined)
      
      inline def setCroppingUndefined: Self = StObject.set(x, "cropping", js.undefined)
      
      inline def setCroppingValidateDimensions(value: Boolean): Self = StObject.set(x, "croppingValidateDimensions", value.asInstanceOf[js.Any])
      
      inline def setCroppingValidateDimensionsUndefined: Self = StObject.set(x, "croppingValidateDimensions", js.undefined)
      
      inline def setDefaultSource(value: typings.cloudinaryUploadwidgetBrowser.Source): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
      
      inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
      
      inline def setDropboxAppKey(value: String): Self = StObject.set(x, "dropboxAppKey", value.asInstanceOf[js.Any])
      
      inline def setDropboxAppKeyUndefined: Self = StObject.set(x, "dropboxAppKey", js.undefined)
      
      inline def setEncryption(value: Iv): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
      
      inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderNull: Self = StObject.set(x, "folder", null)
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setGetUploadPresets(value: /* cb */ js.Function1[/* presets */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "getUploadPresets", js.Any.fromFunction1(value))
      
      inline def setGetUploadPresetsUndefined: Self = StObject.set(x, "getUploadPresets", js.undefined)
      
      inline def setGoogleApiKey(value: String): Self = StObject.set(x, "googleApiKey", value.asInstanceOf[js.Any])
      
      inline def setGoogleApiKeyUndefined: Self = StObject.set(x, "googleApiKey", js.undefined)
      
      inline def setGoogleDriveClientId(value: String): Self = StObject.set(x, "googleDriveClientId", value.asInstanceOf[js.Any])
      
      inline def setGoogleDriveClientIdUndefined: Self = StObject.set(x, "googleDriveClientId", js.undefined)
      
      inline def setInstagramClientId(value: String): Self = StObject.set(x, "instagramClientId", value.asInstanceOf[js.Any])
      
      inline def setInstagramClientIdUndefined: Self = StObject.set(x, "instagramClientId", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxImageFileSize(value: Double): Self = StObject.set(x, "maxImageFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxImageFileSizeUndefined: Self = StObject.set(x, "maxImageFileSize", js.undefined)
      
      inline def setMaxImageHeight(value: Double): Self = StObject.set(x, "maxImageHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxImageHeightNull: Self = StObject.set(x, "maxImageHeight", null)
      
      inline def setMaxImageHeightUndefined: Self = StObject.set(x, "maxImageHeight", js.undefined)
      
      inline def setMaxImageWidth(value: Double): Self = StObject.set(x, "maxImageWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxImageWidthNull: Self = StObject.set(x, "maxImageWidth", null)
      
      inline def setMaxImageWidthUndefined: Self = StObject.set(x, "maxImageWidth", js.undefined)
      
      inline def setMaxRawFileSize(value: Double): Self = StObject.set(x, "maxRawFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxRawFileSizeUndefined: Self = StObject.set(x, "maxRawFileSize", js.undefined)
      
      inline def setMaxVideoFileSize(value: Double): Self = StObject.set(x, "maxVideoFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxVideoFileSizeUndefined: Self = StObject.set(x, "maxVideoFileSize", js.undefined)
      
      inline def setMinImageHeight(value: Double): Self = StObject.set(x, "minImageHeight", value.asInstanceOf[js.Any])
      
      inline def setMinImageHeightNull: Self = StObject.set(x, "minImageHeight", null)
      
      inline def setMinImageHeightUndefined: Self = StObject.set(x, "minImageHeight", js.undefined)
      
      inline def setMinImageWidth(value: Double): Self = StObject.set(x, "minImageWidth", value.asInstanceOf[js.Any])
      
      inline def setMinImageWidthNull: Self = StObject.set(x, "minImageWidth", null)
      
      inline def setMinImageWidthUndefined: Self = StObject.set(x, "minImageWidth", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setPrepareUploadParams(value: (/* cb */ js.Function1[/* results */ Any, Unit], /* params */ Any) => Unit): Self = StObject.set(x, "prepareUploadParams", js.Any.fromFunction2(value))
      
      inline def setPrepareUploadParamsUndefined: Self = StObject.set(x, "prepareUploadParams", js.undefined)
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
      
      inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
      
      inline def setQueueViewPosition(value: String): Self = StObject.set(x, "queueViewPosition", value.asInstanceOf[js.Any])
      
      inline def setQueueViewPositionUndefined: Self = StObject.set(x, "queueViewPosition", js.undefined)
      
      inline def setResourceType(value: auto | image | video | raw): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      inline def setSearchByRights(value: Boolean): Self = StObject.set(x, "searchByRights", value.asInstanceOf[js.Any])
      
      inline def setSearchByRightsUndefined: Self = StObject.set(x, "searchByRights", js.undefined)
      
      inline def setSearchBySites(value: js.Array[String]): Self = StObject.set(x, "searchBySites", value.asInstanceOf[js.Any])
      
      inline def setSearchBySitesUndefined: Self = StObject.set(x, "searchBySites", js.undefined)
      
      inline def setSearchBySitesVarargs(value: String*): Self = StObject.set(x, "searchBySites", js.Array(value*))
      
      inline def setShowAdvancedOptions(value: Boolean): Self = StObject.set(x, "showAdvancedOptions", value.asInstanceOf[js.Any])
      
      inline def setShowAdvancedOptionsUndefined: Self = StObject.set(x, "showAdvancedOptions", js.undefined)
      
      inline def setShowCompletedButton(value: Boolean): Self = StObject.set(x, "showCompletedButton", value.asInstanceOf[js.Any])
      
      inline def setShowCompletedButtonUndefined: Self = StObject.set(x, "showCompletedButton", js.undefined)
      
      inline def setShowInsecurePreview(value: Boolean): Self = StObject.set(x, "showInsecurePreview", value.asInstanceOf[js.Any])
      
      inline def setShowInsecurePreviewUndefined: Self = StObject.set(x, "showInsecurePreview", js.undefined)
      
      inline def setShowPoweredBy(value: Boolean): Self = StObject.set(x, "showPoweredBy", value.asInstanceOf[js.Any])
      
      inline def setShowPoweredByUndefined: Self = StObject.set(x, "showPoweredBy", js.undefined)
      
      inline def setShowSkipCropButton(value: Boolean): Self = StObject.set(x, "showSkipCropButton", value.asInstanceOf[js.Any])
      
      inline def setShowSkipCropButtonUndefined: Self = StObject.set(x, "showSkipCropButton", js.undefined)
      
      inline def setShowUploadMoreButton(value: Boolean): Self = StObject.set(x, "showUploadMoreButton", value.asInstanceOf[js.Any])
      
      inline def setShowUploadMoreButtonUndefined: Self = StObject.set(x, "showUploadMoreButton", js.undefined)
      
      inline def setSingleUploadAutoClose(value: Boolean): Self = StObject.set(x, "singleUploadAutoClose", value.asInstanceOf[js.Any])
      
      inline def setSingleUploadAutoCloseUndefined: Self = StObject.set(x, "singleUploadAutoClose", js.undefined)
      
      inline def setSources(value: js.Array[typings.cloudinaryUploadwidgetBrowser.Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: typings.cloudinaryUploadwidgetBrowser.Source*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setStyles(value: CustomizedStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setText(value: CustomizedText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: default | white | minimal | purple): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setThumbnailTransformation(value: String | js.Array[ThumbnailTransformation]): Self = StObject.set(x, "thumbnailTransformation", value.asInstanceOf[js.Any])
      
      inline def setThumbnailTransformationUndefined: Self = StObject.set(x, "thumbnailTransformation", js.undefined)
      
      inline def setThumbnailTransformationVarargs(value: ThumbnailTransformation*): Self = StObject.set(x, "thumbnailTransformation", js.Array(value*))
      
      inline def setThumbnails(value: String): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsNull: Self = StObject.set(x, "thumbnails", null)
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      inline def setUploadPreset(value: String): Self = StObject.set(x, "uploadPreset", value.asInstanceOf[js.Any])
      
      inline def setUploadPresetUndefined: Self = StObject.set(x, "uploadPreset", js.undefined)
      
      inline def setUploadSignatureTimestamp(value: Double): Self = StObject.set(x, "uploadSignatureTimestamp", value.asInstanceOf[js.Any])
      
      inline def setUploadSignatureTimestampUndefined: Self = StObject.set(x, "uploadSignatureTimestamp", js.undefined)
      
      inline def setValidateMaxWidthHeight(value: Boolean): Self = StObject.set(x, "validateMaxWidthHeight", value.asInstanceOf[js.Any])
      
      inline def setValidateMaxWidthHeightUndefined: Self = StObject.set(x, "validateMaxWidthHeight", js.undefined)
    }
  }
  
  trait Quiet extends StObject {
    
    var quiet: Boolean
  }
  object Quiet {
    
    inline def apply(quiet: Boolean): Quiet = {
      val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quiet]
    }
    
    extension [Self <: Quiet](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    var reason: MAX_EXCEEDED | INVALID_PUBLIC_ID
  }
  object Reason {
    
    inline def apply(reason: MAX_EXCEEDED | INVALID_PUBLIC_ID): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setReason(value: MAX_EXCEEDED | INVALID_PUBLIC_ID): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveThumbnails extends StObject {
    
    var removeThumbnails: Boolean
  }
  object RemoveThumbnails {
    
    inline def apply(removeThumbnails: Boolean): RemoveThumbnails = {
      val __obj = js.Dynamic.literal(removeThumbnails = removeThumbnails.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveThumbnails]
    }
    
    extension [Self <: RemoveThumbnails](x: Self) {
      
      inline def setRemoveThumbnails(value: Boolean): Self = StObject.set(x, "removeThumbnails", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source extends StObject {
    
    var source: String
  }
  object Source {
    
    inline def apply(source: String): typings.cloudinaryUploadwidgetBrowser.anon.Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.anon.Source]
    }
    
    extension [Self <: typings.cloudinaryUploadwidgetBrowser.anon.Source](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tags extends StObject {
    
    var tags: js.Array[String]
  }
  object Tags {
    
    inline def apply(tags: js.Array[String]): Tags = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tags]
    }
    
    extension [Self <: Tags](x: Self) {
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
