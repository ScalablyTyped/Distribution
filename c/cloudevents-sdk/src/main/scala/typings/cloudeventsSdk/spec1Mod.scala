package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.cloudeventsSdk.anon.Id
import typings.cloudeventsSdk.cloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spec1Mod {
  
  /** @typedef {import("../../../cloudevent")} CloudEvent */
  /**
    * Decorates a CloudEvent with the 1.0 specification getters and setters
    * @ignore
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/v1/spec_1", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Spec1
  
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
    * Decorates a CloudEvent with the 1.0 specification getters and setters
    * @ignore
    */
  @js.native
  trait Spec1 extends StObject {
    
    def addExtension(key: js.Any, value: js.Any): Spec1 = js.native
    
    def check(): Unit = js.native
    
    def data: js.Any = js.native
    
    def dataContentType: js.Any = js.native
    def dataContentType_=(arg: js.Any): Unit = js.native
    
    def dataSchema: js.Any = js.native
    def dataSchema_=(arg: js.Any): Unit = js.native
    
    def data_=(arg: js.Any): Unit = js.native
    
    def id: js.Any = js.native
    def id_=(arg: js.Any): Unit = js.native
    
    var payload: Id = js.native
    
    def source: js.Any = js.native
    def source_=(arg: js.Any): Unit = js.native
    
    def specversion: String = js.native
    
    def subject: js.Any = js.native
    def subject_=(arg: js.Any): Unit = js.native
    
    def time: String = js.native
    def time_=(arg: String): Unit = js.native
    
    def `type`: js.Any = js.native
    def type_=(arg: js.Any): Unit = js.native
  }
}
