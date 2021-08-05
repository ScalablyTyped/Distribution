package typings.consul.mod

import typings.consul.mod.Event.FireOptions
import typings.consul.mod.Event.ListOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Fires a new user event
    */
  def fire[TData](name: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String, callback: Callback[TData]): Unit = js.native
  def fire[TData](name: String, payload: Buffer): Thenable[TData] = js.native
  def fire[TData](name: String, payload: Buffer, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](name: String): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](name: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
}
object Event {
  
  trait FireOptions
    extends StObject
       with CommonOptions {
    
    var name: String
    
    var node: js.UndefOr[String] = js.undefined
    
    var payload: String | Buffer
    
    var service: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object FireOptions {
    
    inline def apply(name: String, payload: String | Buffer): FireOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[FireOptions]
    }
    
    extension [Self <: FireOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait ListOptions
    extends StObject
       with CommonOptions {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
