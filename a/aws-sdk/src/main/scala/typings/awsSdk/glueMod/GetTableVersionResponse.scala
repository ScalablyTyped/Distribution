package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableVersionResponse extends StObject {
  
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[typings.awsSdk.glueMod.TableVersion] = js.undefined
}
object GetTableVersionResponse {
  
  @scala.inline
  def apply(): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionResponse]
  }
  
  @scala.inline
  implicit class GetTableVersionResponseMutableBuilder[Self <: GetTableVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableVersion(value: TableVersion): Self = StObject.set(x, "TableVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableVersionUndefined: Self = StObject.set(x, "TableVersion", js.undefined)
  }
}
