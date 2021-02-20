package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends StObject {
  
  /**
    * The name of a sheet. This name is displayed on the sheet's tab in the QuickSight console.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The unique identifier associated with a sheet.
    */
  var SheetId: js.UndefOr[RestrictiveResourceId] = js.native
}
object Sheet {
  
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSheetId(value: RestrictiveResourceId): Self = StObject.set(x, "SheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "SheetId", js.undefined)
  }
}
