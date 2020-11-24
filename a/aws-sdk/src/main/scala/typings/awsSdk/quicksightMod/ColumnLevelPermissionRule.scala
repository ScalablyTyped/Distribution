package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnLevelPermissionRule extends js.Object {
  
  /**
    * An array of column names.
    */
  var ColumnNames: js.UndefOr[ColumnNameList] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
    */
  var Principals: js.UndefOr[PrincipalList] = js.native
}
object ColumnLevelPermissionRule {
  
  @scala.inline
  def apply(): ColumnLevelPermissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLevelPermissionRule]
  }
  
  @scala.inline
  implicit class ColumnLevelPermissionRuleOps[Self <: ColumnLevelPermissionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnNamesVarargs(value: String*): Self = this.set("ColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: ColumnNameList): Self = this.set("ColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("ColumnNames", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = this.set("Principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = this.set("Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("Principals", js.undefined)
  }
}
