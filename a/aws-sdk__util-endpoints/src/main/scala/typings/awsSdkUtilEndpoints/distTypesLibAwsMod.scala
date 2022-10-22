package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointARN
import typings.awsSdkTypes.distTypesEndpointMod.EndpointPartition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAwsMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/aws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVirtualHostableS3Bucket(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isVirtualHostableS3Bucket(value: String, allowSubDomains: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any], allowSubDomains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseArn(value: String): EndpointARN | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArn")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointARN | Null]
  
  inline def partition(value: String): EndpointPartition = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointPartition]
}
