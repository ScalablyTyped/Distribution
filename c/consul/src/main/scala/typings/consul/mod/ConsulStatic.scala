package typings.consul.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsulStatic
  extends StObject
     with Instantiable0[Consul]
     with Instantiable1[/* opts */ ConsulOptions, Consul] {
  
  def apply(): Consul = js.native
  def apply(opts: ConsulOptions): Consul = js.native
  
  var Acl: AclStatic = js.native
  
  var Agent: AgentStatic = js.native
  
  var Catalog: CatalogStatic = js.native
  
  var Event: EventStatic = js.native
  
  var Health: HealthStatic = js.native
  
  var Kv: KvStatic = js.native
  
  var Lock: LockStatic = js.native
  
  var Session: SessionStatic = js.native
  
  var Status: StatusStatic = js.native
  
  var Watch: WatchStatic = js.native
}
