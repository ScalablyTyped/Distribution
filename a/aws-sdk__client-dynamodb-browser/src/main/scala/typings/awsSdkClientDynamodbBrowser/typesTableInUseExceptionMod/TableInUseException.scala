package typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod

import typings.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableInUseExceptionDetails> * / any */ @js.native
trait TableInUseException
  extends CreateBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion {
  
  var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException = js.native
}
object TableInUseException {
  
  @scala.inline
  def apply(name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException): TableInUseException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInUseException]
  }
  
  @scala.inline
  implicit class TableInUseExceptionOps[Self <: TableInUseException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
