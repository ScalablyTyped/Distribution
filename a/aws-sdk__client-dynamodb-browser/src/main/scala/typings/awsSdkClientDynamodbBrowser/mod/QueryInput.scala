package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
object QueryInput {
  
  inline def apply(TableName: String): QueryInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInput]
  }
}
