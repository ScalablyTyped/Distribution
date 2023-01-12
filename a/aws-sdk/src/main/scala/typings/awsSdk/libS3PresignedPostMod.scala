package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.libS3PresignedPostMod.PresignedPost.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libS3PresignedPostMod {
  
  @JSImport("aws-sdk/lib/s3/presigned_post", "PresignedPost")
  @js.native
  open class PresignedPost () extends StObject {
    
    /**
      * The fields that must be included as hidden inputs on the form.
      */
    var fields: Fields = js.native
    
    /**
      * The URL that should be used as the action of the form.
      */
    var url: String = js.native
  }
  object PresignedPost {
    
    trait Fields
      extends StObject
         with /**
      * Additional keys that must be included in the form to be submitted. This
      * will include signature metadata as well as any fields provided to
      * s3.createPresignedPost
      */
    /* key */ StringDictionary[String] {
      
      /**
        * A base64-encoded policy detailing what constitutes an acceptable POST
        * upload. Composed of the conditions and expiration provided to
        * s3.createPresignedPost
        */
      var Policy: String
      
      /**
        * A hex-encoded HMAC of the POST policy, signed with the credentials
        * provided to the S3 client.
        */
      var `X-Amz-Signature`: String
    }
    object Fields {
      
      inline def apply(Policy: String, `X-Amz-Signature`: String): Fields = {
        val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
        __obj.updateDynamic("X-Amz-Signature")(`X-Amz-Signature`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Fields]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
        
        inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
        
        inline def `setX-Amz-Signature`(value: String): Self = StObject.set(x, "X-Amz-Signature", value.asInstanceOf[js.Any])
      }
    }
    
    trait Params extends StObject {
      
      /**
        * The S3 bucket to which the form should upload an attached file.
        */
      var Bucket: js.UndefOr[String] = js.undefined
      
      /**
        * An array of conditions that must be met for the form upload to be
        * accepted by S3.
        */
      var Conditions: js.UndefOr[js.Array[StringDictionary[Any] | (js.Tuple3[String, Any, Any])]] = js.undefined
      
      /**
        * The number of seconds for which the POST form's signed policy should be
        * valid. Defaults to 3600 (one hour).
        */
      var Expires: js.UndefOr[Double] = js.undefined
      
      /**
        * A hash of form fields to include in the presigned POST form. All fields
        * (except 'key') will be included as exact match conditions in the
        * presigned policy.
        */
      var Fields: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object Params {
      
      inline def apply(): Params = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Params]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
        
        inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
        
        inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
        
        inline def setConditions(value: js.Array[StringDictionary[Any] | (js.Tuple3[String, Any, Any])]): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
        
        inline def setConditionsVarargs(value: (StringDictionary[Any] | (js.Tuple3[String, Any, Any]))*): Self = StObject.set(x, "Conditions", js.Array(value*))
        
        inline def setExpires(value: Double): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
        
        inline def setFields(value: StringDictionary[Any]): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
      }
    }
  }
}
