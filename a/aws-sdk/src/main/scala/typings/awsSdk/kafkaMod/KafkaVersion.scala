package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KafkaVersion extends StObject {
  
  var Status: js.UndefOr[KafkaVersionStatus] = js.native
  
  var Version: js.UndefOr[string] = js.native
}
object KafkaVersion {
  
  @scala.inline
  def apply(): KafkaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaVersion]
  }
  
  @scala.inline
  implicit class KafkaVersionMutableBuilder[Self <: KafkaVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: KafkaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
