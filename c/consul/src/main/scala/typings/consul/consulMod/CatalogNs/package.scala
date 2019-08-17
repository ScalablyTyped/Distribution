package typings.consul.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CatalogNs {
  import typings.consul.consulMod.CatalogNs.NodeNs.ListOptions
  import typings.consul.consulMod.CommonOptions

  type DatacentersOptions = CommonOptions
  type NodesOptions = ListOptions
  type ServicesOptions = typings.consul.consulMod.CatalogNs.ServiceNs.ListOptions
}
