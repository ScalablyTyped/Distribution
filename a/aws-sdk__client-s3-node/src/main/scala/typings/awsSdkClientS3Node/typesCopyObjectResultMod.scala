package typings.awsSdkClientS3Node

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyObjectResultMod {
  
  @js.native
  trait CopyObjectResult extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * _LastModified shape
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.native
  }
  object CopyObjectResult {
    
    @scala.inline
    def apply(): CopyObjectResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyObjectResult]
    }
    
    @scala.inline
    implicit class CopyObjectResultMutableBuilder[Self <: CopyObjectResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledCopyObjectResult extends CopyObjectResult {
    
    /**
      * _LastModified shape
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledCopyObjectResult: js.UndefOr[Date] = js.native
  }
  object UnmarshalledCopyObjectResult {
    
    @scala.inline
    def apply(): UnmarshalledCopyObjectResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCopyObjectResult]
    }
    
    @scala.inline
    implicit class UnmarshalledCopyObjectResultMutableBuilder[Self <: UnmarshalledCopyObjectResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
