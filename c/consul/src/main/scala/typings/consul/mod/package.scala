package typings.consul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Acl = typings.consul.mod.Acl_
  type Agent = typings.consul.mod.Agent_
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[typings.consul.mod.Response], 
    js.Any
  ]
  type Catalog = typings.consul.mod.Catalog_
  type Event = typings.consul.mod.Event_
  type Health = typings.consul.mod.Health_
  type Kv = typings.consul.mod.Kv_
  type Lock = typings.consul.mod.Lock_
  type Session = typings.consul.mod.Session_
  type Watch = typings.consul.mod.Watch_
}
