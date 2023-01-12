package typings.backblazeB2

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import typings.backblazeB2.mod.UploadProgressFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  applicationKeyId :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait applicationKeyIdstringCom extends StObject {
    
    var applicationKeyId: String
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object applicationKeyIdstringCom {
    
    inline def apply(applicationKeyId: String): applicationKeyIdstringCom = {
      val __obj = js.Dynamic.literal(applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[applicationKeyIdstringCom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: applicationKeyIdstringCom] (val x: Self) extends AnyVal {
      
      inline def setApplicationKeyId(value: String): Self = StObject.set(x, "applicationKeyId", value.asInstanceOf[js.Any])
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
    }
  }
  
  /* Inlined {  bucketId :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait bucketIdstringCommonArgs extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var bucketId: String
  }
  object bucketIdstringCommonArgs {
    
    inline def apply(bucketId: String): bucketIdstringCommonArgs = {
      val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[bucketIdstringCommonArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: bucketIdstringCommonArgs] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  bucketId :string,   fileName :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait bucketIdstringfileNamestr extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var bucketId: String
    
    var fileName: String
  }
  object bucketIdstringfileNamestr {
    
    inline def apply(bucketId: String, fileName: String): bucketIdstringfileNamestr = {
      val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[bucketIdstringfileNamestr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: bucketIdstringfileNamestr] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  fileId :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait fileIdstringCommonArgs extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var fileId: String
  }
  object fileIdstringCommonArgs {
    
    inline def apply(fileId: String): fileIdstringCommonArgs = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
      __obj.asInstanceOf[fileIdstringCommonArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fileIdstringCommonArgs] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  fileId :string} & backblaze-b2.backblaze-b2.DownloadFileOpts */
  trait fileIdstringDownloadFileO extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var fileId: String
    
    var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
    
    var responseType: arraybuffer | blob | document | json | text | stream
  }
  object fileIdstringDownloadFileO {
    
    inline def apply(fileId: String, responseType: arraybuffer | blob | document | json | text | stream): fileIdstringDownloadFileO = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[fileIdstringDownloadFileO]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fileIdstringDownloadFileO] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setOnDownloadProgress(value: /* event */ Any => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressNull: Self = StObject.set(x, "onDownloadProgress", null)
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setResponseType(value: arraybuffer | blob | document | json | text | stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  fileId :string,   fileName :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait fileIdstringfileNamestrin extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var fileId: String
    
    var fileName: String
  }
  object fileIdstringfileNamestrin {
    
    inline def apply(fileId: String, fileName: String): fileIdstringfileNamestrin = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[fileIdstringfileNamestrin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fileIdstringfileNamestrin] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  fileId :string,   partSha1Array :std.Array<string>} & backblaze-b2.backblaze-b2.CommonArgs */
  trait fileIdstringpartSha1Array extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var fileId: String
    
    var partSha1Array: js.Array[String]
  }
  object fileIdstringpartSha1Array {
    
    inline def apply(fileId: String, partSha1Array: js.Array[String]): fileIdstringpartSha1Array = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], partSha1Array = partSha1Array.asInstanceOf[js.Any])
      __obj.asInstanceOf[fileIdstringpartSha1Array]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fileIdstringpartSha1Array] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setPartSha1Array(value: js.Array[String]): Self = StObject.set(x, "partSha1Array", value.asInstanceOf[js.Any])
      
      inline def setPartSha1ArrayVarargs(value: String*): Self = StObject.set(x, "partSha1Array", js.Array(value*))
    }
  }
  
  /* Inlined {  maxKeyCount :number,   startApplicationKeyId :string} & backblaze-b2.backblaze-b2.CommonArgs */
  trait maxKeyCountnumberstartApp extends StObject {
    
    var axios: js.UndefOr[Record[String, Any]] = js.undefined
    
    var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
    
    var maxKeyCount: Double
    
    var startApplicationKeyId: String
  }
  object maxKeyCountnumberstartApp {
    
    inline def apply(maxKeyCount: Double, startApplicationKeyId: String): maxKeyCountnumberstartApp = {
      val __obj = js.Dynamic.literal(maxKeyCount = maxKeyCount.asInstanceOf[js.Any], startApplicationKeyId = startApplicationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[maxKeyCountnumberstartApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: maxKeyCountnumberstartApp] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
      
      inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setMaxKeyCount(value: Double): Self = StObject.set(x, "maxKeyCount", value.asInstanceOf[js.Any])
      
      inline def setStartApplicationKeyId(value: String): Self = StObject.set(x, "startApplicationKeyId", value.asInstanceOf[js.Any])
    }
  }
}
