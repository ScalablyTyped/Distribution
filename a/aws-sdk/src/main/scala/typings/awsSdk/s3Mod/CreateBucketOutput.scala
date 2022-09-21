package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketOutput extends StObject {
  
  /**
    * A forward slash followed by the name of the bucket.
    */
  var Location: js.UndefOr[typings.awsSdk.s3Mod.Location] = js.undefined
}
object CreateBucketOutput {
  
  inline def apply(): CreateBucketOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOutput]
  }
  
  extension [Self <: CreateBucketOutput](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
