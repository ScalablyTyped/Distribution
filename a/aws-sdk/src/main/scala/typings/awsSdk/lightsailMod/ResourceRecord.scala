package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecord extends StObject {
  
  /**
    * The name of the record.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The DNS record type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The value for the DNS record.
    */
  var value: js.UndefOr[String] = js.native
}
object ResourceRecord {
  
  @scala.inline
  def apply(): ResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecord]
  }
  
  @scala.inline
  implicit class ResourceRecordMutableBuilder[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
