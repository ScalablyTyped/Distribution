package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAwsParseArnMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/aws/parseArn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseArn(value: String): EndpointARN | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArn")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointARN | Null]
}
