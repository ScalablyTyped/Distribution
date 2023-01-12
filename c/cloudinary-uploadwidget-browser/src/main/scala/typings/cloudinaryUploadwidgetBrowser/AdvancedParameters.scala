package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.cloudinaryUploadwidgetBrowser.anon.Cancel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedParameters extends StObject {
  
  var autoMinimize: js.UndefOr[Boolean] = js.undefined
  
  var getTags: js.UndefOr[
    js.Function2[/* cb */ js.Function1[/* tags */ js.Array[String], Unit], /* prefix */ String, Unit]
  ] = js.undefined
  
  var getUploadPresets: js.UndefOr[js.Function1[/* cb */ js.Function1[/* presets */ js.Array[String], Unit], Unit]] = js.undefined
  
  var inlineContainer: js.UndefOr[String | HTMLElement | Null] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var preBatch: js.UndefOr[
    js.Function2[
      /* cb */ js.Function1[/* options */ js.UndefOr[Cancel], Unit], 
      /* data */ StringDictionary[Any], 
      Unit
    ]
  ] = js.undefined
  
  var prepareUploadParams: js.UndefOr[
    js.Function2[/* cb */ js.Function1[/* results */ Any, Unit], /* params */ Any, Unit]
  ] = js.undefined
  
  var queueViewPosition: js.UndefOr[String] = js.undefined
  
  var showAdvancedOptions: js.UndefOr[Boolean] = js.undefined
  
  var showCompletedButton: js.UndefOr[Boolean] = js.undefined
  
  var showInsecurePreview: js.UndefOr[Boolean] = js.undefined
  
  var showPoweredBy: js.UndefOr[Boolean] = js.undefined
  
  var showUploadMoreButton: js.UndefOr[Boolean] = js.undefined
  
  var singleUploadAutoClose: js.UndefOr[Boolean] = js.undefined
}
object AdvancedParameters {
  
  inline def apply(): AdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedParameters] (val x: Self) extends AnyVal {
    
    inline def setAutoMinimize(value: Boolean): Self = StObject.set(x, "autoMinimize", value.asInstanceOf[js.Any])
    
    inline def setAutoMinimizeUndefined: Self = StObject.set(x, "autoMinimize", js.undefined)
    
    inline def setGetTags(value: (/* cb */ js.Function1[/* tags */ js.Array[String], Unit], /* prefix */ String) => Unit): Self = StObject.set(x, "getTags", js.Any.fromFunction2(value))
    
    inline def setGetTagsUndefined: Self = StObject.set(x, "getTags", js.undefined)
    
    inline def setGetUploadPresets(value: /* cb */ js.Function1[/* presets */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "getUploadPresets", js.Any.fromFunction1(value))
    
    inline def setGetUploadPresetsUndefined: Self = StObject.set(x, "getUploadPresets", js.undefined)
    
    inline def setInlineContainer(value: String | HTMLElement): Self = StObject.set(x, "inlineContainer", value.asInstanceOf[js.Any])
    
    inline def setInlineContainerNull: Self = StObject.set(x, "inlineContainer", null)
    
    inline def setInlineContainerUndefined: Self = StObject.set(x, "inlineContainer", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPreBatch(
      value: (/* cb */ js.Function1[/* options */ js.UndefOr[Cancel], Unit], /* data */ StringDictionary[Any]) => Unit
    ): Self = StObject.set(x, "preBatch", js.Any.fromFunction2(value))
    
    inline def setPreBatchUndefined: Self = StObject.set(x, "preBatch", js.undefined)
    
    inline def setPrepareUploadParams(value: (/* cb */ js.Function1[/* results */ Any, Unit], /* params */ Any) => Unit): Self = StObject.set(x, "prepareUploadParams", js.Any.fromFunction2(value))
    
    inline def setPrepareUploadParamsUndefined: Self = StObject.set(x, "prepareUploadParams", js.undefined)
    
    inline def setQueueViewPosition(value: String): Self = StObject.set(x, "queueViewPosition", value.asInstanceOf[js.Any])
    
    inline def setQueueViewPositionUndefined: Self = StObject.set(x, "queueViewPosition", js.undefined)
    
    inline def setShowAdvancedOptions(value: Boolean): Self = StObject.set(x, "showAdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setShowAdvancedOptionsUndefined: Self = StObject.set(x, "showAdvancedOptions", js.undefined)
    
    inline def setShowCompletedButton(value: Boolean): Self = StObject.set(x, "showCompletedButton", value.asInstanceOf[js.Any])
    
    inline def setShowCompletedButtonUndefined: Self = StObject.set(x, "showCompletedButton", js.undefined)
    
    inline def setShowInsecurePreview(value: Boolean): Self = StObject.set(x, "showInsecurePreview", value.asInstanceOf[js.Any])
    
    inline def setShowInsecurePreviewUndefined: Self = StObject.set(x, "showInsecurePreview", js.undefined)
    
    inline def setShowPoweredBy(value: Boolean): Self = StObject.set(x, "showPoweredBy", value.asInstanceOf[js.Any])
    
    inline def setShowPoweredByUndefined: Self = StObject.set(x, "showPoweredBy", js.undefined)
    
    inline def setShowUploadMoreButton(value: Boolean): Self = StObject.set(x, "showUploadMoreButton", value.asInstanceOf[js.Any])
    
    inline def setShowUploadMoreButtonUndefined: Self = StObject.set(x, "showUploadMoreButton", js.undefined)
    
    inline def setSingleUploadAutoClose(value: Boolean): Self = StObject.set(x, "singleUploadAutoClose", value.asInstanceOf[js.Any])
    
    inline def setSingleUploadAutoCloseUndefined: Self = StObject.set(x, "singleUploadAutoClose", js.undefined)
  }
}
