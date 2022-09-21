package typings.ckeditor4.CKEDITOR

import typings.ckeditor4.CKEDITOR.plugins.widget.definition
import typings.ckeditor4.ckeditor4Strings.load
import typings.ckeditor4.ckeditor4Strings.loadAndUpload
import typings.ckeditor4.ckeditor4Strings.upload
import typings.std.Blob
import typings.std.FileReader
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTools {
  
  @js.native
  trait fileLoader
    extends StObject
       with event {
    
    def abort(): Unit = js.native
    
    val data: String = js.native
    
    val file: Blob = js.native
    
    val fileName: String = js.native
    
    val id: Double = js.native
    
    def isFinished(): Boolean = js.native
    
    def load(): Unit = js.native
    
    def loadAndUpload(url: String): Unit = js.native
    def loadAndUpload(url: String, additionalRequestParameters: Any): Unit = js.native
    
    val loaded: Double = js.native
    
    val message: String = js.native
    
    val reader: FileReader = js.native
    
    val responseData: Any = js.native
    
    var status: String = js.native
    
    val total: Double = js.native
    
    def update(): Unit = js.native
    
    def upload(url: String): Unit = js.native
    def upload(url: String, additionalRequestParameters: Any): Unit = js.native
    
    val uploadTotal: Double = js.native
    
    val uploadUrl: String = js.native
    
    val uploaded: String = js.native
    
    val url: String = js.native
    
    val xhr: XMLHttpRequest = js.native
  }
  
  @js.native
  trait uploadRepository
    extends StObject
       with event {
    
    def create(fileOrData: String, fileName: String): fileLoader = js.native
    def create(fileOrData: String, fileName: String, loaderType: Any): fileLoader = js.native
    def create(fileOrData: Blob, fileName: String): fileLoader = js.native
    def create(fileOrData: Blob, fileName: String, loaderType: Any): fileLoader = js.native
    
    def isFinished(): Boolean = js.native
    
    val loaders: js.Array[fileLoader] = js.native
  }
  
  trait uploadWidgetDefinition
    extends StObject
       with definition {
    
    var additionalRequestParameters: js.UndefOr[Any] = js.undefined
    
    var fileToElement: js.UndefOr[js.Function1[/* pastedFile */ Any, HTMLElement]] = js.undefined
    
    var loadMethod: js.UndefOr[load | loadAndUpload | upload] = js.undefined
    
    var loaderType: js.UndefOr[Any] = js.undefined
    
    var onAbort: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onUploaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onUploading: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var replaceWith: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var skipNotifications: js.UndefOr[Boolean] = js.undefined
    
    var supportedTypes: js.UndefOr[js.RegExp] = js.undefined
    
    var uploadUrl: js.UndefOr[String] = js.undefined
  }
  object uploadWidgetDefinition {
    
    inline def apply(): uploadWidgetDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[uploadWidgetDefinition]
    }
    
    extension [Self <: uploadWidgetDefinition](x: Self) {
      
      inline def setAdditionalRequestParameters(value: Any): Self = StObject.set(x, "additionalRequestParameters", value.asInstanceOf[js.Any])
      
      inline def setAdditionalRequestParametersUndefined: Self = StObject.set(x, "additionalRequestParameters", js.undefined)
      
      inline def setFileToElement(value: /* pastedFile */ Any => HTMLElement): Self = StObject.set(x, "fileToElement", js.Any.fromFunction1(value))
      
      inline def setFileToElementUndefined: Self = StObject.set(x, "fileToElement", js.undefined)
      
      inline def setLoadMethod(value: load | loadAndUpload | upload): Self = StObject.set(x, "loadMethod", value.asInstanceOf[js.Any])
      
      inline def setLoadMethodUndefined: Self = StObject.set(x, "loadMethod", js.undefined)
      
      inline def setLoaderType(value: Any): Self = StObject.set(x, "loaderType", value.asInstanceOf[js.Any])
      
      inline def setLoaderTypeUndefined: Self = StObject.set(x, "loaderType", js.undefined)
      
      inline def setOnAbort(value: () => Boolean): Self = StObject.set(x, "onAbort", js.Any.fromFunction0(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnError(value: () => Boolean): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoaded(value: () => Boolean): Self = StObject.set(x, "onLoaded", js.Any.fromFunction0(value))
      
      inline def setOnLoadedUndefined: Self = StObject.set(x, "onLoaded", js.undefined)
      
      inline def setOnUploaded(value: () => Boolean): Self = StObject.set(x, "onUploaded", js.Any.fromFunction0(value))
      
      inline def setOnUploadedUndefined: Self = StObject.set(x, "onUploaded", js.undefined)
      
      inline def setOnUploading(value: () => Boolean): Self = StObject.set(x, "onUploading", js.Any.fromFunction0(value))
      
      inline def setOnUploadingUndefined: Self = StObject.set(x, "onUploading", js.undefined)
      
      inline def setReplaceWith(value: () => Any): Self = StObject.set(x, "replaceWith", js.Any.fromFunction0(value))
      
      inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      inline def setSkipNotifications(value: Boolean): Self = StObject.set(x, "skipNotifications", value.asInstanceOf[js.Any])
      
      inline def setSkipNotificationsUndefined: Self = StObject.set(x, "skipNotifications", js.undefined)
      
      inline def setSupportedTypes(value: js.RegExp): Self = StObject.set(x, "supportedTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedTypesUndefined: Self = StObject.set(x, "supportedTypes", js.undefined)
      
      inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    }
  }
}
