package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.auto
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.image
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.raw
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.video
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadParameters extends StObject {
  
  var context: js.UndefOr[Record[String, Any]] = js.undefined
  
  var folder: js.UndefOr[String | Null] = js.undefined
  
  var publicId: js.UndefOr[String | Null] = js.undefined
  
  var resourceType: js.UndefOr[auto | image | video | raw] = js.undefined
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var uploadSignature: js.UndefOr[
    String | (js.Function2[
      /* callback */ js.Function1[/* result */ String, Unit], 
      /* params */ CloudinaryUploadWidgetOptions, 
      Unit
    ])
  ] = js.undefined
  
  var uploadSignatureTimestamp: js.UndefOr[Double] = js.undefined
}
object UploadParameters {
  
  inline def apply(): UploadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadParameters] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderNull: Self = StObject.set(x, "folder", null)
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setResourceType(value: auto | image | video | raw): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUploadSignature(
      value: String | (js.Function2[
          /* callback */ js.Function1[/* result */ String, Unit], 
          /* params */ CloudinaryUploadWidgetOptions, 
          Unit
        ])
    ): Self = StObject.set(x, "uploadSignature", value.asInstanceOf[js.Any])
    
    inline def setUploadSignatureFunction2(
      value: (/* callback */ js.Function1[/* result */ String, Unit], /* params */ CloudinaryUploadWidgetOptions) => Unit
    ): Self = StObject.set(x, "uploadSignature", js.Any.fromFunction2(value))
    
    inline def setUploadSignatureTimestamp(value: Double): Self = StObject.set(x, "uploadSignatureTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUploadSignatureTimestampUndefined: Self = StObject.set(x, "uploadSignatureTimestamp", js.undefined)
    
    inline def setUploadSignatureUndefined: Self = StObject.set(x, "uploadSignature", js.undefined)
  }
}
