package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsEntity extends StObject {
  
  /**
    * The data returned by the query.
    */
  var Data: js.UndefOr[OpsEntityItemMap] = js.native
  
  /**
    * The query ID.
    */
  var Id: js.UndefOr[OpsEntityId] = js.native
}
object OpsEntity {
  
  @scala.inline
  def apply(): OpsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntity]
  }
  
  @scala.inline
  implicit class OpsEntityMutableBuilder[Self <: OpsEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: OpsEntityItemMap): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setId(value: OpsEntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
