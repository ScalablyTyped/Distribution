package typings.consul.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Catalog {
  import typings.consul.consulMod.Catalog.Node.ListOptions
  import typings.consul.consulMod.CommonOptions

  type DatacentersOptions = CommonOptions
  type Node = Node_
  type NodesOptions = ListOptions
  type Service = Service_
  type ServicesOptions = typings.consul.consulMod.Catalog.Service.ListOptions
}
