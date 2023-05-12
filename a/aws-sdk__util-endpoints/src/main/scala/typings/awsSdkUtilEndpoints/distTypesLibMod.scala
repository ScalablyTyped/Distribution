package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointARN
import typings.awsSdkTypes.distTypesEndpointMod.EndpointPartition
import typings.awsSdkTypes.distTypesEndpointMod.EndpointURL
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkUtilEndpoints.distTypesLibAwsPartitionMod.PartitionsInfo
import typings.awsSdkUtilEndpoints.distTypesLibGetAttrMod.GetAttrValue
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object aws {
    
    @JSImport("@aws-sdk/util-endpoints/dist-types/lib", "aws")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getUserAgentPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPrefix")().asInstanceOf[String]
    
    inline def isVirtualHostableS3Bucket(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isVirtualHostableS3Bucket(value: String, allowSubDomains: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualHostableS3Bucket")(value.asInstanceOf[js.Any], allowSubDomains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def parseArn(value: String): EndpointARN | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArn")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointARN | Null]
    
    inline def partition(value: String): EndpointPartition = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointPartition]
    
    inline def setPartitionInfo(partitionsInfo: PartitionsInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setPartitionInfo(partitionsInfo: PartitionsInfo, userAgentPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPartitionInfo")(partitionsInfo.asInstanceOf[js.Any], userAgentPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def useDefaultPartitionInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDefaultPartitionInfo")().asInstanceOf[Unit]
  }
  
  inline def booleanEquals(value1: Boolean, value2: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("booleanEquals")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getAttr(value: GetAttrValue, path: String): GetAttrValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttr")(value.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[GetAttrValue]
  
  inline def isSet(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidHostLabel(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostLabel")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidHostLabel(value: String, allowSubDomains: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostLabel")(value.asInstanceOf[js.Any], allowSubDomains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def not(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseURL(value: String): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
  inline def parseURL(value: Endpoint): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
  inline def parseURL(value: URL): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
  
  inline def stringEquals(value1: String, value2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringEquals")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def substring(input: String, start: Double, stop: Double, reverse: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(input.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def uriEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
