package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.cloudeventsSdk.anon.Id
import typings.cloudeventsSdk.cloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spec03Mod {
  
  /** @typedef {import("../../../cloudevent")} CloudEvent */
  /**
    * Decorates a CloudEvent with the 0.3 specification getters and setters
    * @ignore
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/v03/spec_0_3", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Spec03
  
  trait CloudEvent extends StObject {
    
    var CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]
  }
  object CloudEvent {
    
    inline def apply(CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): CloudEvent = {
      val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    extension [Self <: CloudEvent](x: Self) {
      
      inline def setCloudEvent(value: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): Self = StObject.set(x, "CloudEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /** @typedef {import("../../../cloudevent")} CloudEvent */
  /**
    * Decorates a CloudEvent with the 0.3 specification getters and setters
    * @ignore
    */
  @js.native
  trait Spec03 extends StObject {
    
    def addExtension(key: Any, value: Any): Spec03 = js.native
    
    def check(): Unit = js.native
    
    def data: Any = js.native
    
    def dataContentEncoding: Any = js.native
    def dataContentEncoding_=(arg: Any): Unit = js.native
    
    def dataContentType: Any = js.native
    def dataContentType_=(arg: Any): Unit = js.native
    
    def data_=(arg: Any): Unit = js.native
    
    def id: Any = js.native
    def id_=(arg: Any): Unit = js.native
    
    var payload: Id = js.native
    
    def schemaURL: Any = js.native
    def schemaURL_=(arg: Any): Unit = js.native
    
    def source: Any = js.native
    def source_=(arg: Any): Unit = js.native
    
    def specversion: String = js.native
    
    def subject: Any = js.native
    def subject_=(arg: Any): Unit = js.native
    
    def time: String = js.native
    def time_=(arg: String): Unit = js.native
    
    def `type`: Any = js.native
    def type_=(arg: Any): Unit = js.native
  }
}
