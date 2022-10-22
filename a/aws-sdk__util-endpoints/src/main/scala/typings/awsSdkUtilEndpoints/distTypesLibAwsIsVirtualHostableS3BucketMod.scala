package typings.awsSdkUtilEndpoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAwsIsVirtualHostableS3BucketMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/aws/isVirtualHostableS3Bucket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVirtualHostableS3Bucket(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isVirtualHostableS3Bucket(value: String, allowSubDomains: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any], allowSubDomains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
