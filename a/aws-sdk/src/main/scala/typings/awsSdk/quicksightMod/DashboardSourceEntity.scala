package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardSourceEntity extends StObject {
  
  /**
    * Source template.
    */
  var SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.native
}
object DashboardSourceEntity {
  
  @scala.inline
  def apply(): DashboardSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSourceEntity]
  }
  
  @scala.inline
  implicit class DashboardSourceEntityMutableBuilder[Self <: DashboardSourceEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceTemplate(value: DashboardSourceTemplate): Self = StObject.set(x, "SourceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTemplateUndefined: Self = StObject.set(x, "SourceTemplate", js.undefined)
  }
}
