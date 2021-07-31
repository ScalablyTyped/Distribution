package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfo extends StObject {
  
  /**
    * Name of the field.
    */
  var Name: js.UndefOr[FieldName] = js.undefined
}
object FieldInfo {
  
  @scala.inline
  def apply(): FieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldInfo]
  }
  
  @scala.inline
  implicit class FieldInfoMutableBuilder[Self <: FieldInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FieldName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
