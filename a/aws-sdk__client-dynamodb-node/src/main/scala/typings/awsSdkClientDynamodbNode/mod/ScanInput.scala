package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
object ScanInput {
  
  inline def apply(TableName: String): ScanInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInput]
  }
}
