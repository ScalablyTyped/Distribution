package typings.awsSdk2Types.clientsDynamodbMod

import typings.awsSdk2Types.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk2-types/clients/dynamodb", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
open class DocumentClient ()
  extends typings.awsSdk2Types.libDynamodbDocumentClientMod.DocumentClient {
  def this(options: DocumentClientOptions & ClientConfiguration) = this()
}
