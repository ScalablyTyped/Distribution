package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableToPointInTimeInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
object RestoreTableToPointInTimeInput {
  
  inline def apply(SourceTableName: String, TargetTableName: String): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
}
