package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GLACIER
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoncurrentVersionTransitionMod {
  
  trait NoncurrentVersionTransition extends StObject {
    
    /**
      * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    var NoncurrentDays: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  }
  object NoncurrentVersionTransition {
    
    @scala.inline
    def apply(): NoncurrentVersionTransition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoncurrentVersionTransition]
    }
    
    @scala.inline
    implicit class NoncurrentVersionTransitionMutableBuilder[Self <: NoncurrentVersionTransition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoncurrentDays(value: Double): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
      
      @scala.inline
      def setStorageClass(value: GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  type UnmarshalledNoncurrentVersionTransition = NoncurrentVersionTransition
}
