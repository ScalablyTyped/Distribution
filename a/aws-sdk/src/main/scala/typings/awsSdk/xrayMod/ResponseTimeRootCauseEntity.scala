package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseTimeRootCauseEntity extends StObject {
  
  /**
    * The type and messages of the exceptions.
    */
  var Coverage: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}
object ResponseTimeRootCauseEntity {
  
  @scala.inline
  def apply(): ResponseTimeRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseTimeRootCauseEntity]
  }
  
  @scala.inline
  implicit class ResponseTimeRootCauseEntityMutableBuilder[Self <: ResponseTimeRootCauseEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverage(value: NullableDouble): Self = StObject.set(x, "Coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "Coverage", js.undefined)
    
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
