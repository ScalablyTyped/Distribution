package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.undefined
}
object DescribeBackupInput {
  
  inline def apply(): DescribeBackupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBackupInput] (val x: Self) extends AnyVal {
    
    inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
  }
}
