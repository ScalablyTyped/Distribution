package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
    * Date the bucket was created. This date can change when making changes to your bucket, such as editing its bucket policy.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setName(value: BucketName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
