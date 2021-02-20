package typings.awsSdkClientLambdaNode

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFunctionCodeMod {
  
  @js.native
  trait FunctionCode extends StObject {
    
    /**
      * <p>An Amazon S3 bucket in the same region as your function.</p>
      */
    var S3Bucket: js.UndefOr[String] = js.native
    
    /**
      * <p>The Amazon S3 key of the deployment package.</p>
      */
    var S3Key: js.UndefOr[String] = js.native
    
    /**
      * <p>For versioned objects, the version of the deployment package object to use.</p>
      */
    var S3ObjectVersion: js.UndefOr[String] = js.native
    
    /**
      * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
      */
    var ZipFile: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
  }
  object FunctionCode {
    
    @scala.inline
    def apply(): FunctionCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionCode]
    }
    
    @scala.inline
    implicit class FunctionCodeMutableBuilder[Self <: FunctionCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
      
      @scala.inline
      def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
      
      @scala.inline
      def setS3ObjectVersion(value: String): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
      
      @scala.inline
      def setZipFile(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledFunctionCode extends FunctionCode {
    
    /**
      * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
      */
    @JSName("ZipFile")
    var ZipFile_UnmarshalledFunctionCode: js.UndefOr[Uint8Array] = js.native
  }
  object UnmarshalledFunctionCode {
    
    @scala.inline
    def apply(): UnmarshalledFunctionCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledFunctionCode]
    }
    
    @scala.inline
    implicit class UnmarshalledFunctionCodeMutableBuilder[Self <: UnmarshalledFunctionCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setZipFile(value: Uint8Array): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
    }
  }
}
