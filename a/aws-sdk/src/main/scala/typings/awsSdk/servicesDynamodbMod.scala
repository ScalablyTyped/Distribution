package typings.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.dynamodbMod.ClientConfiguration
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/services/dynamodb", JSImport.Namespace)
@js.native
object servicesDynamodbMod extends js.Object {
  
  @js.native
  class DynamoDBCustomizations () extends Service
  /* static members */
  @js.native
  object DynamoDBCustomizations extends js.Object {
    
    /**
      * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
      * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
      */
    var DocumentClient: Instantiable1[
        /* options */ js.UndefOr[DocumentClientOptions with ClientConfiguration], 
        typings.awsSdk.documentClientMod.DocumentClient
      ] = js.native
  }
}
