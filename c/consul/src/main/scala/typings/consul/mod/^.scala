package typings.consul.mod

import org.scalablytyped.runtime.TopLevel
import typings.consul.mod.Lock.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("consul", JSImport.Namespace)
@js.native
class ^ ()
  extends StObject
     with Consul {
  def this(opts: ConsulOptions) = this()
  
  /* CompleteClass */
  var acl: Acl = js.native
  
  /* CompleteClass */
  var agent: Agent = js.native
  
  /* CompleteClass */
  var catalog: Catalog = js.native
  
  /* CompleteClass */
  var event: Event = js.native
  
  /* CompleteClass */
  var health: Health = js.native
  
  /* CompleteClass */
  var kv: Kv = js.native
  
  /**
    * Lock helper.
    */
  /* CompleteClass */
  override def lock(opts: Options): Lock = js.native
  
  /* CompleteClass */
  var session: Session = js.native
  
  /* CompleteClass */
  var status: Status = js.native
  
  /**
    * Watch helper.
    */
  /* CompleteClass */
  override def watch(opts: typings.consul.mod.Watch.Options): Watch = js.native
}
@JSImport("consul", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[js.Object & ConsulStatic]
