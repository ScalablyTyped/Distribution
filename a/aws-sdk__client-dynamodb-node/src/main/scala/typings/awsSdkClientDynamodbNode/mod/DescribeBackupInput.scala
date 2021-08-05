package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput
object DescribeBackupInput {
  
  inline def apply(BackupArn: String): DescribeBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupInput]
  }
}
