package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.plugins.widget.definition
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
    def loadAndUpload(url: String, additionalRequestParameters: js.Any): Unit = js.native
    
    val loaded: Double = js.native
    
    val message: String = js.native
    
    val reader: FileReader = js.native
    
    val responseData: js.Any = js.native
    
    var status: String = js.native
    
    val total: Double = js.native
    
    def update(): Unit = js.native
    
    def upload(url: String): Unit = js.native
    def upload(url: String, additionalRequestParameters: js.Any): Unit = js.native
    
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
    def create(fileOrData: String, fileName: String, loaderType: js.Any): fileLoader = js.native
    def create(fileOrData: Blob, fileName: String): fileLoader = js.native
    def create(fileOrData: Blob, fileName: String, loaderType: js.Any): fileLoader = js.native
    
    def isFinished(): Boolean = js.native
    
    val loaders: js.Array[fileLoader] = js.native
  }
  
  trait uploadWidgetDefinition
    extends StObject
       with definition {
    
    var additionalRequestParameters: js.Any
    
    def fileToElement(pastedFile: js.Any): HTMLElement
    
    var loadMethod: String
    
    var loaderType: js.Any
    
    def onAbort(): Boolean
    
    def onError(): Boolean
    
    def onLoaded(): Boolean
    
    def onUploaded(): Boolean
    
    def onUploading(): Boolean
    
    def replaceWith(): js.Any
    
    var skipNotifications: Boolean
    
    var supportedTypes: String
    
    var uploadUrl: String
  }
  object uploadWidgetDefinition {
    
    @scala.inline
    def apply(
      additionalRequestParameters: js.Any,
      fileToElement: js.Any => HTMLElement,
      loadMethod: String,
      loaderType: js.Any,
      onAbort: () => Boolean,
      onError: () => Boolean,
      onLoaded: () => Boolean,
      onUploaded: () => Boolean,
      onUploading: () => Boolean,
      replaceWith: () => js.Any,
      skipNotifications: Boolean,
      supportedTypes: String,
      uploadUrl: String
    ): uploadWidgetDefinition = {
      val __obj = js.Dynamic.literal(additionalRequestParameters = additionalRequestParameters.asInstanceOf[js.Any], fileToElement = js.Any.fromFunction1(fileToElement), loadMethod = loadMethod.asInstanceOf[js.Any], loaderType = loaderType.asInstanceOf[js.Any], onAbort = js.Any.fromFunction0(onAbort), onError = js.Any.fromFunction0(onError), onLoaded = js.Any.fromFunction0(onLoaded), onUploaded = js.Any.fromFunction0(onUploaded), onUploading = js.Any.fromFunction0(onUploading), replaceWith = js.Any.fromFunction0(replaceWith), skipNotifications = skipNotifications.asInstanceOf[js.Any], supportedTypes = supportedTypes.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[uploadWidgetDefinition]
    }
    
    @scala.inline
    implicit class uploadWidgetDefinitionMutableBuilder[Self <: uploadWidgetDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalRequestParameters(value: js.Any): Self = StObject.set(x, "additionalRequestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileToElement(value: js.Any => HTMLElement): Self = StObject.set(x, "fileToElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadMethod(value: String): Self = StObject.set(x, "loadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderType(value: js.Any): Self = StObject.set(x, "loaderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbort(value: () => Boolean): Self = StObject.set(x, "onAbort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnError(value: () => Boolean): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoaded(value: () => Boolean): Self = StObject.set(x, "onLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUploaded(value: () => Boolean): Self = StObject.set(x, "onUploaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUploading(value: () => Boolean): Self = StObject.set(x, "onUploading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplaceWith(value: () => js.Any): Self = StObject.set(x, "replaceWith", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSkipNotifications(value: Boolean): Self = StObject.set(x, "skipNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedTypes(value: String): Self = StObject.set(x, "supportedTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    }
  }
}
