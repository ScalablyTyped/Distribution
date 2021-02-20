package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoncurrentVersionExpirationMod {
  
  @js.native
  trait NoncurrentVersionExpiration extends StObject {
    
    /**
      * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    var NoncurrentDays: js.UndefOr[Double] = js.native
  }
  object NoncurrentVersionExpiration {
    
    @scala.inline
    def apply(): NoncurrentVersionExpiration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoncurrentVersionExpiration]
    }
    
    @scala.inline
    implicit class NoncurrentVersionExpirationMutableBuilder[Self <: NoncurrentVersionExpiration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoncurrentDays(value: Double): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
    }
  }
  
  type UnmarshalledNoncurrentVersionExpiration = NoncurrentVersionExpiration
}
