package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaultRootCauseEntity extends StObject {
  
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.native
  
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}
object FaultRootCauseEntity {
  
  @scala.inline
  def apply(): FaultRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCauseEntity]
  }
  
  @scala.inline
  implicit class FaultRootCauseEntityMutableBuilder[Self <: FaultRootCauseEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptions(value: RootCauseExceptions): Self = StObject.set(x, "Exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsUndefined: Self = StObject.set(x, "Exceptions", js.undefined)
    
    @scala.inline
    def setExceptionsVarargs(value: RootCauseException*): Self = StObject.set(x, "Exceptions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRemote(value: NullableBoolean): Self = StObject.set(x, "Remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "Remote", js.undefined)
  }
}
