package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var port: Double
  
  var priority: Double
  
  var proto: String
  
  var proxied: js.UndefOr[Boolean] = js.undefined
  
  var service: String
  
  var target: String
  
  var ttl: Double
  
  var weight: Double
}
object Name {
  
  inline def apply(
    name: String,
    port: Double,
    priority: Double,
    proto: String,
    service: String,
    target: String,
    ttl: Double,
    weight: Double
  ): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setProxied(value: Boolean): Self = StObject.set(x, "proxied", value.asInstanceOf[js.Any])
    
    inline def setProxiedUndefined: Self = StObject.set(x, "proxied", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
