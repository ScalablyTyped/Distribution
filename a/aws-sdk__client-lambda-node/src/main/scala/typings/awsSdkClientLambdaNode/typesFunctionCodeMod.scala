package typings.awsSdkClientLambdaNode

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFunctionCodeMod {
  
  trait FunctionCode extends StObject {
    
    /**
      * <p>An Amazon S3 bucket in the same region as your function.</p>
      */
    var S3Bucket: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon S3 key of the deployment package.</p>
      */
    var S3Key: js.UndefOr[String] = js.undefined
    
    /**
      * <p>For versioned objects, the version of the deployment package object to use.</p>
      */
    var S3ObjectVersion: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
      */
    var ZipFile: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  }
  object FunctionCode {
    
    inline def apply(): FunctionCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionCode]
    }
    
    extension [Self <: FunctionCode](x: Self) {
      
      inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
      
      inline def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
      
      inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
      
      inline def setS3ObjectVersion(value: String): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
      
      inline def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
      
      inline def setZipFile(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      inline def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
    }
  }
  
  trait UnmarshalledFunctionCode
    extends StObject
       with FunctionCode {
    
    /**
      * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
      */
    @JSName("ZipFile")
    var ZipFile_UnmarshalledFunctionCode: js.UndefOr[Uint8Array] = js.undefined
  }
  object UnmarshalledFunctionCode {
    
    inline def apply(): UnmarshalledFunctionCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledFunctionCode]
    }
    
    extension [Self <: UnmarshalledFunctionCode](x: Self) {
      
      inline def setZipFile(value: Uint8Array): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      inline def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
    }
  }
}
