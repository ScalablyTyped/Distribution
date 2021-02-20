package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GLACIER
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectMod {
  
  @js.native
  trait Object extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.native
    
    /**
      * _LastModified shape
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.native
    
    /**
      * _Size shape
      */
    var Size: js.UndefOr[Double] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.native
  }
  object Object {
    
    @scala.inline
    def apply(): Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledObject extends Object {
    
    /**
      * _LastModified shape
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledObject: js.UndefOr[Date] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledObject: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledObject {
    
    @scala.inline
    def apply(): UnmarshalledObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledObject]
    }
    
    @scala.inline
    implicit class UnmarshalledObjectMutableBuilder[Self <: UnmarshalledObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
