package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyRevision extends StObject {
  
  /**
    * The ID of the workflow or system.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The revision number of the workflow or system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}
object DependencyRevision {
  
  @scala.inline
  def apply(): DependencyRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyRevision]
  }
  
  @scala.inline
  implicit class DependencyRevisionMutableBuilder[Self <: DependencyRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
