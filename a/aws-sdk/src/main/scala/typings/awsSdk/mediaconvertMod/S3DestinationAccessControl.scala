package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationAccessControl extends StObject {
  
  /**
    * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
    */
  var CannedAcl: js.UndefOr[S3ObjectCannedAcl] = js.undefined
}
object S3DestinationAccessControl {
  
  inline def apply(): S3DestinationAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationAccessControl]
  }
  
  extension [Self <: S3DestinationAccessControl](x: Self) {
    
    inline def setCannedAcl(value: S3ObjectCannedAcl): Self = StObject.set(x, "CannedAcl", value.asInstanceOf[js.Any])
    
    inline def setCannedAclUndefined: Self = StObject.set(x, "CannedAcl", js.undefined)
  }
}
